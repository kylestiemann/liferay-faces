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
package com.liferay.faces.alloy.component.diagramnodefork;

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
public abstract class DiagramNodeForkRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DiagramNodeFork diagramNodeFork = (DiagramNodeFork) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var diagramNodeFork = new A.DiagramNodeFork");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlign(renderedAttributes, diagramNodeFork);
		renderAlignOn(renderedAttributes, diagramNodeFork);
		renderDiagramNodeForkBodyContent(renderedAttributes, diagramNodeFork);
		renderBoundingBox(renderedAttributes, diagramNodeFork);
		renderBuilder(renderedAttributes, diagramNodeFork);
		renderCentered(renderedAttributes, diagramNodeFork);
		renderConnectors(renderedAttributes, diagramNodeFork);
		renderConstrain(renderedAttributes, diagramNodeFork);
		renderContentBox(renderedAttributes, diagramNodeFork);
		renderControlsToolbar(renderedAttributes, diagramNodeFork);
		renderDescription(renderedAttributes, diagramNodeFork);
		renderDestroyed(renderedAttributes, diagramNodeFork);
		renderDisabled(renderedAttributes, diagramNodeFork);
		renderFillHeight(renderedAttributes, diagramNodeFork);
		renderFocused(renderedAttributes, diagramNodeFork);
		renderFooterContent(renderedAttributes, diagramNodeFork);
		renderGraphic(renderedAttributes, diagramNodeFork);
		renderHeaderContent(renderedAttributes, diagramNodeFork);
		renderHeight(renderedAttributes, diagramNodeFork);
		renderHighlightBoundaryStroke(renderedAttributes, diagramNodeFork);
		renderHighlighted(renderedAttributes, diagramNodeFork);
		renderDiagramNodeForkId(renderedAttributes, diagramNodeFork);
		renderInitialized(renderedAttributes, diagramNodeFork);
		renderDiagramNodeForkLocale(renderedAttributes, diagramNodeFork);
		renderName(renderedAttributes, diagramNodeFork);
		renderPreventOverlap(renderedAttributes, diagramNodeFork);
		renderRender(renderedAttributes, diagramNodeFork);
		renderRendered(renderedAttributes, diagramNodeFork);
		renderRequired(renderedAttributes, diagramNodeFork);
		renderSelected(renderedAttributes, diagramNodeFork);
		renderShapeBoundary(renderedAttributes, diagramNodeFork);
		renderShapeInvite(renderedAttributes, diagramNodeFork);
		renderShim(renderedAttributes, diagramNodeFork);
		renderSrcNode(renderedAttributes, diagramNodeFork);
		renderStrings(renderedAttributes, diagramNodeFork);
		renderTabIndex(renderedAttributes, diagramNodeFork);
		renderTransitions(renderedAttributes, diagramNodeFork);
		renderType(renderedAttributes, diagramNodeFork);
		renderVisible(renderedAttributes, diagramNodeFork);
		renderWidth(renderedAttributes, diagramNodeFork);
		renderX(renderedAttributes, diagramNodeFork);
		renderXy(renderedAttributes, diagramNodeFork);
		renderY(renderedAttributes, diagramNodeFork);
		renderZIndex(renderedAttributes, diagramNodeFork);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlignChange(renderedAfterEvents, diagramNodeFork);
		renderAfterAlignOnChange(renderedAfterEvents, diagramNodeFork);
		renderAfterBodyContentChange(renderedAfterEvents, diagramNodeFork);
		renderAfterBoundingBoxChange(renderedAfterEvents, diagramNodeFork);
		renderAfterBuilderChange(renderedAfterEvents, diagramNodeFork);
		renderAfterCenteredChange(renderedAfterEvents, diagramNodeFork);
		renderAfterConnectorsChange(renderedAfterEvents, diagramNodeFork);
		renderAfterConstrainChange(renderedAfterEvents, diagramNodeFork);
		renderAfterContentBoxChange(renderedAfterEvents, diagramNodeFork);
		renderAfterControlsToolbarChange(renderedAfterEvents, diagramNodeFork);
		renderAfterDescriptionChange(renderedAfterEvents, diagramNodeFork);
		renderAfterDestroyedChange(renderedAfterEvents, diagramNodeFork);
		renderAfterDisabledChange(renderedAfterEvents, diagramNodeFork);
		renderAfterFillHeightChange(renderedAfterEvents, diagramNodeFork);
		renderAfterFocusedChange(renderedAfterEvents, diagramNodeFork);
		renderAfterFooterContentChange(renderedAfterEvents, diagramNodeFork);
		renderAfterGraphicChange(renderedAfterEvents, diagramNodeFork);
		renderAfterHeaderContentChange(renderedAfterEvents, diagramNodeFork);
		renderAfterHeightChange(renderedAfterEvents, diagramNodeFork);
		renderAfterHighlightBoundaryStrokeChange(renderedAfterEvents, diagramNodeFork);
		renderAfterHighlightedChange(renderedAfterEvents, diagramNodeFork);
		renderAfterIdChange(renderedAfterEvents, diagramNodeFork);
		renderAfterInitializedChange(renderedAfterEvents, diagramNodeFork);
		renderAfterLocaleChange(renderedAfterEvents, diagramNodeFork);
		renderAfterNameChange(renderedAfterEvents, diagramNodeFork);
		renderAfterPreventOverlapChange(renderedAfterEvents, diagramNodeFork);
		renderAfterRenderChange(renderedAfterEvents, diagramNodeFork);
		renderAfterRenderedChange(renderedAfterEvents, diagramNodeFork);
		renderAfterRequiredChange(renderedAfterEvents, diagramNodeFork);
		renderAfterSelectedChange(renderedAfterEvents, diagramNodeFork);
		renderAfterShapeBoundaryChange(renderedAfterEvents, diagramNodeFork);
		renderAfterShapeInviteChange(renderedAfterEvents, diagramNodeFork);
		renderAfterShimChange(renderedAfterEvents, diagramNodeFork);
		renderAfterSrcNodeChange(renderedAfterEvents, diagramNodeFork);
		renderAfterStringsChange(renderedAfterEvents, diagramNodeFork);
		renderAfterTabIndexChange(renderedAfterEvents, diagramNodeFork);
		renderAfterTransitionsChange(renderedAfterEvents, diagramNodeFork);
		renderAfterTypeChange(renderedAfterEvents, diagramNodeFork);
		renderAfterVisibleChange(renderedAfterEvents, diagramNodeFork);
		renderAfterWidthChange(renderedAfterEvents, diagramNodeFork);
		renderAfterXChange(renderedAfterEvents, diagramNodeFork);
		renderAfterXyChange(renderedAfterEvents, diagramNodeFork);
		renderAfterYChange(renderedAfterEvents, diagramNodeFork);
		renderAfterZIndexChange(renderedAfterEvents, diagramNodeFork);

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

		renderOnAlignChange(renderedOnEvents, diagramNodeFork);
		renderOnAlignOnChange(renderedOnEvents, diagramNodeFork);
		renderOnBodyContentChange(renderedOnEvents, diagramNodeFork);
		renderOnBoundingBoxChange(renderedOnEvents, diagramNodeFork);
		renderOnBuilderChange(renderedOnEvents, diagramNodeFork);
		renderOnCenteredChange(renderedOnEvents, diagramNodeFork);
		renderOnConnectorsChange(renderedOnEvents, diagramNodeFork);
		renderOnConstrainChange(renderedOnEvents, diagramNodeFork);
		renderOnContentBoxChange(renderedOnEvents, diagramNodeFork);
		renderOnControlsToolbarChange(renderedOnEvents, diagramNodeFork);
		renderOnDescriptionChange(renderedOnEvents, diagramNodeFork);
		renderOnDestroyedChange(renderedOnEvents, diagramNodeFork);
		renderOnDisabledChange(renderedOnEvents, diagramNodeFork);
		renderOnFillHeightChange(renderedOnEvents, diagramNodeFork);
		renderOnFocusedChange(renderedOnEvents, diagramNodeFork);
		renderOnFooterContentChange(renderedOnEvents, diagramNodeFork);
		renderOnGraphicChange(renderedOnEvents, diagramNodeFork);
		renderOnHeaderContentChange(renderedOnEvents, diagramNodeFork);
		renderOnHeightChange(renderedOnEvents, diagramNodeFork);
		renderOnHighlightBoundaryStrokeChange(renderedOnEvents, diagramNodeFork);
		renderOnHighlightedChange(renderedOnEvents, diagramNodeFork);
		renderOnIdChange(renderedOnEvents, diagramNodeFork);
		renderOnInitializedChange(renderedOnEvents, diagramNodeFork);
		renderOnLocaleChange(renderedOnEvents, diagramNodeFork);
		renderOnNameChange(renderedOnEvents, diagramNodeFork);
		renderOnPreventOverlapChange(renderedOnEvents, diagramNodeFork);
		renderOnRenderChange(renderedOnEvents, diagramNodeFork);
		renderOnRenderedChange(renderedOnEvents, diagramNodeFork);
		renderOnRequiredChange(renderedOnEvents, diagramNodeFork);
		renderOnSelectedChange(renderedOnEvents, diagramNodeFork);
		renderOnShapeBoundaryChange(renderedOnEvents, diagramNodeFork);
		renderOnShapeInviteChange(renderedOnEvents, diagramNodeFork);
		renderOnShimChange(renderedOnEvents, diagramNodeFork);
		renderOnSrcNodeChange(renderedOnEvents, diagramNodeFork);
		renderOnStringsChange(renderedOnEvents, diagramNodeFork);
		renderOnTabIndexChange(renderedOnEvents, diagramNodeFork);
		renderOnTransitionsChange(renderedOnEvents, diagramNodeFork);
		renderOnTypeChange(renderedOnEvents, diagramNodeFork);
		renderOnVisibleChange(renderedOnEvents, diagramNodeFork);
		renderOnWidthChange(renderedOnEvents, diagramNodeFork);
		renderOnXChange(renderedOnEvents, diagramNodeFork);
		renderOnXyChange(renderedOnEvents, diagramNodeFork);
		renderOnYChange(renderedOnEvents, diagramNodeFork);
		renderOnZIndexChange(renderedOnEvents, diagramNodeFork);

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

	protected void renderAlign(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object align = diagramNodeFork.getAlign();

		if (align != null) {
			renderedAttributes.add(renderObject(DiagramNodeFork.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object alignOn = diagramNodeFork.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(DiagramNodeFork.ALIGN_ON, alignOn));
		}
	}

	protected void renderDiagramNodeForkBodyContent(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object diagramNodeForkBodyContent = diagramNodeFork.getDiagramNodeForkBodyContent();

		if (diagramNodeForkBodyContent != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.DIAGRAM_NODE_FORK_BODY_CONTENT, diagramNodeForkBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String boundingBox = diagramNodeFork.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object builder = diagramNodeFork.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.BUILDER, builder));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object centered = diagramNodeFork.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.CENTERED, centered));
		}
	}

	protected void renderConnectors(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String connectors = diagramNodeFork.getConnectors();

		if (connectors != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.CONNECTORS, connectors));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object constrain = diagramNodeFork.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String contentBox = diagramNodeFork.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.CONTENT_BOX, contentBox));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object controlsToolbar = diagramNodeFork.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(DiagramNodeFork.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDescription(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String description = diagramNodeFork.getDescription();

		if (description != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.DESCRIPTION, description));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean destroyed = diagramNodeFork.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeFork.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean disabled = diagramNodeFork.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeFork.DISABLED, disabled));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object fillHeight = diagramNodeFork.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean focused = diagramNodeFork.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeFork.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object footerContent = diagramNodeFork.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderGraphic(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object graphic = diagramNodeFork.getGraphic();

		if (graphic != null) {
			renderedAttributes.add(renderObject(DiagramNodeFork.GRAPHIC, graphic));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object headerContent = diagramNodeFork.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object height = diagramNodeFork.getHeight();

		if (height != null) {
			renderedAttributes.add(renderNumber(DiagramNodeFork.HEIGHT, height));
		}
	}

	protected void renderHighlightBoundaryStroke(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object highlightBoundaryStroke = diagramNodeFork.getHighlightBoundaryStroke();

		if (highlightBoundaryStroke != null) {
			renderedAttributes.add(renderObject(DiagramNodeFork.HIGHLIGHT_BOUNDARY_STROKE, highlightBoundaryStroke));
		}
	}

	protected void renderHighlighted(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean highlighted = diagramNodeFork.getHighlighted();

		if (highlighted != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeFork.HIGHLIGHTED, highlighted));
		}
	}

	protected void renderDiagramNodeForkId(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String diagramNodeForkId = diagramNodeFork.getDiagramNodeForkId();

		if (diagramNodeForkId != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.DIAGRAM_NODE_FORK_ID, diagramNodeForkId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean initialized = diagramNodeFork.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeFork.INITIALIZED, initialized));
		}
	}

	protected void renderDiagramNodeForkLocale(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String diagramNodeForkLocale = diagramNodeFork.getDiagramNodeForkLocale();

		if (diagramNodeForkLocale != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.DIAGRAM_NODE_FORK_LOCALE, diagramNodeForkLocale));
		}
	}

	protected void renderName(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String name = diagramNodeFork.getName();

		if (name != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.NAME, name));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean preventOverlap = diagramNodeFork.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeFork.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object render = diagramNodeFork.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean rendered = diagramNodeFork.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeFork.RENDERED, rendered));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean required = diagramNodeFork.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeFork.REQUIRED, required));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean selected = diagramNodeFork.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeFork.SELECTED, selected));
		}
	}

	protected void renderShapeBoundary(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object shapeBoundary = diagramNodeFork.getShapeBoundary();

		if (shapeBoundary != null) {
			renderedAttributes.add(renderObject(DiagramNodeFork.SHAPE_BOUNDARY, shapeBoundary));
		}
	}

	protected void renderShapeInvite(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object shapeInvite = diagramNodeFork.getShapeInvite();

		if (shapeInvite != null) {
			renderedAttributes.add(renderObject(DiagramNodeFork.SHAPE_INVITE, shapeInvite));
		}
	}

	protected void renderShim(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean shim = diagramNodeFork.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeFork.SHIM, shim));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String srcNode = diagramNodeFork.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object strings = diagramNodeFork.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(DiagramNodeFork.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object tabIndex = diagramNodeFork.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(DiagramNodeFork.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTransitions(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String transitions = diagramNodeFork.getTransitions();

		if (transitions != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.TRANSITIONS, transitions));
		}
	}

	protected void renderType(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String type = diagramNodeFork.getType();

		if (type != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.TYPE, type));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean visible = diagramNodeFork.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeFork.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object width = diagramNodeFork.getWidth();

		if (width != null) {
			renderedAttributes.add(renderNumber(DiagramNodeFork.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object x = diagramNodeFork.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(DiagramNodeFork.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object xy = diagramNodeFork.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(DiagramNodeFork.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object y = diagramNodeFork.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(DiagramNodeFork.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object zIndex = diagramNodeFork.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(DiagramNodeFork.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterAlignChange = diagramNodeFork.getAfterAlignChange();

		if (afterAlignChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_ALIGN_CHANGE, afterAlignChange));
		}
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterAlignOnChange = diagramNodeFork.getAfterAlignOnChange();

		if (afterAlignOnChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterBodyContentChange = diagramNodeFork.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterBoundingBoxChange = diagramNodeFork.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterBuilderChange = diagramNodeFork.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterCenteredChange = diagramNodeFork.getAfterCenteredChange();

		if (afterCenteredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_CENTERED_CHANGE, afterCenteredChange));
		}
	}

	protected void renderAfterConnectorsChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterConnectorsChange = diagramNodeFork.getAfterConnectorsChange();

		if (afterConnectorsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_CONNECTORS_CHANGE, afterConnectorsChange));
		}
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterConstrainChange = diagramNodeFork.getAfterConstrainChange();

		if (afterConstrainChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterContentBoxChange = diagramNodeFork.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterControlsToolbarChange = diagramNodeFork.getAfterControlsToolbarChange();

		if (afterControlsToolbarChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
		}
	}

	protected void renderAfterDescriptionChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterDescriptionChange = diagramNodeFork.getAfterDescriptionChange();

		if (afterDescriptionChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_DESCRIPTION_CHANGE, afterDescriptionChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterDestroyedChange = diagramNodeFork.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterDisabledChange = diagramNodeFork.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterFillHeightChange = diagramNodeFork.getAfterFillHeightChange();

		if (afterFillHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterFocusedChange = diagramNodeFork.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterFooterContentChange = diagramNodeFork.getAfterFooterContentChange();

		if (afterFooterContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
		}
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterGraphicChange = diagramNodeFork.getAfterGraphicChange();

		if (afterGraphicChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
		}
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterHeaderContentChange = diagramNodeFork.getAfterHeaderContentChange();

		if (afterHeaderContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterHeightChange = diagramNodeFork.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterHighlightBoundaryStrokeChange = diagramNodeFork.getAfterHighlightBoundaryStrokeChange();

		if (afterHighlightBoundaryStrokeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, afterHighlightBoundaryStrokeChange));
		}
	}

	protected void renderAfterHighlightedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterHighlightedChange = diagramNodeFork.getAfterHighlightedChange();

		if (afterHighlightedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_HIGHLIGHTED_CHANGE, afterHighlightedChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterIdChange = diagramNodeFork.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterInitializedChange = diagramNodeFork.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterLocaleChange = diagramNodeFork.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterNameChange = diagramNodeFork.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterPreventOverlapChange = diagramNodeFork.getAfterPreventOverlapChange();

		if (afterPreventOverlapChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterRenderChange = diagramNodeFork.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterRenderedChange = diagramNodeFork.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterRequiredChange = diagramNodeFork.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterSelectedChange = diagramNodeFork.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterShapeBoundaryChange = diagramNodeFork.getAfterShapeBoundaryChange();

		if (afterShapeBoundaryChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_SHAPE_BOUNDARY_CHANGE, afterShapeBoundaryChange));
		}
	}

	protected void renderAfterShapeInviteChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterShapeInviteChange = diagramNodeFork.getAfterShapeInviteChange();

		if (afterShapeInviteChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_SHAPE_INVITE_CHANGE, afterShapeInviteChange));
		}
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterShimChange = diagramNodeFork.getAfterShimChange();

		if (afterShimChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_SHIM_CHANGE, afterShimChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterSrcNodeChange = diagramNodeFork.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterStringsChange = diagramNodeFork.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterTabIndexChange = diagramNodeFork.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTransitionsChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterTransitionsChange = diagramNodeFork.getAfterTransitionsChange();

		if (afterTransitionsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_TRANSITIONS_CHANGE, afterTransitionsChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterTypeChange = diagramNodeFork.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterVisibleChange = diagramNodeFork.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterWidthChange = diagramNodeFork.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterXChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterXChange = diagramNodeFork.getAfterXChange();

		if (afterXChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_XCHANGE, afterXChange));
		}
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterXyChange = diagramNodeFork.getAfterXyChange();

		if (afterXyChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_XY_CHANGE, afterXyChange));
		}
	}

	protected void renderAfterYChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterYChange = diagramNodeFork.getAfterYChange();

		if (afterYChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_YCHANGE, afterYChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterZIndexChange = diagramNodeFork.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onAlignChange = diagramNodeFork.getOnAlignChange();

		if (onAlignChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_ALIGN_CHANGE, onAlignChange));
		}
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onAlignOnChange = diagramNodeFork.getOnAlignOnChange();

		if (onAlignOnChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_ALIGN_ON_CHANGE, onAlignOnChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onBodyContentChange = diagramNodeFork.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onBoundingBoxChange = diagramNodeFork.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onBuilderChange = diagramNodeFork.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onCenteredChange = diagramNodeFork.getOnCenteredChange();

		if (onCenteredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_CENTERED_CHANGE, onCenteredChange));
		}
	}

	protected void renderOnConnectorsChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onConnectorsChange = diagramNodeFork.getOnConnectorsChange();

		if (onConnectorsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_CONNECTORS_CHANGE, onConnectorsChange));
		}
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onConstrainChange = diagramNodeFork.getOnConstrainChange();

		if (onConstrainChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_CONSTRAIN_CHANGE, onConstrainChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onContentBoxChange = diagramNodeFork.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onControlsToolbarChange = diagramNodeFork.getOnControlsToolbarChange();

		if (onControlsToolbarChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
		}
	}

	protected void renderOnDescriptionChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onDescriptionChange = diagramNodeFork.getOnDescriptionChange();

		if (onDescriptionChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_DESCRIPTION_CHANGE, onDescriptionChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onDestroyedChange = diagramNodeFork.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onDisabledChange = diagramNodeFork.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onFillHeightChange = diagramNodeFork.getOnFillHeightChange();

		if (onFillHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onFocusedChange = diagramNodeFork.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onFooterContentChange = diagramNodeFork.getOnFooterContentChange();

		if (onFooterContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
		}
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onGraphicChange = diagramNodeFork.getOnGraphicChange();

		if (onGraphicChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_GRAPHIC_CHANGE, onGraphicChange));
		}
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onHeaderContentChange = diagramNodeFork.getOnHeaderContentChange();

		if (onHeaderContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onHeightChange = diagramNodeFork.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onHighlightBoundaryStrokeChange = diagramNodeFork.getOnHighlightBoundaryStrokeChange();

		if (onHighlightBoundaryStrokeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, onHighlightBoundaryStrokeChange));
		}
	}

	protected void renderOnHighlightedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onHighlightedChange = diagramNodeFork.getOnHighlightedChange();

		if (onHighlightedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_HIGHLIGHTED_CHANGE, onHighlightedChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onIdChange = diagramNodeFork.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onInitializedChange = diagramNodeFork.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onLocaleChange = diagramNodeFork.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onNameChange = diagramNodeFork.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onPreventOverlapChange = diagramNodeFork.getOnPreventOverlapChange();

		if (onPreventOverlapChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onRenderChange = diagramNodeFork.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onRenderedChange = diagramNodeFork.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onRequiredChange = diagramNodeFork.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onSelectedChange = diagramNodeFork.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onShapeBoundaryChange = diagramNodeFork.getOnShapeBoundaryChange();

		if (onShapeBoundaryChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_SHAPE_BOUNDARY_CHANGE, onShapeBoundaryChange));
		}
	}

	protected void renderOnShapeInviteChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onShapeInviteChange = diagramNodeFork.getOnShapeInviteChange();

		if (onShapeInviteChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_SHAPE_INVITE_CHANGE, onShapeInviteChange));
		}
	}

	protected void renderOnShimChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onShimChange = diagramNodeFork.getOnShimChange();

		if (onShimChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_SHIM_CHANGE, onShimChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onSrcNodeChange = diagramNodeFork.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onStringsChange = diagramNodeFork.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onTabIndexChange = diagramNodeFork.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTransitionsChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onTransitionsChange = diagramNodeFork.getOnTransitionsChange();

		if (onTransitionsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_TRANSITIONS_CHANGE, onTransitionsChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onTypeChange = diagramNodeFork.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onVisibleChange = diagramNodeFork.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onWidthChange = diagramNodeFork.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnXChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onXChange = diagramNodeFork.getOnXChange();

		if (onXChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_XCHANGE, onXChange));
		}
	}

	protected void renderOnXyChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onXyChange = diagramNodeFork.getOnXyChange();

		if (onXyChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_XY_CHANGE, onXyChange));
		}
	}

	protected void renderOnYChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onYChange = diagramNodeFork.getOnYChange();

		if (onYChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_YCHANGE, onYChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onZIndexChange = diagramNodeFork.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeFork.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}