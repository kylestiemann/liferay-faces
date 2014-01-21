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

		if (diagramBuilder.getAvailableFields() != null) {
			renderAvailableFields(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getAvailableFieldsDragConfig() != null) {
			renderAvailableFieldsDragConfig(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getCanvas() != null) {
			renderCanvas(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getConnector() != null) {
			renderConnector(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getContentBox() != null) {
			renderContentBox(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getContentContainer() != null) {
			renderContentContainer(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getCssClass() != null) {
			renderCssClass(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getDisabled() != null) {
			renderDisabled(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getDropConfig() != null) {
			renderDropConfig(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getDropContainer() != null) {
			renderDropContainer(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getFields() != null) {
			renderFields(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getFieldsContainer() != null) {
			renderFieldsContainer(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getFieldsDragConfig() != null) {
			renderFieldsDragConfig(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getFocused() != null) {
			renderFocused(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getGraphic() != null) {
			renderGraphic(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getHeight() != null) {
			renderHeight(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getHideClass() != null) {
			renderHideClass(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getHighlightDropZones() != null) {
			renderHighlightDropZones(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getDiagramBuilderId() != null) {
			renderDiagramBuilderId(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getInitialized() != null) {
			renderInitialized(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getDiagramBuilderLocale() != null) {
			renderDiagramBuilderLocale(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getMaxFields() != null) {
			renderMaxFields(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getPropertyList() != null) {
			renderPropertyList(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getRender() != null) {
			renderRender(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getRendered() != null) {
			renderRendered(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getShowSuggestConnector() != null) {
			renderShowSuggestConnector(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getStrings() != null) {
			renderStrings(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getSuggestConnectorOverlay() != null) {
			renderSuggestConnectorOverlay(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getTabView() != null) {
			renderTabView(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getToolbar() != null) {
			renderToolbar(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getToolbarContainer() != null) {
			renderToolbarContainer(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getUseARIA() != null) {
			renderUseARIA(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getVisible() != null) {
			renderVisible(renderedAttributes, diagramBuilder);
		}

		if (diagramBuilder.getWidth() != null) {
			renderWidth(renderedAttributes, diagramBuilder);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (diagramBuilder.getAfterAvailableFieldsChange() != null) {
			renderAfterAvailableFieldsChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterAvailableFieldsDragConfigChange() != null) {
			renderAfterAvailableFieldsDragConfigChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterCanvasChange() != null) {
			renderAfterCanvasChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterConnectorChange() != null) {
			renderAfterConnectorChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterContentContainerChange() != null) {
			renderAfterContentContainerChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterDropConfigChange() != null) {
			renderAfterDropConfigChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterDropContainerChange() != null) {
			renderAfterDropContainerChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterFieldsChange() != null) {
			renderAfterFieldsChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterFieldsContainerChange() != null) {
			renderAfterFieldsContainerChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterFieldsDragConfigChange() != null) {
			renderAfterFieldsDragConfigChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterGraphicChange() != null) {
			renderAfterGraphicChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterHideClassChange() != null) {
			renderAfterHideClassChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterHighlightDropZonesChange() != null) {
			renderAfterHighlightDropZonesChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterMaxFieldsChange() != null) {
			renderAfterMaxFieldsChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterPropertyListChange() != null) {
			renderAfterPropertyListChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterShowSuggestConnectorChange() != null) {
			renderAfterShowSuggestConnectorChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterSuggestConnectorOverlayChange() != null) {
			renderAfterSuggestConnectorOverlayChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterTabViewChange() != null) {
			renderAfterTabViewChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterToolbarChange() != null) {
			renderAfterToolbarChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterToolbarContainerChange() != null) {
			renderAfterToolbarContainerChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterUseARIAChange() != null) {
			renderAfterUseARIAChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, diagramBuilder);
		}

		if (diagramBuilder.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, diagramBuilder);
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

		if (diagramBuilder.getOnAvailableFieldsChange() != null) {
			renderOnAvailableFieldsChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnAvailableFieldsDragConfigChange() != null) {
			renderOnAvailableFieldsDragConfigChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnCanvasChange() != null) {
			renderOnCanvasChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnConnectorChange() != null) {
			renderOnConnectorChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnContentContainerChange() != null) {
			renderOnContentContainerChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnDropConfigChange() != null) {
			renderOnDropConfigChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnDropContainerChange() != null) {
			renderOnDropContainerChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnFieldsChange() != null) {
			renderOnFieldsChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnFieldsContainerChange() != null) {
			renderOnFieldsContainerChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnFieldsDragConfigChange() != null) {
			renderOnFieldsDragConfigChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnGraphicChange() != null) {
			renderOnGraphicChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnHideClassChange() != null) {
			renderOnHideClassChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnHighlightDropZonesChange() != null) {
			renderOnHighlightDropZonesChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnMaxFieldsChange() != null) {
			renderOnMaxFieldsChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnPropertyListChange() != null) {
			renderOnPropertyListChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnShowSuggestConnectorChange() != null) {
			renderOnShowSuggestConnectorChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnSuggestConnectorOverlayChange() != null) {
			renderOnSuggestConnectorOverlayChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnTabViewChange() != null) {
			renderOnTabViewChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnToolbarChange() != null) {
			renderOnToolbarChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnToolbarContainerChange() != null) {
			renderOnToolbarContainerChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnUseARIAChange() != null) {
			renderOnUseARIAChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, diagramBuilder);
		}

		if (diagramBuilder.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, diagramBuilder);
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

	protected void renderAvailableFields(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object availableFields = diagramBuilder.getAvailableFields();
		renderedAttributes.add(renderArray(DiagramBuilder.AVAILABLE_FIELDS, availableFields));
	}

	protected void renderAvailableFieldsDragConfig(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object availableFieldsDragConfig = diagramBuilder.getAvailableFieldsDragConfig();
		renderedAttributes.add(renderObject(DiagramBuilder.AVAILABLE_FIELDS_DRAG_CONFIG, availableFieldsDragConfig));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String boundingBox = diagramBuilder.getBoundingBox();
		renderedAttributes.add(renderString(DiagramBuilder.BOUNDING_BOX, boundingBox));
	}

	protected void renderCanvas(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String canvas = diagramBuilder.getCanvas();
		renderedAttributes.add(renderString(DiagramBuilder.CANVAS, canvas));
	}

	protected void renderConnector(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String connector = diagramBuilder.getConnector();
		renderedAttributes.add(renderString(DiagramBuilder.CONNECTOR, connector));
	}

	protected void renderContentBox(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String contentBox = diagramBuilder.getContentBox();
		renderedAttributes.add(renderString(DiagramBuilder.CONTENT_BOX, contentBox));
	}

	protected void renderContentContainer(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String contentContainer = diagramBuilder.getContentContainer();
		renderedAttributes.add(renderString(DiagramBuilder.CONTENT_CONTAINER, contentContainer));
	}

	protected void renderCssClass(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String cssClass = diagramBuilder.getCssClass();
		renderedAttributes.add(renderString(DiagramBuilder.CSS_CLASS, cssClass));
	}

	protected void renderDestroyed(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Boolean destroyed = diagramBuilder.getDestroyed();
		renderedAttributes.add(renderBoolean(DiagramBuilder.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Boolean disabled = diagramBuilder.getDisabled();
		renderedAttributes.add(renderBoolean(DiagramBuilder.DISABLED, disabled));
	}

	protected void renderDropConfig(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object dropConfig = diagramBuilder.getDropConfig();
		renderedAttributes.add(renderObject(DiagramBuilder.DROP_CONFIG, dropConfig));
	}

	protected void renderDropContainer(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String dropContainer = diagramBuilder.getDropContainer();
		renderedAttributes.add(renderString(DiagramBuilder.DROP_CONTAINER, dropContainer));
	}

	protected void renderFields(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object fields = diagramBuilder.getFields();
		renderedAttributes.add(renderArray(DiagramBuilder.FIELDS, fields));
	}

	protected void renderFieldsContainer(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String fieldsContainer = diagramBuilder.getFieldsContainer();
		renderedAttributes.add(renderString(DiagramBuilder.FIELDS_CONTAINER, fieldsContainer));
	}

	protected void renderFieldsDragConfig(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object fieldsDragConfig = diagramBuilder.getFieldsDragConfig();
		renderedAttributes.add(renderObject(DiagramBuilder.FIELDS_DRAG_CONFIG, fieldsDragConfig));
	}

	protected void renderFocused(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Boolean focused = diagramBuilder.getFocused();
		renderedAttributes.add(renderBoolean(DiagramBuilder.FOCUSED, focused));
	}

	protected void renderGraphic(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object graphic = diagramBuilder.getGraphic();
		renderedAttributes.add(renderObject(DiagramBuilder.GRAPHIC, graphic));
	}

	protected void renderHeight(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object height = diagramBuilder.getHeight();
		renderedAttributes.add(renderString(DiagramBuilder.HEIGHT, height));
	}

	protected void renderHideClass(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String hideClass = diagramBuilder.getHideClass();
		renderedAttributes.add(renderString(DiagramBuilder.HIDE_CLASS, hideClass));
	}

	protected void renderHighlightDropZones(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Boolean highlightDropZones = diagramBuilder.getHighlightDropZones();
		renderedAttributes.add(renderBoolean(DiagramBuilder.HIGHLIGHT_DROP_ZONES, highlightDropZones));
	}

	protected void renderDiagramBuilderId(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String diagramBuilderId = diagramBuilder.getDiagramBuilderId();
		renderedAttributes.add(renderString(DiagramBuilder.DIAGRAM_BUILDER_ID, diagramBuilderId));
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Boolean initialized = diagramBuilder.getInitialized();
		renderedAttributes.add(renderBoolean(DiagramBuilder.INITIALIZED, initialized));
	}

	protected void renderDiagramBuilderLocale(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String diagramBuilderLocale = diagramBuilder.getDiagramBuilderLocale();
		renderedAttributes.add(renderString(DiagramBuilder.DIAGRAM_BUILDER_LOCALE, diagramBuilderLocale));
	}

	protected void renderMaxFields(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object maxFields = diagramBuilder.getMaxFields();
		renderedAttributes.add(renderNumber(DiagramBuilder.MAX_FIELDS, maxFields));
	}

	protected void renderPropertyList(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object propertyList = diagramBuilder.getPropertyList();
		renderedAttributes.add(renderObject(DiagramBuilder.PROPERTY_LIST, propertyList));
	}

	protected void renderRender(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object render = diagramBuilder.getRender();
		renderedAttributes.add(renderString(DiagramBuilder.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Boolean rendered = diagramBuilder.getRendered();
		renderedAttributes.add(renderBoolean(DiagramBuilder.RENDERED, rendered));
	}

	protected void renderShowSuggestConnector(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Boolean showSuggestConnector = diagramBuilder.getShowSuggestConnector();
		renderedAttributes.add(renderBoolean(DiagramBuilder.SHOW_SUGGEST_CONNECTOR, showSuggestConnector));
	}

	protected void renderSrcNode(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String srcNode = diagramBuilder.getSrcNode();
		renderedAttributes.add(renderString(DiagramBuilder.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object strings = diagramBuilder.getStrings();
		renderedAttributes.add(renderObject(DiagramBuilder.STRINGS, strings));
	}

	protected void renderSuggestConnectorOverlay(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String suggestConnectorOverlay = diagramBuilder.getSuggestConnectorOverlay();
		renderedAttributes.add(renderString(DiagramBuilder.SUGGEST_CONNECTOR_OVERLAY, suggestConnectorOverlay));
	}

	protected void renderTabIndex(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object tabIndex = diagramBuilder.getTabIndex();
		renderedAttributes.add(renderNumber(DiagramBuilder.TAB_INDEX, tabIndex));
	}

	protected void renderTabView(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object tabView = diagramBuilder.getTabView();
		renderedAttributes.add(renderObject(DiagramBuilder.TAB_VIEW, tabView));
	}

	protected void renderToolbar(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object toolbar = diagramBuilder.getToolbar();
		renderedAttributes.add(renderObject(DiagramBuilder.TOOLBAR, toolbar));
	}

	protected void renderToolbarContainer(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String toolbarContainer = diagramBuilder.getToolbarContainer();
		renderedAttributes.add(renderString(DiagramBuilder.TOOLBAR_CONTAINER, toolbarContainer));
	}

	protected void renderUseARIA(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Boolean useARIA = diagramBuilder.getUseARIA();
		renderedAttributes.add(renderBoolean(DiagramBuilder.USE_ARIA, useARIA));
	}

	protected void renderVisible(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Boolean visible = diagramBuilder.getVisible();
		renderedAttributes.add(renderBoolean(DiagramBuilder.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.Object width = diagramBuilder.getWidth();
		renderedAttributes.add(renderString(DiagramBuilder.WIDTH, width));
	}

	protected void renderAfterAvailableFieldsChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterAvailableFieldsChange = diagramBuilder.getAfterAvailableFieldsChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_AVAILABLE_FIELDS_CHANGE, afterAvailableFieldsChange));
	}

	protected void renderAfterAvailableFieldsDragConfigChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterAvailableFieldsDragConfigChange = diagramBuilder.getAfterAvailableFieldsDragConfigChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE, afterAvailableFieldsDragConfigChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterBoundingBoxChange = diagramBuilder.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCanvasChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterCanvasChange = diagramBuilder.getAfterCanvasChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_CANVAS_CHANGE, afterCanvasChange));
	}

	protected void renderAfterConnectorChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterConnectorChange = diagramBuilder.getAfterConnectorChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_CONNECTOR_CHANGE, afterConnectorChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterContentBoxChange = diagramBuilder.getAfterContentBoxChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterContentContainerChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterContentContainerChange = diagramBuilder.getAfterContentContainerChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_CONTENT_CONTAINER_CHANGE, afterContentContainerChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterCssClassChange = diagramBuilder.getAfterCssClassChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterDestroyedChange = diagramBuilder.getAfterDestroyedChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterDisabledChange = diagramBuilder.getAfterDisabledChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterDropConfigChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterDropConfigChange = diagramBuilder.getAfterDropConfigChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_DROP_CONFIG_CHANGE, afterDropConfigChange));
	}

	protected void renderAfterDropContainerChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterDropContainerChange = diagramBuilder.getAfterDropContainerChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_DROP_CONTAINER_CHANGE, afterDropContainerChange));
	}

	protected void renderAfterFieldsChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterFieldsChange = diagramBuilder.getAfterFieldsChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_FIELDS_CHANGE, afterFieldsChange));
	}

	protected void renderAfterFieldsContainerChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterFieldsContainerChange = diagramBuilder.getAfterFieldsContainerChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_FIELDS_CONTAINER_CHANGE, afterFieldsContainerChange));
	}

	protected void renderAfterFieldsDragConfigChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterFieldsDragConfigChange = diagramBuilder.getAfterFieldsDragConfigChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_FIELDS_DRAG_CONFIG_CHANGE, afterFieldsDragConfigChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterFocusedChange = diagramBuilder.getAfterFocusedChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterGraphicChange = diagramBuilder.getAfterGraphicChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterHeightChange = diagramBuilder.getAfterHeightChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterHideClassChange = diagramBuilder.getAfterHideClassChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
	}

	protected void renderAfterHighlightDropZonesChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterHighlightDropZonesChange = diagramBuilder.getAfterHighlightDropZonesChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_HIGHLIGHT_DROP_ZONES_CHANGE, afterHighlightDropZonesChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterIdChange = diagramBuilder.getAfterIdChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterInitializedChange = diagramBuilder.getAfterInitializedChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterLocaleChange = diagramBuilder.getAfterLocaleChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterMaxFieldsChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterMaxFieldsChange = diagramBuilder.getAfterMaxFieldsChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_MAX_FIELDS_CHANGE, afterMaxFieldsChange));
	}

	protected void renderAfterPropertyListChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterPropertyListChange = diagramBuilder.getAfterPropertyListChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_PROPERTY_LIST_CHANGE, afterPropertyListChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterRenderChange = diagramBuilder.getAfterRenderChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterRenderedChange = diagramBuilder.getAfterRenderedChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterShowSuggestConnectorChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterShowSuggestConnectorChange = diagramBuilder.getAfterShowSuggestConnectorChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_SHOW_SUGGEST_CONNECTOR_CHANGE, afterShowSuggestConnectorChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterSrcNodeChange = diagramBuilder.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterStringsChange = diagramBuilder.getAfterStringsChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterSuggestConnectorOverlayChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterSuggestConnectorOverlayChange = diagramBuilder.getAfterSuggestConnectorOverlayChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_SUGGEST_CONNECTOR_OVERLAY_CHANGE, afterSuggestConnectorOverlayChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterTabIndexChange = diagramBuilder.getAfterTabIndexChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTabViewChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterTabViewChange = diagramBuilder.getAfterTabViewChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_TAB_VIEW_CHANGE, afterTabViewChange));
	}

	protected void renderAfterToolbarChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterToolbarChange = diagramBuilder.getAfterToolbarChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_TOOLBAR_CHANGE, afterToolbarChange));
	}

	protected void renderAfterToolbarContainerChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterToolbarContainerChange = diagramBuilder.getAfterToolbarContainerChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_TOOLBAR_CONTAINER_CHANGE, afterToolbarContainerChange));
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterUseARIAChange = diagramBuilder.getAfterUseARIAChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_USE_ARIACHANGE, afterUseARIAChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterVisibleChange = diagramBuilder.getAfterVisibleChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String afterWidthChange = diagramBuilder.getAfterWidthChange();
		renderedAttributes.add(renderString(DiagramBuilder.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnAvailableFieldsChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onAvailableFieldsChange = diagramBuilder.getOnAvailableFieldsChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_AVAILABLE_FIELDS_CHANGE, onAvailableFieldsChange));
	}

	protected void renderOnAvailableFieldsDragConfigChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onAvailableFieldsDragConfigChange = diagramBuilder.getOnAvailableFieldsDragConfigChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE, onAvailableFieldsDragConfigChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onBoundingBoxChange = diagramBuilder.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCanvasChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onCanvasChange = diagramBuilder.getOnCanvasChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_CANVAS_CHANGE, onCanvasChange));
	}

	protected void renderOnConnectorChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onConnectorChange = diagramBuilder.getOnConnectorChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_CONNECTOR_CHANGE, onConnectorChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onContentBoxChange = diagramBuilder.getOnContentBoxChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnContentContainerChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onContentContainerChange = diagramBuilder.getOnContentContainerChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_CONTENT_CONTAINER_CHANGE, onContentContainerChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onCssClassChange = diagramBuilder.getOnCssClassChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onDestroyedChange = diagramBuilder.getOnDestroyedChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onDisabledChange = diagramBuilder.getOnDisabledChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnDropConfigChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onDropConfigChange = diagramBuilder.getOnDropConfigChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_DROP_CONFIG_CHANGE, onDropConfigChange));
	}

	protected void renderOnDropContainerChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onDropContainerChange = diagramBuilder.getOnDropContainerChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_DROP_CONTAINER_CHANGE, onDropContainerChange));
	}

	protected void renderOnFieldsChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onFieldsChange = diagramBuilder.getOnFieldsChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_FIELDS_CHANGE, onFieldsChange));
	}

	protected void renderOnFieldsContainerChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onFieldsContainerChange = diagramBuilder.getOnFieldsContainerChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_FIELDS_CONTAINER_CHANGE, onFieldsContainerChange));
	}

	protected void renderOnFieldsDragConfigChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onFieldsDragConfigChange = diagramBuilder.getOnFieldsDragConfigChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_FIELDS_DRAG_CONFIG_CHANGE, onFieldsDragConfigChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onFocusedChange = diagramBuilder.getOnFocusedChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onGraphicChange = diagramBuilder.getOnGraphicChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_GRAPHIC_CHANGE, onGraphicChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onHeightChange = diagramBuilder.getOnHeightChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onHideClassChange = diagramBuilder.getOnHideClassChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_HIDE_CLASS_CHANGE, onHideClassChange));
	}

	protected void renderOnHighlightDropZonesChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onHighlightDropZonesChange = diagramBuilder.getOnHighlightDropZonesChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_HIGHLIGHT_DROP_ZONES_CHANGE, onHighlightDropZonesChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onIdChange = diagramBuilder.getOnIdChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onInitializedChange = diagramBuilder.getOnInitializedChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onLocaleChange = diagramBuilder.getOnLocaleChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnMaxFieldsChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onMaxFieldsChange = diagramBuilder.getOnMaxFieldsChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_MAX_FIELDS_CHANGE, onMaxFieldsChange));
	}

	protected void renderOnPropertyListChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onPropertyListChange = diagramBuilder.getOnPropertyListChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_PROPERTY_LIST_CHANGE, onPropertyListChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onRenderChange = diagramBuilder.getOnRenderChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onRenderedChange = diagramBuilder.getOnRenderedChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnShowSuggestConnectorChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onShowSuggestConnectorChange = diagramBuilder.getOnShowSuggestConnectorChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_SHOW_SUGGEST_CONNECTOR_CHANGE, onShowSuggestConnectorChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onSrcNodeChange = diagramBuilder.getOnSrcNodeChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onStringsChange = diagramBuilder.getOnStringsChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnSuggestConnectorOverlayChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onSuggestConnectorOverlayChange = diagramBuilder.getOnSuggestConnectorOverlayChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_SUGGEST_CONNECTOR_OVERLAY_CHANGE, onSuggestConnectorOverlayChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onTabIndexChange = diagramBuilder.getOnTabIndexChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTabViewChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onTabViewChange = diagramBuilder.getOnTabViewChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_TAB_VIEW_CHANGE, onTabViewChange));
	}

	protected void renderOnToolbarChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onToolbarChange = diagramBuilder.getOnToolbarChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_TOOLBAR_CHANGE, onToolbarChange));
	}

	protected void renderOnToolbarContainerChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onToolbarContainerChange = diagramBuilder.getOnToolbarContainerChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_TOOLBAR_CONTAINER_CHANGE, onToolbarContainerChange));
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onUseARIAChange = diagramBuilder.getOnUseARIAChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_USE_ARIACHANGE, onUseARIAChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onVisibleChange = diagramBuilder.getOnVisibleChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		java.lang.String onWidthChange = diagramBuilder.getOnWidthChange();
		renderedAttributes.add(renderString(DiagramBuilder.ON_WIDTH_CHANGE, onWidthChange));
	}

}