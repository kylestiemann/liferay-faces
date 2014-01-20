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
package com.liferay.faces.alloy.component.diagramnodestate;

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
public abstract class DiagramNodeStateRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DiagramNodeState diagramNodeState = (DiagramNodeState) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var diagramNodeState = new A.DiagramNodeState");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlign(renderedAttributes, diagramNodeState);
		renderAlignOn(renderedAttributes, diagramNodeState);
		renderDiagramNodeStateBodyContent(renderedAttributes, diagramNodeState);
		renderBoundingBox(renderedAttributes, diagramNodeState);
		renderBuilder(renderedAttributes, diagramNodeState);
		renderCentered(renderedAttributes, diagramNodeState);
		renderConnectors(renderedAttributes, diagramNodeState);
		renderConstrain(renderedAttributes, diagramNodeState);
		renderContentBox(renderedAttributes, diagramNodeState);
		renderControlsToolbar(renderedAttributes, diagramNodeState);
		renderDescription(renderedAttributes, diagramNodeState);
		renderDestroyed(renderedAttributes, diagramNodeState);
		renderDisabled(renderedAttributes, diagramNodeState);
		renderFillHeight(renderedAttributes, diagramNodeState);
		renderFocused(renderedAttributes, diagramNodeState);
		renderFooterContent(renderedAttributes, diagramNodeState);
		renderGraphic(renderedAttributes, diagramNodeState);
		renderHeaderContent(renderedAttributes, diagramNodeState);
		renderHeight(renderedAttributes, diagramNodeState);
		renderHighlightBoundaryStroke(renderedAttributes, diagramNodeState);
		renderHighlighted(renderedAttributes, diagramNodeState);
		renderDiagramNodeStateId(renderedAttributes, diagramNodeState);
		renderInitialized(renderedAttributes, diagramNodeState);
		renderDiagramNodeStateLocale(renderedAttributes, diagramNodeState);
		renderName(renderedAttributes, diagramNodeState);
		renderPreventOverlap(renderedAttributes, diagramNodeState);
		renderRender(renderedAttributes, diagramNodeState);
		renderRendered(renderedAttributes, diagramNodeState);
		renderRequired(renderedAttributes, diagramNodeState);
		renderSelected(renderedAttributes, diagramNodeState);
		renderShapeBoundary(renderedAttributes, diagramNodeState);
		renderShapeInvite(renderedAttributes, diagramNodeState);
		renderShim(renderedAttributes, diagramNodeState);
		renderSrcNode(renderedAttributes, diagramNodeState);
		renderStrings(renderedAttributes, diagramNodeState);
		renderTabIndex(renderedAttributes, diagramNodeState);
		renderTransitions(renderedAttributes, diagramNodeState);
		renderType(renderedAttributes, diagramNodeState);
		renderVisible(renderedAttributes, diagramNodeState);
		renderWidth(renderedAttributes, diagramNodeState);
		renderX(renderedAttributes, diagramNodeState);
		renderXy(renderedAttributes, diagramNodeState);
		renderY(renderedAttributes, diagramNodeState);
		renderZIndex(renderedAttributes, diagramNodeState);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlignChange(renderedAfterEvents, diagramNodeState);
		renderAfterAlignOnChange(renderedAfterEvents, diagramNodeState);
		renderAfterBodyContentChange(renderedAfterEvents, diagramNodeState);
		renderAfterBoundingBoxChange(renderedAfterEvents, diagramNodeState);
		renderAfterBuilderChange(renderedAfterEvents, diagramNodeState);
		renderAfterCenteredChange(renderedAfterEvents, diagramNodeState);
		renderAfterConnectorsChange(renderedAfterEvents, diagramNodeState);
		renderAfterConstrainChange(renderedAfterEvents, diagramNodeState);
		renderAfterContentBoxChange(renderedAfterEvents, diagramNodeState);
		renderAfterControlsToolbarChange(renderedAfterEvents, diagramNodeState);
		renderAfterDescriptionChange(renderedAfterEvents, diagramNodeState);
		renderAfterDestroyedChange(renderedAfterEvents, diagramNodeState);
		renderAfterDisabledChange(renderedAfterEvents, diagramNodeState);
		renderAfterFillHeightChange(renderedAfterEvents, diagramNodeState);
		renderAfterFocusedChange(renderedAfterEvents, diagramNodeState);
		renderAfterFooterContentChange(renderedAfterEvents, diagramNodeState);
		renderAfterGraphicChange(renderedAfterEvents, diagramNodeState);
		renderAfterHeaderContentChange(renderedAfterEvents, diagramNodeState);
		renderAfterHeightChange(renderedAfterEvents, diagramNodeState);
		renderAfterHighlightBoundaryStrokeChange(renderedAfterEvents, diagramNodeState);
		renderAfterHighlightedChange(renderedAfterEvents, diagramNodeState);
		renderAfterIdChange(renderedAfterEvents, diagramNodeState);
		renderAfterInitializedChange(renderedAfterEvents, diagramNodeState);
		renderAfterLocaleChange(renderedAfterEvents, diagramNodeState);
		renderAfterNameChange(renderedAfterEvents, diagramNodeState);
		renderAfterPreventOverlapChange(renderedAfterEvents, diagramNodeState);
		renderAfterRenderChange(renderedAfterEvents, diagramNodeState);
		renderAfterRenderedChange(renderedAfterEvents, diagramNodeState);
		renderAfterRequiredChange(renderedAfterEvents, diagramNodeState);
		renderAfterSelectedChange(renderedAfterEvents, diagramNodeState);
		renderAfterShapeBoundaryChange(renderedAfterEvents, diagramNodeState);
		renderAfterShapeInviteChange(renderedAfterEvents, diagramNodeState);
		renderAfterShimChange(renderedAfterEvents, diagramNodeState);
		renderAfterSrcNodeChange(renderedAfterEvents, diagramNodeState);
		renderAfterStringsChange(renderedAfterEvents, diagramNodeState);
		renderAfterTabIndexChange(renderedAfterEvents, diagramNodeState);
		renderAfterTransitionsChange(renderedAfterEvents, diagramNodeState);
		renderAfterTypeChange(renderedAfterEvents, diagramNodeState);
		renderAfterVisibleChange(renderedAfterEvents, diagramNodeState);
		renderAfterWidthChange(renderedAfterEvents, diagramNodeState);
		renderAfterXChange(renderedAfterEvents, diagramNodeState);
		renderAfterXyChange(renderedAfterEvents, diagramNodeState);
		renderAfterYChange(renderedAfterEvents, diagramNodeState);
		renderAfterZIndexChange(renderedAfterEvents, diagramNodeState);

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

		renderOnAlignChange(renderedOnEvents, diagramNodeState);
		renderOnAlignOnChange(renderedOnEvents, diagramNodeState);
		renderOnBodyContentChange(renderedOnEvents, diagramNodeState);
		renderOnBoundingBoxChange(renderedOnEvents, diagramNodeState);
		renderOnBuilderChange(renderedOnEvents, diagramNodeState);
		renderOnCenteredChange(renderedOnEvents, diagramNodeState);
		renderOnConnectorsChange(renderedOnEvents, diagramNodeState);
		renderOnConstrainChange(renderedOnEvents, diagramNodeState);
		renderOnContentBoxChange(renderedOnEvents, diagramNodeState);
		renderOnControlsToolbarChange(renderedOnEvents, diagramNodeState);
		renderOnDescriptionChange(renderedOnEvents, diagramNodeState);
		renderOnDestroyedChange(renderedOnEvents, diagramNodeState);
		renderOnDisabledChange(renderedOnEvents, diagramNodeState);
		renderOnFillHeightChange(renderedOnEvents, diagramNodeState);
		renderOnFocusedChange(renderedOnEvents, diagramNodeState);
		renderOnFooterContentChange(renderedOnEvents, diagramNodeState);
		renderOnGraphicChange(renderedOnEvents, diagramNodeState);
		renderOnHeaderContentChange(renderedOnEvents, diagramNodeState);
		renderOnHeightChange(renderedOnEvents, diagramNodeState);
		renderOnHighlightBoundaryStrokeChange(renderedOnEvents, diagramNodeState);
		renderOnHighlightedChange(renderedOnEvents, diagramNodeState);
		renderOnIdChange(renderedOnEvents, diagramNodeState);
		renderOnInitializedChange(renderedOnEvents, diagramNodeState);
		renderOnLocaleChange(renderedOnEvents, diagramNodeState);
		renderOnNameChange(renderedOnEvents, diagramNodeState);
		renderOnPreventOverlapChange(renderedOnEvents, diagramNodeState);
		renderOnRenderChange(renderedOnEvents, diagramNodeState);
		renderOnRenderedChange(renderedOnEvents, diagramNodeState);
		renderOnRequiredChange(renderedOnEvents, diagramNodeState);
		renderOnSelectedChange(renderedOnEvents, diagramNodeState);
		renderOnShapeBoundaryChange(renderedOnEvents, diagramNodeState);
		renderOnShapeInviteChange(renderedOnEvents, diagramNodeState);
		renderOnShimChange(renderedOnEvents, diagramNodeState);
		renderOnSrcNodeChange(renderedOnEvents, diagramNodeState);
		renderOnStringsChange(renderedOnEvents, diagramNodeState);
		renderOnTabIndexChange(renderedOnEvents, diagramNodeState);
		renderOnTransitionsChange(renderedOnEvents, diagramNodeState);
		renderOnTypeChange(renderedOnEvents, diagramNodeState);
		renderOnVisibleChange(renderedOnEvents, diagramNodeState);
		renderOnWidthChange(renderedOnEvents, diagramNodeState);
		renderOnXChange(renderedOnEvents, diagramNodeState);
		renderOnXyChange(renderedOnEvents, diagramNodeState);
		renderOnYChange(renderedOnEvents, diagramNodeState);
		renderOnZIndexChange(renderedOnEvents, diagramNodeState);

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

	protected void renderAlign(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object align = diagramNodeState.getAlign();

		if (align != null) {
			renderedAttributes.add(renderObject(DiagramNodeState.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object alignOn = diagramNodeState.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(DiagramNodeState.ALIGN_ON, alignOn));
		}
	}

	protected void renderDiagramNodeStateBodyContent(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object diagramNodeStateBodyContent = diagramNodeState.getDiagramNodeStateBodyContent();

		if (diagramNodeStateBodyContent != null) {
			renderedAttributes.add(renderString(DiagramNodeState.DIAGRAM_NODE_STATE_BODY_CONTENT, diagramNodeStateBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String boundingBox = diagramNodeState.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(DiagramNodeState.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object builder = diagramNodeState.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderString(DiagramNodeState.BUILDER, builder));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object centered = diagramNodeState.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderString(DiagramNodeState.CENTERED, centered));
		}
	}

	protected void renderConnectors(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String connectors = diagramNodeState.getConnectors();

		if (connectors != null) {
			renderedAttributes.add(renderString(DiagramNodeState.CONNECTORS, connectors));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object constrain = diagramNodeState.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(DiagramNodeState.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String contentBox = diagramNodeState.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(DiagramNodeState.CONTENT_BOX, contentBox));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object controlsToolbar = diagramNodeState.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(DiagramNodeState.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDescription(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String description = diagramNodeState.getDescription();

		if (description != null) {
			renderedAttributes.add(renderString(DiagramNodeState.DESCRIPTION, description));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean destroyed = diagramNodeState.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeState.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean disabled = diagramNodeState.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeState.DISABLED, disabled));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object fillHeight = diagramNodeState.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(DiagramNodeState.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean focused = diagramNodeState.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeState.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object footerContent = diagramNodeState.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(DiagramNodeState.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderGraphic(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object graphic = diagramNodeState.getGraphic();

		if (graphic != null) {
			renderedAttributes.add(renderObject(DiagramNodeState.GRAPHIC, graphic));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object headerContent = diagramNodeState.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(DiagramNodeState.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object height = diagramNodeState.getHeight();

		if (height != null) {
			renderedAttributes.add(renderNumber(DiagramNodeState.HEIGHT, height));
		}
	}

	protected void renderHighlightBoundaryStroke(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object highlightBoundaryStroke = diagramNodeState.getHighlightBoundaryStroke();

		if (highlightBoundaryStroke != null) {
			renderedAttributes.add(renderObject(DiagramNodeState.HIGHLIGHT_BOUNDARY_STROKE, highlightBoundaryStroke));
		}
	}

	protected void renderHighlighted(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean highlighted = diagramNodeState.getHighlighted();

		if (highlighted != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeState.HIGHLIGHTED, highlighted));
		}
	}

	protected void renderDiagramNodeStateId(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String diagramNodeStateId = diagramNodeState.getDiagramNodeStateId();

		if (diagramNodeStateId != null) {
			renderedAttributes.add(renderString(DiagramNodeState.DIAGRAM_NODE_STATE_ID, diagramNodeStateId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean initialized = diagramNodeState.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeState.INITIALIZED, initialized));
		}
	}

	protected void renderDiagramNodeStateLocale(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String diagramNodeStateLocale = diagramNodeState.getDiagramNodeStateLocale();

		if (diagramNodeStateLocale != null) {
			renderedAttributes.add(renderString(DiagramNodeState.DIAGRAM_NODE_STATE_LOCALE, diagramNodeStateLocale));
		}
	}

	protected void renderName(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String name = diagramNodeState.getName();

		if (name != null) {
			renderedAttributes.add(renderString(DiagramNodeState.NAME, name));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean preventOverlap = diagramNodeState.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeState.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object render = diagramNodeState.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(DiagramNodeState.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean rendered = diagramNodeState.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeState.RENDERED, rendered));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean required = diagramNodeState.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeState.REQUIRED, required));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean selected = diagramNodeState.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeState.SELECTED, selected));
		}
	}

	protected void renderShapeBoundary(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object shapeBoundary = diagramNodeState.getShapeBoundary();

		if (shapeBoundary != null) {
			renderedAttributes.add(renderObject(DiagramNodeState.SHAPE_BOUNDARY, shapeBoundary));
		}
	}

	protected void renderShapeInvite(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object shapeInvite = diagramNodeState.getShapeInvite();

		if (shapeInvite != null) {
			renderedAttributes.add(renderObject(DiagramNodeState.SHAPE_INVITE, shapeInvite));
		}
	}

	protected void renderShim(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean shim = diagramNodeState.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeState.SHIM, shim));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String srcNode = diagramNodeState.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(DiagramNodeState.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object strings = diagramNodeState.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(DiagramNodeState.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object tabIndex = diagramNodeState.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(DiagramNodeState.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTransitions(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String transitions = diagramNodeState.getTransitions();

		if (transitions != null) {
			renderedAttributes.add(renderString(DiagramNodeState.TRANSITIONS, transitions));
		}
	}

	protected void renderType(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String type = diagramNodeState.getType();

		if (type != null) {
			renderedAttributes.add(renderString(DiagramNodeState.TYPE, type));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean visible = diagramNodeState.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeState.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object width = diagramNodeState.getWidth();

		if (width != null) {
			renderedAttributes.add(renderNumber(DiagramNodeState.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object x = diagramNodeState.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(DiagramNodeState.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object xy = diagramNodeState.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(DiagramNodeState.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object y = diagramNodeState.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(DiagramNodeState.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object zIndex = diagramNodeState.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(DiagramNodeState.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterAlignChange = diagramNodeState.getAfterAlignChange();

		if (afterAlignChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_ALIGN_CHANGE, afterAlignChange));
		}
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterAlignOnChange = diagramNodeState.getAfterAlignOnChange();

		if (afterAlignOnChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterBodyContentChange = diagramNodeState.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterBoundingBoxChange = diagramNodeState.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterBuilderChange = diagramNodeState.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterCenteredChange = diagramNodeState.getAfterCenteredChange();

		if (afterCenteredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_CENTERED_CHANGE, afterCenteredChange));
		}
	}

	protected void renderAfterConnectorsChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterConnectorsChange = diagramNodeState.getAfterConnectorsChange();

		if (afterConnectorsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_CONNECTORS_CHANGE, afterConnectorsChange));
		}
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterConstrainChange = diagramNodeState.getAfterConstrainChange();

		if (afterConstrainChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterContentBoxChange = diagramNodeState.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterControlsToolbarChange = diagramNodeState.getAfterControlsToolbarChange();

		if (afterControlsToolbarChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
		}
	}

	protected void renderAfterDescriptionChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterDescriptionChange = diagramNodeState.getAfterDescriptionChange();

		if (afterDescriptionChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_DESCRIPTION_CHANGE, afterDescriptionChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterDestroyedChange = diagramNodeState.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterDisabledChange = diagramNodeState.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterFillHeightChange = diagramNodeState.getAfterFillHeightChange();

		if (afterFillHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterFocusedChange = diagramNodeState.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterFooterContentChange = diagramNodeState.getAfterFooterContentChange();

		if (afterFooterContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
		}
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterGraphicChange = diagramNodeState.getAfterGraphicChange();

		if (afterGraphicChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
		}
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterHeaderContentChange = diagramNodeState.getAfterHeaderContentChange();

		if (afterHeaderContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterHeightChange = diagramNodeState.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterHighlightBoundaryStrokeChange = diagramNodeState.getAfterHighlightBoundaryStrokeChange();

		if (afterHighlightBoundaryStrokeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, afterHighlightBoundaryStrokeChange));
		}
	}

	protected void renderAfterHighlightedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterHighlightedChange = diagramNodeState.getAfterHighlightedChange();

		if (afterHighlightedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_HIGHLIGHTED_CHANGE, afterHighlightedChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterIdChange = diagramNodeState.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterInitializedChange = diagramNodeState.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterLocaleChange = diagramNodeState.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterNameChange = diagramNodeState.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterPreventOverlapChange = diagramNodeState.getAfterPreventOverlapChange();

		if (afterPreventOverlapChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterRenderChange = diagramNodeState.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterRenderedChange = diagramNodeState.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterRequiredChange = diagramNodeState.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterSelectedChange = diagramNodeState.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterShapeBoundaryChange = diagramNodeState.getAfterShapeBoundaryChange();

		if (afterShapeBoundaryChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_SHAPE_BOUNDARY_CHANGE, afterShapeBoundaryChange));
		}
	}

	protected void renderAfterShapeInviteChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterShapeInviteChange = diagramNodeState.getAfterShapeInviteChange();

		if (afterShapeInviteChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_SHAPE_INVITE_CHANGE, afterShapeInviteChange));
		}
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterShimChange = diagramNodeState.getAfterShimChange();

		if (afterShimChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_SHIM_CHANGE, afterShimChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterSrcNodeChange = diagramNodeState.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterStringsChange = diagramNodeState.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterTabIndexChange = diagramNodeState.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTransitionsChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterTransitionsChange = diagramNodeState.getAfterTransitionsChange();

		if (afterTransitionsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_TRANSITIONS_CHANGE, afterTransitionsChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterTypeChange = diagramNodeState.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterVisibleChange = diagramNodeState.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterWidthChange = diagramNodeState.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterXChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterXChange = diagramNodeState.getAfterXChange();

		if (afterXChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_XCHANGE, afterXChange));
		}
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterXyChange = diagramNodeState.getAfterXyChange();

		if (afterXyChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_XY_CHANGE, afterXyChange));
		}
	}

	protected void renderAfterYChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterYChange = diagramNodeState.getAfterYChange();

		if (afterYChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_YCHANGE, afterYChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterZIndexChange = diagramNodeState.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onAlignChange = diagramNodeState.getOnAlignChange();

		if (onAlignChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_ALIGN_CHANGE, onAlignChange));
		}
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onAlignOnChange = diagramNodeState.getOnAlignOnChange();

		if (onAlignOnChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_ALIGN_ON_CHANGE, onAlignOnChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onBodyContentChange = diagramNodeState.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onBoundingBoxChange = diagramNodeState.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onBuilderChange = diagramNodeState.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onCenteredChange = diagramNodeState.getOnCenteredChange();

		if (onCenteredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_CENTERED_CHANGE, onCenteredChange));
		}
	}

	protected void renderOnConnectorsChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onConnectorsChange = diagramNodeState.getOnConnectorsChange();

		if (onConnectorsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_CONNECTORS_CHANGE, onConnectorsChange));
		}
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onConstrainChange = diagramNodeState.getOnConstrainChange();

		if (onConstrainChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_CONSTRAIN_CHANGE, onConstrainChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onContentBoxChange = diagramNodeState.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onControlsToolbarChange = diagramNodeState.getOnControlsToolbarChange();

		if (onControlsToolbarChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
		}
	}

	protected void renderOnDescriptionChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onDescriptionChange = diagramNodeState.getOnDescriptionChange();

		if (onDescriptionChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_DESCRIPTION_CHANGE, onDescriptionChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onDestroyedChange = diagramNodeState.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onDisabledChange = diagramNodeState.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onFillHeightChange = diagramNodeState.getOnFillHeightChange();

		if (onFillHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onFocusedChange = diagramNodeState.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onFooterContentChange = diagramNodeState.getOnFooterContentChange();

		if (onFooterContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
		}
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onGraphicChange = diagramNodeState.getOnGraphicChange();

		if (onGraphicChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_GRAPHIC_CHANGE, onGraphicChange));
		}
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onHeaderContentChange = diagramNodeState.getOnHeaderContentChange();

		if (onHeaderContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onHeightChange = diagramNodeState.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onHighlightBoundaryStrokeChange = diagramNodeState.getOnHighlightBoundaryStrokeChange();

		if (onHighlightBoundaryStrokeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, onHighlightBoundaryStrokeChange));
		}
	}

	protected void renderOnHighlightedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onHighlightedChange = diagramNodeState.getOnHighlightedChange();

		if (onHighlightedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_HIGHLIGHTED_CHANGE, onHighlightedChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onIdChange = diagramNodeState.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onInitializedChange = diagramNodeState.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onLocaleChange = diagramNodeState.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onNameChange = diagramNodeState.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onPreventOverlapChange = diagramNodeState.getOnPreventOverlapChange();

		if (onPreventOverlapChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onRenderChange = diagramNodeState.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onRenderedChange = diagramNodeState.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onRequiredChange = diagramNodeState.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onSelectedChange = diagramNodeState.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onShapeBoundaryChange = diagramNodeState.getOnShapeBoundaryChange();

		if (onShapeBoundaryChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_SHAPE_BOUNDARY_CHANGE, onShapeBoundaryChange));
		}
	}

	protected void renderOnShapeInviteChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onShapeInviteChange = diagramNodeState.getOnShapeInviteChange();

		if (onShapeInviteChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_SHAPE_INVITE_CHANGE, onShapeInviteChange));
		}
	}

	protected void renderOnShimChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onShimChange = diagramNodeState.getOnShimChange();

		if (onShimChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_SHIM_CHANGE, onShimChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onSrcNodeChange = diagramNodeState.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onStringsChange = diagramNodeState.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onTabIndexChange = diagramNodeState.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTransitionsChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onTransitionsChange = diagramNodeState.getOnTransitionsChange();

		if (onTransitionsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_TRANSITIONS_CHANGE, onTransitionsChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onTypeChange = diagramNodeState.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onVisibleChange = diagramNodeState.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onWidthChange = diagramNodeState.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnXChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onXChange = diagramNodeState.getOnXChange();

		if (onXChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_XCHANGE, onXChange));
		}
	}

	protected void renderOnXyChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onXyChange = diagramNodeState.getOnXyChange();

		if (onXyChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_XY_CHANGE, onXyChange));
		}
	}

	protected void renderOnYChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onYChange = diagramNodeState.getOnYChange();

		if (onYChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_YCHANGE, onYChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onZIndexChange = diagramNodeState.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeState.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}