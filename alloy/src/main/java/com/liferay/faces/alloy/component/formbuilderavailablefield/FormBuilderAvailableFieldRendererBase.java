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
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.AUIRenderer;
import com.liferay.faces.alloy.renderkit.BufferedResponseWriter;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class FormBuilderAvailableFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-base";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		FormBuilderAvailableField formBuilderAvailableField = (FormBuilderAvailableField) uiComponent;
		encodeHTML(facesContext, formBuilderAvailableField);
		encodeJavaScript(facesContext, formBuilderAvailableField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderAvailableField formBuilderAvailableField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderAvailableField formBuilderAvailableField) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, formBuilderAvailableField);

		bufferedResponseWriter.write("var formBuilderAvailableField = new A.FormBuilderAvailableField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderDestroyed(renrederedAttributes, formBuilderAvailableField);
		renderDraggable(renrederedAttributes, formBuilderAvailableField);
		renderHiddenAttributes(renrederedAttributes, formBuilderAvailableField);
		renderIconClass(renrederedAttributes, formBuilderAvailableField);
		renderFormbuilderavailablefieldId(renrederedAttributes, formBuilderAvailableField);
		renderInitialized(renrederedAttributes, formBuilderAvailableField);
		renderLabel(renrederedAttributes, formBuilderAvailableField);
		renderName(renrederedAttributes, formBuilderAvailableField);
		renderNode(renrederedAttributes, formBuilderAvailableField);
		renderOptions(renrederedAttributes, formBuilderAvailableField);
		renderPredefinedValue(renrederedAttributes, formBuilderAvailableField);
		renderReadOnlyAttributes(renrederedAttributes, formBuilderAvailableField);
		renderRequired(renrederedAttributes, formBuilderAvailableField);
		renderShowLabel(renrederedAttributes, formBuilderAvailableField);
		renderTip(renrederedAttributes, formBuilderAvailableField);
		renderType(renrederedAttributes, formBuilderAvailableField);
		renderUnique(renrederedAttributes, formBuilderAvailableField);
		renderWidth(renrederedAttributes, formBuilderAvailableField);

		Iterator<String> it = renrederedAttributes.iterator();

		while (it.hasNext()) {
			bufferedResponseWriter.write(it.next());

			if (it.hasNext()) {
				bufferedResponseWriter.write(StringPool.COMMA);
			}
		}

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(".render()");
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, formBuilderAvailableField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		if (formBuilderAvailableField.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", formBuilderAvailableField.getDestroyed()));
		}
	}

	protected void renderDraggable(ArrayList<String> renrederedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		if (formBuilderAvailableField.getDraggable() != null) {
			renrederedAttributes.add(renderBoolean("draggable", formBuilderAvailableField.getDraggable()));
		}
	}

	protected void renderHiddenAttributes(ArrayList<String> renrederedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		if (formBuilderAvailableField.getHiddenAttributes() != null) {
			renrederedAttributes.add(renderArray("hiddenAttributes", formBuilderAvailableField.getHiddenAttributes()));
		}
	}

	protected void renderIconClass(ArrayList<String> renrederedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		if (formBuilderAvailableField.getIconClass() != null) {
			renrederedAttributes.add(renderString("iconClass", formBuilderAvailableField.getIconClass()));
		}
	}

	protected void renderFormbuilderavailablefieldId(ArrayList<String> renrederedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		if (formBuilderAvailableField.getFormbuilderavailablefieldId() != null) {
			renrederedAttributes.add(renderString("formbuilderavailablefieldId", formBuilderAvailableField.getFormbuilderavailablefieldId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		if (formBuilderAvailableField.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", formBuilderAvailableField.getInitialized()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		if (formBuilderAvailableField.getLabel() != null) {
			renrederedAttributes.add(renderString("label", formBuilderAvailableField.getLabel()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		if (formBuilderAvailableField.getName() != null) {
			renrederedAttributes.add(renderString("name", formBuilderAvailableField.getName()));
		}
	}

	protected void renderNode(ArrayList<String> renrederedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		if (formBuilderAvailableField.getNode() != null) {
			renrederedAttributes.add(renderString("node", formBuilderAvailableField.getNode()));
		}
	}

	protected void renderOptions(ArrayList<String> renrederedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		if (formBuilderAvailableField.getOptions() != null) {
			renrederedAttributes.add(renderObject("options", formBuilderAvailableField.getOptions()));
		}
	}

	protected void renderPredefinedValue(ArrayList<String> renrederedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		if (formBuilderAvailableField.getPredefinedValue() != null) {
			renrederedAttributes.add(renderString("predefinedValue", formBuilderAvailableField.getPredefinedValue()));
		}
	}

	protected void renderReadOnlyAttributes(ArrayList<String> renrederedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		if (formBuilderAvailableField.getReadOnlyAttributes() != null) {
			renrederedAttributes.add(renderArray("readOnlyAttributes", formBuilderAvailableField.getReadOnlyAttributes()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		if (formBuilderAvailableField.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", formBuilderAvailableField.getRequired()));
		}
	}

	protected void renderShowLabel(ArrayList<String> renrederedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		if (formBuilderAvailableField.getShowLabel() != null) {
			renrederedAttributes.add(renderBoolean("showLabel", formBuilderAvailableField.getShowLabel()));
		}
	}

	protected void renderTip(ArrayList<String> renrederedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		if (formBuilderAvailableField.getTip() != null) {
			renrederedAttributes.add(renderString("tip", formBuilderAvailableField.getTip()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		if (formBuilderAvailableField.getType() != null) {
			renrederedAttributes.add(renderString("type", formBuilderAvailableField.getType()));
		}
	}

	protected void renderUnique(ArrayList<String> renrederedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		if (formBuilderAvailableField.getUnique() != null) {
			renrederedAttributes.add(renderBoolean("unique", formBuilderAvailableField.getUnique()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		if (formBuilderAvailableField.getWidth() != null) {
			renrederedAttributes.add(renderString("width", formBuilderAvailableField.getWidth()));
		}
	}

}