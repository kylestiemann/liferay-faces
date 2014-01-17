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

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
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
		renderFormbuilderavailablefieldId(renderedAttributes, formBuilderAvailableField);
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

		Iterator<String> it = renderedAttributes.iterator();

		while (it.hasNext()) {
			responseWriter.write(it.next());

			if (it.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

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

	protected void renderFormbuilderavailablefieldId(List<String> renderedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		java.lang.String formbuilderavailablefieldId = formBuilderAvailableField.getFormbuilderavailablefieldId();

		if (formbuilderavailablefieldId != null) {
			renderedAttributes.add(renderString(FormBuilderAvailableField.FORMBUILDERAVAILABLEFIELD_ID, formbuilderavailablefieldId));
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

}