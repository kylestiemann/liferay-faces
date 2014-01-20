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
package com.liferay.faces.alloy.component.formbuilderavailablefield;

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
public abstract class FormBuilderAvailableFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-base";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderAvailableField formBuilderAvailableField = (FormBuilderAvailableField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderAvailableField = new A.FormBuilderAvailableField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (formBuilderAvailableField.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getDraggable() != null) {
			renderDraggable(renderedAttributes, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getHiddenAttributes() != null) {
			renderHiddenAttributes(renderedAttributes, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getIconClass() != null) {
			renderIconClass(renderedAttributes, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getFormBuilderAvailableFieldId() != null) {
			renderFormBuilderAvailableFieldId(renderedAttributes, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getInitialized() != null) {
			renderInitialized(renderedAttributes, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getLabel() != null) {
			renderLabel(renderedAttributes, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getName() != null) {
			renderName(renderedAttributes, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getNode() != null) {
			renderNode(renderedAttributes, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getOptions() != null) {
			renderOptions(renderedAttributes, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getPredefinedValue() != null) {
			renderPredefinedValue(renderedAttributes, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getReadOnlyAttributes() != null) {
			renderReadOnlyAttributes(renderedAttributes, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getRequired() != null) {
			renderRequired(renderedAttributes, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getShowLabel() != null) {
			renderShowLabel(renderedAttributes, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getTip() != null) {
			renderTip(renderedAttributes, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getType() != null) {
			renderType(renderedAttributes, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getUnique() != null) {
			renderUnique(renderedAttributes, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getWidth() != null) {
			renderWidth(renderedAttributes, formBuilderAvailableField);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (formBuilderAvailableField.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getAfterDraggableChange() != null) {
			renderAfterDraggableChange(renderedAfterEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getAfterHiddenAttributesChange() != null) {
			renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getAfterIconClassChange() != null) {
			renderAfterIconClassChange(renderedAfterEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getAfterNodeChange() != null) {
			renderAfterNodeChange(renderedAfterEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getAfterOptionsChange() != null) {
			renderAfterOptionsChange(renderedAfterEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getAfterPredefinedValueChange() != null) {
			renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getAfterReadOnlyAttributesChange() != null) {
			renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getAfterShowLabelChange() != null) {
			renderAfterShowLabelChange(renderedAfterEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getAfterTipChange() != null) {
			renderAfterTipChange(renderedAfterEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getAfterUniqueChange() != null) {
			renderAfterUniqueChange(renderedAfterEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, formBuilderAvailableField);
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

		if (formBuilderAvailableField.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getOnDraggableChange() != null) {
			renderOnDraggableChange(renderedOnEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getOnHiddenAttributesChange() != null) {
			renderOnHiddenAttributesChange(renderedOnEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getOnIconClassChange() != null) {
			renderOnIconClassChange(renderedOnEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getOnNodeChange() != null) {
			renderOnNodeChange(renderedOnEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getOnOptionsChange() != null) {
			renderOnOptionsChange(renderedOnEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getOnPredefinedValueChange() != null) {
			renderOnPredefinedValueChange(renderedOnEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getOnReadOnlyAttributesChange() != null) {
			renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getOnShowLabelChange() != null) {
			renderOnShowLabelChange(renderedOnEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getOnTipChange() != null) {
			renderOnTipChange(renderedOnEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getOnUniqueChange() != null) {
			renderOnUniqueChange(renderedOnEvents, formBuilderAvailableField);
		}
		
		if (formBuilderAvailableField.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, formBuilderAvailableField);
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

	protected void renderDestroyed(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Boolean destroyed = formBuilderAvailableField.getDestroyed();
		renderedAttributes.add(renderBoolean(FormBuilderAvailableField.DESTROYED, destroyed));
	}

	protected void renderDraggable(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Boolean draggable = formBuilderAvailableField.getDraggable();
		renderedAttributes.add(renderBoolean(FormBuilderAvailableField.DRAGGABLE, draggable));
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderAvailableField.getHiddenAttributes();
		renderedAttributes.add(renderArray(FormBuilderAvailableField.HIDDEN_ATTRIBUTES, hiddenAttributes));
	}

	protected void renderIconClass(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String iconClass = formBuilderAvailableField.getIconClass();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ICON_CLASS, iconClass));
	}

	protected void renderFormBuilderAvailableFieldId(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String formBuilderAvailableFieldId = formBuilderAvailableField.getFormBuilderAvailableFieldId();
		renderedAttributes.add(renderString(FormBuilderAvailableField.FORM_BUILDER_AVAILABLE_FIELD_ID, formBuilderAvailableFieldId));
	}

	protected void renderInitialized(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Boolean initialized = formBuilderAvailableField.getInitialized();
		renderedAttributes.add(renderBoolean(FormBuilderAvailableField.INITIALIZED, initialized));
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String label = formBuilderAvailableField.getLabel();
		renderedAttributes.add(renderString(FormBuilderAvailableField.LABEL, label));
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String name = formBuilderAvailableField.getName();
		renderedAttributes.add(renderString(FormBuilderAvailableField.NAME, name));
	}

	protected void renderNode(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Object node = formBuilderAvailableField.getNode();
		renderedAttributes.add(renderString(FormBuilderAvailableField.NODE, node));
	}

	protected void renderOptions(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Object options = formBuilderAvailableField.getOptions();
		renderedAttributes.add(renderObject(FormBuilderAvailableField.OPTIONS, options));
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String predefinedValue = formBuilderAvailableField.getPredefinedValue();
		renderedAttributes.add(renderString(FormBuilderAvailableField.PREDEFINED_VALUE, predefinedValue));
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderAvailableField.getReadOnlyAttributes();
		renderedAttributes.add(renderArray(FormBuilderAvailableField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Boolean required = formBuilderAvailableField.getRequired();
		renderedAttributes.add(renderBoolean(FormBuilderAvailableField.REQUIRED, required));
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Boolean showLabel = formBuilderAvailableField.getShowLabel();
		renderedAttributes.add(renderBoolean(FormBuilderAvailableField.SHOW_LABEL, showLabel));
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String tip = formBuilderAvailableField.getTip();
		renderedAttributes.add(renderString(FormBuilderAvailableField.TIP, tip));
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String type = formBuilderAvailableField.getType();
		renderedAttributes.add(renderString(FormBuilderAvailableField.TYPE, type));
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Boolean unique = formBuilderAvailableField.getUnique();
		renderedAttributes.add(renderBoolean(FormBuilderAvailableField.UNIQUE, unique));
	}

	protected void renderWidth(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String width = formBuilderAvailableField.getWidth();
		renderedAttributes.add(renderString(FormBuilderAvailableField.WIDTH, width));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterDestroyedChange = formBuilderAvailableField.getAfterDestroyedChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDraggableChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterDraggableChange = formBuilderAvailableField.getAfterDraggableChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_DRAGGABLE_CHANGE, afterDraggableChange));
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderAvailableField.getAfterHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
	}

	protected void renderAfterIconClassChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterIconClassChange = formBuilderAvailableField.getAfterIconClassChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_ICON_CLASS_CHANGE, afterIconClassChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterIdChange = formBuilderAvailableField.getAfterIdChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterInitializedChange = formBuilderAvailableField.getAfterInitializedChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterLabelChange = formBuilderAvailableField.getAfterLabelChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterNameChange = formBuilderAvailableField.getAfterNameChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterNodeChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterNodeChange = formBuilderAvailableField.getAfterNodeChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_NODE_CHANGE, afterNodeChange));
	}

	protected void renderAfterOptionsChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterOptionsChange = formBuilderAvailableField.getAfterOptionsChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_OPTIONS_CHANGE, afterOptionsChange));
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderAvailableField.getAfterPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderAvailableField.getAfterReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderAvailableField.getAfterRequiredChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderAvailableField.getAfterShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterTipChange = formBuilderAvailableField.getAfterTipChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_TIP_CHANGE, afterTipChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterTypeChange = formBuilderAvailableField.getAfterTypeChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderAvailableField.getAfterUniqueChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterWidthChange = formBuilderAvailableField.getAfterWidthChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onDestroyedChange = formBuilderAvailableField.getOnDestroyedChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDraggableChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onDraggableChange = formBuilderAvailableField.getOnDraggableChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ON_DRAGGABLE_CHANGE, onDraggableChange));
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderAvailableField.getOnHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
	}

	protected void renderOnIconClassChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onIconClassChange = formBuilderAvailableField.getOnIconClassChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ON_ICON_CLASS_CHANGE, onIconClassChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onIdChange = formBuilderAvailableField.getOnIdChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onInitializedChange = formBuilderAvailableField.getOnInitializedChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onLabelChange = formBuilderAvailableField.getOnLabelChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onNameChange = formBuilderAvailableField.getOnNameChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnNodeChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onNodeChange = formBuilderAvailableField.getOnNodeChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ON_NODE_CHANGE, onNodeChange));
	}

	protected void renderOnOptionsChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onOptionsChange = formBuilderAvailableField.getOnOptionsChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ON_OPTIONS_CHANGE, onOptionsChange));
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderAvailableField.getOnPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderAvailableField.getOnReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onRequiredChange = formBuilderAvailableField.getOnRequiredChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderAvailableField.getOnShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onTipChange = formBuilderAvailableField.getOnTipChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ON_TIP_CHANGE, onTipChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onTypeChange = formBuilderAvailableField.getOnTypeChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onUniqueChange = formBuilderAvailableField.getOnUniqueChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ON_UNIQUE_CHANGE, onUniqueChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onWidthChange = formBuilderAvailableField.getOnWidthChange();
		renderedAttributes.add(renderString(FormBuilderAvailableField.ON_WIDTH_CHANGE, onWidthChange));
	}

}