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
package com.liferay.faces.alloy.component.diagramnodestart;

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
public abstract class DiagramNodeStartRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DiagramNodeStart diagramNodeStart = (DiagramNodeStart) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var diagramNodeStart = new A.DiagramNodeStart");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlign(renderedAttributes, diagramNodeStart);
		renderAlignOn(renderedAttributes, diagramNodeStart);
		renderDiagramNodeStartBodyContent(renderedAttributes, diagramNodeStart);
		renderBoundingBox(renderedAttributes, diagramNodeStart);
		renderBuilder(renderedAttributes, diagramNodeStart);
		renderCentered(renderedAttributes, diagramNodeStart);
		renderConnectors(renderedAttributes, diagramNodeStart);
		renderConstrain(renderedAttributes, diagramNodeStart);
		renderContentBox(renderedAttributes, diagramNodeStart);
		renderControlsToolbar(renderedAttributes, diagramNodeStart);
		renderDescription(renderedAttributes, diagramNodeStart);
		renderDestroyed(renderedAttributes, diagramNodeStart);
		renderDisabled(renderedAttributes, diagramNodeStart);
		renderFillHeight(renderedAttributes, diagramNodeStart);
		renderFocused(renderedAttributes, diagramNodeStart);
		renderFooterContent(renderedAttributes, diagramNodeStart);
		renderGraphic(renderedAttributes, diagramNodeStart);
		renderHeaderContent(renderedAttributes, diagramNodeStart);
		renderHeight(renderedAttributes, diagramNodeStart);
		renderHighlightBoundaryStroke(renderedAttributes, diagramNodeStart);
		renderHighlighted(renderedAttributes, diagramNodeStart);
		renderDiagramNodeStartId(renderedAttributes, diagramNodeStart);
		renderInitialized(renderedAttributes, diagramNodeStart);
		renderDiagramNodeStartLocale(renderedAttributes, diagramNodeStart);
		renderName(renderedAttributes, diagramNodeStart);
		renderPreventOverlap(renderedAttributes, diagramNodeStart);
		renderRender(renderedAttributes, diagramNodeStart);
		renderRendered(renderedAttributes, diagramNodeStart);
		renderRequired(renderedAttributes, diagramNodeStart);
		renderSelected(renderedAttributes, diagramNodeStart);
		renderShapeBoundary(renderedAttributes, diagramNodeStart);
		renderShapeInvite(renderedAttributes, diagramNodeStart);
		renderShim(renderedAttributes, diagramNodeStart);
		renderSrcNode(renderedAttributes, diagramNodeStart);
		renderStrings(renderedAttributes, diagramNodeStart);
		renderTabIndex(renderedAttributes, diagramNodeStart);
		renderTransitions(renderedAttributes, diagramNodeStart);
		renderType(renderedAttributes, diagramNodeStart);
		renderVisible(renderedAttributes, diagramNodeStart);
		renderWidth(renderedAttributes, diagramNodeStart);
		renderX(renderedAttributes, diagramNodeStart);
		renderXy(renderedAttributes, diagramNodeStart);
		renderY(renderedAttributes, diagramNodeStart);
		renderZIndex(renderedAttributes, diagramNodeStart);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlignChange(renderedAfterEvents, diagramNodeStart);
		renderAfterAlignOnChange(renderedAfterEvents, diagramNodeStart);
		renderAfterBodyContentChange(renderedAfterEvents, diagramNodeStart);
		renderAfterBoundingBoxChange(renderedAfterEvents, diagramNodeStart);
		renderAfterBuilderChange(renderedAfterEvents, diagramNodeStart);
		renderAfterCenteredChange(renderedAfterEvents, diagramNodeStart);
		renderAfterConnectorsChange(renderedAfterEvents, diagramNodeStart);
		renderAfterConstrainChange(renderedAfterEvents, diagramNodeStart);
		renderAfterContentBoxChange(renderedAfterEvents, diagramNodeStart);
		renderAfterControlsToolbarChange(renderedAfterEvents, diagramNodeStart);
		renderAfterDescriptionChange(renderedAfterEvents, diagramNodeStart);
		renderAfterDestroyedChange(renderedAfterEvents, diagramNodeStart);
		renderAfterDisabledChange(renderedAfterEvents, diagramNodeStart);
		renderAfterFillHeightChange(renderedAfterEvents, diagramNodeStart);
		renderAfterFocusedChange(renderedAfterEvents, diagramNodeStart);
		renderAfterFooterContentChange(renderedAfterEvents, diagramNodeStart);
		renderAfterGraphicChange(renderedAfterEvents, diagramNodeStart);
		renderAfterHeaderContentChange(renderedAfterEvents, diagramNodeStart);
		renderAfterHeightChange(renderedAfterEvents, diagramNodeStart);
		renderAfterHighlightBoundaryStrokeChange(renderedAfterEvents, diagramNodeStart);
		renderAfterHighlightedChange(renderedAfterEvents, diagramNodeStart);
		renderAfterIdChange(renderedAfterEvents, diagramNodeStart);
		renderAfterInitializedChange(renderedAfterEvents, diagramNodeStart);
		renderAfterLocaleChange(renderedAfterEvents, diagramNodeStart);
		renderAfterNameChange(renderedAfterEvents, diagramNodeStart);
		renderAfterPreventOverlapChange(renderedAfterEvents, diagramNodeStart);
		renderAfterRenderChange(renderedAfterEvents, diagramNodeStart);
		renderAfterRenderedChange(renderedAfterEvents, diagramNodeStart);
		renderAfterRequiredChange(renderedAfterEvents, diagramNodeStart);
		renderAfterSelectedChange(renderedAfterEvents, diagramNodeStart);
		renderAfterShapeBoundaryChange(renderedAfterEvents, diagramNodeStart);
		renderAfterShapeInviteChange(renderedAfterEvents, diagramNodeStart);
		renderAfterShimChange(renderedAfterEvents, diagramNodeStart);
		renderAfterSrcNodeChange(renderedAfterEvents, diagramNodeStart);
		renderAfterStringsChange(renderedAfterEvents, diagramNodeStart);
		renderAfterTabIndexChange(renderedAfterEvents, diagramNodeStart);
		renderAfterTransitionsChange(renderedAfterEvents, diagramNodeStart);
		renderAfterTypeChange(renderedAfterEvents, diagramNodeStart);
		renderAfterVisibleChange(renderedAfterEvents, diagramNodeStart);
		renderAfterWidthChange(renderedAfterEvents, diagramNodeStart);
		renderAfterXChange(renderedAfterEvents, diagramNodeStart);
		renderAfterXyChange(renderedAfterEvents, diagramNodeStart);
		renderAfterYChange(renderedAfterEvents, diagramNodeStart);
		renderAfterZIndexChange(renderedAfterEvents, diagramNodeStart);

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

		renderOnAlignChange(renderedOnEvents, diagramNodeStart);
		renderOnAlignOnChange(renderedOnEvents, diagramNodeStart);
		renderOnBodyContentChange(renderedOnEvents, diagramNodeStart);
		renderOnBoundingBoxChange(renderedOnEvents, diagramNodeStart);
		renderOnBuilderChange(renderedOnEvents, diagramNodeStart);
		renderOnCenteredChange(renderedOnEvents, diagramNodeStart);
		renderOnConnectorsChange(renderedOnEvents, diagramNodeStart);
		renderOnConstrainChange(renderedOnEvents, diagramNodeStart);
		renderOnContentBoxChange(renderedOnEvents, diagramNodeStart);
		renderOnControlsToolbarChange(renderedOnEvents, diagramNodeStart);
		renderOnDescriptionChange(renderedOnEvents, diagramNodeStart);
		renderOnDestroyedChange(renderedOnEvents, diagramNodeStart);
		renderOnDisabledChange(renderedOnEvents, diagramNodeStart);
		renderOnFillHeightChange(renderedOnEvents, diagramNodeStart);
		renderOnFocusedChange(renderedOnEvents, diagramNodeStart);
		renderOnFooterContentChange(renderedOnEvents, diagramNodeStart);
		renderOnGraphicChange(renderedOnEvents, diagramNodeStart);
		renderOnHeaderContentChange(renderedOnEvents, diagramNodeStart);
		renderOnHeightChange(renderedOnEvents, diagramNodeStart);
		renderOnHighlightBoundaryStrokeChange(renderedOnEvents, diagramNodeStart);
		renderOnHighlightedChange(renderedOnEvents, diagramNodeStart);
		renderOnIdChange(renderedOnEvents, diagramNodeStart);
		renderOnInitializedChange(renderedOnEvents, diagramNodeStart);
		renderOnLocaleChange(renderedOnEvents, diagramNodeStart);
		renderOnNameChange(renderedOnEvents, diagramNodeStart);
		renderOnPreventOverlapChange(renderedOnEvents, diagramNodeStart);
		renderOnRenderChange(renderedOnEvents, diagramNodeStart);
		renderOnRenderedChange(renderedOnEvents, diagramNodeStart);
		renderOnRequiredChange(renderedOnEvents, diagramNodeStart);
		renderOnSelectedChange(renderedOnEvents, diagramNodeStart);
		renderOnShapeBoundaryChange(renderedOnEvents, diagramNodeStart);
		renderOnShapeInviteChange(renderedOnEvents, diagramNodeStart);
		renderOnShimChange(renderedOnEvents, diagramNodeStart);
		renderOnSrcNodeChange(renderedOnEvents, diagramNodeStart);
		renderOnStringsChange(renderedOnEvents, diagramNodeStart);
		renderOnTabIndexChange(renderedOnEvents, diagramNodeStart);
		renderOnTransitionsChange(renderedOnEvents, diagramNodeStart);
		renderOnTypeChange(renderedOnEvents, diagramNodeStart);
		renderOnVisibleChange(renderedOnEvents, diagramNodeStart);
		renderOnWidthChange(renderedOnEvents, diagramNodeStart);
		renderOnXChange(renderedOnEvents, diagramNodeStart);
		renderOnXyChange(renderedOnEvents, diagramNodeStart);
		renderOnYChange(renderedOnEvents, diagramNodeStart);
		renderOnZIndexChange(renderedOnEvents, diagramNodeStart);

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

	protected void renderAlign(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object align = diagramNodeStart.getAlign();

		if (align != null) {
			renderedAttributes.add(renderObject(DiagramNodeStart.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object alignOn = diagramNodeStart.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(DiagramNodeStart.ALIGN_ON, alignOn));
		}
	}

	protected void renderDiagramNodeStartBodyContent(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object diagramNodeStartBodyContent = diagramNodeStart.getDiagramNodeStartBodyContent();

		if (diagramNodeStartBodyContent != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.DIAGRAM_NODE_START_BODY_CONTENT, diagramNodeStartBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String boundingBox = diagramNodeStart.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object builder = diagramNodeStart.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.BUILDER, builder));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object centered = diagramNodeStart.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.CENTERED, centered));
		}
	}

	protected void renderConnectors(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String connectors = diagramNodeStart.getConnectors();

		if (connectors != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.CONNECTORS, connectors));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object constrain = diagramNodeStart.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String contentBox = diagramNodeStart.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.CONTENT_BOX, contentBox));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object controlsToolbar = diagramNodeStart.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(DiagramNodeStart.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDescription(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String description = diagramNodeStart.getDescription();

		if (description != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.DESCRIPTION, description));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean destroyed = diagramNodeStart.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeStart.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean disabled = diagramNodeStart.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeStart.DISABLED, disabled));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object fillHeight = diagramNodeStart.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean focused = diagramNodeStart.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeStart.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object footerContent = diagramNodeStart.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderGraphic(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object graphic = diagramNodeStart.getGraphic();

		if (graphic != null) {
			renderedAttributes.add(renderObject(DiagramNodeStart.GRAPHIC, graphic));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object headerContent = diagramNodeStart.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object height = diagramNodeStart.getHeight();

		if (height != null) {
			renderedAttributes.add(renderNumber(DiagramNodeStart.HEIGHT, height));
		}
	}

	protected void renderHighlightBoundaryStroke(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object highlightBoundaryStroke = diagramNodeStart.getHighlightBoundaryStroke();

		if (highlightBoundaryStroke != null) {
			renderedAttributes.add(renderObject(DiagramNodeStart.HIGHLIGHT_BOUNDARY_STROKE, highlightBoundaryStroke));
		}
	}

	protected void renderHighlighted(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean highlighted = diagramNodeStart.getHighlighted();

		if (highlighted != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeStart.HIGHLIGHTED, highlighted));
		}
	}

	protected void renderDiagramNodeStartId(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String diagramNodeStartId = diagramNodeStart.getDiagramNodeStartId();

		if (diagramNodeStartId != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.DIAGRAM_NODE_START_ID, diagramNodeStartId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean initialized = diagramNodeStart.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeStart.INITIALIZED, initialized));
		}
	}

	protected void renderDiagramNodeStartLocale(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String diagramNodeStartLocale = diagramNodeStart.getDiagramNodeStartLocale();

		if (diagramNodeStartLocale != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.DIAGRAM_NODE_START_LOCALE, diagramNodeStartLocale));
		}
	}

	protected void renderName(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String name = diagramNodeStart.getName();

		if (name != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.NAME, name));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean preventOverlap = diagramNodeStart.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeStart.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object render = diagramNodeStart.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean rendered = diagramNodeStart.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeStart.RENDERED, rendered));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean required = diagramNodeStart.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeStart.REQUIRED, required));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean selected = diagramNodeStart.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeStart.SELECTED, selected));
		}
	}

	protected void renderShapeBoundary(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object shapeBoundary = diagramNodeStart.getShapeBoundary();

		if (shapeBoundary != null) {
			renderedAttributes.add(renderObject(DiagramNodeStart.SHAPE_BOUNDARY, shapeBoundary));
		}
	}

	protected void renderShapeInvite(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object shapeInvite = diagramNodeStart.getShapeInvite();

		if (shapeInvite != null) {
			renderedAttributes.add(renderObject(DiagramNodeStart.SHAPE_INVITE, shapeInvite));
		}
	}

	protected void renderShim(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean shim = diagramNodeStart.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeStart.SHIM, shim));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String srcNode = diagramNodeStart.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object strings = diagramNodeStart.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(DiagramNodeStart.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object tabIndex = diagramNodeStart.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(DiagramNodeStart.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTransitions(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String transitions = diagramNodeStart.getTransitions();

		if (transitions != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.TRANSITIONS, transitions));
		}
	}

	protected void renderType(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String type = diagramNodeStart.getType();

		if (type != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.TYPE, type));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean visible = diagramNodeStart.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeStart.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object width = diagramNodeStart.getWidth();

		if (width != null) {
			renderedAttributes.add(renderNumber(DiagramNodeStart.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object x = diagramNodeStart.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(DiagramNodeStart.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object xy = diagramNodeStart.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(DiagramNodeStart.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object y = diagramNodeStart.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(DiagramNodeStart.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object zIndex = diagramNodeStart.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(DiagramNodeStart.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterAlignChange = diagramNodeStart.getAfterAlignChange();

		if (afterAlignChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_ALIGN_CHANGE, afterAlignChange));
		}
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterAlignOnChange = diagramNodeStart.getAfterAlignOnChange();

		if (afterAlignOnChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterBodyContentChange = diagramNodeStart.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterBoundingBoxChange = diagramNodeStart.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterBuilderChange = diagramNodeStart.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterCenteredChange = diagramNodeStart.getAfterCenteredChange();

		if (afterCenteredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_CENTERED_CHANGE, afterCenteredChange));
		}
	}

	protected void renderAfterConnectorsChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterConnectorsChange = diagramNodeStart.getAfterConnectorsChange();

		if (afterConnectorsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_CONNECTORS_CHANGE, afterConnectorsChange));
		}
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterConstrainChange = diagramNodeStart.getAfterConstrainChange();

		if (afterConstrainChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterContentBoxChange = diagramNodeStart.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterControlsToolbarChange = diagramNodeStart.getAfterControlsToolbarChange();

		if (afterControlsToolbarChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
		}
	}

	protected void renderAfterDescriptionChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterDescriptionChange = diagramNodeStart.getAfterDescriptionChange();

		if (afterDescriptionChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_DESCRIPTION_CHANGE, afterDescriptionChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterDestroyedChange = diagramNodeStart.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterDisabledChange = diagramNodeStart.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterFillHeightChange = diagramNodeStart.getAfterFillHeightChange();

		if (afterFillHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterFocusedChange = diagramNodeStart.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterFooterContentChange = diagramNodeStart.getAfterFooterContentChange();

		if (afterFooterContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
		}
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterGraphicChange = diagramNodeStart.getAfterGraphicChange();

		if (afterGraphicChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
		}
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterHeaderContentChange = diagramNodeStart.getAfterHeaderContentChange();

		if (afterHeaderContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterHeightChange = diagramNodeStart.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterHighlightBoundaryStrokeChange = diagramNodeStart.getAfterHighlightBoundaryStrokeChange();

		if (afterHighlightBoundaryStrokeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, afterHighlightBoundaryStrokeChange));
		}
	}

	protected void renderAfterHighlightedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterHighlightedChange = diagramNodeStart.getAfterHighlightedChange();

		if (afterHighlightedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_HIGHLIGHTED_CHANGE, afterHighlightedChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterIdChange = diagramNodeStart.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterInitializedChange = diagramNodeStart.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterLocaleChange = diagramNodeStart.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterNameChange = diagramNodeStart.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterPreventOverlapChange = diagramNodeStart.getAfterPreventOverlapChange();

		if (afterPreventOverlapChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterRenderChange = diagramNodeStart.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterRenderedChange = diagramNodeStart.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterRequiredChange = diagramNodeStart.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterSelectedChange = diagramNodeStart.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterShapeBoundaryChange = diagramNodeStart.getAfterShapeBoundaryChange();

		if (afterShapeBoundaryChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_SHAPE_BOUNDARY_CHANGE, afterShapeBoundaryChange));
		}
	}

	protected void renderAfterShapeInviteChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterShapeInviteChange = diagramNodeStart.getAfterShapeInviteChange();

		if (afterShapeInviteChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_SHAPE_INVITE_CHANGE, afterShapeInviteChange));
		}
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterShimChange = diagramNodeStart.getAfterShimChange();

		if (afterShimChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_SHIM_CHANGE, afterShimChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterSrcNodeChange = diagramNodeStart.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterStringsChange = diagramNodeStart.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterTabIndexChange = diagramNodeStart.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTransitionsChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterTransitionsChange = diagramNodeStart.getAfterTransitionsChange();

		if (afterTransitionsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_TRANSITIONS_CHANGE, afterTransitionsChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterTypeChange = diagramNodeStart.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterVisibleChange = diagramNodeStart.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterWidthChange = diagramNodeStart.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterXChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterXChange = diagramNodeStart.getAfterXChange();

		if (afterXChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_XCHANGE, afterXChange));
		}
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterXyChange = diagramNodeStart.getAfterXyChange();

		if (afterXyChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_XY_CHANGE, afterXyChange));
		}
	}

	protected void renderAfterYChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterYChange = diagramNodeStart.getAfterYChange();

		if (afterYChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_YCHANGE, afterYChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterZIndexChange = diagramNodeStart.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onAlignChange = diagramNodeStart.getOnAlignChange();

		if (onAlignChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_ALIGN_CHANGE, onAlignChange));
		}
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onAlignOnChange = diagramNodeStart.getOnAlignOnChange();

		if (onAlignOnChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_ALIGN_ON_CHANGE, onAlignOnChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onBodyContentChange = diagramNodeStart.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onBoundingBoxChange = diagramNodeStart.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onBuilderChange = diagramNodeStart.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onCenteredChange = diagramNodeStart.getOnCenteredChange();

		if (onCenteredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_CENTERED_CHANGE, onCenteredChange));
		}
	}

	protected void renderOnConnectorsChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onConnectorsChange = diagramNodeStart.getOnConnectorsChange();

		if (onConnectorsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_CONNECTORS_CHANGE, onConnectorsChange));
		}
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onConstrainChange = diagramNodeStart.getOnConstrainChange();

		if (onConstrainChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_CONSTRAIN_CHANGE, onConstrainChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onContentBoxChange = diagramNodeStart.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onControlsToolbarChange = diagramNodeStart.getOnControlsToolbarChange();

		if (onControlsToolbarChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
		}
	}

	protected void renderOnDescriptionChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onDescriptionChange = diagramNodeStart.getOnDescriptionChange();

		if (onDescriptionChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_DESCRIPTION_CHANGE, onDescriptionChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onDestroyedChange = diagramNodeStart.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onDisabledChange = diagramNodeStart.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onFillHeightChange = diagramNodeStart.getOnFillHeightChange();

		if (onFillHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onFocusedChange = diagramNodeStart.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onFooterContentChange = diagramNodeStart.getOnFooterContentChange();

		if (onFooterContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
		}
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onGraphicChange = diagramNodeStart.getOnGraphicChange();

		if (onGraphicChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_GRAPHIC_CHANGE, onGraphicChange));
		}
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onHeaderContentChange = diagramNodeStart.getOnHeaderContentChange();

		if (onHeaderContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onHeightChange = diagramNodeStart.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onHighlightBoundaryStrokeChange = diagramNodeStart.getOnHighlightBoundaryStrokeChange();

		if (onHighlightBoundaryStrokeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, onHighlightBoundaryStrokeChange));
		}
	}

	protected void renderOnHighlightedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onHighlightedChange = diagramNodeStart.getOnHighlightedChange();

		if (onHighlightedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_HIGHLIGHTED_CHANGE, onHighlightedChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onIdChange = diagramNodeStart.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onInitializedChange = diagramNodeStart.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onLocaleChange = diagramNodeStart.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onNameChange = diagramNodeStart.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onPreventOverlapChange = diagramNodeStart.getOnPreventOverlapChange();

		if (onPreventOverlapChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onRenderChange = diagramNodeStart.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onRenderedChange = diagramNodeStart.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onRequiredChange = diagramNodeStart.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onSelectedChange = diagramNodeStart.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onShapeBoundaryChange = diagramNodeStart.getOnShapeBoundaryChange();

		if (onShapeBoundaryChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_SHAPE_BOUNDARY_CHANGE, onShapeBoundaryChange));
		}
	}

	protected void renderOnShapeInviteChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onShapeInviteChange = diagramNodeStart.getOnShapeInviteChange();

		if (onShapeInviteChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_SHAPE_INVITE_CHANGE, onShapeInviteChange));
		}
	}

	protected void renderOnShimChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onShimChange = diagramNodeStart.getOnShimChange();

		if (onShimChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_SHIM_CHANGE, onShimChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onSrcNodeChange = diagramNodeStart.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onStringsChange = diagramNodeStart.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onTabIndexChange = diagramNodeStart.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTransitionsChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onTransitionsChange = diagramNodeStart.getOnTransitionsChange();

		if (onTransitionsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_TRANSITIONS_CHANGE, onTransitionsChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onTypeChange = diagramNodeStart.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onVisibleChange = diagramNodeStart.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onWidthChange = diagramNodeStart.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnXChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onXChange = diagramNodeStart.getOnXChange();

		if (onXChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_XCHANGE, onXChange));
		}
	}

	protected void renderOnXyChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onXyChange = diagramNodeStart.getOnXyChange();

		if (onXyChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_XY_CHANGE, onXyChange));
		}
	}

	protected void renderOnYChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onYChange = diagramNodeStart.getOnYChange();

		if (onYChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_YCHANGE, onYChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onZIndexChange = diagramNodeStart.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeStart.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}