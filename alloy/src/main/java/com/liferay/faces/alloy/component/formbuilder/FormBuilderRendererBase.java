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
		renderFormBuilderId(renderedAttributes, formBuilder);
		renderInitialized(renderedAttributes, formBuilder);
		renderFormBuilderLocale(renderedAttributes, formBuilder);
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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAllowRemoveRequiredFieldsChange(renderedAfterEvents, formBuilder);
		renderAfterAvailableFieldsChange(renderedAfterEvents, formBuilder);
		renderAfterAvailableFieldsDragConfigChange(renderedAfterEvents, formBuilder);
		renderAfterBoundingBoxChange(renderedAfterEvents, formBuilder);
		renderAfterCanvasChange(renderedAfterEvents, formBuilder);
		renderAfterContentBoxChange(renderedAfterEvents, formBuilder);
		renderAfterContentContainerChange(renderedAfterEvents, formBuilder);
		renderAfterCssClassChange(renderedAfterEvents, formBuilder);
		renderAfterDestroyedChange(renderedAfterEvents, formBuilder);
		renderAfterDisabledChange(renderedAfterEvents, formBuilder);
		renderAfterDropConfigChange(renderedAfterEvents, formBuilder);
		renderAfterDropContainerChange(renderedAfterEvents, formBuilder);
		renderAfterEnableEditingChange(renderedAfterEvents, formBuilder);
		renderAfterFieldsChange(renderedAfterEvents, formBuilder);
		renderAfterFieldsContainerChange(renderedAfterEvents, formBuilder);
		renderAfterFieldsSortableListConfigChange(renderedAfterEvents, formBuilder);
		renderAfterFocusedChange(renderedAfterEvents, formBuilder);
		renderAfterHeightChange(renderedAfterEvents, formBuilder);
		renderAfterHideClassChange(renderedAfterEvents, formBuilder);
		renderAfterIdChange(renderedAfterEvents, formBuilder);
		renderAfterInitializedChange(renderedAfterEvents, formBuilder);
		renderAfterLocaleChange(renderedAfterEvents, formBuilder);
		renderAfterMaxFieldsChange(renderedAfterEvents, formBuilder);
		renderAfterPropertyListChange(renderedAfterEvents, formBuilder);
		renderAfterRenderChange(renderedAfterEvents, formBuilder);
		renderAfterRenderedChange(renderedAfterEvents, formBuilder);
		renderAfterSrcNodeChange(renderedAfterEvents, formBuilder);
		renderAfterStringsChange(renderedAfterEvents, formBuilder);
		renderAfterTabIndexChange(renderedAfterEvents, formBuilder);
		renderAfterTabViewChange(renderedAfterEvents, formBuilder);
		renderAfterToolbarChange(renderedAfterEvents, formBuilder);
		renderAfterToolbarContainerChange(renderedAfterEvents, formBuilder);
		renderAfterUseARIAChange(renderedAfterEvents, formBuilder);
		renderAfterVisibleChange(renderedAfterEvents, formBuilder);
		renderAfterWidthChange(renderedAfterEvents, formBuilder);

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

		renderOnAllowRemoveRequiredFieldsChange(renderedOnEvents, formBuilder);
		renderOnAvailableFieldsChange(renderedOnEvents, formBuilder);
		renderOnAvailableFieldsDragConfigChange(renderedOnEvents, formBuilder);
		renderOnBoundingBoxChange(renderedOnEvents, formBuilder);
		renderOnCanvasChange(renderedOnEvents, formBuilder);
		renderOnContentBoxChange(renderedOnEvents, formBuilder);
		renderOnContentContainerChange(renderedOnEvents, formBuilder);
		renderOnCssClassChange(renderedOnEvents, formBuilder);
		renderOnDestroyedChange(renderedOnEvents, formBuilder);
		renderOnDisabledChange(renderedOnEvents, formBuilder);
		renderOnDropConfigChange(renderedOnEvents, formBuilder);
		renderOnDropContainerChange(renderedOnEvents, formBuilder);
		renderOnEnableEditingChange(renderedOnEvents, formBuilder);
		renderOnFieldsChange(renderedOnEvents, formBuilder);
		renderOnFieldsContainerChange(renderedOnEvents, formBuilder);
		renderOnFieldsSortableListConfigChange(renderedOnEvents, formBuilder);
		renderOnFocusedChange(renderedOnEvents, formBuilder);
		renderOnHeightChange(renderedOnEvents, formBuilder);
		renderOnHideClassChange(renderedOnEvents, formBuilder);
		renderOnIdChange(renderedOnEvents, formBuilder);
		renderOnInitializedChange(renderedOnEvents, formBuilder);
		renderOnLocaleChange(renderedOnEvents, formBuilder);
		renderOnMaxFieldsChange(renderedOnEvents, formBuilder);
		renderOnPropertyListChange(renderedOnEvents, formBuilder);
		renderOnRenderChange(renderedOnEvents, formBuilder);
		renderOnRenderedChange(renderedOnEvents, formBuilder);
		renderOnSrcNodeChange(renderedOnEvents, formBuilder);
		renderOnStringsChange(renderedOnEvents, formBuilder);
		renderOnTabIndexChange(renderedOnEvents, formBuilder);
		renderOnTabViewChange(renderedOnEvents, formBuilder);
		renderOnToolbarChange(renderedOnEvents, formBuilder);
		renderOnToolbarContainerChange(renderedOnEvents, formBuilder);
		renderOnUseARIAChange(renderedOnEvents, formBuilder);
		renderOnVisibleChange(renderedOnEvents, formBuilder);
		renderOnWidthChange(renderedOnEvents, formBuilder);

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

	protected void renderFormBuilderId(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String formBuilderId = formBuilder.getFormBuilderId();

		if (formBuilderId != null) {
			renderedAttributes.add(renderString(FormBuilder.FORM_BUILDER_ID, formBuilderId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean initialized = formBuilder.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(FormBuilder.INITIALIZED, initialized));
		}
	}

	protected void renderFormBuilderLocale(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String formBuilderLocale = formBuilder.getFormBuilderLocale();

		if (formBuilderLocale != null) {
			renderedAttributes.add(renderString(FormBuilder.FORM_BUILDER_LOCALE, formBuilderLocale));
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

	protected void renderAfterAllowRemoveRequiredFieldsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterAllowRemoveRequiredFieldsChange = formBuilder.getAfterAllowRemoveRequiredFieldsChange();

		if (afterAllowRemoveRequiredFieldsChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_ALLOW_REMOVE_REQUIRED_FIELDS_CHANGE, afterAllowRemoveRequiredFieldsChange));
		}
	}

	protected void renderAfterAvailableFieldsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterAvailableFieldsChange = formBuilder.getAfterAvailableFieldsChange();

		if (afterAvailableFieldsChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_AVAILABLE_FIELDS_CHANGE, afterAvailableFieldsChange));
		}
	}

	protected void renderAfterAvailableFieldsDragConfigChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterAvailableFieldsDragConfigChange = formBuilder.getAfterAvailableFieldsDragConfigChange();

		if (afterAvailableFieldsDragConfigChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE, afterAvailableFieldsDragConfigChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterBoundingBoxChange = formBuilder.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCanvasChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterCanvasChange = formBuilder.getAfterCanvasChange();

		if (afterCanvasChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_CANVAS_CHANGE, afterCanvasChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterContentBoxChange = formBuilder.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterContentContainerChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterContentContainerChange = formBuilder.getAfterContentContainerChange();

		if (afterContentContainerChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_CONTENT_CONTAINER_CHANGE, afterContentContainerChange));
		}
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterCssClassChange = formBuilder.getAfterCssClassChange();

		if (afterCssClassChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterDestroyedChange = formBuilder.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterDisabledChange = formBuilder.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterDropConfigChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterDropConfigChange = formBuilder.getAfterDropConfigChange();

		if (afterDropConfigChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_DROP_CONFIG_CHANGE, afterDropConfigChange));
		}
	}

	protected void renderAfterDropContainerChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterDropContainerChange = formBuilder.getAfterDropContainerChange();

		if (afterDropContainerChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_DROP_CONTAINER_CHANGE, afterDropContainerChange));
		}
	}

	protected void renderAfterEnableEditingChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterEnableEditingChange = formBuilder.getAfterEnableEditingChange();

		if (afterEnableEditingChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_ENABLE_EDITING_CHANGE, afterEnableEditingChange));
		}
	}

	protected void renderAfterFieldsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterFieldsChange = formBuilder.getAfterFieldsChange();

		if (afterFieldsChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_FIELDS_CHANGE, afterFieldsChange));
		}
	}

	protected void renderAfterFieldsContainerChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterFieldsContainerChange = formBuilder.getAfterFieldsContainerChange();

		if (afterFieldsContainerChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_FIELDS_CONTAINER_CHANGE, afterFieldsContainerChange));
		}
	}

	protected void renderAfterFieldsSortableListConfigChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterFieldsSortableListConfigChange = formBuilder.getAfterFieldsSortableListConfigChange();

		if (afterFieldsSortableListConfigChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_FIELDS_SORTABLE_LIST_CONFIG_CHANGE, afterFieldsSortableListConfigChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterFocusedChange = formBuilder.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterHeightChange = formBuilder.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterHideClassChange = formBuilder.getAfterHideClassChange();

		if (afterHideClassChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterIdChange = formBuilder.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterInitializedChange = formBuilder.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterLocaleChange = formBuilder.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterMaxFieldsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterMaxFieldsChange = formBuilder.getAfterMaxFieldsChange();

		if (afterMaxFieldsChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_MAX_FIELDS_CHANGE, afterMaxFieldsChange));
		}
	}

	protected void renderAfterPropertyListChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterPropertyListChange = formBuilder.getAfterPropertyListChange();

		if (afterPropertyListChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_PROPERTY_LIST_CHANGE, afterPropertyListChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterRenderChange = formBuilder.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterRenderedChange = formBuilder.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterSrcNodeChange = formBuilder.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterStringsChange = formBuilder.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterTabIndexChange = formBuilder.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTabViewChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterTabViewChange = formBuilder.getAfterTabViewChange();

		if (afterTabViewChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_TAB_VIEW_CHANGE, afterTabViewChange));
		}
	}

	protected void renderAfterToolbarChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterToolbarChange = formBuilder.getAfterToolbarChange();

		if (afterToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_TOOLBAR_CHANGE, afterToolbarChange));
		}
	}

	protected void renderAfterToolbarContainerChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterToolbarContainerChange = formBuilder.getAfterToolbarContainerChange();

		if (afterToolbarContainerChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_TOOLBAR_CONTAINER_CHANGE, afterToolbarContainerChange));
		}
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterUseARIAChange = formBuilder.getAfterUseARIAChange();

		if (afterUseARIAChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_USE_ARIACHANGE, afterUseARIAChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterVisibleChange = formBuilder.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterWidthChange = formBuilder.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(FormBuilder.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnAllowRemoveRequiredFieldsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onAllowRemoveRequiredFieldsChange = formBuilder.getOnAllowRemoveRequiredFieldsChange();

		if (onAllowRemoveRequiredFieldsChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_ALLOW_REMOVE_REQUIRED_FIELDS_CHANGE, onAllowRemoveRequiredFieldsChange));
		}
	}

	protected void renderOnAvailableFieldsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onAvailableFieldsChange = formBuilder.getOnAvailableFieldsChange();

		if (onAvailableFieldsChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_AVAILABLE_FIELDS_CHANGE, onAvailableFieldsChange));
		}
	}

	protected void renderOnAvailableFieldsDragConfigChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onAvailableFieldsDragConfigChange = formBuilder.getOnAvailableFieldsDragConfigChange();

		if (onAvailableFieldsDragConfigChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE, onAvailableFieldsDragConfigChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onBoundingBoxChange = formBuilder.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCanvasChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onCanvasChange = formBuilder.getOnCanvasChange();

		if (onCanvasChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_CANVAS_CHANGE, onCanvasChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onContentBoxChange = formBuilder.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnContentContainerChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onContentContainerChange = formBuilder.getOnContentContainerChange();

		if (onContentContainerChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_CONTENT_CONTAINER_CHANGE, onContentContainerChange));
		}
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onCssClassChange = formBuilder.getOnCssClassChange();

		if (onCssClassChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_CSS_CLASS_CHANGE, onCssClassChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onDestroyedChange = formBuilder.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onDisabledChange = formBuilder.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnDropConfigChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onDropConfigChange = formBuilder.getOnDropConfigChange();

		if (onDropConfigChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_DROP_CONFIG_CHANGE, onDropConfigChange));
		}
	}

	protected void renderOnDropContainerChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onDropContainerChange = formBuilder.getOnDropContainerChange();

		if (onDropContainerChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_DROP_CONTAINER_CHANGE, onDropContainerChange));
		}
	}

	protected void renderOnEnableEditingChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onEnableEditingChange = formBuilder.getOnEnableEditingChange();

		if (onEnableEditingChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_ENABLE_EDITING_CHANGE, onEnableEditingChange));
		}
	}

	protected void renderOnFieldsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onFieldsChange = formBuilder.getOnFieldsChange();

		if (onFieldsChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_FIELDS_CHANGE, onFieldsChange));
		}
	}

	protected void renderOnFieldsContainerChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onFieldsContainerChange = formBuilder.getOnFieldsContainerChange();

		if (onFieldsContainerChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_FIELDS_CONTAINER_CHANGE, onFieldsContainerChange));
		}
	}

	protected void renderOnFieldsSortableListConfigChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onFieldsSortableListConfigChange = formBuilder.getOnFieldsSortableListConfigChange();

		if (onFieldsSortableListConfigChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_FIELDS_SORTABLE_LIST_CONFIG_CHANGE, onFieldsSortableListConfigChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onFocusedChange = formBuilder.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onHeightChange = formBuilder.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onHideClassChange = formBuilder.getOnHideClassChange();

		if (onHideClassChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_HIDE_CLASS_CHANGE, onHideClassChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onIdChange = formBuilder.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onInitializedChange = formBuilder.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onLocaleChange = formBuilder.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnMaxFieldsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onMaxFieldsChange = formBuilder.getOnMaxFieldsChange();

		if (onMaxFieldsChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_MAX_FIELDS_CHANGE, onMaxFieldsChange));
		}
	}

	protected void renderOnPropertyListChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onPropertyListChange = formBuilder.getOnPropertyListChange();

		if (onPropertyListChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_PROPERTY_LIST_CHANGE, onPropertyListChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onRenderChange = formBuilder.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onRenderedChange = formBuilder.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onSrcNodeChange = formBuilder.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onStringsChange = formBuilder.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onTabIndexChange = formBuilder.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTabViewChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onTabViewChange = formBuilder.getOnTabViewChange();

		if (onTabViewChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_TAB_VIEW_CHANGE, onTabViewChange));
		}
	}

	protected void renderOnToolbarChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onToolbarChange = formBuilder.getOnToolbarChange();

		if (onToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_TOOLBAR_CHANGE, onToolbarChange));
		}
	}

	protected void renderOnToolbarContainerChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onToolbarContainerChange = formBuilder.getOnToolbarContainerChange();

		if (onToolbarContainerChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_TOOLBAR_CONTAINER_CHANGE, onToolbarContainerChange));
		}
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onUseARIAChange = formBuilder.getOnUseARIAChange();

		if (onUseARIAChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_USE_ARIACHANGE, onUseARIAChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onVisibleChange = formBuilder.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onWidthChange = formBuilder.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(FormBuilder.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}