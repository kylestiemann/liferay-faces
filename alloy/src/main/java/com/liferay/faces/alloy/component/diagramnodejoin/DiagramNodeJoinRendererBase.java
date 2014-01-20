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
package com.liferay.faces.alloy.component.diagramnodejoin;

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
public abstract class DiagramNodeJoinRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DiagramNodeJoin diagramNodeJoin = (DiagramNodeJoin) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var diagramNodeJoin = new A.DiagramNodeJoin");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlign(renderedAttributes, diagramNodeJoin);
		renderAlignOn(renderedAttributes, diagramNodeJoin);
		renderDiagramNodeJoinBodyContent(renderedAttributes, diagramNodeJoin);
		renderBoundingBox(renderedAttributes, diagramNodeJoin);
		renderBuilder(renderedAttributes, diagramNodeJoin);
		renderCentered(renderedAttributes, diagramNodeJoin);
		renderConnectors(renderedAttributes, diagramNodeJoin);
		renderConstrain(renderedAttributes, diagramNodeJoin);
		renderContentBox(renderedAttributes, diagramNodeJoin);
		renderControlsToolbar(renderedAttributes, diagramNodeJoin);
		renderDescription(renderedAttributes, diagramNodeJoin);
		renderDestroyed(renderedAttributes, diagramNodeJoin);
		renderDisabled(renderedAttributes, diagramNodeJoin);
		renderFillHeight(renderedAttributes, diagramNodeJoin);
		renderFocused(renderedAttributes, diagramNodeJoin);
		renderFooterContent(renderedAttributes, diagramNodeJoin);
		renderGraphic(renderedAttributes, diagramNodeJoin);
		renderHeaderContent(renderedAttributes, diagramNodeJoin);
		renderHeight(renderedAttributes, diagramNodeJoin);
		renderHighlightBoundaryStroke(renderedAttributes, diagramNodeJoin);
		renderHighlighted(renderedAttributes, diagramNodeJoin);
		renderDiagramNodeJoinId(renderedAttributes, diagramNodeJoin);
		renderInitialized(renderedAttributes, diagramNodeJoin);
		renderDiagramNodeJoinLocale(renderedAttributes, diagramNodeJoin);
		renderName(renderedAttributes, diagramNodeJoin);
		renderPreventOverlap(renderedAttributes, diagramNodeJoin);
		renderRender(renderedAttributes, diagramNodeJoin);
		renderRendered(renderedAttributes, diagramNodeJoin);
		renderRequired(renderedAttributes, diagramNodeJoin);
		renderSelected(renderedAttributes, diagramNodeJoin);
		renderShapeBoundary(renderedAttributes, diagramNodeJoin);
		renderShapeInvite(renderedAttributes, diagramNodeJoin);
		renderShim(renderedAttributes, diagramNodeJoin);
		renderSrcNode(renderedAttributes, diagramNodeJoin);
		renderStrings(renderedAttributes, diagramNodeJoin);
		renderTabIndex(renderedAttributes, diagramNodeJoin);
		renderTransitions(renderedAttributes, diagramNodeJoin);
		renderType(renderedAttributes, diagramNodeJoin);
		renderVisible(renderedAttributes, diagramNodeJoin);
		renderWidth(renderedAttributes, diagramNodeJoin);
		renderX(renderedAttributes, diagramNodeJoin);
		renderXy(renderedAttributes, diagramNodeJoin);
		renderY(renderedAttributes, diagramNodeJoin);
		renderZIndex(renderedAttributes, diagramNodeJoin);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlignChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterAlignOnChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterBodyContentChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterBoundingBoxChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterBuilderChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterCenteredChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterConnectorsChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterConstrainChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterContentBoxChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterControlsToolbarChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterDescriptionChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterDestroyedChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterDisabledChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterFillHeightChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterFocusedChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterFooterContentChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterGraphicChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterHeaderContentChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterHeightChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterHighlightBoundaryStrokeChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterHighlightedChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterIdChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterInitializedChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterLocaleChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterNameChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterPreventOverlapChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterRenderChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterRenderedChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterRequiredChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterSelectedChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterShapeBoundaryChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterShapeInviteChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterShimChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterSrcNodeChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterStringsChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterTabIndexChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterTransitionsChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterTypeChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterVisibleChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterWidthChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterXChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterXyChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterYChange(renderedAfterEvents, diagramNodeJoin);
		renderAfterZIndexChange(renderedAfterEvents, diagramNodeJoin);

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

		renderOnAlignChange(renderedOnEvents, diagramNodeJoin);
		renderOnAlignOnChange(renderedOnEvents, diagramNodeJoin);
		renderOnBodyContentChange(renderedOnEvents, diagramNodeJoin);
		renderOnBoundingBoxChange(renderedOnEvents, diagramNodeJoin);
		renderOnBuilderChange(renderedOnEvents, diagramNodeJoin);
		renderOnCenteredChange(renderedOnEvents, diagramNodeJoin);
		renderOnConnectorsChange(renderedOnEvents, diagramNodeJoin);
		renderOnConstrainChange(renderedOnEvents, diagramNodeJoin);
		renderOnContentBoxChange(renderedOnEvents, diagramNodeJoin);
		renderOnControlsToolbarChange(renderedOnEvents, diagramNodeJoin);
		renderOnDescriptionChange(renderedOnEvents, diagramNodeJoin);
		renderOnDestroyedChange(renderedOnEvents, diagramNodeJoin);
		renderOnDisabledChange(renderedOnEvents, diagramNodeJoin);
		renderOnFillHeightChange(renderedOnEvents, diagramNodeJoin);
		renderOnFocusedChange(renderedOnEvents, diagramNodeJoin);
		renderOnFooterContentChange(renderedOnEvents, diagramNodeJoin);
		renderOnGraphicChange(renderedOnEvents, diagramNodeJoin);
		renderOnHeaderContentChange(renderedOnEvents, diagramNodeJoin);
		renderOnHeightChange(renderedOnEvents, diagramNodeJoin);
		renderOnHighlightBoundaryStrokeChange(renderedOnEvents, diagramNodeJoin);
		renderOnHighlightedChange(renderedOnEvents, diagramNodeJoin);
		renderOnIdChange(renderedOnEvents, diagramNodeJoin);
		renderOnInitializedChange(renderedOnEvents, diagramNodeJoin);
		renderOnLocaleChange(renderedOnEvents, diagramNodeJoin);
		renderOnNameChange(renderedOnEvents, diagramNodeJoin);
		renderOnPreventOverlapChange(renderedOnEvents, diagramNodeJoin);
		renderOnRenderChange(renderedOnEvents, diagramNodeJoin);
		renderOnRenderedChange(renderedOnEvents, diagramNodeJoin);
		renderOnRequiredChange(renderedOnEvents, diagramNodeJoin);
		renderOnSelectedChange(renderedOnEvents, diagramNodeJoin);
		renderOnShapeBoundaryChange(renderedOnEvents, diagramNodeJoin);
		renderOnShapeInviteChange(renderedOnEvents, diagramNodeJoin);
		renderOnShimChange(renderedOnEvents, diagramNodeJoin);
		renderOnSrcNodeChange(renderedOnEvents, diagramNodeJoin);
		renderOnStringsChange(renderedOnEvents, diagramNodeJoin);
		renderOnTabIndexChange(renderedOnEvents, diagramNodeJoin);
		renderOnTransitionsChange(renderedOnEvents, diagramNodeJoin);
		renderOnTypeChange(renderedOnEvents, diagramNodeJoin);
		renderOnVisibleChange(renderedOnEvents, diagramNodeJoin);
		renderOnWidthChange(renderedOnEvents, diagramNodeJoin);
		renderOnXChange(renderedOnEvents, diagramNodeJoin);
		renderOnXyChange(renderedOnEvents, diagramNodeJoin);
		renderOnYChange(renderedOnEvents, diagramNodeJoin);
		renderOnZIndexChange(renderedOnEvents, diagramNodeJoin);

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

	protected void renderAlign(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object align = diagramNodeJoin.getAlign();

		if (align != null) {
			renderedAttributes.add(renderObject(DiagramNodeJoin.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object alignOn = diagramNodeJoin.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(DiagramNodeJoin.ALIGN_ON, alignOn));
		}
	}

	protected void renderDiagramNodeJoinBodyContent(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object diagramNodeJoinBodyContent = diagramNodeJoin.getDiagramNodeJoinBodyContent();

		if (diagramNodeJoinBodyContent != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.DIAGRAM_NODE_JOIN_BODY_CONTENT, diagramNodeJoinBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String boundingBox = diagramNodeJoin.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object builder = diagramNodeJoin.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.BUILDER, builder));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object centered = diagramNodeJoin.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.CENTERED, centered));
		}
	}

	protected void renderConnectors(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String connectors = diagramNodeJoin.getConnectors();

		if (connectors != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.CONNECTORS, connectors));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object constrain = diagramNodeJoin.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String contentBox = diagramNodeJoin.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.CONTENT_BOX, contentBox));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object controlsToolbar = diagramNodeJoin.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(DiagramNodeJoin.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDescription(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String description = diagramNodeJoin.getDescription();

		if (description != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.DESCRIPTION, description));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean destroyed = diagramNodeJoin.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeJoin.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean disabled = diagramNodeJoin.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeJoin.DISABLED, disabled));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object fillHeight = diagramNodeJoin.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean focused = diagramNodeJoin.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeJoin.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object footerContent = diagramNodeJoin.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderGraphic(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object graphic = diagramNodeJoin.getGraphic();

		if (graphic != null) {
			renderedAttributes.add(renderObject(DiagramNodeJoin.GRAPHIC, graphic));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object headerContent = diagramNodeJoin.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object height = diagramNodeJoin.getHeight();

		if (height != null) {
			renderedAttributes.add(renderNumber(DiagramNodeJoin.HEIGHT, height));
		}
	}

	protected void renderHighlightBoundaryStroke(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object highlightBoundaryStroke = diagramNodeJoin.getHighlightBoundaryStroke();

		if (highlightBoundaryStroke != null) {
			renderedAttributes.add(renderObject(DiagramNodeJoin.HIGHLIGHT_BOUNDARY_STROKE, highlightBoundaryStroke));
		}
	}

	protected void renderHighlighted(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean highlighted = diagramNodeJoin.getHighlighted();

		if (highlighted != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeJoin.HIGHLIGHTED, highlighted));
		}
	}

	protected void renderDiagramNodeJoinId(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String diagramNodeJoinId = diagramNodeJoin.getDiagramNodeJoinId();

		if (diagramNodeJoinId != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.DIAGRAM_NODE_JOIN_ID, diagramNodeJoinId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean initialized = diagramNodeJoin.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeJoin.INITIALIZED, initialized));
		}
	}

	protected void renderDiagramNodeJoinLocale(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String diagramNodeJoinLocale = diagramNodeJoin.getDiagramNodeJoinLocale();

		if (diagramNodeJoinLocale != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.DIAGRAM_NODE_JOIN_LOCALE, diagramNodeJoinLocale));
		}
	}

	protected void renderName(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String name = diagramNodeJoin.getName();

		if (name != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.NAME, name));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean preventOverlap = diagramNodeJoin.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeJoin.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object render = diagramNodeJoin.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean rendered = diagramNodeJoin.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeJoin.RENDERED, rendered));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean required = diagramNodeJoin.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeJoin.REQUIRED, required));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean selected = diagramNodeJoin.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeJoin.SELECTED, selected));
		}
	}

	protected void renderShapeBoundary(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object shapeBoundary = diagramNodeJoin.getShapeBoundary();

		if (shapeBoundary != null) {
			renderedAttributes.add(renderObject(DiagramNodeJoin.SHAPE_BOUNDARY, shapeBoundary));
		}
	}

	protected void renderShapeInvite(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object shapeInvite = diagramNodeJoin.getShapeInvite();

		if (shapeInvite != null) {
			renderedAttributes.add(renderObject(DiagramNodeJoin.SHAPE_INVITE, shapeInvite));
		}
	}

	protected void renderShim(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean shim = diagramNodeJoin.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeJoin.SHIM, shim));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String srcNode = diagramNodeJoin.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object strings = diagramNodeJoin.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(DiagramNodeJoin.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object tabIndex = diagramNodeJoin.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(DiagramNodeJoin.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTransitions(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String transitions = diagramNodeJoin.getTransitions();

		if (transitions != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.TRANSITIONS, transitions));
		}
	}

	protected void renderType(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String type = diagramNodeJoin.getType();

		if (type != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.TYPE, type));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean visible = diagramNodeJoin.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeJoin.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object width = diagramNodeJoin.getWidth();

		if (width != null) {
			renderedAttributes.add(renderNumber(DiagramNodeJoin.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object x = diagramNodeJoin.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(DiagramNodeJoin.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object xy = diagramNodeJoin.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(DiagramNodeJoin.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object y = diagramNodeJoin.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(DiagramNodeJoin.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object zIndex = diagramNodeJoin.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(DiagramNodeJoin.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterAlignChange = diagramNodeJoin.getAfterAlignChange();

		if (afterAlignChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_ALIGN_CHANGE, afterAlignChange));
		}
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterAlignOnChange = diagramNodeJoin.getAfterAlignOnChange();

		if (afterAlignOnChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterBodyContentChange = diagramNodeJoin.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterBoundingBoxChange = diagramNodeJoin.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterBuilderChange = diagramNodeJoin.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterCenteredChange = diagramNodeJoin.getAfterCenteredChange();

		if (afterCenteredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_CENTERED_CHANGE, afterCenteredChange));
		}
	}

	protected void renderAfterConnectorsChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterConnectorsChange = diagramNodeJoin.getAfterConnectorsChange();

		if (afterConnectorsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_CONNECTORS_CHANGE, afterConnectorsChange));
		}
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterConstrainChange = diagramNodeJoin.getAfterConstrainChange();

		if (afterConstrainChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterContentBoxChange = diagramNodeJoin.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterControlsToolbarChange = diagramNodeJoin.getAfterControlsToolbarChange();

		if (afterControlsToolbarChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
		}
	}

	protected void renderAfterDescriptionChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterDescriptionChange = diagramNodeJoin.getAfterDescriptionChange();

		if (afterDescriptionChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_DESCRIPTION_CHANGE, afterDescriptionChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterDestroyedChange = diagramNodeJoin.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterDisabledChange = diagramNodeJoin.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterFillHeightChange = diagramNodeJoin.getAfterFillHeightChange();

		if (afterFillHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterFocusedChange = diagramNodeJoin.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterFooterContentChange = diagramNodeJoin.getAfterFooterContentChange();

		if (afterFooterContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
		}
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterGraphicChange = diagramNodeJoin.getAfterGraphicChange();

		if (afterGraphicChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
		}
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterHeaderContentChange = diagramNodeJoin.getAfterHeaderContentChange();

		if (afterHeaderContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterHeightChange = diagramNodeJoin.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterHighlightBoundaryStrokeChange = diagramNodeJoin.getAfterHighlightBoundaryStrokeChange();

		if (afterHighlightBoundaryStrokeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, afterHighlightBoundaryStrokeChange));
		}
	}

	protected void renderAfterHighlightedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterHighlightedChange = diagramNodeJoin.getAfterHighlightedChange();

		if (afterHighlightedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_HIGHLIGHTED_CHANGE, afterHighlightedChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterIdChange = diagramNodeJoin.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterInitializedChange = diagramNodeJoin.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterLocaleChange = diagramNodeJoin.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterNameChange = diagramNodeJoin.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterPreventOverlapChange = diagramNodeJoin.getAfterPreventOverlapChange();

		if (afterPreventOverlapChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterRenderChange = diagramNodeJoin.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterRenderedChange = diagramNodeJoin.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterRequiredChange = diagramNodeJoin.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterSelectedChange = diagramNodeJoin.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterShapeBoundaryChange = diagramNodeJoin.getAfterShapeBoundaryChange();

		if (afterShapeBoundaryChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_SHAPE_BOUNDARY_CHANGE, afterShapeBoundaryChange));
		}
	}

	protected void renderAfterShapeInviteChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterShapeInviteChange = diagramNodeJoin.getAfterShapeInviteChange();

		if (afterShapeInviteChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_SHAPE_INVITE_CHANGE, afterShapeInviteChange));
		}
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterShimChange = diagramNodeJoin.getAfterShimChange();

		if (afterShimChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_SHIM_CHANGE, afterShimChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterSrcNodeChange = diagramNodeJoin.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterStringsChange = diagramNodeJoin.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterTabIndexChange = diagramNodeJoin.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTransitionsChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterTransitionsChange = diagramNodeJoin.getAfterTransitionsChange();

		if (afterTransitionsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_TRANSITIONS_CHANGE, afterTransitionsChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterTypeChange = diagramNodeJoin.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterVisibleChange = diagramNodeJoin.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterWidthChange = diagramNodeJoin.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterXChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterXChange = diagramNodeJoin.getAfterXChange();

		if (afterXChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_XCHANGE, afterXChange));
		}
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterXyChange = diagramNodeJoin.getAfterXyChange();

		if (afterXyChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_XY_CHANGE, afterXyChange));
		}
	}

	protected void renderAfterYChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterYChange = diagramNodeJoin.getAfterYChange();

		if (afterYChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_YCHANGE, afterYChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterZIndexChange = diagramNodeJoin.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onAlignChange = diagramNodeJoin.getOnAlignChange();

		if (onAlignChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_ALIGN_CHANGE, onAlignChange));
		}
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onAlignOnChange = diagramNodeJoin.getOnAlignOnChange();

		if (onAlignOnChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_ALIGN_ON_CHANGE, onAlignOnChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onBodyContentChange = diagramNodeJoin.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onBoundingBoxChange = diagramNodeJoin.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onBuilderChange = diagramNodeJoin.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onCenteredChange = diagramNodeJoin.getOnCenteredChange();

		if (onCenteredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_CENTERED_CHANGE, onCenteredChange));
		}
	}

	protected void renderOnConnectorsChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onConnectorsChange = diagramNodeJoin.getOnConnectorsChange();

		if (onConnectorsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_CONNECTORS_CHANGE, onConnectorsChange));
		}
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onConstrainChange = diagramNodeJoin.getOnConstrainChange();

		if (onConstrainChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_CONSTRAIN_CHANGE, onConstrainChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onContentBoxChange = diagramNodeJoin.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onControlsToolbarChange = diagramNodeJoin.getOnControlsToolbarChange();

		if (onControlsToolbarChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
		}
	}

	protected void renderOnDescriptionChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onDescriptionChange = diagramNodeJoin.getOnDescriptionChange();

		if (onDescriptionChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_DESCRIPTION_CHANGE, onDescriptionChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onDestroyedChange = diagramNodeJoin.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onDisabledChange = diagramNodeJoin.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onFillHeightChange = diagramNodeJoin.getOnFillHeightChange();

		if (onFillHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onFocusedChange = diagramNodeJoin.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onFooterContentChange = diagramNodeJoin.getOnFooterContentChange();

		if (onFooterContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
		}
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onGraphicChange = diagramNodeJoin.getOnGraphicChange();

		if (onGraphicChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_GRAPHIC_CHANGE, onGraphicChange));
		}
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onHeaderContentChange = diagramNodeJoin.getOnHeaderContentChange();

		if (onHeaderContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onHeightChange = diagramNodeJoin.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onHighlightBoundaryStrokeChange = diagramNodeJoin.getOnHighlightBoundaryStrokeChange();

		if (onHighlightBoundaryStrokeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, onHighlightBoundaryStrokeChange));
		}
	}

	protected void renderOnHighlightedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onHighlightedChange = diagramNodeJoin.getOnHighlightedChange();

		if (onHighlightedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_HIGHLIGHTED_CHANGE, onHighlightedChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onIdChange = diagramNodeJoin.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onInitializedChange = diagramNodeJoin.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onLocaleChange = diagramNodeJoin.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onNameChange = diagramNodeJoin.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onPreventOverlapChange = diagramNodeJoin.getOnPreventOverlapChange();

		if (onPreventOverlapChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onRenderChange = diagramNodeJoin.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onRenderedChange = diagramNodeJoin.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onRequiredChange = diagramNodeJoin.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onSelectedChange = diagramNodeJoin.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onShapeBoundaryChange = diagramNodeJoin.getOnShapeBoundaryChange();

		if (onShapeBoundaryChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_SHAPE_BOUNDARY_CHANGE, onShapeBoundaryChange));
		}
	}

	protected void renderOnShapeInviteChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onShapeInviteChange = diagramNodeJoin.getOnShapeInviteChange();

		if (onShapeInviteChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_SHAPE_INVITE_CHANGE, onShapeInviteChange));
		}
	}

	protected void renderOnShimChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onShimChange = diagramNodeJoin.getOnShimChange();

		if (onShimChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_SHIM_CHANGE, onShimChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onSrcNodeChange = diagramNodeJoin.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onStringsChange = diagramNodeJoin.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onTabIndexChange = diagramNodeJoin.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTransitionsChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onTransitionsChange = diagramNodeJoin.getOnTransitionsChange();

		if (onTransitionsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_TRANSITIONS_CHANGE, onTransitionsChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onTypeChange = diagramNodeJoin.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onVisibleChange = diagramNodeJoin.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onWidthChange = diagramNodeJoin.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnXChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onXChange = diagramNodeJoin.getOnXChange();

		if (onXChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_XCHANGE, onXChange));
		}
	}

	protected void renderOnXyChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onXyChange = diagramNodeJoin.getOnXyChange();

		if (onXyChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_XY_CHANGE, onXyChange));
		}
	}

	protected void renderOnYChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onYChange = diagramNodeJoin.getOnYChange();

		if (onYChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_YCHANGE, onYChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onZIndexChange = diagramNodeJoin.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeJoin.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}