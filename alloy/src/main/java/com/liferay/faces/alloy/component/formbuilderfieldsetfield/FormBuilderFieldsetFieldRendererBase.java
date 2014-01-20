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
package com.liferay.faces.alloy.component.formbuilderfieldsetfield;

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
public abstract class FormBuilderFieldsetFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-fieldset";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderFieldsetField formBuilderFieldsetField = (FormBuilderFieldsetField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderFieldsetField = new A.FormBuilderFieldsetField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (formBuilderFieldsetField.getAcceptChildren() != null) {
			renderAcceptChildren(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getBuilder() != null) {
			renderBuilder(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getControlsToolbar() != null) {
			renderControlsToolbar(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getDataType() != null) {
			renderDataType(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getDisabled() != null) {
			renderDisabled(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getDropZoneNode() != null) {
			renderDropZoneNode(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getHiddenAttributes() != null) {
			renderHiddenAttributes(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getFormBuilderFieldsetFieldId() != null) {
			renderFormBuilderFieldsetFieldId(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getLabel() != null) {
			renderLabel(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getLabelNode() != null) {
			renderLabelNode(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getLocalizationMap() != null) {
			renderLocalizationMap(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getName() != null) {
			renderName(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getFormBuilderFieldsetFieldParent() != null) {
			renderFormBuilderFieldsetFieldParent(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getPredefinedValue() != null) {
			renderPredefinedValue(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getReadOnly() != null) {
			renderReadOnly(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getReadOnlyAttributes() != null) {
			renderReadOnlyAttributes(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getRequired() != null) {
			renderRequired(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getRequiredFlagNode() != null) {
			renderRequiredFlagNode(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getSelected() != null) {
			renderSelected(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getShowLabel() != null) {
			renderShowLabel(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getStrings() != null) {
			renderStrings(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getTemplate() != null) {
			renderTemplate(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getTemplateNode() != null) {
			renderTemplateNode(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getTip() != null) {
			renderTip(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getTipFlagNode() != null) {
			renderTipFlagNode(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getType() != null) {
			renderType(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getUnique() != null) {
			renderUnique(renderedAttributes, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getZIndex() != null) {
			renderZIndex(renderedAttributes, formBuilderFieldsetField);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (formBuilderFieldsetField.getAfterAcceptChildrenChange() != null) {
			renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterControlsToolbarChange() != null) {
			renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterDataTypeChange() != null) {
			renderAfterDataTypeChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterDropZoneNodeChange() != null) {
			renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterHiddenAttributesChange() != null) {
			renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterLabelNodeChange() != null) {
			renderAfterLabelNodeChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterLocalizationMapChange() != null) {
			renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterParentChange() != null) {
			renderAfterParentChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterPredefinedValueChange() != null) {
			renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterReadOnlyChange() != null) {
			renderAfterReadOnlyChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterReadOnlyAttributesChange() != null) {
			renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterRequiredFlagNodeChange() != null) {
			renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterShowLabelChange() != null) {
			renderAfterShowLabelChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterTemplateChange() != null) {
			renderAfterTemplateChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterTemplateNodeChange() != null) {
			renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterTipChange() != null) {
			renderAfterTipChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterTipFlagNodeChange() != null) {
			renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterUniqueChange() != null) {
			renderAfterUniqueChange(renderedAfterEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, formBuilderFieldsetField);
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

		if (formBuilderFieldsetField.getOnAcceptChildrenChange() != null) {
			renderOnAcceptChildrenChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnControlsToolbarChange() != null) {
			renderOnControlsToolbarChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnDataTypeChange() != null) {
			renderOnDataTypeChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnDropZoneNodeChange() != null) {
			renderOnDropZoneNodeChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnHiddenAttributesChange() != null) {
			renderOnHiddenAttributesChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnLabelNodeChange() != null) {
			renderOnLabelNodeChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnLocalizationMapChange() != null) {
			renderOnLocalizationMapChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnParentChange() != null) {
			renderOnParentChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnPredefinedValueChange() != null) {
			renderOnPredefinedValueChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnReadOnlyChange() != null) {
			renderOnReadOnlyChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnReadOnlyAttributesChange() != null) {
			renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnRequiredFlagNodeChange() != null) {
			renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnShowLabelChange() != null) {
			renderOnShowLabelChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnTemplateChange() != null) {
			renderOnTemplateChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnTemplateNodeChange() != null) {
			renderOnTemplateNodeChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnTipChange() != null) {
			renderOnTipChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnTipFlagNodeChange() != null) {
			renderOnTipFlagNodeChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnUniqueChange() != null) {
			renderOnUniqueChange(renderedOnEvents, formBuilderFieldsetField);
		}
		
		if (formBuilderFieldsetField.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, formBuilderFieldsetField);
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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderFieldsetField.getAcceptChildren();
		renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.ACCEPT_CHILDREN, acceptChildren));
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean builder = formBuilderFieldsetField.getBuilder();
		renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.BUILDER, builder));
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderFieldsetField.getControlsToolbar();
		renderedAttributes.add(renderObject(FormBuilderFieldsetField.CONTROLS_TOOLBAR, controlsToolbar));
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String dataType = formBuilderFieldsetField.getDataType();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.DATA_TYPE, dataType));
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean disabled = formBuilderFieldsetField.getDisabled();
		renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.DISABLED, disabled));
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String dropZoneNode = formBuilderFieldsetField.getDropZoneNode();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.DROP_ZONE_NODE, dropZoneNode));
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderFieldsetField.getHiddenAttributes();
		renderedAttributes.add(renderArray(FormBuilderFieldsetField.HIDDEN_ATTRIBUTES, hiddenAttributes));
	}

	protected void renderFormBuilderFieldsetFieldId(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String formBuilderFieldsetFieldId = formBuilderFieldsetField.getFormBuilderFieldsetFieldId();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.FORM_BUILDER_FIELDSET_FIELD_ID, formBuilderFieldsetFieldId));
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String label = formBuilderFieldsetField.getLabel();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.LABEL, label));
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String labelNode = formBuilderFieldsetField.getLabelNode();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.LABEL_NODE, labelNode));
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object localizationMap = formBuilderFieldsetField.getLocalizationMap();
		renderedAttributes.add(renderObject(FormBuilderFieldsetField.LOCALIZATION_MAP, localizationMap));
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String name = formBuilderFieldsetField.getName();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.NAME, name));
	}

	protected void renderFormBuilderFieldsetFieldParent(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String formBuilderFieldsetFieldParent = formBuilderFieldsetField.getFormBuilderFieldsetFieldParent();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.FORM_BUILDER_FIELDSET_FIELD_PARENT, formBuilderFieldsetFieldParent));
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String predefinedValue = formBuilderFieldsetField.getPredefinedValue();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.PREDEFINED_VALUE, predefinedValue));
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean readOnly = formBuilderFieldsetField.getReadOnly();
		renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.READ_ONLY, readOnly));
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderFieldsetField.getReadOnlyAttributes();
		renderedAttributes.add(renderArray(FormBuilderFieldsetField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean required = formBuilderFieldsetField.getRequired();
		renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.REQUIRED, required));
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderFieldsetField.getRequiredFlagNode();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.REQUIRED_FLAG_NODE, requiredFlagNode));
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean selected = formBuilderFieldsetField.getSelected();
		renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.SELECTED, selected));
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean showLabel = formBuilderFieldsetField.getShowLabel();
		renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.SHOW_LABEL, showLabel));
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object strings = formBuilderFieldsetField.getStrings();
		renderedAttributes.add(renderObject(FormBuilderFieldsetField.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object tabIndex = formBuilderFieldsetField.getTabIndex();
		renderedAttributes.add(renderNumber(FormBuilderFieldsetField.TAB_INDEX, tabIndex));
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String template = formBuilderFieldsetField.getTemplate();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.TEMPLATE, template));
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String templateNode = formBuilderFieldsetField.getTemplateNode();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.TEMPLATE_NODE, templateNode));
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String tip = formBuilderFieldsetField.getTip();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.TIP, tip));
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String tipFlagNode = formBuilderFieldsetField.getTipFlagNode();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.TIP_FLAG_NODE, tipFlagNode));
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String type = formBuilderFieldsetField.getType();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.TYPE, type));
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean unique = formBuilderFieldsetField.getUnique();
		renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.UNIQUE, unique));
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object zIndex = formBuilderFieldsetField.getZIndex();
		renderedAttributes.add(renderNumber(FormBuilderFieldsetField.Z_INDEX, zIndex));
	}

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderFieldsetField.getAfterAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderFieldsetField.getAfterBuilderChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderFieldsetField.getAfterControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderFieldsetField.getAfterDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderFieldsetField.getAfterDisabledChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderFieldsetField.getAfterDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderFieldsetField.getAfterHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterIdChange = formBuilderFieldsetField.getAfterIdChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterLabelChange = formBuilderFieldsetField.getAfterLabelChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderFieldsetField.getAfterLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderFieldsetField.getAfterLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterNameChange = formBuilderFieldsetField.getAfterNameChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterParentChange = formBuilderFieldsetField.getAfterParentChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_PARENT_CHANGE, afterParentChange));
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderFieldsetField.getAfterPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderFieldsetField.getAfterReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderFieldsetField.getAfterReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderFieldsetField.getAfterRequiredChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderFieldsetField.getAfterRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderFieldsetField.getAfterSelectedChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderFieldsetField.getAfterShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterStringsChange = formBuilderFieldsetField.getAfterStringsChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderFieldsetField.getAfterTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderFieldsetField.getAfterTemplateChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderFieldsetField.getAfterTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterTipChange = formBuilderFieldsetField.getAfterTipChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_TIP_CHANGE, afterTipChange));
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderFieldsetField.getAfterTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterTypeChange = formBuilderFieldsetField.getAfterTypeChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderFieldsetField.getAfterUniqueChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderFieldsetField.getAfterZIndexChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderFieldsetField.getOnAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onBuilderChange = formBuilderFieldsetField.getOnBuilderChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderFieldsetField.getOnControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderFieldsetField.getOnDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onDisabledChange = formBuilderFieldsetField.getOnDisabledChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderFieldsetField.getOnDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderFieldsetField.getOnHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onIdChange = formBuilderFieldsetField.getOnIdChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onLabelChange = formBuilderFieldsetField.getOnLabelChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderFieldsetField.getOnLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderFieldsetField.getOnLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onNameChange = formBuilderFieldsetField.getOnNameChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onParentChange = formBuilderFieldsetField.getOnParentChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_PARENT_CHANGE, onParentChange));
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderFieldsetField.getOnPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderFieldsetField.getOnReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderFieldsetField.getOnReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onRequiredChange = formBuilderFieldsetField.getOnRequiredChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderFieldsetField.getOnRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onSelectedChange = formBuilderFieldsetField.getOnSelectedChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderFieldsetField.getOnShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onStringsChange = formBuilderFieldsetField.getOnStringsChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderFieldsetField.getOnTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onTemplateChange = formBuilderFieldsetField.getOnTemplateChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_TEMPLATE_CHANGE, onTemplateChange));
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderFieldsetField.getOnTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onTipChange = formBuilderFieldsetField.getOnTipChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_TIP_CHANGE, onTipChange));
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderFieldsetField.getOnTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onTypeChange = formBuilderFieldsetField.getOnTypeChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onUniqueChange = formBuilderFieldsetField.getOnUniqueChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_UNIQUE_CHANGE, onUniqueChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onZIndexChange = formBuilderFieldsetField.getOnZIndexChange();
		renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}