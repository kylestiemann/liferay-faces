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

}