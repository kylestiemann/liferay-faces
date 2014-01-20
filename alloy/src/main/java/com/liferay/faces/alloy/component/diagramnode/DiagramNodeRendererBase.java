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
package com.liferay.faces.alloy.component.diagramnode;

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
public abstract class DiagramNodeRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DiagramNode diagramNode = (DiagramNode) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var diagramNode = new A.DiagramNode");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlign(renderedAttributes, diagramNode);
		renderAlignOn(renderedAttributes, diagramNode);
		renderDiagramNodeBodyContent(renderedAttributes, diagramNode);
		renderBoundingBox(renderedAttributes, diagramNode);
		renderBuilder(renderedAttributes, diagramNode);
		renderCentered(renderedAttributes, diagramNode);
		renderConnectors(renderedAttributes, diagramNode);
		renderConstrain(renderedAttributes, diagramNode);
		renderContentBox(renderedAttributes, diagramNode);
		renderControlsToolbar(renderedAttributes, diagramNode);
		renderDescription(renderedAttributes, diagramNode);
		renderDestroyed(renderedAttributes, diagramNode);
		renderDisabled(renderedAttributes, diagramNode);
		renderFillHeight(renderedAttributes, diagramNode);
		renderFocused(renderedAttributes, diagramNode);
		renderFooterContent(renderedAttributes, diagramNode);
		renderGraphic(renderedAttributes, diagramNode);
		renderHeaderContent(renderedAttributes, diagramNode);
		renderHeight(renderedAttributes, diagramNode);
		renderHighlightBoundaryStroke(renderedAttributes, diagramNode);
		renderHighlighted(renderedAttributes, diagramNode);
		renderDiagramNodeId(renderedAttributes, diagramNode);
		renderInitialized(renderedAttributes, diagramNode);
		renderDiagramNodeLocale(renderedAttributes, diagramNode);
		renderName(renderedAttributes, diagramNode);
		renderPreventOverlap(renderedAttributes, diagramNode);
		renderRender(renderedAttributes, diagramNode);
		renderRendered(renderedAttributes, diagramNode);
		renderRequired(renderedAttributes, diagramNode);
		renderSelected(renderedAttributes, diagramNode);
		renderShapeBoundary(renderedAttributes, diagramNode);
		renderShapeInvite(renderedAttributes, diagramNode);
		renderShim(renderedAttributes, diagramNode);
		renderSrcNode(renderedAttributes, diagramNode);
		renderStrings(renderedAttributes, diagramNode);
		renderTabIndex(renderedAttributes, diagramNode);
		renderTransitions(renderedAttributes, diagramNode);
		renderType(renderedAttributes, diagramNode);
		renderVisible(renderedAttributes, diagramNode);
		renderWidth(renderedAttributes, diagramNode);
		renderX(renderedAttributes, diagramNode);
		renderXy(renderedAttributes, diagramNode);
		renderY(renderedAttributes, diagramNode);
		renderZIndex(renderedAttributes, diagramNode);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlignChange(renderedAfterEvents, diagramNode);
		renderAfterAlignOnChange(renderedAfterEvents, diagramNode);
		renderAfterBodyContentChange(renderedAfterEvents, diagramNode);
		renderAfterBoundingBoxChange(renderedAfterEvents, diagramNode);
		renderAfterBuilderChange(renderedAfterEvents, diagramNode);
		renderAfterCenteredChange(renderedAfterEvents, diagramNode);
		renderAfterConnectorsChange(renderedAfterEvents, diagramNode);
		renderAfterConstrainChange(renderedAfterEvents, diagramNode);
		renderAfterContentBoxChange(renderedAfterEvents, diagramNode);
		renderAfterControlsToolbarChange(renderedAfterEvents, diagramNode);
		renderAfterDescriptionChange(renderedAfterEvents, diagramNode);
		renderAfterDestroyedChange(renderedAfterEvents, diagramNode);
		renderAfterDisabledChange(renderedAfterEvents, diagramNode);
		renderAfterFillHeightChange(renderedAfterEvents, diagramNode);
		renderAfterFocusedChange(renderedAfterEvents, diagramNode);
		renderAfterFooterContentChange(renderedAfterEvents, diagramNode);
		renderAfterGraphicChange(renderedAfterEvents, diagramNode);
		renderAfterHeaderContentChange(renderedAfterEvents, diagramNode);
		renderAfterHeightChange(renderedAfterEvents, diagramNode);
		renderAfterHighlightBoundaryStrokeChange(renderedAfterEvents, diagramNode);
		renderAfterHighlightedChange(renderedAfterEvents, diagramNode);
		renderAfterIdChange(renderedAfterEvents, diagramNode);
		renderAfterInitializedChange(renderedAfterEvents, diagramNode);
		renderAfterLocaleChange(renderedAfterEvents, diagramNode);
		renderAfterNameChange(renderedAfterEvents, diagramNode);
		renderAfterPreventOverlapChange(renderedAfterEvents, diagramNode);
		renderAfterRenderChange(renderedAfterEvents, diagramNode);
		renderAfterRenderedChange(renderedAfterEvents, diagramNode);
		renderAfterRequiredChange(renderedAfterEvents, diagramNode);
		renderAfterSelectedChange(renderedAfterEvents, diagramNode);
		renderAfterShapeBoundaryChange(renderedAfterEvents, diagramNode);
		renderAfterShapeInviteChange(renderedAfterEvents, diagramNode);
		renderAfterShimChange(renderedAfterEvents, diagramNode);
		renderAfterSrcNodeChange(renderedAfterEvents, diagramNode);
		renderAfterStringsChange(renderedAfterEvents, diagramNode);
		renderAfterTabIndexChange(renderedAfterEvents, diagramNode);
		renderAfterTransitionsChange(renderedAfterEvents, diagramNode);
		renderAfterTypeChange(renderedAfterEvents, diagramNode);
		renderAfterVisibleChange(renderedAfterEvents, diagramNode);
		renderAfterWidthChange(renderedAfterEvents, diagramNode);
		renderAfterXChange(renderedAfterEvents, diagramNode);
		renderAfterXyChange(renderedAfterEvents, diagramNode);
		renderAfterYChange(renderedAfterEvents, diagramNode);
		renderAfterZIndexChange(renderedAfterEvents, diagramNode);

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

		renderOnAlignChange(renderedOnEvents, diagramNode);
		renderOnAlignOnChange(renderedOnEvents, diagramNode);
		renderOnBodyContentChange(renderedOnEvents, diagramNode);
		renderOnBoundingBoxChange(renderedOnEvents, diagramNode);
		renderOnBuilderChange(renderedOnEvents, diagramNode);
		renderOnCenteredChange(renderedOnEvents, diagramNode);
		renderOnConnectorsChange(renderedOnEvents, diagramNode);
		renderOnConstrainChange(renderedOnEvents, diagramNode);
		renderOnContentBoxChange(renderedOnEvents, diagramNode);
		renderOnControlsToolbarChange(renderedOnEvents, diagramNode);
		renderOnDescriptionChange(renderedOnEvents, diagramNode);
		renderOnDestroyedChange(renderedOnEvents, diagramNode);
		renderOnDisabledChange(renderedOnEvents, diagramNode);
		renderOnFillHeightChange(renderedOnEvents, diagramNode);
		renderOnFocusedChange(renderedOnEvents, diagramNode);
		renderOnFooterContentChange(renderedOnEvents, diagramNode);
		renderOnGraphicChange(renderedOnEvents, diagramNode);
		renderOnHeaderContentChange(renderedOnEvents, diagramNode);
		renderOnHeightChange(renderedOnEvents, diagramNode);
		renderOnHighlightBoundaryStrokeChange(renderedOnEvents, diagramNode);
		renderOnHighlightedChange(renderedOnEvents, diagramNode);
		renderOnIdChange(renderedOnEvents, diagramNode);
		renderOnInitializedChange(renderedOnEvents, diagramNode);
		renderOnLocaleChange(renderedOnEvents, diagramNode);
		renderOnNameChange(renderedOnEvents, diagramNode);
		renderOnPreventOverlapChange(renderedOnEvents, diagramNode);
		renderOnRenderChange(renderedOnEvents, diagramNode);
		renderOnRenderedChange(renderedOnEvents, diagramNode);
		renderOnRequiredChange(renderedOnEvents, diagramNode);
		renderOnSelectedChange(renderedOnEvents, diagramNode);
		renderOnShapeBoundaryChange(renderedOnEvents, diagramNode);
		renderOnShapeInviteChange(renderedOnEvents, diagramNode);
		renderOnShimChange(renderedOnEvents, diagramNode);
		renderOnSrcNodeChange(renderedOnEvents, diagramNode);
		renderOnStringsChange(renderedOnEvents, diagramNode);
		renderOnTabIndexChange(renderedOnEvents, diagramNode);
		renderOnTransitionsChange(renderedOnEvents, diagramNode);
		renderOnTypeChange(renderedOnEvents, diagramNode);
		renderOnVisibleChange(renderedOnEvents, diagramNode);
		renderOnWidthChange(renderedOnEvents, diagramNode);
		renderOnXChange(renderedOnEvents, diagramNode);
		renderOnXyChange(renderedOnEvents, diagramNode);
		renderOnYChange(renderedOnEvents, diagramNode);
		renderOnZIndexChange(renderedOnEvents, diagramNode);

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

	protected void renderAlign(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object align = diagramNode.getAlign();

		if (align != null) {
			renderedAttributes.add(renderObject(DiagramNode.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object alignOn = diagramNode.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(DiagramNode.ALIGN_ON, alignOn));
		}
	}

	protected void renderDiagramNodeBodyContent(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object diagramNodeBodyContent = diagramNode.getDiagramNodeBodyContent();

		if (diagramNodeBodyContent != null) {
			renderedAttributes.add(renderString(DiagramNode.DIAGRAM_NODE_BODY_CONTENT, diagramNodeBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String boundingBox = diagramNode.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(DiagramNode.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object builder = diagramNode.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderString(DiagramNode.BUILDER, builder));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object centered = diagramNode.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderString(DiagramNode.CENTERED, centered));
		}
	}

	protected void renderConnectors(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String connectors = diagramNode.getConnectors();

		if (connectors != null) {
			renderedAttributes.add(renderString(DiagramNode.CONNECTORS, connectors));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object constrain = diagramNode.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(DiagramNode.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String contentBox = diagramNode.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(DiagramNode.CONTENT_BOX, contentBox));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object controlsToolbar = diagramNode.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(DiagramNode.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDescription(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String description = diagramNode.getDescription();

		if (description != null) {
			renderedAttributes.add(renderString(DiagramNode.DESCRIPTION, description));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean destroyed = diagramNode.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(DiagramNode.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean disabled = diagramNode.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(DiagramNode.DISABLED, disabled));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object fillHeight = diagramNode.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(DiagramNode.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean focused = diagramNode.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(DiagramNode.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object footerContent = diagramNode.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(DiagramNode.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderGraphic(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object graphic = diagramNode.getGraphic();

		if (graphic != null) {
			renderedAttributes.add(renderObject(DiagramNode.GRAPHIC, graphic));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object headerContent = diagramNode.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(DiagramNode.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object height = diagramNode.getHeight();

		if (height != null) {
			renderedAttributes.add(renderNumber(DiagramNode.HEIGHT, height));
		}
	}

	protected void renderHighlightBoundaryStroke(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object highlightBoundaryStroke = diagramNode.getHighlightBoundaryStroke();

		if (highlightBoundaryStroke != null) {
			renderedAttributes.add(renderObject(DiagramNode.HIGHLIGHT_BOUNDARY_STROKE, highlightBoundaryStroke));
		}
	}

	protected void renderHighlighted(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean highlighted = diagramNode.getHighlighted();

		if (highlighted != null) {
			renderedAttributes.add(renderBoolean(DiagramNode.HIGHLIGHTED, highlighted));
		}
	}

	protected void renderDiagramNodeId(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String diagramNodeId = diagramNode.getDiagramNodeId();

		if (diagramNodeId != null) {
			renderedAttributes.add(renderString(DiagramNode.DIAGRAM_NODE_ID, diagramNodeId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean initialized = diagramNode.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(DiagramNode.INITIALIZED, initialized));
		}
	}

	protected void renderDiagramNodeLocale(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String diagramNodeLocale = diagramNode.getDiagramNodeLocale();

		if (diagramNodeLocale != null) {
			renderedAttributes.add(renderString(DiagramNode.DIAGRAM_NODE_LOCALE, diagramNodeLocale));
		}
	}

	protected void renderName(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String name = diagramNode.getName();

		if (name != null) {
			renderedAttributes.add(renderString(DiagramNode.NAME, name));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean preventOverlap = diagramNode.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(DiagramNode.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object render = diagramNode.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(DiagramNode.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean rendered = diagramNode.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(DiagramNode.RENDERED, rendered));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean required = diagramNode.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(DiagramNode.REQUIRED, required));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean selected = diagramNode.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(DiagramNode.SELECTED, selected));
		}
	}

	protected void renderShapeBoundary(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object shapeBoundary = diagramNode.getShapeBoundary();

		if (shapeBoundary != null) {
			renderedAttributes.add(renderObject(DiagramNode.SHAPE_BOUNDARY, shapeBoundary));
		}
	}

	protected void renderShapeInvite(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object shapeInvite = diagramNode.getShapeInvite();

		if (shapeInvite != null) {
			renderedAttributes.add(renderObject(DiagramNode.SHAPE_INVITE, shapeInvite));
		}
	}

	protected void renderShim(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean shim = diagramNode.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(DiagramNode.SHIM, shim));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String srcNode = diagramNode.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(DiagramNode.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object strings = diagramNode.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(DiagramNode.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object tabIndex = diagramNode.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(DiagramNode.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTransitions(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String transitions = diagramNode.getTransitions();

		if (transitions != null) {
			renderedAttributes.add(renderString(DiagramNode.TRANSITIONS, transitions));
		}
	}

	protected void renderType(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String type = diagramNode.getType();

		if (type != null) {
			renderedAttributes.add(renderString(DiagramNode.TYPE, type));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean visible = diagramNode.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(DiagramNode.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object width = diagramNode.getWidth();

		if (width != null) {
			renderedAttributes.add(renderNumber(DiagramNode.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object x = diagramNode.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(DiagramNode.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object xy = diagramNode.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(DiagramNode.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object y = diagramNode.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(DiagramNode.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object zIndex = diagramNode.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(DiagramNode.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterAlignChange = diagramNode.getAfterAlignChange();

		if (afterAlignChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_ALIGN_CHANGE, afterAlignChange));
		}
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterAlignOnChange = diagramNode.getAfterAlignOnChange();

		if (afterAlignOnChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterBodyContentChange = diagramNode.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterBoundingBoxChange = diagramNode.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterBuilderChange = diagramNode.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterCenteredChange = diagramNode.getAfterCenteredChange();

		if (afterCenteredChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_CENTERED_CHANGE, afterCenteredChange));
		}
	}

	protected void renderAfterConnectorsChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterConnectorsChange = diagramNode.getAfterConnectorsChange();

		if (afterConnectorsChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_CONNECTORS_CHANGE, afterConnectorsChange));
		}
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterConstrainChange = diagramNode.getAfterConstrainChange();

		if (afterConstrainChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterContentBoxChange = diagramNode.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterControlsToolbarChange = diagramNode.getAfterControlsToolbarChange();

		if (afterControlsToolbarChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
		}
	}

	protected void renderAfterDescriptionChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterDescriptionChange = diagramNode.getAfterDescriptionChange();

		if (afterDescriptionChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_DESCRIPTION_CHANGE, afterDescriptionChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterDestroyedChange = diagramNode.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterDisabledChange = diagramNode.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterFillHeightChange = diagramNode.getAfterFillHeightChange();

		if (afterFillHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterFocusedChange = diagramNode.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterFooterContentChange = diagramNode.getAfterFooterContentChange();

		if (afterFooterContentChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
		}
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterGraphicChange = diagramNode.getAfterGraphicChange();

		if (afterGraphicChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
		}
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterHeaderContentChange = diagramNode.getAfterHeaderContentChange();

		if (afterHeaderContentChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterHeightChange = diagramNode.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterHighlightBoundaryStrokeChange = diagramNode.getAfterHighlightBoundaryStrokeChange();

		if (afterHighlightBoundaryStrokeChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, afterHighlightBoundaryStrokeChange));
		}
	}

	protected void renderAfterHighlightedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterHighlightedChange = diagramNode.getAfterHighlightedChange();

		if (afterHighlightedChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_HIGHLIGHTED_CHANGE, afterHighlightedChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterIdChange = diagramNode.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterInitializedChange = diagramNode.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterLocaleChange = diagramNode.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterNameChange = diagramNode.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterPreventOverlapChange = diagramNode.getAfterPreventOverlapChange();

		if (afterPreventOverlapChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterRenderChange = diagramNode.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterRenderedChange = diagramNode.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterRequiredChange = diagramNode.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterSelectedChange = diagramNode.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShapeBoundaryChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterShapeBoundaryChange = diagramNode.getAfterShapeBoundaryChange();

		if (afterShapeBoundaryChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_SHAPE_BOUNDARY_CHANGE, afterShapeBoundaryChange));
		}
	}

	protected void renderAfterShapeInviteChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterShapeInviteChange = diagramNode.getAfterShapeInviteChange();

		if (afterShapeInviteChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_SHAPE_INVITE_CHANGE, afterShapeInviteChange));
		}
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterShimChange = diagramNode.getAfterShimChange();

		if (afterShimChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_SHIM_CHANGE, afterShimChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterSrcNodeChange = diagramNode.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterStringsChange = diagramNode.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterTabIndexChange = diagramNode.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTransitionsChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterTransitionsChange = diagramNode.getAfterTransitionsChange();

		if (afterTransitionsChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_TRANSITIONS_CHANGE, afterTransitionsChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterTypeChange = diagramNode.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterVisibleChange = diagramNode.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterWidthChange = diagramNode.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterXChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterXChange = diagramNode.getAfterXChange();

		if (afterXChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_XCHANGE, afterXChange));
		}
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterXyChange = diagramNode.getAfterXyChange();

		if (afterXyChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_XY_CHANGE, afterXyChange));
		}
	}

	protected void renderAfterYChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterYChange = diagramNode.getAfterYChange();

		if (afterYChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_YCHANGE, afterYChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterZIndexChange = diagramNode.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNode.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onAlignChange = diagramNode.getOnAlignChange();

		if (onAlignChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_ALIGN_CHANGE, onAlignChange));
		}
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onAlignOnChange = diagramNode.getOnAlignOnChange();

		if (onAlignOnChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_ALIGN_ON_CHANGE, onAlignOnChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onBodyContentChange = diagramNode.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onBoundingBoxChange = diagramNode.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onBuilderChange = diagramNode.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onCenteredChange = diagramNode.getOnCenteredChange();

		if (onCenteredChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_CENTERED_CHANGE, onCenteredChange));
		}
	}

	protected void renderOnConnectorsChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onConnectorsChange = diagramNode.getOnConnectorsChange();

		if (onConnectorsChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_CONNECTORS_CHANGE, onConnectorsChange));
		}
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onConstrainChange = diagramNode.getOnConstrainChange();

		if (onConstrainChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_CONSTRAIN_CHANGE, onConstrainChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onContentBoxChange = diagramNode.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onControlsToolbarChange = diagramNode.getOnControlsToolbarChange();

		if (onControlsToolbarChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
		}
	}

	protected void renderOnDescriptionChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onDescriptionChange = diagramNode.getOnDescriptionChange();

		if (onDescriptionChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_DESCRIPTION_CHANGE, onDescriptionChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onDestroyedChange = diagramNode.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onDisabledChange = diagramNode.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onFillHeightChange = diagramNode.getOnFillHeightChange();

		if (onFillHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onFocusedChange = diagramNode.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onFooterContentChange = diagramNode.getOnFooterContentChange();

		if (onFooterContentChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
		}
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onGraphicChange = diagramNode.getOnGraphicChange();

		if (onGraphicChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_GRAPHIC_CHANGE, onGraphicChange));
		}
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onHeaderContentChange = diagramNode.getOnHeaderContentChange();

		if (onHeaderContentChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onHeightChange = diagramNode.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onHighlightBoundaryStrokeChange = diagramNode.getOnHighlightBoundaryStrokeChange();

		if (onHighlightBoundaryStrokeChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, onHighlightBoundaryStrokeChange));
		}
	}

	protected void renderOnHighlightedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onHighlightedChange = diagramNode.getOnHighlightedChange();

		if (onHighlightedChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_HIGHLIGHTED_CHANGE, onHighlightedChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onIdChange = diagramNode.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onInitializedChange = diagramNode.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onLocaleChange = diagramNode.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onNameChange = diagramNode.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onPreventOverlapChange = diagramNode.getOnPreventOverlapChange();

		if (onPreventOverlapChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onRenderChange = diagramNode.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onRenderedChange = diagramNode.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onRequiredChange = diagramNode.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onSelectedChange = diagramNode.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShapeBoundaryChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onShapeBoundaryChange = diagramNode.getOnShapeBoundaryChange();

		if (onShapeBoundaryChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_SHAPE_BOUNDARY_CHANGE, onShapeBoundaryChange));
		}
	}

	protected void renderOnShapeInviteChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onShapeInviteChange = diagramNode.getOnShapeInviteChange();

		if (onShapeInviteChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_SHAPE_INVITE_CHANGE, onShapeInviteChange));
		}
	}

	protected void renderOnShimChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onShimChange = diagramNode.getOnShimChange();

		if (onShimChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_SHIM_CHANGE, onShimChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onSrcNodeChange = diagramNode.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onStringsChange = diagramNode.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onTabIndexChange = diagramNode.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTransitionsChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onTransitionsChange = diagramNode.getOnTransitionsChange();

		if (onTransitionsChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_TRANSITIONS_CHANGE, onTransitionsChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onTypeChange = diagramNode.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onVisibleChange = diagramNode.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onWidthChange = diagramNode.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnXChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onXChange = diagramNode.getOnXChange();

		if (onXChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_XCHANGE, onXChange));
		}
	}

	protected void renderOnXyChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onXyChange = diagramNode.getOnXyChange();

		if (onXyChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_XY_CHANGE, onXyChange));
		}
	}

	protected void renderOnYChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onYChange = diagramNode.getOnYChange();

		if (onYChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_YCHANGE, onYChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onZIndexChange = diagramNode.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNode.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}