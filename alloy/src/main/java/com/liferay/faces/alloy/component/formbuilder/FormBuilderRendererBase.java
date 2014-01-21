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

		if (formBuilder.getAllowRemoveRequiredFields() != null) {
			renderAllowRemoveRequiredFields(renderedAttributes, formBuilder);
		}

		if (formBuilder.getAvailableFields() != null) {
			renderAvailableFields(renderedAttributes, formBuilder);
		}

		if (formBuilder.getAvailableFieldsDragConfig() != null) {
			renderAvailableFieldsDragConfig(renderedAttributes, formBuilder);
		}

		if (formBuilder.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, formBuilder);
		}

		if (formBuilder.getCanvas() != null) {
			renderCanvas(renderedAttributes, formBuilder);
		}

		if (formBuilder.getContentBox() != null) {
			renderContentBox(renderedAttributes, formBuilder);
		}

		if (formBuilder.getContentContainer() != null) {
			renderContentContainer(renderedAttributes, formBuilder);
		}

		if (formBuilder.getCssClass() != null) {
			renderCssClass(renderedAttributes, formBuilder);
		}

		if (formBuilder.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, formBuilder);
		}

		if (formBuilder.getDisabled() != null) {
			renderDisabled(renderedAttributes, formBuilder);
		}

		if (formBuilder.getDropConfig() != null) {
			renderDropConfig(renderedAttributes, formBuilder);
		}

		if (formBuilder.getDropContainer() != null) {
			renderDropContainer(renderedAttributes, formBuilder);
		}

		if (formBuilder.getEnableEditing() != null) {
			renderEnableEditing(renderedAttributes, formBuilder);
		}

		if (formBuilder.getFields() != null) {
			renderFields(renderedAttributes, formBuilder);
		}

		if (formBuilder.getFieldsContainer() != null) {
			renderFieldsContainer(renderedAttributes, formBuilder);
		}

		if (formBuilder.getFieldsSortableListConfig() != null) {
			renderFieldsSortableListConfig(renderedAttributes, formBuilder);
		}

		if (formBuilder.getFocused() != null) {
			renderFocused(renderedAttributes, formBuilder);
		}

		if (formBuilder.getHeight() != null) {
			renderHeight(renderedAttributes, formBuilder);
		}

		if (formBuilder.getHideClass() != null) {
			renderHideClass(renderedAttributes, formBuilder);
		}

		if (formBuilder.getFormBuilderId() != null) {
			renderFormBuilderId(renderedAttributes, formBuilder);
		}

		if (formBuilder.getInitialized() != null) {
			renderInitialized(renderedAttributes, formBuilder);
		}

		if (formBuilder.getFormBuilderLocale() != null) {
			renderFormBuilderLocale(renderedAttributes, formBuilder);
		}

		if (formBuilder.getMaxFields() != null) {
			renderMaxFields(renderedAttributes, formBuilder);
		}

		if (formBuilder.getPropertyList() != null) {
			renderPropertyList(renderedAttributes, formBuilder);
		}

		if (formBuilder.getRender() != null) {
			renderRender(renderedAttributes, formBuilder);
		}

		if (formBuilder.getRendered() != null) {
			renderRendered(renderedAttributes, formBuilder);
		}

		if (formBuilder.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, formBuilder);
		}

		if (formBuilder.getStrings() != null) {
			renderStrings(renderedAttributes, formBuilder);
		}

		if (formBuilder.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, formBuilder);
		}

		if (formBuilder.getTabView() != null) {
			renderTabView(renderedAttributes, formBuilder);
		}

		if (formBuilder.getToolbar() != null) {
			renderToolbar(renderedAttributes, formBuilder);
		}

		if (formBuilder.getToolbarContainer() != null) {
			renderToolbarContainer(renderedAttributes, formBuilder);
		}

		if (formBuilder.getUseARIA() != null) {
			renderUseARIA(renderedAttributes, formBuilder);
		}

		if (formBuilder.getVisible() != null) {
			renderVisible(renderedAttributes, formBuilder);
		}

		if (formBuilder.getWidth() != null) {
			renderWidth(renderedAttributes, formBuilder);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (formBuilder.getAfterAllowRemoveRequiredFieldsChange() != null) {
			renderAfterAllowRemoveRequiredFieldsChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterAvailableFieldsChange() != null) {
			renderAfterAvailableFieldsChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterAvailableFieldsDragConfigChange() != null) {
			renderAfterAvailableFieldsDragConfigChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterCanvasChange() != null) {
			renderAfterCanvasChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterContentContainerChange() != null) {
			renderAfterContentContainerChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterDropConfigChange() != null) {
			renderAfterDropConfigChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterDropContainerChange() != null) {
			renderAfterDropContainerChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterEnableEditingChange() != null) {
			renderAfterEnableEditingChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterFieldsChange() != null) {
			renderAfterFieldsChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterFieldsContainerChange() != null) {
			renderAfterFieldsContainerChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterFieldsSortableListConfigChange() != null) {
			renderAfterFieldsSortableListConfigChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterHideClassChange() != null) {
			renderAfterHideClassChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterMaxFieldsChange() != null) {
			renderAfterMaxFieldsChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterPropertyListChange() != null) {
			renderAfterPropertyListChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterTabViewChange() != null) {
			renderAfterTabViewChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterToolbarChange() != null) {
			renderAfterToolbarChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterToolbarContainerChange() != null) {
			renderAfterToolbarContainerChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterUseARIAChange() != null) {
			renderAfterUseARIAChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, formBuilder);
		}

		if (formBuilder.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, formBuilder);
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

		if (formBuilder.getOnAllowRemoveRequiredFieldsChange() != null) {
			renderOnAllowRemoveRequiredFieldsChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnAvailableFieldsChange() != null) {
			renderOnAvailableFieldsChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnAvailableFieldsDragConfigChange() != null) {
			renderOnAvailableFieldsDragConfigChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnCanvasChange() != null) {
			renderOnCanvasChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnContentContainerChange() != null) {
			renderOnContentContainerChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnDropConfigChange() != null) {
			renderOnDropConfigChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnDropContainerChange() != null) {
			renderOnDropContainerChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnEnableEditingChange() != null) {
			renderOnEnableEditingChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnFieldsChange() != null) {
			renderOnFieldsChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnFieldsContainerChange() != null) {
			renderOnFieldsContainerChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnFieldsSortableListConfigChange() != null) {
			renderOnFieldsSortableListConfigChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnHideClassChange() != null) {
			renderOnHideClassChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnMaxFieldsChange() != null) {
			renderOnMaxFieldsChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnPropertyListChange() != null) {
			renderOnPropertyListChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnTabViewChange() != null) {
			renderOnTabViewChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnToolbarChange() != null) {
			renderOnToolbarChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnToolbarContainerChange() != null) {
			renderOnToolbarContainerChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnUseARIAChange() != null) {
			renderOnUseARIAChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, formBuilder);
		}

		if (formBuilder.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, formBuilder);
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

	protected void renderAllowRemoveRequiredFields(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean allowRemoveRequiredFields = formBuilder.getAllowRemoveRequiredFields();
		renderedAttributes.add(renderBoolean(FormBuilder.ALLOW_REMOVE_REQUIRED_FIELDS, allowRemoveRequiredFields));
	}

	protected void renderAvailableFields(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object availableFields = formBuilder.getAvailableFields();
		renderedAttributes.add(renderArray(FormBuilder.AVAILABLE_FIELDS, availableFields));
	}

	protected void renderAvailableFieldsDragConfig(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object availableFieldsDragConfig = formBuilder.getAvailableFieldsDragConfig();
		renderedAttributes.add(renderObject(FormBuilder.AVAILABLE_FIELDS_DRAG_CONFIG, availableFieldsDragConfig));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String boundingBox = formBuilder.getBoundingBox();
		renderedAttributes.add(renderString(FormBuilder.BOUNDING_BOX, boundingBox));
	}

	protected void renderCanvas(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String canvas = formBuilder.getCanvas();
		renderedAttributes.add(renderString(FormBuilder.CANVAS, canvas));
	}

	protected void renderContentBox(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String contentBox = formBuilder.getContentBox();
		renderedAttributes.add(renderString(FormBuilder.CONTENT_BOX, contentBox));
	}

	protected void renderContentContainer(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String contentContainer = formBuilder.getContentContainer();
		renderedAttributes.add(renderString(FormBuilder.CONTENT_CONTAINER, contentContainer));
	}

	protected void renderCssClass(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String cssClass = formBuilder.getCssClass();
		renderedAttributes.add(renderString(FormBuilder.CSS_CLASS, cssClass));
	}

	protected void renderDestroyed(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean destroyed = formBuilder.getDestroyed();
		renderedAttributes.add(renderBoolean(FormBuilder.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean disabled = formBuilder.getDisabled();
		renderedAttributes.add(renderBoolean(FormBuilder.DISABLED, disabled));
	}

	protected void renderDropConfig(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object dropConfig = formBuilder.getDropConfig();
		renderedAttributes.add(renderObject(FormBuilder.DROP_CONFIG, dropConfig));
	}

	protected void renderDropContainer(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String dropContainer = formBuilder.getDropContainer();
		renderedAttributes.add(renderString(FormBuilder.DROP_CONTAINER, dropContainer));
	}

	protected void renderEnableEditing(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean enableEditing = formBuilder.getEnableEditing();
		renderedAttributes.add(renderBoolean(FormBuilder.ENABLE_EDITING, enableEditing));
	}

	protected void renderFields(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object fields = formBuilder.getFields();
		renderedAttributes.add(renderArray(FormBuilder.FIELDS, fields));
	}

	protected void renderFieldsContainer(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String fieldsContainer = formBuilder.getFieldsContainer();
		renderedAttributes.add(renderString(FormBuilder.FIELDS_CONTAINER, fieldsContainer));
	}

	protected void renderFieldsSortableListConfig(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object fieldsSortableListConfig = formBuilder.getFieldsSortableListConfig();
		renderedAttributes.add(renderObject(FormBuilder.FIELDS_SORTABLE_LIST_CONFIG, fieldsSortableListConfig));
	}

	protected void renderFocused(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean focused = formBuilder.getFocused();
		renderedAttributes.add(renderBoolean(FormBuilder.FOCUSED, focused));
	}

	protected void renderHeight(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object height = formBuilder.getHeight();
		renderedAttributes.add(renderString(FormBuilder.HEIGHT, height));
	}

	protected void renderHideClass(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String hideClass = formBuilder.getHideClass();
		renderedAttributes.add(renderString(FormBuilder.HIDE_CLASS, hideClass));
	}

	protected void renderFormBuilderId(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String formBuilderId = formBuilder.getFormBuilderId();
		renderedAttributes.add(renderString(FormBuilder.FORM_BUILDER_ID, formBuilderId));
	}

	protected void renderInitialized(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean initialized = formBuilder.getInitialized();
		renderedAttributes.add(renderBoolean(FormBuilder.INITIALIZED, initialized));
	}

	protected void renderFormBuilderLocale(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String formBuilderLocale = formBuilder.getFormBuilderLocale();
		renderedAttributes.add(renderString(FormBuilder.FORM_BUILDER_LOCALE, formBuilderLocale));
	}

	protected void renderMaxFields(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object maxFields = formBuilder.getMaxFields();
		renderedAttributes.add(renderNumber(FormBuilder.MAX_FIELDS, maxFields));
	}

	protected void renderPropertyList(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object propertyList = formBuilder.getPropertyList();
		renderedAttributes.add(renderObject(FormBuilder.PROPERTY_LIST, propertyList));
	}

	protected void renderRender(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object render = formBuilder.getRender();
		renderedAttributes.add(renderString(FormBuilder.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean rendered = formBuilder.getRendered();
		renderedAttributes.add(renderBoolean(FormBuilder.RENDERED, rendered));
	}

	protected void renderSrcNode(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String srcNode = formBuilder.getSrcNode();
		renderedAttributes.add(renderString(FormBuilder.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object strings = formBuilder.getStrings();
		renderedAttributes.add(renderObject(FormBuilder.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object tabIndex = formBuilder.getTabIndex();
		renderedAttributes.add(renderNumber(FormBuilder.TAB_INDEX, tabIndex));
	}

	protected void renderTabView(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object tabView = formBuilder.getTabView();
		renderedAttributes.add(renderObject(FormBuilder.TAB_VIEW, tabView));
	}

	protected void renderToolbar(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object toolbar = formBuilder.getToolbar();
		renderedAttributes.add(renderObject(FormBuilder.TOOLBAR, toolbar));
	}

	protected void renderToolbarContainer(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String toolbarContainer = formBuilder.getToolbarContainer();
		renderedAttributes.add(renderString(FormBuilder.TOOLBAR_CONTAINER, toolbarContainer));
	}

	protected void renderUseARIA(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean useARIA = formBuilder.getUseARIA();
		renderedAttributes.add(renderBoolean(FormBuilder.USE_ARIA, useARIA));
	}

	protected void renderVisible(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Boolean visible = formBuilder.getVisible();
		renderedAttributes.add(renderBoolean(FormBuilder.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.Object width = formBuilder.getWidth();
		renderedAttributes.add(renderString(FormBuilder.WIDTH, width));
	}

	protected void renderAfterAllowRemoveRequiredFieldsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterAllowRemoveRequiredFieldsChange = formBuilder.getAfterAllowRemoveRequiredFieldsChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_ALLOW_REMOVE_REQUIRED_FIELDS_CHANGE, afterAllowRemoveRequiredFieldsChange));
	}

	protected void renderAfterAvailableFieldsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterAvailableFieldsChange = formBuilder.getAfterAvailableFieldsChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_AVAILABLE_FIELDS_CHANGE, afterAvailableFieldsChange));
	}

	protected void renderAfterAvailableFieldsDragConfigChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterAvailableFieldsDragConfigChange = formBuilder.getAfterAvailableFieldsDragConfigChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE, afterAvailableFieldsDragConfigChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterBoundingBoxChange = formBuilder.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCanvasChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterCanvasChange = formBuilder.getAfterCanvasChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_CANVAS_CHANGE, afterCanvasChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterContentBoxChange = formBuilder.getAfterContentBoxChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterContentContainerChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterContentContainerChange = formBuilder.getAfterContentContainerChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_CONTENT_CONTAINER_CHANGE, afterContentContainerChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterCssClassChange = formBuilder.getAfterCssClassChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterDestroyedChange = formBuilder.getAfterDestroyedChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterDisabledChange = formBuilder.getAfterDisabledChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterDropConfigChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterDropConfigChange = formBuilder.getAfterDropConfigChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_DROP_CONFIG_CHANGE, afterDropConfigChange));
	}

	protected void renderAfterDropContainerChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterDropContainerChange = formBuilder.getAfterDropContainerChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_DROP_CONTAINER_CHANGE, afterDropContainerChange));
	}

	protected void renderAfterEnableEditingChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterEnableEditingChange = formBuilder.getAfterEnableEditingChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_ENABLE_EDITING_CHANGE, afterEnableEditingChange));
	}

	protected void renderAfterFieldsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterFieldsChange = formBuilder.getAfterFieldsChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_FIELDS_CHANGE, afterFieldsChange));
	}

	protected void renderAfterFieldsContainerChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterFieldsContainerChange = formBuilder.getAfterFieldsContainerChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_FIELDS_CONTAINER_CHANGE, afterFieldsContainerChange));
	}

	protected void renderAfterFieldsSortableListConfigChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterFieldsSortableListConfigChange = formBuilder.getAfterFieldsSortableListConfigChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_FIELDS_SORTABLE_LIST_CONFIG_CHANGE, afterFieldsSortableListConfigChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterFocusedChange = formBuilder.getAfterFocusedChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterHeightChange = formBuilder.getAfterHeightChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterHideClassChange = formBuilder.getAfterHideClassChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterIdChange = formBuilder.getAfterIdChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterInitializedChange = formBuilder.getAfterInitializedChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterLocaleChange = formBuilder.getAfterLocaleChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterMaxFieldsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterMaxFieldsChange = formBuilder.getAfterMaxFieldsChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_MAX_FIELDS_CHANGE, afterMaxFieldsChange));
	}

	protected void renderAfterPropertyListChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterPropertyListChange = formBuilder.getAfterPropertyListChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_PROPERTY_LIST_CHANGE, afterPropertyListChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterRenderChange = formBuilder.getAfterRenderChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterRenderedChange = formBuilder.getAfterRenderedChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterSrcNodeChange = formBuilder.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterStringsChange = formBuilder.getAfterStringsChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterTabIndexChange = formBuilder.getAfterTabIndexChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTabViewChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterTabViewChange = formBuilder.getAfterTabViewChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_TAB_VIEW_CHANGE, afterTabViewChange));
	}

	protected void renderAfterToolbarChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterToolbarChange = formBuilder.getAfterToolbarChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_TOOLBAR_CHANGE, afterToolbarChange));
	}

	protected void renderAfterToolbarContainerChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterToolbarContainerChange = formBuilder.getAfterToolbarContainerChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_TOOLBAR_CONTAINER_CHANGE, afterToolbarContainerChange));
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterUseARIAChange = formBuilder.getAfterUseARIAChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_USE_ARIACHANGE, afterUseARIAChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterVisibleChange = formBuilder.getAfterVisibleChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String afterWidthChange = formBuilder.getAfterWidthChange();
		renderedAttributes.add(renderString(FormBuilder.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnAllowRemoveRequiredFieldsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onAllowRemoveRequiredFieldsChange = formBuilder.getOnAllowRemoveRequiredFieldsChange();
		renderedAttributes.add(renderString(FormBuilder.ON_ALLOW_REMOVE_REQUIRED_FIELDS_CHANGE, onAllowRemoveRequiredFieldsChange));
	}

	protected void renderOnAvailableFieldsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onAvailableFieldsChange = formBuilder.getOnAvailableFieldsChange();
		renderedAttributes.add(renderString(FormBuilder.ON_AVAILABLE_FIELDS_CHANGE, onAvailableFieldsChange));
	}

	protected void renderOnAvailableFieldsDragConfigChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onAvailableFieldsDragConfigChange = formBuilder.getOnAvailableFieldsDragConfigChange();
		renderedAttributes.add(renderString(FormBuilder.ON_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE, onAvailableFieldsDragConfigChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onBoundingBoxChange = formBuilder.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(FormBuilder.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCanvasChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onCanvasChange = formBuilder.getOnCanvasChange();
		renderedAttributes.add(renderString(FormBuilder.ON_CANVAS_CHANGE, onCanvasChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onContentBoxChange = formBuilder.getOnContentBoxChange();
		renderedAttributes.add(renderString(FormBuilder.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnContentContainerChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onContentContainerChange = formBuilder.getOnContentContainerChange();
		renderedAttributes.add(renderString(FormBuilder.ON_CONTENT_CONTAINER_CHANGE, onContentContainerChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onCssClassChange = formBuilder.getOnCssClassChange();
		renderedAttributes.add(renderString(FormBuilder.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onDestroyedChange = formBuilder.getOnDestroyedChange();
		renderedAttributes.add(renderString(FormBuilder.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onDisabledChange = formBuilder.getOnDisabledChange();
		renderedAttributes.add(renderString(FormBuilder.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnDropConfigChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onDropConfigChange = formBuilder.getOnDropConfigChange();
		renderedAttributes.add(renderString(FormBuilder.ON_DROP_CONFIG_CHANGE, onDropConfigChange));
	}

	protected void renderOnDropContainerChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onDropContainerChange = formBuilder.getOnDropContainerChange();
		renderedAttributes.add(renderString(FormBuilder.ON_DROP_CONTAINER_CHANGE, onDropContainerChange));
	}

	protected void renderOnEnableEditingChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onEnableEditingChange = formBuilder.getOnEnableEditingChange();
		renderedAttributes.add(renderString(FormBuilder.ON_ENABLE_EDITING_CHANGE, onEnableEditingChange));
	}

	protected void renderOnFieldsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onFieldsChange = formBuilder.getOnFieldsChange();
		renderedAttributes.add(renderString(FormBuilder.ON_FIELDS_CHANGE, onFieldsChange));
	}

	protected void renderOnFieldsContainerChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onFieldsContainerChange = formBuilder.getOnFieldsContainerChange();
		renderedAttributes.add(renderString(FormBuilder.ON_FIELDS_CONTAINER_CHANGE, onFieldsContainerChange));
	}

	protected void renderOnFieldsSortableListConfigChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onFieldsSortableListConfigChange = formBuilder.getOnFieldsSortableListConfigChange();
		renderedAttributes.add(renderString(FormBuilder.ON_FIELDS_SORTABLE_LIST_CONFIG_CHANGE, onFieldsSortableListConfigChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onFocusedChange = formBuilder.getOnFocusedChange();
		renderedAttributes.add(renderString(FormBuilder.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onHeightChange = formBuilder.getOnHeightChange();
		renderedAttributes.add(renderString(FormBuilder.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onHideClassChange = formBuilder.getOnHideClassChange();
		renderedAttributes.add(renderString(FormBuilder.ON_HIDE_CLASS_CHANGE, onHideClassChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onIdChange = formBuilder.getOnIdChange();
		renderedAttributes.add(renderString(FormBuilder.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onInitializedChange = formBuilder.getOnInitializedChange();
		renderedAttributes.add(renderString(FormBuilder.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onLocaleChange = formBuilder.getOnLocaleChange();
		renderedAttributes.add(renderString(FormBuilder.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnMaxFieldsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onMaxFieldsChange = formBuilder.getOnMaxFieldsChange();
		renderedAttributes.add(renderString(FormBuilder.ON_MAX_FIELDS_CHANGE, onMaxFieldsChange));
	}

	protected void renderOnPropertyListChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onPropertyListChange = formBuilder.getOnPropertyListChange();
		renderedAttributes.add(renderString(FormBuilder.ON_PROPERTY_LIST_CHANGE, onPropertyListChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onRenderChange = formBuilder.getOnRenderChange();
		renderedAttributes.add(renderString(FormBuilder.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onRenderedChange = formBuilder.getOnRenderedChange();
		renderedAttributes.add(renderString(FormBuilder.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onSrcNodeChange = formBuilder.getOnSrcNodeChange();
		renderedAttributes.add(renderString(FormBuilder.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onStringsChange = formBuilder.getOnStringsChange();
		renderedAttributes.add(renderString(FormBuilder.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onTabIndexChange = formBuilder.getOnTabIndexChange();
		renderedAttributes.add(renderString(FormBuilder.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTabViewChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onTabViewChange = formBuilder.getOnTabViewChange();
		renderedAttributes.add(renderString(FormBuilder.ON_TAB_VIEW_CHANGE, onTabViewChange));
	}

	protected void renderOnToolbarChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onToolbarChange = formBuilder.getOnToolbarChange();
		renderedAttributes.add(renderString(FormBuilder.ON_TOOLBAR_CHANGE, onToolbarChange));
	}

	protected void renderOnToolbarContainerChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onToolbarContainerChange = formBuilder.getOnToolbarContainerChange();
		renderedAttributes.add(renderString(FormBuilder.ON_TOOLBAR_CONTAINER_CHANGE, onToolbarContainerChange));
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onUseARIAChange = formBuilder.getOnUseARIAChange();
		renderedAttributes.add(renderString(FormBuilder.ON_USE_ARIACHANGE, onUseARIAChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onVisibleChange = formBuilder.getOnVisibleChange();
		renderedAttributes.add(renderString(FormBuilder.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, FormBuilder formBuilder) throws IOException {
		java.lang.String onWidthChange = formBuilder.getOnWidthChange();
		renderedAttributes.add(renderString(FormBuilder.ON_WIDTH_CHANGE, onWidthChange));
	}

}