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
public abstract class FormBuilderRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-base";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilder formBuilder = (FormBuilder) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilder = new A.FormBuilder");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAllowRemoveRequiredFields(renderedAttributes, formBuilder);
		renderAvailableFields(renderedAttributes, formBuilder);
		renderAvailableFieldsDragConfig(renderedAttributes, formBuilder);
		renderBoundingBox(renderedAttributes, formBuilder);
		renderCanvas(renderedAttributes, formBuilder);
		renderContentBox(renderedAttributes, formBuilder);
		renderContentContainer(renderedAttributes, formBuilder);
		renderCssClass(renderedAttributes, formBuilder);
		renderDestroyed(renderedAttributes, formBuilder);
		renderDisabled(renderedAttributes, formBuilder);
		renderDropConfig(renderedAttributes, formBuilder);
		renderDropContainer(renderedAttributes, formBuilder);
		renderEnableEditing(renderedAttributes, formBuilder);
		renderFields(renderedAttributes, formBuilder);
		renderFieldsContainer(renderedAttributes, formBuilder);
		renderFieldsSortableListConfig(renderedAttributes, formBuilder);
		renderFocused(renderedAttributes, formBuilder);
		renderHeight(renderedAttributes, formBuilder);
		renderHideClass(renderedAttributes, formBuilder);
		renderFormbuilderId(renderedAttributes, formBuilder);
		renderInitialized(renderedAttributes, formBuilder);
		renderFormbuilderLocale(renderedAttributes, formBuilder);
		renderMaxFields(renderedAttributes, formBuilder);
		renderPropertyList(renderedAttributes, formBuilder);
		renderRender(renderedAttributes, formBuilder);
		renderRendered(renderedAttributes, formBuilder);
		renderSrcNode(renderedAttributes, formBuilder);
		renderStrings(renderedAttributes, formBuilder);
		renderTabIndex(renderedAttributes, formBuilder);
		renderTabView(renderedAttributes, formBuilder);
		renderToolbar(renderedAttributes, formBuilder);
		renderToolbarContainer(renderedAttributes, formBuilder);
		renderUseARIA(renderedAttributes, formBuilder);
		renderVisible(renderedAttributes, formBuilder);
		renderWidth(renderedAttributes, formBuilder);

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

	protected void renderAllowRemoveRequiredFields(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean allowRemoveRequiredFields = formBuilder.getAllowRemoveRequiredFields();

		if (allowRemoveRequiredFields != null) {
			renderedAttributes.add(renderBoolean(FormBuilder.ALLOW_REMOVE_REQUIRED_FIELDS, allowRemoveRequiredFields));
		}
	}

	protected void renderAvailableFields(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object availableFields = formBuilder.getAvailableFields();

		if (availableFields != null) {
			renderedAttributes.add(renderArray(FormBuilder.AVAILABLE_FIELDS, availableFields));
		}
	}

	protected void renderAvailableFieldsDragConfig(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object availableFieldsDragConfig = formBuilder.getAvailableFieldsDragConfig();

		if (availableFieldsDragConfig != null) {
			renderedAttributes.add(renderObject(FormBuilder.AVAILABLE_FIELDS_DRAG_CONFIG, availableFieldsDragConfig));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String boundingBox = formBuilder.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(FormBuilder.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCanvas(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String canvas = formBuilder.getCanvas();

		if (canvas != null) {
			renderedAttributes.add(renderString(FormBuilder.CANVAS, canvas));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String contentBox = formBuilder.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(FormBuilder.CONTENT_BOX, contentBox));
		}
	}

	protected void renderContentContainer(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String contentContainer = formBuilder.getContentContainer();

		if (contentContainer != null) {
			renderedAttributes.add(renderString(FormBuilder.CONTENT_CONTAINER, contentContainer));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String cssClass = formBuilder.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(FormBuilder.CSS_CLASS, cssClass));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean destroyed = formBuilder.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(FormBuilder.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean disabled = formBuilder.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(FormBuilder.DISABLED, disabled));
		}
	}

	protected void renderDropConfig(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object dropConfig = formBuilder.getDropConfig();

		if (dropConfig != null) {
			renderedAttributes.add(renderObject(FormBuilder.DROP_CONFIG, dropConfig));
		}
	}

	protected void renderDropContainer(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String dropContainer = formBuilder.getDropContainer();

		if (dropContainer != null) {
			renderedAttributes.add(renderString(FormBuilder.DROP_CONTAINER, dropContainer));
		}
	}

	protected void renderEnableEditing(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean enableEditing = formBuilder.getEnableEditing();

		if (enableEditing != null) {
			renderedAttributes.add(renderBoolean(FormBuilder.ENABLE_EDITING, enableEditing));
		}
	}

	protected void renderFields(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object fields = formBuilder.getFields();

		if (fields != null) {
			renderedAttributes.add(renderArray(FormBuilder.FIELDS, fields));
		}
	}

	protected void renderFieldsContainer(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String fieldsContainer = formBuilder.getFieldsContainer();

		if (fieldsContainer != null) {
			renderedAttributes.add(renderString(FormBuilder.FIELDS_CONTAINER, fieldsContainer));
		}
	}

	protected void renderFieldsSortableListConfig(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object fieldsSortableListConfig = formBuilder.getFieldsSortableListConfig();

		if (fieldsSortableListConfig != null) {
			renderedAttributes.add(renderObject(FormBuilder.FIELDS_SORTABLE_LIST_CONFIG, fieldsSortableListConfig));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean focused = formBuilder.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(FormBuilder.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object height = formBuilder.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(FormBuilder.HEIGHT, height));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String hideClass = formBuilder.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(FormBuilder.HIDE_CLASS, hideClass));
		}
	}

	protected void renderFormbuilderId(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String formbuilderId = formBuilder.getFormbuilderId();

		if (formbuilderId != null) {
			renderedAttributes.add(renderString(FormBuilder.FORMBUILDER_ID, formbuilderId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean initialized = formBuilder.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(FormBuilder.INITIALIZED, initialized));
		}
	}

	protected void renderFormbuilderLocale(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String formbuilderLocale = formBuilder.getFormbuilderLocale();

		if (formbuilderLocale != null) {
			renderedAttributes.add(renderString(FormBuilder.FORMBUILDER_LOCALE, formbuilderLocale));
		}
	}

	protected void renderMaxFields(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object maxFields = formBuilder.getMaxFields();

		if (maxFields != null) {
			renderedAttributes.add(renderNumber(FormBuilder.MAX_FIELDS, maxFields));
		}
	}

	protected void renderPropertyList(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object propertyList = formBuilder.getPropertyList();

		if (propertyList != null) {
			renderedAttributes.add(renderObject(FormBuilder.PROPERTY_LIST, propertyList));
		}
	}

	protected void renderRender(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object render = formBuilder.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(FormBuilder.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean rendered = formBuilder.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(FormBuilder.RENDERED, rendered));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String srcNode = formBuilder.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(FormBuilder.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object strings = formBuilder.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(FormBuilder.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object tabIndex = formBuilder.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilder.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTabView(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object tabView = formBuilder.getTabView();

		if (tabView != null) {
			renderedAttributes.add(renderObject(FormBuilder.TAB_VIEW, tabView));
		}
	}

	protected void renderToolbar(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object toolbar = formBuilder.getToolbar();

		if (toolbar != null) {
			renderedAttributes.add(renderObject(FormBuilder.TOOLBAR, toolbar));
		}
	}

	protected void renderToolbarContainer(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String toolbarContainer = formBuilder.getToolbarContainer();

		if (toolbarContainer != null) {
			renderedAttributes.add(renderString(FormBuilder.TOOLBAR_CONTAINER, toolbarContainer));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean useARIA = formBuilder.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(FormBuilder.USE_ARIA, useARIA));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean visible = formBuilder.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(FormBuilder.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object width = formBuilder.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(FormBuilder.WIDTH, width));
		}
	}

}