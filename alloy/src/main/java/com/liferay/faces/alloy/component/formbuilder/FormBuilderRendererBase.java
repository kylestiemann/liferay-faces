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
package com.liferay.faces.alloy.component.formbuilder;

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
public abstract class FormBuilderRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-base";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		FormBuilder formBuilder = (FormBuilder) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var formBuilder = new A.FormBuilder");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAllowRemoveRequiredFields(renrederedAttributes, formBuilder);
		renderAvailableFields(renrederedAttributes, formBuilder);
		renderAvailableFieldsDragConfig(renrederedAttributes, formBuilder);
		renderBoundingBox(renrederedAttributes, formBuilder);
		renderCanvas(renrederedAttributes, formBuilder);
		renderContentBox(renrederedAttributes, formBuilder);
		renderContentContainer(renrederedAttributes, formBuilder);
		renderCssClass(renrederedAttributes, formBuilder);
		renderDestroyed(renrederedAttributes, formBuilder);
		renderDisabled(renrederedAttributes, formBuilder);
		renderDropConfig(renrederedAttributes, formBuilder);
		renderDropContainer(renrederedAttributes, formBuilder);
		renderEnableEditing(renrederedAttributes, formBuilder);
		renderFields(renrederedAttributes, formBuilder);
		renderFieldsContainer(renrederedAttributes, formBuilder);
		renderFieldsSortableListConfig(renrederedAttributes, formBuilder);
		renderFocused(renrederedAttributes, formBuilder);
		renderHeight(renrederedAttributes, formBuilder);
		renderHideClass(renrederedAttributes, formBuilder);
		renderFormbuilderId(renrederedAttributes, formBuilder);
		renderInitialized(renrederedAttributes, formBuilder);
		renderFormbuilderLocale(renrederedAttributes, formBuilder);
		renderMaxFields(renrederedAttributes, formBuilder);
		renderPropertyList(renrederedAttributes, formBuilder);
		renderRender(renrederedAttributes, formBuilder);
		renderRendered(renrederedAttributes, formBuilder);
		renderSrcNode(renrederedAttributes, formBuilder);
		renderStrings(renrederedAttributes, formBuilder);
		renderTabIndex(renrederedAttributes, formBuilder);
		renderTabView(renrederedAttributes, formBuilder);
		renderToolbar(renrederedAttributes, formBuilder);
		renderToolbarContainer(renrederedAttributes, formBuilder);
		renderUseARIA(renrederedAttributes, formBuilder);
		renderVisible(renrederedAttributes, formBuilder);
		renderWidth(renrederedAttributes, formBuilder);

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
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAllowRemoveRequiredFields(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getAllowRemoveRequiredFields() != null) {
			renrederedAttributes.add(renderBoolean("allowRemoveRequiredFields", formBuilder.getAllowRemoveRequiredFields()));
		}
	}

	protected void renderAvailableFields(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getAvailableFields() != null) {
			renrederedAttributes.add(renderArray("availableFields", formBuilder.getAvailableFields()));
		}
	}

	protected void renderAvailableFieldsDragConfig(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getAvailableFieldsDragConfig() != null) {
			renrederedAttributes.add(renderObject("availableFieldsDragConfig", formBuilder.getAvailableFieldsDragConfig()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", formBuilder.getBoundingBox()));
		}
	}

	protected void renderCanvas(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getCanvas() != null) {
			renrederedAttributes.add(renderString("canvas", formBuilder.getCanvas()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", formBuilder.getContentBox()));
		}
	}

	protected void renderContentContainer(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getContentContainer() != null) {
			renrederedAttributes.add(renderString("contentContainer", formBuilder.getContentContainer()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", formBuilder.getCssClass()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", formBuilder.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", formBuilder.getDisabled()));
		}
	}

	protected void renderDropConfig(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getDropConfig() != null) {
			renrederedAttributes.add(renderObject("dropConfig", formBuilder.getDropConfig()));
		}
	}

	protected void renderDropContainer(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getDropContainer() != null) {
			renrederedAttributes.add(renderString("dropContainer", formBuilder.getDropContainer()));
		}
	}

	protected void renderEnableEditing(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getEnableEditing() != null) {
			renrederedAttributes.add(renderBoolean("enableEditing", formBuilder.getEnableEditing()));
		}
	}

	protected void renderFields(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getFields() != null) {
			renrederedAttributes.add(renderArray("fields", formBuilder.getFields()));
		}
	}

	protected void renderFieldsContainer(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getFieldsContainer() != null) {
			renrederedAttributes.add(renderString("fieldsContainer", formBuilder.getFieldsContainer()));
		}
	}

	protected void renderFieldsSortableListConfig(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getFieldsSortableListConfig() != null) {
			renrederedAttributes.add(renderObject("fieldsSortableListConfig", formBuilder.getFieldsSortableListConfig()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", formBuilder.getFocused()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getHeight() != null) {
			renrederedAttributes.add(renderString("height", formBuilder.getHeight()));
		}
	}

	protected void renderHideClass(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getHideClass() != null) {
			renrederedAttributes.add(renderString("hideClass", formBuilder.getHideClass()));
		}
	}

	protected void renderFormbuilderId(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getFormbuilderId() != null) {
			renrederedAttributes.add(renderString("formbuilderId", formBuilder.getFormbuilderId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", formBuilder.getInitialized()));
		}
	}

	protected void renderFormbuilderLocale(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getFormbuilderLocale() != null) {
			renrederedAttributes.add(renderString("formbuilderLocale", formBuilder.getFormbuilderLocale()));
		}
	}

	protected void renderMaxFields(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getMaxFields() != null) {
			renrederedAttributes.add(renderNumber("maxFields", formBuilder.getMaxFields()));
		}
	}

	protected void renderPropertyList(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getPropertyList() != null) {
			renrederedAttributes.add(renderObject("propertyList", formBuilder.getPropertyList()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getRender() != null) {
			renrederedAttributes.add(renderString("render", formBuilder.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", formBuilder.getRendered()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", formBuilder.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", formBuilder.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", formBuilder.getTabIndex()));
		}
	}

	protected void renderTabView(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getTabView() != null) {
			renrederedAttributes.add(renderObject("tabView", formBuilder.getTabView()));
		}
	}

	protected void renderToolbar(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getToolbar() != null) {
			renrederedAttributes.add(renderObject("toolbar", formBuilder.getToolbar()));
		}
	}

	protected void renderToolbarContainer(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getToolbarContainer() != null) {
			renrederedAttributes.add(renderString("toolbarContainer", formBuilder.getToolbarContainer()));
		}
	}

	protected void renderUseARIA(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getUseARIA() != null) {
			renrederedAttributes.add(renderBoolean("useARIA", formBuilder.getUseARIA()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", formBuilder.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, FormBuilder formBuilder) throws IOException {
		if (formBuilder.getWidth() != null) {
			renrederedAttributes.add(renderString("width", formBuilder.getWidth()));
		}
	}

}