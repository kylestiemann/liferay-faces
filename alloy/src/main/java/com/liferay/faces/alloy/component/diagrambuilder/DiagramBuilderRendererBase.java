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
package com.liferay.faces.alloy.component.diagrambuilder;

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
public abstract class DiagramBuilderRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DiagramBuilder diagramBuilder = (DiagramBuilder) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var diagramBuilder = new A.DiagramBuilder");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAvailableFields(renderedAttributes, diagramBuilder);
		renderAvailableFieldsDragConfig(renderedAttributes, diagramBuilder);
		renderBoundingBox(renderedAttributes, diagramBuilder);
		renderCanvas(renderedAttributes, diagramBuilder);
		renderConnector(renderedAttributes, diagramBuilder);
		renderContentBox(renderedAttributes, diagramBuilder);
		renderContentContainer(renderedAttributes, diagramBuilder);
		renderCssClass(renderedAttributes, diagramBuilder);
		renderDestroyed(renderedAttributes, diagramBuilder);
		renderDisabled(renderedAttributes, diagramBuilder);
		renderDropConfig(renderedAttributes, diagramBuilder);
		renderDropContainer(renderedAttributes, diagramBuilder);
		renderFields(renderedAttributes, diagramBuilder);
		renderFieldsContainer(renderedAttributes, diagramBuilder);
		renderFieldsDragConfig(renderedAttributes, diagramBuilder);
		renderFocused(renderedAttributes, diagramBuilder);
		renderGraphic(renderedAttributes, diagramBuilder);
		renderHeight(renderedAttributes, diagramBuilder);
		renderHideClass(renderedAttributes, diagramBuilder);
		renderHighlightDropZones(renderedAttributes, diagramBuilder);
		renderDiagramBuilderId(renderedAttributes, diagramBuilder);
		renderInitialized(renderedAttributes, diagramBuilder);
		renderDiagramBuilderLocale(renderedAttributes, diagramBuilder);
		renderMaxFields(renderedAttributes, diagramBuilder);
		renderPropertyList(renderedAttributes, diagramBuilder);
		renderRender(renderedAttributes, diagramBuilder);
		renderRendered(renderedAttributes, diagramBuilder);
		renderShowSuggestConnector(renderedAttributes, diagramBuilder);
		renderSrcNode(renderedAttributes, diagramBuilder);
		renderStrings(renderedAttributes, diagramBuilder);
		renderSuggestConnectorOverlay(renderedAttributes, diagramBuilder);
		renderTabIndex(renderedAttributes, diagramBuilder);
		renderTabView(renderedAttributes, diagramBuilder);
		renderToolbar(renderedAttributes, diagramBuilder);
		renderToolbarContainer(renderedAttributes, diagramBuilder);
		renderUseARIA(renderedAttributes, diagramBuilder);
		renderVisible(renderedAttributes, diagramBuilder);
		renderWidth(renderedAttributes, diagramBuilder);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAvailableFieldsChange(renderedAfterEvents, diagramBuilder);
		renderAfterAvailableFieldsDragConfigChange(renderedAfterEvents, diagramBuilder);
		renderAfterBoundingBoxChange(renderedAfterEvents, diagramBuilder);
		renderAfterCanvasChange(renderedAfterEvents, diagramBuilder);
		renderAfterConnectorChange(renderedAfterEvents, diagramBuilder);
		renderAfterContentBoxChange(renderedAfterEvents, diagramBuilder);
		renderAfterContentContainerChange(renderedAfterEvents, diagramBuilder);
		renderAfterCssClassChange(renderedAfterEvents, diagramBuilder);
		renderAfterDestroyedChange(renderedAfterEvents, diagramBuilder);
		renderAfterDisabledChange(renderedAfterEvents, diagramBuilder);
		renderAfterDropConfigChange(renderedAfterEvents, diagramBuilder);
		renderAfterDropContainerChange(renderedAfterEvents, diagramBuilder);
		renderAfterFieldsChange(renderedAfterEvents, diagramBuilder);
		renderAfterFieldsContainerChange(renderedAfterEvents, diagramBuilder);
		renderAfterFieldsDragConfigChange(renderedAfterEvents, diagramBuilder);
		renderAfterFocusedChange(renderedAfterEvents, diagramBuilder);
		renderAfterGraphicChange(renderedAfterEvents, diagramBuilder);
		renderAfterHeightChange(renderedAfterEvents, diagramBuilder);
		renderAfterHideClassChange(renderedAfterEvents, diagramBuilder);
		renderAfterHighlightDropZonesChange(renderedAfterEvents, diagramBuilder);
		renderAfterIdChange(renderedAfterEvents, diagramBuilder);
		renderAfterInitializedChange(renderedAfterEvents, diagramBuilder);
		renderAfterLocaleChange(renderedAfterEvents, diagramBuilder);
		renderAfterMaxFieldsChange(renderedAfterEvents, diagramBuilder);
		renderAfterPropertyListChange(renderedAfterEvents, diagramBuilder);
		renderAfterRenderChange(renderedAfterEvents, diagramBuilder);
		renderAfterRenderedChange(renderedAfterEvents, diagramBuilder);
		renderAfterShowSuggestConnectorChange(renderedAfterEvents, diagramBuilder);
		renderAfterSrcNodeChange(renderedAfterEvents, diagramBuilder);
		renderAfterStringsChange(renderedAfterEvents, diagramBuilder);
		renderAfterSuggestConnectorOverlayChange(renderedAfterEvents, diagramBuilder);
		renderAfterTabIndexChange(renderedAfterEvents, diagramBuilder);
		renderAfterTabViewChange(renderedAfterEvents, diagramBuilder);
		renderAfterToolbarChange(renderedAfterEvents, diagramBuilder);
		renderAfterToolbarContainerChange(renderedAfterEvents, diagramBuilder);
		renderAfterUseARIAChange(renderedAfterEvents, diagramBuilder);
		renderAfterVisibleChange(renderedAfterEvents, diagramBuilder);
		renderAfterWidthChange(renderedAfterEvents, diagramBuilder);

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

		renderOnAvailableFieldsChange(renderedOnEvents, diagramBuilder);
		renderOnAvailableFieldsDragConfigChange(renderedOnEvents, diagramBuilder);
		renderOnBoundingBoxChange(renderedOnEvents, diagramBuilder);
		renderOnCanvasChange(renderedOnEvents, diagramBuilder);
		renderOnConnectorChange(renderedOnEvents, diagramBuilder);
		renderOnContentBoxChange(renderedOnEvents, diagramBuilder);
		renderOnContentContainerChange(renderedOnEvents, diagramBuilder);
		renderOnCssClassChange(renderedOnEvents, diagramBuilder);
		renderOnDestroyedChange(renderedOnEvents, diagramBuilder);
		renderOnDisabledChange(renderedOnEvents, diagramBuilder);
		renderOnDropConfigChange(renderedOnEvents, diagramBuilder);
		renderOnDropContainerChange(renderedOnEvents, diagramBuilder);
		renderOnFieldsChange(renderedOnEvents, diagramBuilder);
		renderOnFieldsContainerChange(renderedOnEvents, diagramBuilder);
		renderOnFieldsDragConfigChange(renderedOnEvents, diagramBuilder);
		renderOnFocusedChange(renderedOnEvents, diagramBuilder);
		renderOnGraphicChange(renderedOnEvents, diagramBuilder);
		renderOnHeightChange(renderedOnEvents, diagramBuilder);
		renderOnHideClassChange(renderedOnEvents, diagramBuilder);
		renderOnHighlightDropZonesChange(renderedOnEvents, diagramBuilder);
		renderOnIdChange(renderedOnEvents, diagramBuilder);
		renderOnInitializedChange(renderedOnEvents, diagramBuilder);
		renderOnLocaleChange(renderedOnEvents, diagramBuilder);
		renderOnMaxFieldsChange(renderedOnEvents, diagramBuilder);
		renderOnPropertyListChange(renderedOnEvents, diagramBuilder);
		renderOnRenderChange(renderedOnEvents, diagramBuilder);
		renderOnRenderedChange(renderedOnEvents, diagramBuilder);
		renderOnShowSuggestConnectorChange(renderedOnEvents, diagramBuilder);
		renderOnSrcNodeChange(renderedOnEvents, diagramBuilder);
		renderOnStringsChange(renderedOnEvents, diagramBuilder);
		renderOnSuggestConnectorOverlayChange(renderedOnEvents, diagramBuilder);
		renderOnTabIndexChange(renderedOnEvents, diagramBuilder);
		renderOnTabViewChange(renderedOnEvents, diagramBuilder);
		renderOnToolbarChange(renderedOnEvents, diagramBuilder);
		renderOnToolbarContainerChange(renderedOnEvents, diagramBuilder);
		renderOnUseARIAChange(renderedOnEvents, diagramBuilder);
		renderOnVisibleChange(renderedOnEvents, diagramBuilder);
		renderOnWidthChange(renderedOnEvents, diagramBuilder);

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

	protected void renderAvailableFields(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object availableFields = diagramBuilder.getAvailableFields();

		if (availableFields != null) {
			renderedAttributes.add(renderArray(DiagramBuilder.AVAILABLE_FIELDS, availableFields));
		}
	}

	protected void renderAvailableFieldsDragConfig(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object availableFieldsDragConfig = diagramBuilder.getAvailableFieldsDragConfig();

		if (availableFieldsDragConfig != null) {
			renderedAttributes.add(renderObject(DiagramBuilder.AVAILABLE_FIELDS_DRAG_CONFIG, availableFieldsDragConfig));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String boundingBox = diagramBuilder.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(DiagramBuilder.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCanvas(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String canvas = diagramBuilder.getCanvas();

		if (canvas != null) {
			renderedAttributes.add(renderString(DiagramBuilder.CANVAS, canvas));
		}
	}

	protected void renderConnector(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String connector = diagramBuilder.getConnector();

		if (connector != null) {
			renderedAttributes.add(renderString(DiagramBuilder.CONNECTOR, connector));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String contentBox = diagramBuilder.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(DiagramBuilder.CONTENT_BOX, contentBox));
		}
	}

	protected void renderContentContainer(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String contentContainer = diagramBuilder.getContentContainer();

		if (contentContainer != null) {
			renderedAttributes.add(renderString(DiagramBuilder.CONTENT_CONTAINER, contentContainer));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String cssClass = diagramBuilder.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(DiagramBuilder.CSS_CLASS, cssClass));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Boolean destroyed = diagramBuilder.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(DiagramBuilder.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Boolean disabled = diagramBuilder.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(DiagramBuilder.DISABLED, disabled));
		}
	}

	protected void renderDropConfig(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object dropConfig = diagramBuilder.getDropConfig();

		if (dropConfig != null) {
			renderedAttributes.add(renderObject(DiagramBuilder.DROP_CONFIG, dropConfig));
		}
	}

	protected void renderDropContainer(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String dropContainer = diagramBuilder.getDropContainer();

		if (dropContainer != null) {
			renderedAttributes.add(renderString(DiagramBuilder.DROP_CONTAINER, dropContainer));
		}
	}

	protected void renderFields(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object fields = diagramBuilder.getFields();

		if (fields != null) {
			renderedAttributes.add(renderArray(DiagramBuilder.FIELDS, fields));
		}
	}

	protected void renderFieldsContainer(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String fieldsContainer = diagramBuilder.getFieldsContainer();

		if (fieldsContainer != null) {
			renderedAttributes.add(renderString(DiagramBuilder.FIELDS_CONTAINER, fieldsContainer));
		}
	}

	protected void renderFieldsDragConfig(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object fieldsDragConfig = diagramBuilder.getFieldsDragConfig();

		if (fieldsDragConfig != null) {
			renderedAttributes.add(renderObject(DiagramBuilder.FIELDS_DRAG_CONFIG, fieldsDragConfig));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Boolean focused = diagramBuilder.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(DiagramBuilder.FOCUSED, focused));
		}
	}

	protected void renderGraphic(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object graphic = diagramBuilder.getGraphic();

		if (graphic != null) {
			renderedAttributes.add(renderObject(DiagramBuilder.GRAPHIC, graphic));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object height = diagramBuilder.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(DiagramBuilder.HEIGHT, height));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String hideClass = diagramBuilder.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(DiagramBuilder.HIDE_CLASS, hideClass));
		}
	}

	protected void renderHighlightDropZones(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Boolean highlightDropZones = diagramBuilder.getHighlightDropZones();

		if (highlightDropZones != null) {
			renderedAttributes.add(renderBoolean(DiagramBuilder.HIGHLIGHT_DROP_ZONES, highlightDropZones));
		}
	}

	protected void renderDiagramBuilderId(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String diagramBuilderId = diagramBuilder.getDiagramBuilderId();

		if (diagramBuilderId != null) {
			renderedAttributes.add(renderString(DiagramBuilder.DIAGRAM_BUILDER_ID, diagramBuilderId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Boolean initialized = diagramBuilder.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(DiagramBuilder.INITIALIZED, initialized));
		}
	}

	protected void renderDiagramBuilderLocale(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String diagramBuilderLocale = diagramBuilder.getDiagramBuilderLocale();

		if (diagramBuilderLocale != null) {
			renderedAttributes.add(renderString(DiagramBuilder.DIAGRAM_BUILDER_LOCALE, diagramBuilderLocale));
		}
	}

	protected void renderMaxFields(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object maxFields = diagramBuilder.getMaxFields();

		if (maxFields != null) {
			renderedAttributes.add(renderNumber(DiagramBuilder.MAX_FIELDS, maxFields));
		}
	}

	protected void renderPropertyList(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object propertyList = diagramBuilder.getPropertyList();

		if (propertyList != null) {
			renderedAttributes.add(renderObject(DiagramBuilder.PROPERTY_LIST, propertyList));
		}
	}

	protected void renderRender(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object render = diagramBuilder.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(DiagramBuilder.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Boolean rendered = diagramBuilder.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(DiagramBuilder.RENDERED, rendered));
		}
	}

	protected void renderShowSuggestConnector(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Boolean showSuggestConnector = diagramBuilder.getShowSuggestConnector();

		if (showSuggestConnector != null) {
			renderedAttributes.add(renderBoolean(DiagramBuilder.SHOW_SUGGEST_CONNECTOR, showSuggestConnector));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String srcNode = diagramBuilder.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(DiagramBuilder.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object strings = diagramBuilder.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(DiagramBuilder.STRINGS, strings));
		}
	}

	protected void renderSuggestConnectorOverlay(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String suggestConnectorOverlay = diagramBuilder.getSuggestConnectorOverlay();

		if (suggestConnectorOverlay != null) {
			renderedAttributes.add(renderString(DiagramBuilder.SUGGEST_CONNECTOR_OVERLAY, suggestConnectorOverlay));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object tabIndex = diagramBuilder.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(DiagramBuilder.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTabView(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object tabView = diagramBuilder.getTabView();

		if (tabView != null) {
			renderedAttributes.add(renderObject(DiagramBuilder.TAB_VIEW, tabView));
		}
	}

	protected void renderToolbar(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object toolbar = diagramBuilder.getToolbar();

		if (toolbar != null) {
			renderedAttributes.add(renderObject(DiagramBuilder.TOOLBAR, toolbar));
		}
	}

	protected void renderToolbarContainer(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String toolbarContainer = diagramBuilder.getToolbarContainer();

		if (toolbarContainer != null) {
			renderedAttributes.add(renderString(DiagramBuilder.TOOLBAR_CONTAINER, toolbarContainer));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Boolean useARIA = diagramBuilder.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(DiagramBuilder.USE_ARIA, useARIA));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Boolean visible = diagramBuilder.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(DiagramBuilder.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object width = diagramBuilder.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(DiagramBuilder.WIDTH, width));
		}
	}

	protected void renderAfterAvailableFieldsChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterAvailableFieldsChange = diagramBuilder.getAfterAvailableFieldsChange();

		if (afterAvailableFieldsChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_AVAILABLE_FIELDS_CHANGE, afterAvailableFieldsChange));
		}
	}

	protected void renderAfterAvailableFieldsDragConfigChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterAvailableFieldsDragConfigChange = diagramBuilder.getAfterAvailableFieldsDragConfigChange();

		if (afterAvailableFieldsDragConfigChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE, afterAvailableFieldsDragConfigChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterBoundingBoxChange = diagramBuilder.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCanvasChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterCanvasChange = diagramBuilder.getAfterCanvasChange();

		if (afterCanvasChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_CANVAS_CHANGE, afterCanvasChange));
		}
	}

	protected void renderAfterConnectorChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterConnectorChange = diagramBuilder.getAfterConnectorChange();

		if (afterConnectorChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_CONNECTOR_CHANGE, afterConnectorChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterContentBoxChange = diagramBuilder.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterContentContainerChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterContentContainerChange = diagramBuilder.getAfterContentContainerChange();

		if (afterContentContainerChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_CONTENT_CONTAINER_CHANGE, afterContentContainerChange));
		}
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterCssClassChange = diagramBuilder.getAfterCssClassChange();

		if (afterCssClassChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterDestroyedChange = diagramBuilder.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterDisabledChange = diagramBuilder.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterDropConfigChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterDropConfigChange = diagramBuilder.getAfterDropConfigChange();

		if (afterDropConfigChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_DROP_CONFIG_CHANGE, afterDropConfigChange));
		}
	}

	protected void renderAfterDropContainerChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterDropContainerChange = diagramBuilder.getAfterDropContainerChange();

		if (afterDropContainerChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_DROP_CONTAINER_CHANGE, afterDropContainerChange));
		}
	}

	protected void renderAfterFieldsChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterFieldsChange = diagramBuilder.getAfterFieldsChange();

		if (afterFieldsChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_FIELDS_CHANGE, afterFieldsChange));
		}
	}

	protected void renderAfterFieldsContainerChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterFieldsContainerChange = diagramBuilder.getAfterFieldsContainerChange();

		if (afterFieldsContainerChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_FIELDS_CONTAINER_CHANGE, afterFieldsContainerChange));
		}
	}

	protected void renderAfterFieldsDragConfigChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterFieldsDragConfigChange = diagramBuilder.getAfterFieldsDragConfigChange();

		if (afterFieldsDragConfigChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_FIELDS_DRAG_CONFIG_CHANGE, afterFieldsDragConfigChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterFocusedChange = diagramBuilder.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterGraphicChange = diagramBuilder.getAfterGraphicChange();

		if (afterGraphicChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterHeightChange = diagramBuilder.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterHideClassChange = diagramBuilder.getAfterHideClassChange();

		if (afterHideClassChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
		}
	}

	protected void renderAfterHighlightDropZonesChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterHighlightDropZonesChange = diagramBuilder.getAfterHighlightDropZonesChange();

		if (afterHighlightDropZonesChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_HIGHLIGHT_DROP_ZONES_CHANGE, afterHighlightDropZonesChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterIdChange = diagramBuilder.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterInitializedChange = diagramBuilder.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterLocaleChange = diagramBuilder.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterMaxFieldsChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterMaxFieldsChange = diagramBuilder.getAfterMaxFieldsChange();

		if (afterMaxFieldsChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_MAX_FIELDS_CHANGE, afterMaxFieldsChange));
		}
	}

	protected void renderAfterPropertyListChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterPropertyListChange = diagramBuilder.getAfterPropertyListChange();

		if (afterPropertyListChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_PROPERTY_LIST_CHANGE, afterPropertyListChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterRenderChange = diagramBuilder.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterRenderedChange = diagramBuilder.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterShowSuggestConnectorChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterShowSuggestConnectorChange = diagramBuilder.getAfterShowSuggestConnectorChange();

		if (afterShowSuggestConnectorChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_SHOW_SUGGEST_CONNECTOR_CHANGE, afterShowSuggestConnectorChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterSrcNodeChange = diagramBuilder.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterStringsChange = diagramBuilder.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterSuggestConnectorOverlayChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterSuggestConnectorOverlayChange = diagramBuilder.getAfterSuggestConnectorOverlayChange();

		if (afterSuggestConnectorOverlayChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_SUGGEST_CONNECTOR_OVERLAY_CHANGE, afterSuggestConnectorOverlayChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterTabIndexChange = diagramBuilder.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTabViewChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterTabViewChange = diagramBuilder.getAfterTabViewChange();

		if (afterTabViewChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_TAB_VIEW_CHANGE, afterTabViewChange));
		}
	}

	protected void renderAfterToolbarChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterToolbarChange = diagramBuilder.getAfterToolbarChange();

		if (afterToolbarChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_TOOLBAR_CHANGE, afterToolbarChange));
		}
	}

	protected void renderAfterToolbarContainerChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterToolbarContainerChange = diagramBuilder.getAfterToolbarContainerChange();

		if (afterToolbarContainerChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_TOOLBAR_CONTAINER_CHANGE, afterToolbarContainerChange));
		}
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterUseARIAChange = diagramBuilder.getAfterUseARIAChange();

		if (afterUseARIAChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_USE_ARIACHANGE, afterUseARIAChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterVisibleChange = diagramBuilder.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterWidthChange = diagramBuilder.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnAvailableFieldsChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onAvailableFieldsChange = diagramBuilder.getOnAvailableFieldsChange();

		if (onAvailableFieldsChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_AVAILABLE_FIELDS_CHANGE, onAvailableFieldsChange));
		}
	}

	protected void renderOnAvailableFieldsDragConfigChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onAvailableFieldsDragConfigChange = diagramBuilder.getOnAvailableFieldsDragConfigChange();

		if (onAvailableFieldsDragConfigChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE, onAvailableFieldsDragConfigChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onBoundingBoxChange = diagramBuilder.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCanvasChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onCanvasChange = diagramBuilder.getOnCanvasChange();

		if (onCanvasChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_CANVAS_CHANGE, onCanvasChange));
		}
	}

	protected void renderOnConnectorChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onConnectorChange = diagramBuilder.getOnConnectorChange();

		if (onConnectorChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_CONNECTOR_CHANGE, onConnectorChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onContentBoxChange = diagramBuilder.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnContentContainerChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onContentContainerChange = diagramBuilder.getOnContentContainerChange();

		if (onContentContainerChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_CONTENT_CONTAINER_CHANGE, onContentContainerChange));
		}
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onCssClassChange = diagramBuilder.getOnCssClassChange();

		if (onCssClassChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_CSS_CLASS_CHANGE, onCssClassChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onDestroyedChange = diagramBuilder.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onDisabledChange = diagramBuilder.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnDropConfigChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onDropConfigChange = diagramBuilder.getOnDropConfigChange();

		if (onDropConfigChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_DROP_CONFIG_CHANGE, onDropConfigChange));
		}
	}

	protected void renderOnDropContainerChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onDropContainerChange = diagramBuilder.getOnDropContainerChange();

		if (onDropContainerChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_DROP_CONTAINER_CHANGE, onDropContainerChange));
		}
	}

	protected void renderOnFieldsChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onFieldsChange = diagramBuilder.getOnFieldsChange();

		if (onFieldsChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_FIELDS_CHANGE, onFieldsChange));
		}
	}

	protected void renderOnFieldsContainerChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onFieldsContainerChange = diagramBuilder.getOnFieldsContainerChange();

		if (onFieldsContainerChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_FIELDS_CONTAINER_CHANGE, onFieldsContainerChange));
		}
	}

	protected void renderOnFieldsDragConfigChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onFieldsDragConfigChange = diagramBuilder.getOnFieldsDragConfigChange();

		if (onFieldsDragConfigChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_FIELDS_DRAG_CONFIG_CHANGE, onFieldsDragConfigChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onFocusedChange = diagramBuilder.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onGraphicChange = diagramBuilder.getOnGraphicChange();

		if (onGraphicChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_GRAPHIC_CHANGE, onGraphicChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onHeightChange = diagramBuilder.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onHideClassChange = diagramBuilder.getOnHideClassChange();

		if (onHideClassChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_HIDE_CLASS_CHANGE, onHideClassChange));
		}
	}

	protected void renderOnHighlightDropZonesChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onHighlightDropZonesChange = diagramBuilder.getOnHighlightDropZonesChange();

		if (onHighlightDropZonesChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_HIGHLIGHT_DROP_ZONES_CHANGE, onHighlightDropZonesChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onIdChange = diagramBuilder.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onInitializedChange = diagramBuilder.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onLocaleChange = diagramBuilder.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnMaxFieldsChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onMaxFieldsChange = diagramBuilder.getOnMaxFieldsChange();

		if (onMaxFieldsChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_MAX_FIELDS_CHANGE, onMaxFieldsChange));
		}
	}

	protected void renderOnPropertyListChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onPropertyListChange = diagramBuilder.getOnPropertyListChange();

		if (onPropertyListChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_PROPERTY_LIST_CHANGE, onPropertyListChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onRenderChange = diagramBuilder.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onRenderedChange = diagramBuilder.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnShowSuggestConnectorChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onShowSuggestConnectorChange = diagramBuilder.getOnShowSuggestConnectorChange();

		if (onShowSuggestConnectorChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_SHOW_SUGGEST_CONNECTOR_CHANGE, onShowSuggestConnectorChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onSrcNodeChange = diagramBuilder.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onStringsChange = diagramBuilder.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnSuggestConnectorOverlayChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onSuggestConnectorOverlayChange = diagramBuilder.getOnSuggestConnectorOverlayChange();

		if (onSuggestConnectorOverlayChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_SUGGEST_CONNECTOR_OVERLAY_CHANGE, onSuggestConnectorOverlayChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onTabIndexChange = diagramBuilder.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTabViewChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onTabViewChange = diagramBuilder.getOnTabViewChange();

		if (onTabViewChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_TAB_VIEW_CHANGE, onTabViewChange));
		}
	}

	protected void renderOnToolbarChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onToolbarChange = diagramBuilder.getOnToolbarChange();

		if (onToolbarChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_TOOLBAR_CHANGE, onToolbarChange));
		}
	}

	protected void renderOnToolbarContainerChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onToolbarContainerChange = diagramBuilder.getOnToolbarContainerChange();

		if (onToolbarContainerChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_TOOLBAR_CONTAINER_CHANGE, onToolbarContainerChange));
		}
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onUseARIAChange = diagramBuilder.getOnUseARIAChange();

		if (onUseARIAChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_USE_ARIACHANGE, onUseARIAChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onVisibleChange = diagramBuilder.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onWidthChange = diagramBuilder.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(DiagramBuilder.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}