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

		if (formBuilderFileUploadField.getAcceptChildren() != null) {
			renderAcceptChildren(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getBuilder() != null) {
			renderBuilder(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getControlsToolbar() != null) {
			renderControlsToolbar(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getDataType() != null) {
			renderDataType(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getDisabled() != null) {
			renderDisabled(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getDropZoneNode() != null) {
			renderDropZoneNode(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getHiddenAttributes() != null) {
			renderHiddenAttributes(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getFormBuilderFileUploadFieldId() != null) {
			renderFormBuilderFileUploadFieldId(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getLabel() != null) {
			renderLabel(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getLabelNode() != null) {
			renderLabelNode(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getLocalizationMap() != null) {
			renderLocalizationMap(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getName() != null) {
			renderName(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getFormBuilderFileUploadFieldParent() != null) {
			renderFormBuilderFileUploadFieldParent(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getPredefinedValue() != null) {
			renderPredefinedValue(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getReadOnly() != null) {
			renderReadOnly(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getReadOnlyAttributes() != null) {
			renderReadOnlyAttributes(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getRequired() != null) {
			renderRequired(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getRequiredFlagNode() != null) {
			renderRequiredFlagNode(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getSelected() != null) {
			renderSelected(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getShowLabel() != null) {
			renderShowLabel(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getStrings() != null) {
			renderStrings(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getTemplate() != null) {
			renderTemplate(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getTemplateNode() != null) {
			renderTemplateNode(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getTip() != null) {
			renderTip(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getTipFlagNode() != null) {
			renderTipFlagNode(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getType() != null) {
			renderType(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getUnique() != null) {
			renderUnique(renderedAttributes, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getZIndex() != null) {
			renderZIndex(renderedAttributes, formBuilderFileUploadField);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (formBuilderFileUploadField.getAfterAcceptChildrenChange() != null) {
			renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterControlsToolbarChange() != null) {
			renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterDataTypeChange() != null) {
			renderAfterDataTypeChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterDropZoneNodeChange() != null) {
			renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterHiddenAttributesChange() != null) {
			renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterLabelNodeChange() != null) {
			renderAfterLabelNodeChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterLocalizationMapChange() != null) {
			renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterParentChange() != null) {
			renderAfterParentChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterPredefinedValueChange() != null) {
			renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterReadOnlyChange() != null) {
			renderAfterReadOnlyChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterReadOnlyAttributesChange() != null) {
			renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterRequiredFlagNodeChange() != null) {
			renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterShowLabelChange() != null) {
			renderAfterShowLabelChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterTemplateChange() != null) {
			renderAfterTemplateChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterTemplateNodeChange() != null) {
			renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterTipChange() != null) {
			renderAfterTipChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterTipFlagNodeChange() != null) {
			renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterUniqueChange() != null) {
			renderAfterUniqueChange(renderedAfterEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, formBuilderFileUploadField);
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

		if (formBuilderFileUploadField.getOnAcceptChildrenChange() != null) {
			renderOnAcceptChildrenChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnControlsToolbarChange() != null) {
			renderOnControlsToolbarChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnDataTypeChange() != null) {
			renderOnDataTypeChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnDropZoneNodeChange() != null) {
			renderOnDropZoneNodeChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnHiddenAttributesChange() != null) {
			renderOnHiddenAttributesChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnLabelNodeChange() != null) {
			renderOnLabelNodeChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnLocalizationMapChange() != null) {
			renderOnLocalizationMapChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnParentChange() != null) {
			renderOnParentChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnPredefinedValueChange() != null) {
			renderOnPredefinedValueChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnReadOnlyChange() != null) {
			renderOnReadOnlyChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnReadOnlyAttributesChange() != null) {
			renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnRequiredFlagNodeChange() != null) {
			renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnShowLabelChange() != null) {
			renderOnShowLabelChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnTemplateChange() != null) {
			renderOnTemplateChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnTemplateNodeChange() != null) {
			renderOnTemplateNodeChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnTipChange() != null) {
			renderOnTipChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnTipFlagNodeChange() != null) {
			renderOnTipFlagNodeChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnUniqueChange() != null) {
			renderOnUniqueChange(renderedOnEvents, formBuilderFileUploadField);
		}
		
		if (formBuilderFileUploadField.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, formBuilderFileUploadField);
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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderFileUploadField.getAcceptChildren();
		renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.ACCEPT_CHILDREN, acceptChildren));
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean builder = formBuilderFileUploadField.getBuilder();
		renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.BUILDER, builder));
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderFileUploadField.getControlsToolbar();
		renderedAttributes.add(renderObject(FormBuilderFileUploadField.CONTROLS_TOOLBAR, controlsToolbar));
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String dataType = formBuilderFileUploadField.getDataType();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.DATA_TYPE, dataType));
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean disabled = formBuilderFileUploadField.getDisabled();
		renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.DISABLED, disabled));
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String dropZoneNode = formBuilderFileUploadField.getDropZoneNode();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.DROP_ZONE_NODE, dropZoneNode));
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderFileUploadField.getHiddenAttributes();
		renderedAttributes.add(renderArray(FormBuilderFileUploadField.HIDDEN_ATTRIBUTES, hiddenAttributes));
	}

	protected void renderFormBuilderFileUploadFieldId(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String formBuilderFileUploadFieldId = formBuilderFileUploadField.getFormBuilderFileUploadFieldId();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.FORM_BUILDER_FILE_UPLOAD_FIELD_ID, formBuilderFileUploadFieldId));
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String label = formBuilderFileUploadField.getLabel();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.LABEL, label));
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String labelNode = formBuilderFileUploadField.getLabelNode();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.LABEL_NODE, labelNode));
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object localizationMap = formBuilderFileUploadField.getLocalizationMap();
		renderedAttributes.add(renderObject(FormBuilderFileUploadField.LOCALIZATION_MAP, localizationMap));
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String name = formBuilderFileUploadField.getName();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.NAME, name));
	}

	protected void renderFormBuilderFileUploadFieldParent(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String formBuilderFileUploadFieldParent = formBuilderFileUploadField.getFormBuilderFileUploadFieldParent();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.FORM_BUILDER_FILE_UPLOAD_FIELD_PARENT, formBuilderFileUploadFieldParent));
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String predefinedValue = formBuilderFileUploadField.getPredefinedValue();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.PREDEFINED_VALUE, predefinedValue));
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean readOnly = formBuilderFileUploadField.getReadOnly();
		renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.READ_ONLY, readOnly));
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderFileUploadField.getReadOnlyAttributes();
		renderedAttributes.add(renderArray(FormBuilderFileUploadField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean required = formBuilderFileUploadField.getRequired();
		renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.REQUIRED, required));
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderFileUploadField.getRequiredFlagNode();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.REQUIRED_FLAG_NODE, requiredFlagNode));
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean selected = formBuilderFileUploadField.getSelected();
		renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.SELECTED, selected));
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean showLabel = formBuilderFileUploadField.getShowLabel();
		renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.SHOW_LABEL, showLabel));
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object strings = formBuilderFileUploadField.getStrings();
		renderedAttributes.add(renderObject(FormBuilderFileUploadField.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object tabIndex = formBuilderFileUploadField.getTabIndex();
		renderedAttributes.add(renderNumber(FormBuilderFileUploadField.TAB_INDEX, tabIndex));
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String template = formBuilderFileUploadField.getTemplate();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.TEMPLATE, template));
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String templateNode = formBuilderFileUploadField.getTemplateNode();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.TEMPLATE_NODE, templateNode));
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String tip = formBuilderFileUploadField.getTip();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.TIP, tip));
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String tipFlagNode = formBuilderFileUploadField.getTipFlagNode();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.TIP_FLAG_NODE, tipFlagNode));
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String type = formBuilderFileUploadField.getType();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.TYPE, type));
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean unique = formBuilderFileUploadField.getUnique();
		renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.UNIQUE, unique));
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object zIndex = formBuilderFileUploadField.getZIndex();
		renderedAttributes.add(renderNumber(FormBuilderFileUploadField.Z_INDEX, zIndex));
	}

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderFileUploadField.getAfterAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderFileUploadField.getAfterBuilderChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderFileUploadField.getAfterControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderFileUploadField.getAfterDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderFileUploadField.getAfterDisabledChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderFileUploadField.getAfterDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderFileUploadField.getAfterHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterIdChange = formBuilderFileUploadField.getAfterIdChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterLabelChange = formBuilderFileUploadField.getAfterLabelChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderFileUploadField.getAfterLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderFileUploadField.getAfterLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterNameChange = formBuilderFileUploadField.getAfterNameChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterParentChange = formBuilderFileUploadField.getAfterParentChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_PARENT_CHANGE, afterParentChange));
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderFileUploadField.getAfterPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderFileUploadField.getAfterReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderFileUploadField.getAfterReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderFileUploadField.getAfterRequiredChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderFileUploadField.getAfterRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderFileUploadField.getAfterSelectedChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderFileUploadField.getAfterShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterStringsChange = formBuilderFileUploadField.getAfterStringsChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderFileUploadField.getAfterTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderFileUploadField.getAfterTemplateChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderFileUploadField.getAfterTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterTipChange = formBuilderFileUploadField.getAfterTipChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_TIP_CHANGE, afterTipChange));
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderFileUploadField.getAfterTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterTypeChange = formBuilderFileUploadField.getAfterTypeChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderFileUploadField.getAfterUniqueChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderFileUploadField.getAfterZIndexChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderFileUploadField.getOnAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onBuilderChange = formBuilderFileUploadField.getOnBuilderChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderFileUploadField.getOnControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderFileUploadField.getOnDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onDisabledChange = formBuilderFileUploadField.getOnDisabledChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderFileUploadField.getOnDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderFileUploadField.getOnHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onIdChange = formBuilderFileUploadField.getOnIdChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onLabelChange = formBuilderFileUploadField.getOnLabelChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderFileUploadField.getOnLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderFileUploadField.getOnLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onNameChange = formBuilderFileUploadField.getOnNameChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onParentChange = formBuilderFileUploadField.getOnParentChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_PARENT_CHANGE, onParentChange));
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderFileUploadField.getOnPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderFileUploadField.getOnReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderFileUploadField.getOnReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onRequiredChange = formBuilderFileUploadField.getOnRequiredChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderFileUploadField.getOnRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onSelectedChange = formBuilderFileUploadField.getOnSelectedChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderFileUploadField.getOnShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onStringsChange = formBuilderFileUploadField.getOnStringsChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderFileUploadField.getOnTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onTemplateChange = formBuilderFileUploadField.getOnTemplateChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_TEMPLATE_CHANGE, onTemplateChange));
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderFileUploadField.getOnTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onTipChange = formBuilderFileUploadField.getOnTipChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_TIP_CHANGE, onTipChange));
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderFileUploadField.getOnTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onTypeChange = formBuilderFileUploadField.getOnTypeChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onUniqueChange = formBuilderFileUploadField.getOnUniqueChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_UNIQUE_CHANGE, onUniqueChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onZIndexChange = formBuilderFileUploadField.getOnZIndexChange();
		renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}