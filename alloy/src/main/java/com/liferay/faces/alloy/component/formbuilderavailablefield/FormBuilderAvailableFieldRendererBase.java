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

		renderDestroyed(renderedAttributes, formBuilderAvailableField);
		renderDraggable(renderedAttributes, formBuilderAvailableField);
		renderHiddenAttributes(renderedAttributes, formBuilderAvailableField);
		renderIconClass(renderedAttributes, formBuilderAvailableField);
		renderFormBuilderAvailableFieldId(renderedAttributes, formBuilderAvailableField);
		renderInitialized(renderedAttributes, formBuilderAvailableField);
		renderLabel(renderedAttributes, formBuilderAvailableField);
		renderName(renderedAttributes, formBuilderAvailableField);
		renderNode(renderedAttributes, formBuilderAvailableField);
		renderOptions(renderedAttributes, formBuilderAvailableField);
		renderPredefinedValue(renderedAttributes, formBuilderAvailableField);
		renderReadOnlyAttributes(renderedAttributes, formBuilderAvailableField);
		renderRequired(renderedAttributes, formBuilderAvailableField);
		renderShowLabel(renderedAttributes, formBuilderAvailableField);
		renderTip(renderedAttributes, formBuilderAvailableField);
		renderType(renderedAttributes, formBuilderAvailableField);
		renderUnique(renderedAttributes, formBuilderAvailableField);
		renderWidth(renderedAttributes, formBuilderAvailableField);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterDestroyedChange(renderedAfterEvents, formBuilderAvailableField);
		renderAfterDraggableChange(renderedAfterEvents, formBuilderAvailableField);
		renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderAvailableField);
		renderAfterIconClassChange(renderedAfterEvents, formBuilderAvailableField);
		renderAfterIdChange(renderedAfterEvents, formBuilderAvailableField);
		renderAfterInitializedChange(renderedAfterEvents, formBuilderAvailableField);
		renderAfterLabelChange(renderedAfterEvents, formBuilderAvailableField);
		renderAfterNameChange(renderedAfterEvents, formBuilderAvailableField);
		renderAfterNodeChange(renderedAfterEvents, formBuilderAvailableField);
		renderAfterOptionsChange(renderedAfterEvents, formBuilderAvailableField);
		renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderAvailableField);
		renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderAvailableField);
		renderAfterRequiredChange(renderedAfterEvents, formBuilderAvailableField);
		renderAfterShowLabelChange(renderedAfterEvents, formBuilderAvailableField);
		renderAfterTipChange(renderedAfterEvents, formBuilderAvailableField);
		renderAfterTypeChange(renderedAfterEvents, formBuilderAvailableField);
		renderAfterUniqueChange(renderedAfterEvents, formBuilderAvailableField);
		renderAfterWidthChange(renderedAfterEvents, formBuilderAvailableField);

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

		renderOnDestroyedChange(renderedOnEvents, formBuilderAvailableField);
		renderOnDraggableChange(renderedOnEvents, formBuilderAvailableField);
		renderOnHiddenAttributesChange(renderedOnEvents, formBuilderAvailableField);
		renderOnIconClassChange(renderedOnEvents, formBuilderAvailableField);
		renderOnIdChange(renderedOnEvents, formBuilderAvailableField);
		renderOnInitializedChange(renderedOnEvents, formBuilderAvailableField);
		renderOnLabelChange(renderedOnEvents, formBuilderAvailableField);
		renderOnNameChange(renderedOnEvents, formBuilderAvailableField);
		renderOnNodeChange(renderedOnEvents, formBuilderAvailableField);
		renderOnOptionsChange(renderedOnEvents, formBuilderAvailableField);
		renderOnPredefinedValueChange(renderedOnEvents, formBuilderAvailableField);
		renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderAvailableField);
		renderOnRequiredChange(renderedOnEvents, formBuilderAvailableField);
		renderOnShowLabelChange(renderedOnEvents, formBuilderAvailableField);
		renderOnTipChange(renderedOnEvents, formBuilderAvailableField);
		renderOnTypeChange(renderedOnEvents, formBuilderAvailableField);
		renderOnUniqueChange(renderedOnEvents, formBuilderAvailableField);
		renderOnWidthChange(renderedOnEvents, formBuilderAvailableField);

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

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(FormBuilderAvailableField.DESTROYED, destroyed));
		}
	}

	protected void renderDraggable(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Boolean draggable = formBuilderAvailableField.getDraggable();

		if (draggable != null) {
			renderedAttributes.add(renderBoolean(FormBuilderAvailableField.DRAGGABLE, draggable));
		}
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderAvailableField.getHiddenAttributes();

		if (hiddenAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderAvailableField.HIDDEN_ATTRIBUTES, hiddenAttributes));
		}
	}

	protected void renderIconClass(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String iconClass = formBuilderAvailableField.getIconClass();

		if (iconClass != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ICON_CLASS, iconClass));
		}
	}

	protected void renderFormBuilderAvailableFieldId(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String formBuilderAvailableFieldId = formBuilderAvailableField.getFormBuilderAvailableFieldId();

		if (formBuilderAvailableFieldId != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.FORM_BUILDER_AVAILABLE_FIELD_ID, formBuilderAvailableFieldId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Boolean initialized = formBuilderAvailableField.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(FormBuilderAvailableField.INITIALIZED, initialized));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String label = formBuilderAvailableField.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.LABEL, label));
		}
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String name = formBuilderAvailableField.getName();

		if (name != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.NAME, name));
		}
	}

	protected void renderNode(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Object node = formBuilderAvailableField.getNode();

		if (node != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.NODE, node));
		}
	}

	protected void renderOptions(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Object options = formBuilderAvailableField.getOptions();

		if (options != null) {
			renderedAttributes.add(renderObject(FormBuilderAvailableField.OPTIONS, options));
		}
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String predefinedValue = formBuilderAvailableField.getPredefinedValue();

		if (predefinedValue != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.PREDEFINED_VALUE, predefinedValue));
		}
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderAvailableField.getReadOnlyAttributes();

		if (readOnlyAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderAvailableField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Boolean required = formBuilderAvailableField.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(FormBuilderAvailableField.REQUIRED, required));
		}
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Boolean showLabel = formBuilderAvailableField.getShowLabel();

		if (showLabel != null) {
			renderedAttributes.add(renderBoolean(FormBuilderAvailableField.SHOW_LABEL, showLabel));
		}
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String tip = formBuilderAvailableField.getTip();

		if (tip != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.TIP, tip));
		}
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String type = formBuilderAvailableField.getType();

		if (type != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.TYPE, type));
		}
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.Boolean unique = formBuilderAvailableField.getUnique();

		if (unique != null) {
			renderedAttributes.add(renderBoolean(FormBuilderAvailableField.UNIQUE, unique));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String width = formBuilderAvailableField.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.WIDTH, width));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterDestroyedChange = formBuilderAvailableField.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDraggableChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterDraggableChange = formBuilderAvailableField.getAfterDraggableChange();

		if (afterDraggableChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_DRAGGABLE_CHANGE, afterDraggableChange));
		}
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderAvailableField.getAfterHiddenAttributesChange();

		if (afterHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
		}
	}

	protected void renderAfterIconClassChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterIconClassChange = formBuilderAvailableField.getAfterIconClassChange();

		if (afterIconClassChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_ICON_CLASS_CHANGE, afterIconClassChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterIdChange = formBuilderAvailableField.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterInitializedChange = formBuilderAvailableField.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterLabelChange = formBuilderAvailableField.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterNameChange = formBuilderAvailableField.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterNodeChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterNodeChange = formBuilderAvailableField.getAfterNodeChange();

		if (afterNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_NODE_CHANGE, afterNodeChange));
		}
	}

	protected void renderAfterOptionsChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterOptionsChange = formBuilderAvailableField.getAfterOptionsChange();

		if (afterOptionsChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_OPTIONS_CHANGE, afterOptionsChange));
		}
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderAvailableField.getAfterPredefinedValueChange();

		if (afterPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
		}
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderAvailableField.getAfterReadOnlyAttributesChange();

		if (afterReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderAvailableField.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderAvailableField.getAfterShowLabelChange();

		if (afterShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
		}
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterTipChange = formBuilderAvailableField.getAfterTipChange();

		if (afterTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_TIP_CHANGE, afterTipChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterTypeChange = formBuilderAvailableField.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderAvailableField.getAfterUniqueChange();

		if (afterUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String afterWidthChange = formBuilderAvailableField.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onDestroyedChange = formBuilderAvailableField.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDraggableChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onDraggableChange = formBuilderAvailableField.getOnDraggableChange();

		if (onDraggableChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ON_DRAGGABLE_CHANGE, onDraggableChange));
		}
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderAvailableField.getOnHiddenAttributesChange();

		if (onHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
		}
	}

	protected void renderOnIconClassChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onIconClassChange = formBuilderAvailableField.getOnIconClassChange();

		if (onIconClassChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ON_ICON_CLASS_CHANGE, onIconClassChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onIdChange = formBuilderAvailableField.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onInitializedChange = formBuilderAvailableField.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onLabelChange = formBuilderAvailableField.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onNameChange = formBuilderAvailableField.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnNodeChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onNodeChange = formBuilderAvailableField.getOnNodeChange();

		if (onNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ON_NODE_CHANGE, onNodeChange));
		}
	}

	protected void renderOnOptionsChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onOptionsChange = formBuilderAvailableField.getOnOptionsChange();

		if (onOptionsChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ON_OPTIONS_CHANGE, onOptionsChange));
		}
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderAvailableField.getOnPredefinedValueChange();

		if (onPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
		}
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderAvailableField.getOnReadOnlyAttributesChange();

		if (onReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onRequiredChange = formBuilderAvailableField.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderAvailableField.getOnShowLabelChange();

		if (onShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
		}
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onTipChange = formBuilderAvailableField.getOnTipChange();

		if (onTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ON_TIP_CHANGE, onTipChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onTypeChange = formBuilderAvailableField.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onUniqueChange = formBuilderAvailableField.getOnUniqueChange();

		if (onUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ON_UNIQUE_CHANGE, onUniqueChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String onWidthChange = formBuilderAvailableField.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}