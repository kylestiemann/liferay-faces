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
package com.liferay.faces.alloy.component.diagramnodeend;

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
public abstract class DiagramNodeEndRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DiagramNodeEnd diagramNodeEnd = (DiagramNodeEnd) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var diagramNodeEnd = new A.DiagramNodeEnd");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlign(renderedAttributes, diagramNodeEnd);
		renderAlignOn(renderedAttributes, diagramNodeEnd);
		renderDiagramNodeEndBodyContent(renderedAttributes, diagramNodeEnd);
		renderBoundingBox(renderedAttributes, diagramNodeEnd);
		renderBuilder(renderedAttributes, diagramNodeEnd);
		renderCentered(renderedAttributes, diagramNodeEnd);
		renderConnectors(renderedAttributes, diagramNodeEnd);
		renderConstrain(renderedAttributes, diagramNodeEnd);
		renderContentBox(renderedAttributes, diagramNodeEnd);
		renderControlsToolbar(renderedAttributes, diagramNodeEnd);
		renderDescription(renderedAttributes, diagramNodeEnd);
		renderDestroyed(renderedAttributes, diagramNodeEnd);
		renderDisabled(renderedAttributes, diagramNodeEnd);
		renderFillHeight(renderedAttributes, diagramNodeEnd);
		renderFocused(renderedAttributes, diagramNodeEnd);
		renderFooterContent(renderedAttributes, diagramNodeEnd);
		renderGraphic(renderedAttributes, diagramNodeEnd);
		renderHeaderContent(renderedAttributes, diagramNodeEnd);
		renderHeight(renderedAttributes, diagramNodeEnd);
		renderHighlightBoundaryStroke(renderedAttributes, diagramNodeEnd);
		renderHighlighted(renderedAttributes, diagramNodeEnd);
		renderDiagramNodeEndId(renderedAttributes, diagramNodeEnd);
		renderInitialized(renderedAttributes, diagramNodeEnd);
		renderDiagramNodeEndLocale(renderedAttributes, diagramNodeEnd);
		renderName(renderedAttributes, diagramNodeEnd);
		renderPreventOverlap(renderedAttributes, diagramNodeEnd);
		renderRender(renderedAttributes, diagramNodeEnd);
		renderRendered(renderedAttributes, diagramNodeEnd);
		renderRequired(renderedAttributes, diagramNodeEnd);
		renderSelected(renderedAttributes, diagramNodeEnd);
		renderShapeBoundary(renderedAttributes, diagramNodeEnd);
		renderShapeInvite(renderedAttributes, diagramNodeEnd);
		renderShim(renderedAttributes, diagramNodeEnd);
		renderSrcNode(renderedAttributes, diagramNodeEnd);
		renderStrings(renderedAttributes, diagramNodeEnd);
		renderTabIndex(renderedAttributes, diagramNodeEnd);
		renderTransitions(renderedAttributes, diagramNodeEnd);
		renderType(renderedAttributes, diagramNodeEnd);
		renderVisible(renderedAttributes, diagramNodeEnd);
		renderWidth(renderedAttributes, diagramNodeEnd);
		renderX(renderedAttributes, diagramNodeEnd);
		renderXy(renderedAttributes, diagramNodeEnd);
		renderY(renderedAttributes, diagramNodeEnd);
		renderZIndex(renderedAttributes, diagramNodeEnd);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlignChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterAlignOnChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterBodyContentChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterBoundingBoxChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterBuilderChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterCenteredChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterConnectorsChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterConstrainChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterContentBoxChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterControlsToolbarChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterDescriptionChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterDestroyedChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterDisabledChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterFillHeightChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterFocusedChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterFooterContentChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterGraphicChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterHeaderContentChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterHeightChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterHighlightBoundaryStrokeChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterHighlightedChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterIdChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterInitializedChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterLocaleChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterNameChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterPreventOverlapChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterRenderChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterRenderedChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterRequiredChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterSelectedChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterShapeBoundaryChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterShapeInviteChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterShimChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterSrcNodeChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterStringsChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterTabIndexChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterTransitionsChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterTypeChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterVisibleChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterWidthChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterXChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterXyChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterYChange(renderedAfterEvents, diagramNodeEnd);
		renderAfterZIndexChange(renderedAfterEvents, diagramNodeEnd);

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

		renderOnAlignChange(renderedOnEvents, diagramNodeEnd);
		renderOnAlignOnChange(renderedOnEvents, diagramNodeEnd);
		renderOnBodyContentChange(renderedOnEvents, diagramNodeEnd);
		renderOnBoundingBoxChange(renderedOnEvents, diagramNodeEnd);
		renderOnBuilderChange(renderedOnEvents, diagramNodeEnd);
		renderOnCenteredChange(renderedOnEvents, diagramNodeEnd);
		renderOnConnectorsChange(renderedOnEvents, diagramNodeEnd);
		renderOnConstrainChange(renderedOnEvents, diagramNodeEnd);
		renderOnContentBoxChange(renderedOnEvents, diagramNodeEnd);
		renderOnControlsToolbarChange(renderedOnEvents, diagramNodeEnd);
		renderOnDescriptionChange(renderedOnEvents, diagramNodeEnd);
		renderOnDestroyedChange(renderedOnEvents, diagramNodeEnd);
		renderOnDisabledChange(renderedOnEvents, diagramNodeEnd);
		renderOnFillHeightChange(renderedOnEvents, diagramNodeEnd);
		renderOnFocusedChange(renderedOnEvents, diagramNodeEnd);
		renderOnFooterContentChange(renderedOnEvents, diagramNodeEnd);
		renderOnGraphicChange(renderedOnEvents, diagramNodeEnd);
		renderOnHeaderContentChange(renderedOnEvents, diagramNodeEnd);
		renderOnHeightChange(renderedOnEvents, diagramNodeEnd);
		renderOnHighlightBoundaryStrokeChange(renderedOnEvents, diagramNodeEnd);
		renderOnHighlightedChange(renderedOnEvents, diagramNodeEnd);
		renderOnIdChange(renderedOnEvents, diagramNodeEnd);
		renderOnInitializedChange(renderedOnEvents, diagramNodeEnd);
		renderOnLocaleChange(renderedOnEvents, diagramNodeEnd);
		renderOnNameChange(renderedOnEvents, diagramNodeEnd);
		renderOnPreventOverlapChange(renderedOnEvents, diagramNodeEnd);
		renderOnRenderChange(renderedOnEvents, diagramNodeEnd);
		renderOnRenderedChange(renderedOnEvents, diagramNodeEnd);
		renderOnRequiredChange(renderedOnEvents, diagramNodeEnd);
		renderOnSelectedChange(renderedOnEvents, diagramNodeEnd);
		renderOnShapeBoundaryChange(renderedOnEvents, diagramNodeEnd);
		renderOnShapeInviteChange(renderedOnEvents, diagramNodeEnd);
		renderOnShimChange(renderedOnEvents, diagramNodeEnd);
		renderOnSrcNodeChange(renderedOnEvents, diagramNodeEnd);
		renderOnStringsChange(renderedOnEvents, diagramNodeEnd);
		renderOnTabIndexChange(renderedOnEvents, diagramNodeEnd);
		renderOnTransitionsChange(renderedOnEvents, diagramNodeEnd);
		renderOnTypeChange(renderedOnEvents, diagramNodeEnd);
		renderOnVisibleChange(renderedOnEvents, diagramNodeEnd);
		renderOnWidthChange(renderedOnEvents, diagramNodeEnd);
		renderOnXChange(renderedOnEvents, diagramNodeEnd);
		renderOnXyChange(renderedOnEvents, diagramNodeEnd);
		renderOnYChange(renderedOnEvents, diagramNodeEnd);
		renderOnZIndexChange(renderedOnEvents, diagramNodeEnd);

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

	protected void renderAlign(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object align = diagramNodeEnd.getAlign();

		if (align != null) {
			renderedAttributes.add(renderObject(DiagramNodeEnd.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object alignOn = diagramNodeEnd.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(DiagramNodeEnd.ALIGN_ON, alignOn));
		}
	}

	protected void renderDiagramNodeEndBodyContent(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object diagramNodeEndBodyContent = diagramNodeEnd.getDiagramNodeEndBodyContent();

		if (diagramNodeEndBodyContent != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.DIAGRAM_NODE_END_BODY_CONTENT, diagramNodeEndBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String boundingBox = diagramNodeEnd.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object builder = diagramNodeEnd.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.BUILDER, builder));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object centered = diagramNodeEnd.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.CENTERED, centered));
		}
	}

	protected void renderConnectors(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String connectors = diagramNodeEnd.getConnectors();

		if (connectors != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.CONNECTORS, connectors));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object constrain = diagramNodeEnd.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String contentBox = diagramNodeEnd.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.CONTENT_BOX, contentBox));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object controlsToolbar = diagramNodeEnd.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(DiagramNodeEnd.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDescription(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String description = diagramNodeEnd.getDescription();

		if (description != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.DESCRIPTION, description));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean destroyed = diagramNodeEnd.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeEnd.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean disabled = diagramNodeEnd.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeEnd.DISABLED, disabled));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object fillHeight = diagramNodeEnd.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean focused = diagramNodeEnd.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeEnd.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object footerContent = diagramNodeEnd.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderGraphic(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object graphic = diagramNodeEnd.getGraphic();

		if (graphic != null) {
			renderedAttributes.add(renderObject(DiagramNodeEnd.GRAPHIC, graphic));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object headerContent = diagramNodeEnd.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object height = diagramNodeEnd.getHeight();

		if (height != null) {
			renderedAttributes.add(renderNumber(DiagramNodeEnd.HEIGHT, height));
		}
	}

	protected void renderHighlightBoundaryStroke(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object highlightBoundaryStroke = diagramNodeEnd.getHighlightBoundaryStroke();

		if (highlightBoundaryStroke != null) {
			renderedAttributes.add(renderObject(DiagramNodeEnd.HIGHLIGHT_BOUNDARY_STROKE, highlightBoundaryStroke));
		}
	}

	protected void renderHighlighted(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean highlighted = diagramNodeEnd.getHighlighted();

		if (highlighted != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeEnd.HIGHLIGHTED, highlighted));
		}
	}

	protected void renderDiagramNodeEndId(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String diagramNodeEndId = diagramNodeEnd.getDiagramNodeEndId();

		if (diagramNodeEndId != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.DIAGRAM_NODE_END_ID, diagramNodeEndId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean initialized = diagramNodeEnd.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeEnd.INITIALIZED, initialized));
		}
	}

	protected void renderDiagramNodeEndLocale(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String diagramNodeEndLocale = diagramNodeEnd.getDiagramNodeEndLocale();

		if (diagramNodeEndLocale != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.DIAGRAM_NODE_END_LOCALE, diagramNodeEndLocale));
		}
	}

	protected void renderName(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String name = diagramNodeEnd.getName();

		if (name != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.NAME, name));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean preventOverlap = diagramNodeEnd.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeEnd.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object render = diagramNodeEnd.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean rendered = diagramNodeEnd.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeEnd.RENDERED, rendered));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean required = diagramNodeEnd.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeEnd.REQUIRED, required));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean selected = diagramNodeEnd.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeEnd.SELECTED, selected));
		}
	}

	protected void renderShapeBoundary(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object shapeBoundary = diagramNodeEnd.getShapeBoundary();

		if (shapeBoundary != null) {
			renderedAttributes.add(renderObject(DiagramNodeEnd.SHAPE_BOUNDARY, shapeBoundary));
		}
	}

	protected void renderShapeInvite(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object shapeInvite = diagramNodeEnd.getShapeInvite();

		if (shapeInvite != null) {
			renderedAttributes.add(renderObject(DiagramNodeEnd.SHAPE_INVITE, shapeInvite));
		}
	}

	protected void renderShim(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean shim = diagramNodeEnd.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeEnd.SHIM, shim));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String srcNode = diagramNodeEnd.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object strings = diagramNodeEnd.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(DiagramNodeEnd.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object tabIndex = diagramNodeEnd.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(DiagramNodeEnd.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTransitions(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String transitions = diagramNodeEnd.getTransitions();

		if (transitions != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.TRANSITIONS, transitions));
		}
	}

	protected void renderType(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String type = diagramNodeEnd.getType();

		if (type != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.TYPE, type));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean visible = diagramNodeEnd.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeEnd.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object width = diagramNodeEnd.getWidth();

		if (width != null) {
			renderedAttributes.add(renderNumber(DiagramNodeEnd.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object x = diagramNodeEnd.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(DiagramNodeEnd.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object xy = diagramNodeEnd.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(DiagramNodeEnd.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object y = diagramNodeEnd.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(DiagramNodeEnd.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object zIndex = diagramNodeEnd.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(DiagramNodeEnd.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterAlignChange = diagramNodeEnd.getAfterAlignChange();

		if (afterAlignChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_ALIGN_CHANGE, afterAlignChange));
		}
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterAlignOnChange = diagramNodeEnd.getAfterAlignOnChange();

		if (afterAlignOnChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterBodyContentChange = diagramNodeEnd.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterBoundingBoxChange = diagramNodeEnd.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterBuilderChange = diagramNodeEnd.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterCenteredChange = diagramNodeEnd.getAfterCenteredChange();

		if (afterCenteredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_CENTERED_CHANGE, afterCenteredChange));
		}
	}

	protected void renderAfterConnectorsChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterConnectorsChange = diagramNodeEnd.getAfterConnectorsChange();

		if (afterConnectorsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_CONNECTORS_CHANGE, afterConnectorsChange));
		}
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterConstrainChange = diagramNodeEnd.getAfterConstrainChange();

		if (afterConstrainChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterContentBoxChange = diagramNodeEnd.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterControlsToolbarChange = diagramNodeEnd.getAfterControlsToolbarChange();

		if (afterControlsToolbarChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
		}
	}

	protected void renderAfterDescriptionChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterDescriptionChange = diagramNodeEnd.getAfterDescriptionChange();

		if (afterDescriptionChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_DESCRIPTION_CHANGE, afterDescriptionChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterDestroyedChange = diagramNodeEnd.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterDisabledChange = diagramNodeEnd.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterFillHeightChange = diagramNodeEnd.getAfterFillHeightChange();

		if (afterFillHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterFocusedChange = diagramNodeEnd.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterFooterContentChange = diagramNodeEnd.getAfterFooterContentChange();

		if (afterFooterContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
		}
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterGraphicChange = diagramNodeEnd.getAfterGraphicChange();

		if (afterGraphicChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
		}
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterHeaderContentChange = diagramNodeEnd.getAfterHeaderContentChange();

		if (afterHeaderContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterHeightChange = diagramNodeEnd.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterHighlightBoundaryStrokeChange = diagramNodeEnd.getAfterHighlightBoundaryStrokeChange();

		if (afterHighlightBoundaryStrokeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, afterHighlightBoundaryStrokeChange));
		}
	}

	protected void renderAfterHighlightedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterHighlightedChange = diagramNodeEnd.getAfterHighlightedChange();

		if (afterHighlightedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_HIGHLIGHTED_CHANGE, afterHighlightedChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterIdChange = diagramNodeEnd.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterInitializedChange = diagramNodeEnd.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterLocaleChange = diagramNodeEnd.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterNameChange = diagramNodeEnd.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterPreventOverlapChange = diagramNodeEnd.getAfterPreventOverlapChange();

		if (afterPreventOverlapChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterRenderChange = diagramNodeEnd.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterRenderedChange = diagramNodeEnd.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterRequiredChange = diagramNodeEnd.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterSelectedChange = diagramNodeEnd.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterShapeBoundaryChange = diagramNodeEnd.getAfterShapeBoundaryChange();

		if (afterShapeBoundaryChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_SHAPE_BOUNDARY_CHANGE, afterShapeBoundaryChange));
		}
	}

	protected void renderAfterShapeInviteChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterShapeInviteChange = diagramNodeEnd.getAfterShapeInviteChange();

		if (afterShapeInviteChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_SHAPE_INVITE_CHANGE, afterShapeInviteChange));
		}
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterShimChange = diagramNodeEnd.getAfterShimChange();

		if (afterShimChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_SHIM_CHANGE, afterShimChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterSrcNodeChange = diagramNodeEnd.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterStringsChange = diagramNodeEnd.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterTabIndexChange = diagramNodeEnd.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTransitionsChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterTransitionsChange = diagramNodeEnd.getAfterTransitionsChange();

		if (afterTransitionsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_TRANSITIONS_CHANGE, afterTransitionsChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterTypeChange = diagramNodeEnd.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterVisibleChange = diagramNodeEnd.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterWidthChange = diagramNodeEnd.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterXChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterXChange = diagramNodeEnd.getAfterXChange();

		if (afterXChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_XCHANGE, afterXChange));
		}
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterXyChange = diagramNodeEnd.getAfterXyChange();

		if (afterXyChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_XY_CHANGE, afterXyChange));
		}
	}

	protected void renderAfterYChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterYChange = diagramNodeEnd.getAfterYChange();

		if (afterYChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_YCHANGE, afterYChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterZIndexChange = diagramNodeEnd.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onAlignChange = diagramNodeEnd.getOnAlignChange();

		if (onAlignChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_ALIGN_CHANGE, onAlignChange));
		}
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onAlignOnChange = diagramNodeEnd.getOnAlignOnChange();

		if (onAlignOnChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_ALIGN_ON_CHANGE, onAlignOnChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onBodyContentChange = diagramNodeEnd.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onBoundingBoxChange = diagramNodeEnd.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onBuilderChange = diagramNodeEnd.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onCenteredChange = diagramNodeEnd.getOnCenteredChange();

		if (onCenteredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_CENTERED_CHANGE, onCenteredChange));
		}
	}

	protected void renderOnConnectorsChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onConnectorsChange = diagramNodeEnd.getOnConnectorsChange();

		if (onConnectorsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_CONNECTORS_CHANGE, onConnectorsChange));
		}
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onConstrainChange = diagramNodeEnd.getOnConstrainChange();

		if (onConstrainChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_CONSTRAIN_CHANGE, onConstrainChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onContentBoxChange = diagramNodeEnd.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onControlsToolbarChange = diagramNodeEnd.getOnControlsToolbarChange();

		if (onControlsToolbarChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
		}
	}

	protected void renderOnDescriptionChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onDescriptionChange = diagramNodeEnd.getOnDescriptionChange();

		if (onDescriptionChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_DESCRIPTION_CHANGE, onDescriptionChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onDestroyedChange = diagramNodeEnd.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onDisabledChange = diagramNodeEnd.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onFillHeightChange = diagramNodeEnd.getOnFillHeightChange();

		if (onFillHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onFocusedChange = diagramNodeEnd.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onFooterContentChange = diagramNodeEnd.getOnFooterContentChange();

		if (onFooterContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
		}
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onGraphicChange = diagramNodeEnd.getOnGraphicChange();

		if (onGraphicChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_GRAPHIC_CHANGE, onGraphicChange));
		}
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onHeaderContentChange = diagramNodeEnd.getOnHeaderContentChange();

		if (onHeaderContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onHeightChange = diagramNodeEnd.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onHighlightBoundaryStrokeChange = diagramNodeEnd.getOnHighlightBoundaryStrokeChange();

		if (onHighlightBoundaryStrokeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, onHighlightBoundaryStrokeChange));
		}
	}

	protected void renderOnHighlightedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onHighlightedChange = diagramNodeEnd.getOnHighlightedChange();

		if (onHighlightedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_HIGHLIGHTED_CHANGE, onHighlightedChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onIdChange = diagramNodeEnd.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onInitializedChange = diagramNodeEnd.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onLocaleChange = diagramNodeEnd.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onNameChange = diagramNodeEnd.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onPreventOverlapChange = diagramNodeEnd.getOnPreventOverlapChange();

		if (onPreventOverlapChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onRenderChange = diagramNodeEnd.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onRenderedChange = diagramNodeEnd.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onRequiredChange = diagramNodeEnd.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onSelectedChange = diagramNodeEnd.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onShapeBoundaryChange = diagramNodeEnd.getOnShapeBoundaryChange();

		if (onShapeBoundaryChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_SHAPE_BOUNDARY_CHANGE, onShapeBoundaryChange));
		}
	}

	protected void renderOnShapeInviteChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onShapeInviteChange = diagramNodeEnd.getOnShapeInviteChange();

		if (onShapeInviteChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_SHAPE_INVITE_CHANGE, onShapeInviteChange));
		}
	}

	protected void renderOnShimChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onShimChange = diagramNodeEnd.getOnShimChange();

		if (onShimChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_SHIM_CHANGE, onShimChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onSrcNodeChange = diagramNodeEnd.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onStringsChange = diagramNodeEnd.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onTabIndexChange = diagramNodeEnd.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTransitionsChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onTransitionsChange = diagramNodeEnd.getOnTransitionsChange();

		if (onTransitionsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_TRANSITIONS_CHANGE, onTransitionsChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onTypeChange = diagramNodeEnd.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onVisibleChange = diagramNodeEnd.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onWidthChange = diagramNodeEnd.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnXChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onXChange = diagramNodeEnd.getOnXChange();

		if (onXChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_XCHANGE, onXChange));
		}
	}

	protected void renderOnXyChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onXyChange = diagramNodeEnd.getOnXyChange();

		if (onXyChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_XY_CHANGE, onXyChange));
		}
	}

	protected void renderOnYChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onYChange = diagramNodeEnd.getOnYChange();

		if (onYChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_YCHANGE, onYChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onZIndexChange = diagramNodeEnd.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeEnd.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}