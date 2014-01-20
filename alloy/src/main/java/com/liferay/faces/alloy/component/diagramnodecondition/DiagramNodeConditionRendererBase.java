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
package com.liferay.faces.alloy.component.diagramnodecondition;

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
public abstract class DiagramNodeConditionRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DiagramNodeCondition diagramNodeCondition = (DiagramNodeCondition) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var diagramNodeCondition = new A.DiagramNodeCondition");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlign(renderedAttributes, diagramNodeCondition);
		renderAlignOn(renderedAttributes, diagramNodeCondition);
		renderDiagramNodeConditionBodyContent(renderedAttributes, diagramNodeCondition);
		renderBoundingBox(renderedAttributes, diagramNodeCondition);
		renderBuilder(renderedAttributes, diagramNodeCondition);
		renderCentered(renderedAttributes, diagramNodeCondition);
		renderConnectors(renderedAttributes, diagramNodeCondition);
		renderConstrain(renderedAttributes, diagramNodeCondition);
		renderContentBox(renderedAttributes, diagramNodeCondition);
		renderControlsToolbar(renderedAttributes, diagramNodeCondition);
		renderDescription(renderedAttributes, diagramNodeCondition);
		renderDestroyed(renderedAttributes, diagramNodeCondition);
		renderDisabled(renderedAttributes, diagramNodeCondition);
		renderFillHeight(renderedAttributes, diagramNodeCondition);
		renderFocused(renderedAttributes, diagramNodeCondition);
		renderFooterContent(renderedAttributes, diagramNodeCondition);
		renderGraphic(renderedAttributes, diagramNodeCondition);
		renderHeaderContent(renderedAttributes, diagramNodeCondition);
		renderHeight(renderedAttributes, diagramNodeCondition);
		renderHighlightBoundaryStroke(renderedAttributes, diagramNodeCondition);
		renderHighlighted(renderedAttributes, diagramNodeCondition);
		renderDiagramNodeConditionId(renderedAttributes, diagramNodeCondition);
		renderInitialized(renderedAttributes, diagramNodeCondition);
		renderDiagramNodeConditionLocale(renderedAttributes, diagramNodeCondition);
		renderName(renderedAttributes, diagramNodeCondition);
		renderPreventOverlap(renderedAttributes, diagramNodeCondition);
		renderRender(renderedAttributes, diagramNodeCondition);
		renderRendered(renderedAttributes, diagramNodeCondition);
		renderRequired(renderedAttributes, diagramNodeCondition);
		renderSelected(renderedAttributes, diagramNodeCondition);
		renderShapeBoundary(renderedAttributes, diagramNodeCondition);
		renderShapeInvite(renderedAttributes, diagramNodeCondition);
		renderShim(renderedAttributes, diagramNodeCondition);
		renderSrcNode(renderedAttributes, diagramNodeCondition);
		renderStrings(renderedAttributes, diagramNodeCondition);
		renderTabIndex(renderedAttributes, diagramNodeCondition);
		renderTransitions(renderedAttributes, diagramNodeCondition);
		renderType(renderedAttributes, diagramNodeCondition);
		renderVisible(renderedAttributes, diagramNodeCondition);
		renderWidth(renderedAttributes, diagramNodeCondition);
		renderX(renderedAttributes, diagramNodeCondition);
		renderXy(renderedAttributes, diagramNodeCondition);
		renderY(renderedAttributes, diagramNodeCondition);
		renderZIndex(renderedAttributes, diagramNodeCondition);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlignChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterAlignOnChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterBodyContentChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterBoundingBoxChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterBuilderChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterCenteredChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterConnectorsChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterConstrainChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterContentBoxChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterControlsToolbarChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterDescriptionChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterDestroyedChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterDisabledChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterFillHeightChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterFocusedChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterFooterContentChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterGraphicChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterHeaderContentChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterHeightChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterHighlightBoundaryStrokeChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterHighlightedChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterIdChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterInitializedChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterLocaleChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterNameChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterPreventOverlapChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterRenderChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterRenderedChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterRequiredChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterSelectedChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterShapeBoundaryChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterShapeInviteChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterShimChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterSrcNodeChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterStringsChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterTabIndexChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterTransitionsChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterTypeChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterVisibleChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterWidthChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterXChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterXyChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterYChange(renderedAfterEvents, diagramNodeCondition);
		renderAfterZIndexChange(renderedAfterEvents, diagramNodeCondition);

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

		renderOnAlignChange(renderedOnEvents, diagramNodeCondition);
		renderOnAlignOnChange(renderedOnEvents, diagramNodeCondition);
		renderOnBodyContentChange(renderedOnEvents, diagramNodeCondition);
		renderOnBoundingBoxChange(renderedOnEvents, diagramNodeCondition);
		renderOnBuilderChange(renderedOnEvents, diagramNodeCondition);
		renderOnCenteredChange(renderedOnEvents, diagramNodeCondition);
		renderOnConnectorsChange(renderedOnEvents, diagramNodeCondition);
		renderOnConstrainChange(renderedOnEvents, diagramNodeCondition);
		renderOnContentBoxChange(renderedOnEvents, diagramNodeCondition);
		renderOnControlsToolbarChange(renderedOnEvents, diagramNodeCondition);
		renderOnDescriptionChange(renderedOnEvents, diagramNodeCondition);
		renderOnDestroyedChange(renderedOnEvents, diagramNodeCondition);
		renderOnDisabledChange(renderedOnEvents, diagramNodeCondition);
		renderOnFillHeightChange(renderedOnEvents, diagramNodeCondition);
		renderOnFocusedChange(renderedOnEvents, diagramNodeCondition);
		renderOnFooterContentChange(renderedOnEvents, diagramNodeCondition);
		renderOnGraphicChange(renderedOnEvents, diagramNodeCondition);
		renderOnHeaderContentChange(renderedOnEvents, diagramNodeCondition);
		renderOnHeightChange(renderedOnEvents, diagramNodeCondition);
		renderOnHighlightBoundaryStrokeChange(renderedOnEvents, diagramNodeCondition);
		renderOnHighlightedChange(renderedOnEvents, diagramNodeCondition);
		renderOnIdChange(renderedOnEvents, diagramNodeCondition);
		renderOnInitializedChange(renderedOnEvents, diagramNodeCondition);
		renderOnLocaleChange(renderedOnEvents, diagramNodeCondition);
		renderOnNameChange(renderedOnEvents, diagramNodeCondition);
		renderOnPreventOverlapChange(renderedOnEvents, diagramNodeCondition);
		renderOnRenderChange(renderedOnEvents, diagramNodeCondition);
		renderOnRenderedChange(renderedOnEvents, diagramNodeCondition);
		renderOnRequiredChange(renderedOnEvents, diagramNodeCondition);
		renderOnSelectedChange(renderedOnEvents, diagramNodeCondition);
		renderOnShapeBoundaryChange(renderedOnEvents, diagramNodeCondition);
		renderOnShapeInviteChange(renderedOnEvents, diagramNodeCondition);
		renderOnShimChange(renderedOnEvents, diagramNodeCondition);
		renderOnSrcNodeChange(renderedOnEvents, diagramNodeCondition);
		renderOnStringsChange(renderedOnEvents, diagramNodeCondition);
		renderOnTabIndexChange(renderedOnEvents, diagramNodeCondition);
		renderOnTransitionsChange(renderedOnEvents, diagramNodeCondition);
		renderOnTypeChange(renderedOnEvents, diagramNodeCondition);
		renderOnVisibleChange(renderedOnEvents, diagramNodeCondition);
		renderOnWidthChange(renderedOnEvents, diagramNodeCondition);
		renderOnXChange(renderedOnEvents, diagramNodeCondition);
		renderOnXyChange(renderedOnEvents, diagramNodeCondition);
		renderOnYChange(renderedOnEvents, diagramNodeCondition);
		renderOnZIndexChange(renderedOnEvents, diagramNodeCondition);

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

	protected void renderAlign(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object align = diagramNodeCondition.getAlign();

		if (align != null) {
			renderedAttributes.add(renderObject(DiagramNodeCondition.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object alignOn = diagramNodeCondition.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(DiagramNodeCondition.ALIGN_ON, alignOn));
		}
	}

	protected void renderDiagramNodeConditionBodyContent(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object diagramNodeConditionBodyContent = diagramNodeCondition.getDiagramNodeConditionBodyContent();

		if (diagramNodeConditionBodyContent != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.DIAGRAM_NODE_CONDITION_BODY_CONTENT, diagramNodeConditionBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String boundingBox = diagramNodeCondition.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object builder = diagramNodeCondition.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.BUILDER, builder));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object centered = diagramNodeCondition.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.CENTERED, centered));
		}
	}

	protected void renderConnectors(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String connectors = diagramNodeCondition.getConnectors();

		if (connectors != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.CONNECTORS, connectors));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object constrain = diagramNodeCondition.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String contentBox = diagramNodeCondition.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.CONTENT_BOX, contentBox));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object controlsToolbar = diagramNodeCondition.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(DiagramNodeCondition.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDescription(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String description = diagramNodeCondition.getDescription();

		if (description != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.DESCRIPTION, description));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean destroyed = diagramNodeCondition.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeCondition.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean disabled = diagramNodeCondition.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeCondition.DISABLED, disabled));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object fillHeight = diagramNodeCondition.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean focused = diagramNodeCondition.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeCondition.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object footerContent = diagramNodeCondition.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderGraphic(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object graphic = diagramNodeCondition.getGraphic();

		if (graphic != null) {
			renderedAttributes.add(renderObject(DiagramNodeCondition.GRAPHIC, graphic));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object headerContent = diagramNodeCondition.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object height = diagramNodeCondition.getHeight();

		if (height != null) {
			renderedAttributes.add(renderNumber(DiagramNodeCondition.HEIGHT, height));
		}
	}

	protected void renderHighlightBoundaryStroke(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object highlightBoundaryStroke = diagramNodeCondition.getHighlightBoundaryStroke();

		if (highlightBoundaryStroke != null) {
			renderedAttributes.add(renderObject(DiagramNodeCondition.HIGHLIGHT_BOUNDARY_STROKE, highlightBoundaryStroke));
		}
	}

	protected void renderHighlighted(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean highlighted = diagramNodeCondition.getHighlighted();

		if (highlighted != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeCondition.HIGHLIGHTED, highlighted));
		}
	}

	protected void renderDiagramNodeConditionId(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String diagramNodeConditionId = diagramNodeCondition.getDiagramNodeConditionId();

		if (diagramNodeConditionId != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.DIAGRAM_NODE_CONDITION_ID, diagramNodeConditionId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean initialized = diagramNodeCondition.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeCondition.INITIALIZED, initialized));
		}
	}

	protected void renderDiagramNodeConditionLocale(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String diagramNodeConditionLocale = diagramNodeCondition.getDiagramNodeConditionLocale();

		if (diagramNodeConditionLocale != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.DIAGRAM_NODE_CONDITION_LOCALE, diagramNodeConditionLocale));
		}
	}

	protected void renderName(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String name = diagramNodeCondition.getName();

		if (name != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.NAME, name));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean preventOverlap = diagramNodeCondition.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeCondition.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object render = diagramNodeCondition.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean rendered = diagramNodeCondition.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeCondition.RENDERED, rendered));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean required = diagramNodeCondition.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeCondition.REQUIRED, required));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean selected = diagramNodeCondition.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeCondition.SELECTED, selected));
		}
	}

	protected void renderShapeBoundary(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object shapeBoundary = diagramNodeCondition.getShapeBoundary();

		if (shapeBoundary != null) {
			renderedAttributes.add(renderObject(DiagramNodeCondition.SHAPE_BOUNDARY, shapeBoundary));
		}
	}

	protected void renderShapeInvite(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object shapeInvite = diagramNodeCondition.getShapeInvite();

		if (shapeInvite != null) {
			renderedAttributes.add(renderObject(DiagramNodeCondition.SHAPE_INVITE, shapeInvite));
		}
	}

	protected void renderShim(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean shim = diagramNodeCondition.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeCondition.SHIM, shim));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String srcNode = diagramNodeCondition.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object strings = diagramNodeCondition.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(DiagramNodeCondition.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object tabIndex = diagramNodeCondition.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(DiagramNodeCondition.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTransitions(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String transitions = diagramNodeCondition.getTransitions();

		if (transitions != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.TRANSITIONS, transitions));
		}
	}

	protected void renderType(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String type = diagramNodeCondition.getType();

		if (type != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.TYPE, type));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean visible = diagramNodeCondition.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeCondition.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object width = diagramNodeCondition.getWidth();

		if (width != null) {
			renderedAttributes.add(renderNumber(DiagramNodeCondition.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object x = diagramNodeCondition.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(DiagramNodeCondition.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object xy = diagramNodeCondition.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(DiagramNodeCondition.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object y = diagramNodeCondition.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(DiagramNodeCondition.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object zIndex = diagramNodeCondition.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(DiagramNodeCondition.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterAlignChange = diagramNodeCondition.getAfterAlignChange();

		if (afterAlignChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_ALIGN_CHANGE, afterAlignChange));
		}
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterAlignOnChange = diagramNodeCondition.getAfterAlignOnChange();

		if (afterAlignOnChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterBodyContentChange = diagramNodeCondition.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterBoundingBoxChange = diagramNodeCondition.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterBuilderChange = diagramNodeCondition.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterCenteredChange = diagramNodeCondition.getAfterCenteredChange();

		if (afterCenteredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_CENTERED_CHANGE, afterCenteredChange));
		}
	}

	protected void renderAfterConnectorsChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterConnectorsChange = diagramNodeCondition.getAfterConnectorsChange();

		if (afterConnectorsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_CONNECTORS_CHANGE, afterConnectorsChange));
		}
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterConstrainChange = diagramNodeCondition.getAfterConstrainChange();

		if (afterConstrainChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterContentBoxChange = diagramNodeCondition.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterControlsToolbarChange = diagramNodeCondition.getAfterControlsToolbarChange();

		if (afterControlsToolbarChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
		}
	}

	protected void renderAfterDescriptionChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterDescriptionChange = diagramNodeCondition.getAfterDescriptionChange();

		if (afterDescriptionChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_DESCRIPTION_CHANGE, afterDescriptionChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterDestroyedChange = diagramNodeCondition.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterDisabledChange = diagramNodeCondition.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterFillHeightChange = diagramNodeCondition.getAfterFillHeightChange();

		if (afterFillHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterFocusedChange = diagramNodeCondition.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterFooterContentChange = diagramNodeCondition.getAfterFooterContentChange();

		if (afterFooterContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
		}
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterGraphicChange = diagramNodeCondition.getAfterGraphicChange();

		if (afterGraphicChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
		}
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterHeaderContentChange = diagramNodeCondition.getAfterHeaderContentChange();

		if (afterHeaderContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterHeightChange = diagramNodeCondition.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterHighlightBoundaryStrokeChange = diagramNodeCondition.getAfterHighlightBoundaryStrokeChange();

		if (afterHighlightBoundaryStrokeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, afterHighlightBoundaryStrokeChange));
		}
	}

	protected void renderAfterHighlightedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterHighlightedChange = diagramNodeCondition.getAfterHighlightedChange();

		if (afterHighlightedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_HIGHLIGHTED_CHANGE, afterHighlightedChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterIdChange = diagramNodeCondition.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterInitializedChange = diagramNodeCondition.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterLocaleChange = diagramNodeCondition.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterNameChange = diagramNodeCondition.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterPreventOverlapChange = diagramNodeCondition.getAfterPreventOverlapChange();

		if (afterPreventOverlapChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterRenderChange = diagramNodeCondition.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterRenderedChange = diagramNodeCondition.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterRequiredChange = diagramNodeCondition.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterSelectedChange = diagramNodeCondition.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterShapeBoundaryChange = diagramNodeCondition.getAfterShapeBoundaryChange();

		if (afterShapeBoundaryChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_SHAPE_BOUNDARY_CHANGE, afterShapeBoundaryChange));
		}
	}

	protected void renderAfterShapeInviteChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterShapeInviteChange = diagramNodeCondition.getAfterShapeInviteChange();

		if (afterShapeInviteChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_SHAPE_INVITE_CHANGE, afterShapeInviteChange));
		}
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterShimChange = diagramNodeCondition.getAfterShimChange();

		if (afterShimChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_SHIM_CHANGE, afterShimChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterSrcNodeChange = diagramNodeCondition.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterStringsChange = diagramNodeCondition.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterTabIndexChange = diagramNodeCondition.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTransitionsChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterTransitionsChange = diagramNodeCondition.getAfterTransitionsChange();

		if (afterTransitionsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_TRANSITIONS_CHANGE, afterTransitionsChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterTypeChange = diagramNodeCondition.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterVisibleChange = diagramNodeCondition.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterWidthChange = diagramNodeCondition.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterXChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterXChange = diagramNodeCondition.getAfterXChange();

		if (afterXChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_XCHANGE, afterXChange));
		}
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterXyChange = diagramNodeCondition.getAfterXyChange();

		if (afterXyChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_XY_CHANGE, afterXyChange));
		}
	}

	protected void renderAfterYChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterYChange = diagramNodeCondition.getAfterYChange();

		if (afterYChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_YCHANGE, afterYChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterZIndexChange = diagramNodeCondition.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onAlignChange = diagramNodeCondition.getOnAlignChange();

		if (onAlignChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_ALIGN_CHANGE, onAlignChange));
		}
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onAlignOnChange = diagramNodeCondition.getOnAlignOnChange();

		if (onAlignOnChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_ALIGN_ON_CHANGE, onAlignOnChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onBodyContentChange = diagramNodeCondition.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onBoundingBoxChange = diagramNodeCondition.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onBuilderChange = diagramNodeCondition.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onCenteredChange = diagramNodeCondition.getOnCenteredChange();

		if (onCenteredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_CENTERED_CHANGE, onCenteredChange));
		}
	}

	protected void renderOnConnectorsChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onConnectorsChange = diagramNodeCondition.getOnConnectorsChange();

		if (onConnectorsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_CONNECTORS_CHANGE, onConnectorsChange));
		}
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onConstrainChange = diagramNodeCondition.getOnConstrainChange();

		if (onConstrainChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_CONSTRAIN_CHANGE, onConstrainChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onContentBoxChange = diagramNodeCondition.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onControlsToolbarChange = diagramNodeCondition.getOnControlsToolbarChange();

		if (onControlsToolbarChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
		}
	}

	protected void renderOnDescriptionChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onDescriptionChange = diagramNodeCondition.getOnDescriptionChange();

		if (onDescriptionChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_DESCRIPTION_CHANGE, onDescriptionChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onDestroyedChange = diagramNodeCondition.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onDisabledChange = diagramNodeCondition.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onFillHeightChange = diagramNodeCondition.getOnFillHeightChange();

		if (onFillHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onFocusedChange = diagramNodeCondition.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onFooterContentChange = diagramNodeCondition.getOnFooterContentChange();

		if (onFooterContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
		}
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onGraphicChange = diagramNodeCondition.getOnGraphicChange();

		if (onGraphicChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_GRAPHIC_CHANGE, onGraphicChange));
		}
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onHeaderContentChange = diagramNodeCondition.getOnHeaderContentChange();

		if (onHeaderContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onHeightChange = diagramNodeCondition.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onHighlightBoundaryStrokeChange = diagramNodeCondition.getOnHighlightBoundaryStrokeChange();

		if (onHighlightBoundaryStrokeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, onHighlightBoundaryStrokeChange));
		}
	}

	protected void renderOnHighlightedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onHighlightedChange = diagramNodeCondition.getOnHighlightedChange();

		if (onHighlightedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_HIGHLIGHTED_CHANGE, onHighlightedChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onIdChange = diagramNodeCondition.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onInitializedChange = diagramNodeCondition.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onLocaleChange = diagramNodeCondition.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onNameChange = diagramNodeCondition.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onPreventOverlapChange = diagramNodeCondition.getOnPreventOverlapChange();

		if (onPreventOverlapChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onRenderChange = diagramNodeCondition.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onRenderedChange = diagramNodeCondition.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onRequiredChange = diagramNodeCondition.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onSelectedChange = diagramNodeCondition.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onShapeBoundaryChange = diagramNodeCondition.getOnShapeBoundaryChange();

		if (onShapeBoundaryChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_SHAPE_BOUNDARY_CHANGE, onShapeBoundaryChange));
		}
	}

	protected void renderOnShapeInviteChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onShapeInviteChange = diagramNodeCondition.getOnShapeInviteChange();

		if (onShapeInviteChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_SHAPE_INVITE_CHANGE, onShapeInviteChange));
		}
	}

	protected void renderOnShimChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onShimChange = diagramNodeCondition.getOnShimChange();

		if (onShimChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_SHIM_CHANGE, onShimChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onSrcNodeChange = diagramNodeCondition.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onStringsChange = diagramNodeCondition.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onTabIndexChange = diagramNodeCondition.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTransitionsChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onTransitionsChange = diagramNodeCondition.getOnTransitionsChange();

		if (onTransitionsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_TRANSITIONS_CHANGE, onTransitionsChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onTypeChange = diagramNodeCondition.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onVisibleChange = diagramNodeCondition.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onWidthChange = diagramNodeCondition.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnXChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onXChange = diagramNodeCondition.getOnXChange();

		if (onXChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_XCHANGE, onXChange));
		}
	}

	protected void renderOnXyChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onXyChange = diagramNodeCondition.getOnXyChange();

		if (onXyChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_XY_CHANGE, onXyChange));
		}
	}

	protected void renderOnYChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onYChange = diagramNodeCondition.getOnYChange();

		if (onYChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_YCHANGE, onYChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onZIndexChange = diagramNodeCondition.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeCondition.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}