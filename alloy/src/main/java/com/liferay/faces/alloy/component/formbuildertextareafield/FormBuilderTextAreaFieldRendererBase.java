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

		if (formBuilderTextAreaField.getAcceptChildren() != null) {
			renderAcceptChildren(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getBuilder() != null) {
			renderBuilder(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getControlsToolbar() != null) {
			renderControlsToolbar(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getDataType() != null) {
			renderDataType(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getDisabled() != null) {
			renderDisabled(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getDropZoneNode() != null) {
			renderDropZoneNode(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getHiddenAttributes() != null) {
			renderHiddenAttributes(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getFormBuilderTextAreaFieldId() != null) {
			renderFormBuilderTextAreaFieldId(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getLabel() != null) {
			renderLabel(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getLabelNode() != null) {
			renderLabelNode(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getLocalizationMap() != null) {
			renderLocalizationMap(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getName() != null) {
			renderName(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getFormBuilderTextAreaFieldParent() != null) {
			renderFormBuilderTextAreaFieldParent(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getPredefinedValue() != null) {
			renderPredefinedValue(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getReadOnly() != null) {
			renderReadOnly(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getReadOnlyAttributes() != null) {
			renderReadOnlyAttributes(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getRequired() != null) {
			renderRequired(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getRequiredFlagNode() != null) {
			renderRequiredFlagNode(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getSelected() != null) {
			renderSelected(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getShowLabel() != null) {
			renderShowLabel(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getStrings() != null) {
			renderStrings(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getTemplate() != null) {
			renderTemplate(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getTemplateNode() != null) {
			renderTemplateNode(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getTip() != null) {
			renderTip(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getTipFlagNode() != null) {
			renderTipFlagNode(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getType() != null) {
			renderType(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getUnique() != null) {
			renderUnique(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getWidth() != null) {
			renderWidth(renderedAttributes, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getZIndex() != null) {
			renderZIndex(renderedAttributes, formBuilderTextAreaField);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (formBuilderTextAreaField.getAfterAcceptChildrenChange() != null) {
			renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterControlsToolbarChange() != null) {
			renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterDataTypeChange() != null) {
			renderAfterDataTypeChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterDropZoneNodeChange() != null) {
			renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterHiddenAttributesChange() != null) {
			renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterLabelNodeChange() != null) {
			renderAfterLabelNodeChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterLocalizationMapChange() != null) {
			renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterParentChange() != null) {
			renderAfterParentChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterPredefinedValueChange() != null) {
			renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterReadOnlyChange() != null) {
			renderAfterReadOnlyChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterReadOnlyAttributesChange() != null) {
			renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterRequiredFlagNodeChange() != null) {
			renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterShowLabelChange() != null) {
			renderAfterShowLabelChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterTemplateChange() != null) {
			renderAfterTemplateChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterTemplateNodeChange() != null) {
			renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterTipChange() != null) {
			renderAfterTipChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterTipFlagNodeChange() != null) {
			renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterUniqueChange() != null) {
			renderAfterUniqueChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, formBuilderTextAreaField);
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

		if (formBuilderTextAreaField.getOnAcceptChildrenChange() != null) {
			renderOnAcceptChildrenChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnControlsToolbarChange() != null) {
			renderOnControlsToolbarChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnDataTypeChange() != null) {
			renderOnDataTypeChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnDropZoneNodeChange() != null) {
			renderOnDropZoneNodeChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnHiddenAttributesChange() != null) {
			renderOnHiddenAttributesChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnLabelNodeChange() != null) {
			renderOnLabelNodeChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnLocalizationMapChange() != null) {
			renderOnLocalizationMapChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnParentChange() != null) {
			renderOnParentChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnPredefinedValueChange() != null) {
			renderOnPredefinedValueChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnReadOnlyChange() != null) {
			renderOnReadOnlyChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnReadOnlyAttributesChange() != null) {
			renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnRequiredFlagNodeChange() != null) {
			renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnShowLabelChange() != null) {
			renderOnShowLabelChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnTemplateChange() != null) {
			renderOnTemplateChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnTemplateNodeChange() != null) {
			renderOnTemplateNodeChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnTipChange() != null) {
			renderOnTipChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnTipFlagNodeChange() != null) {
			renderOnTipFlagNodeChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnUniqueChange() != null) {
			renderOnUniqueChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, formBuilderTextAreaField);
		}

		if (formBuilderTextAreaField.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, formBuilderTextAreaField);
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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderTextAreaField.getAcceptChildren();
		renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.ACCEPT_CHILDREN, acceptChildren));
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean builder = formBuilderTextAreaField.getBuilder();
		renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.BUILDER, builder));
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderTextAreaField.getControlsToolbar();
		renderedAttributes.add(renderObject(FormBuilderTextAreaField.CONTROLS_TOOLBAR, controlsToolbar));
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String dataType = formBuilderTextAreaField.getDataType();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.DATA_TYPE, dataType));
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean disabled = formBuilderTextAreaField.getDisabled();
		renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.DISABLED, disabled));
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String dropZoneNode = formBuilderTextAreaField.getDropZoneNode();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.DROP_ZONE_NODE, dropZoneNode));
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderTextAreaField.getHiddenAttributes();
		renderedAttributes.add(renderArray(FormBuilderTextAreaField.HIDDEN_ATTRIBUTES, hiddenAttributes));
	}

	protected void renderFormBuilderTextAreaFieldId(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String formBuilderTextAreaFieldId = formBuilderTextAreaField.getFormBuilderTextAreaFieldId();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.FORM_BUILDER_TEXT_AREA_FIELD_ID, formBuilderTextAreaFieldId));
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String label = formBuilderTextAreaField.getLabel();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.LABEL, label));
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String labelNode = formBuilderTextAreaField.getLabelNode();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.LABEL_NODE, labelNode));
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object localizationMap = formBuilderTextAreaField.getLocalizationMap();
		renderedAttributes.add(renderObject(FormBuilderTextAreaField.LOCALIZATION_MAP, localizationMap));
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String name = formBuilderTextAreaField.getName();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.NAME, name));
	}

	protected void renderFormBuilderTextAreaFieldParent(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String formBuilderTextAreaFieldParent = formBuilderTextAreaField.getFormBuilderTextAreaFieldParent();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.FORM_BUILDER_TEXT_AREA_FIELD_PARENT, formBuilderTextAreaFieldParent));
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String predefinedValue = formBuilderTextAreaField.getPredefinedValue();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.PREDEFINED_VALUE, predefinedValue));
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean readOnly = formBuilderTextAreaField.getReadOnly();
		renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.READ_ONLY, readOnly));
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderTextAreaField.getReadOnlyAttributes();
		renderedAttributes.add(renderArray(FormBuilderTextAreaField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean required = formBuilderTextAreaField.getRequired();
		renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.REQUIRED, required));
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderTextAreaField.getRequiredFlagNode();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.REQUIRED_FLAG_NODE, requiredFlagNode));
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean selected = formBuilderTextAreaField.getSelected();
		renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.SELECTED, selected));
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean showLabel = formBuilderTextAreaField.getShowLabel();
		renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.SHOW_LABEL, showLabel));
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object strings = formBuilderTextAreaField.getStrings();
		renderedAttributes.add(renderObject(FormBuilderTextAreaField.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object tabIndex = formBuilderTextAreaField.getTabIndex();
		renderedAttributes.add(renderNumber(FormBuilderTextAreaField.TAB_INDEX, tabIndex));
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String template = formBuilderTextAreaField.getTemplate();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.TEMPLATE, template));
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String templateNode = formBuilderTextAreaField.getTemplateNode();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.TEMPLATE_NODE, templateNode));
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String tip = formBuilderTextAreaField.getTip();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.TIP, tip));
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String tipFlagNode = formBuilderTextAreaField.getTipFlagNode();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.TIP_FLAG_NODE, tipFlagNode));
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String type = formBuilderTextAreaField.getType();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.TYPE, type));
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean unique = formBuilderTextAreaField.getUnique();
		renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.UNIQUE, unique));
	}

	protected void renderWidth(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String width = formBuilderTextAreaField.getWidth();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.WIDTH, width));
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object zIndex = formBuilderTextAreaField.getZIndex();
		renderedAttributes.add(renderNumber(FormBuilderTextAreaField.Z_INDEX, zIndex));
	}

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderTextAreaField.getAfterAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderTextAreaField.getAfterBuilderChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderTextAreaField.getAfterControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderTextAreaField.getAfterDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderTextAreaField.getAfterDisabledChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderTextAreaField.getAfterDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderTextAreaField.getAfterHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterIdChange = formBuilderTextAreaField.getAfterIdChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterLabelChange = formBuilderTextAreaField.getAfterLabelChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderTextAreaField.getAfterLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderTextAreaField.getAfterLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterNameChange = formBuilderTextAreaField.getAfterNameChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterParentChange = formBuilderTextAreaField.getAfterParentChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_PARENT_CHANGE, afterParentChange));
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderTextAreaField.getAfterPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderTextAreaField.getAfterReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderTextAreaField.getAfterReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderTextAreaField.getAfterRequiredChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderTextAreaField.getAfterRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderTextAreaField.getAfterSelectedChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderTextAreaField.getAfterShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterStringsChange = formBuilderTextAreaField.getAfterStringsChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderTextAreaField.getAfterTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderTextAreaField.getAfterTemplateChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderTextAreaField.getAfterTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterTipChange = formBuilderTextAreaField.getAfterTipChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_TIP_CHANGE, afterTipChange));
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderTextAreaField.getAfterTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterTypeChange = formBuilderTextAreaField.getAfterTypeChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderTextAreaField.getAfterUniqueChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterWidthChange = formBuilderTextAreaField.getAfterWidthChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderTextAreaField.getAfterZIndexChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderTextAreaField.getOnAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onBuilderChange = formBuilderTextAreaField.getOnBuilderChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderTextAreaField.getOnControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderTextAreaField.getOnDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onDisabledChange = formBuilderTextAreaField.getOnDisabledChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderTextAreaField.getOnDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderTextAreaField.getOnHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onIdChange = formBuilderTextAreaField.getOnIdChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onLabelChange = formBuilderTextAreaField.getOnLabelChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderTextAreaField.getOnLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderTextAreaField.getOnLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onNameChange = formBuilderTextAreaField.getOnNameChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onParentChange = formBuilderTextAreaField.getOnParentChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_PARENT_CHANGE, onParentChange));
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderTextAreaField.getOnPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderTextAreaField.getOnReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderTextAreaField.getOnReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onRequiredChange = formBuilderTextAreaField.getOnRequiredChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderTextAreaField.getOnRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onSelectedChange = formBuilderTextAreaField.getOnSelectedChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderTextAreaField.getOnShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onStringsChange = formBuilderTextAreaField.getOnStringsChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderTextAreaField.getOnTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onTemplateChange = formBuilderTextAreaField.getOnTemplateChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_TEMPLATE_CHANGE, onTemplateChange));
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderTextAreaField.getOnTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onTipChange = formBuilderTextAreaField.getOnTipChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_TIP_CHANGE, onTipChange));
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderTextAreaField.getOnTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onTypeChange = formBuilderTextAreaField.getOnTypeChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onUniqueChange = formBuilderTextAreaField.getOnUniqueChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_UNIQUE_CHANGE, onUniqueChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onWidthChange = formBuilderTextAreaField.getOnWidthChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onZIndexChange = formBuilderTextAreaField.getOnZIndexChange();
		renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}