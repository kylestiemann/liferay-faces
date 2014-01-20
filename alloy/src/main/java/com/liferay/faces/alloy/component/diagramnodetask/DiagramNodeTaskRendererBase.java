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
package com.liferay.faces.alloy.component.diagramnodetask;

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
public abstract class DiagramNodeTaskRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DiagramNodeTask diagramNodeTask = (DiagramNodeTask) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var diagramNodeTask = new A.DiagramNodeTask");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlign(renderedAttributes, diagramNodeTask);
		renderAlignOn(renderedAttributes, diagramNodeTask);
		renderDiagramNodeTaskBodyContent(renderedAttributes, diagramNodeTask);
		renderBoundingBox(renderedAttributes, diagramNodeTask);
		renderBuilder(renderedAttributes, diagramNodeTask);
		renderCentered(renderedAttributes, diagramNodeTask);
		renderConnectors(renderedAttributes, diagramNodeTask);
		renderConstrain(renderedAttributes, diagramNodeTask);
		renderContentBox(renderedAttributes, diagramNodeTask);
		renderControlsToolbar(renderedAttributes, diagramNodeTask);
		renderDescription(renderedAttributes, diagramNodeTask);
		renderDestroyed(renderedAttributes, diagramNodeTask);
		renderDisabled(renderedAttributes, diagramNodeTask);
		renderFillHeight(renderedAttributes, diagramNodeTask);
		renderFocused(renderedAttributes, diagramNodeTask);
		renderFooterContent(renderedAttributes, diagramNodeTask);
		renderGraphic(renderedAttributes, diagramNodeTask);
		renderHeaderContent(renderedAttributes, diagramNodeTask);
		renderHeight(renderedAttributes, diagramNodeTask);
		renderHighlightBoundaryStroke(renderedAttributes, diagramNodeTask);
		renderHighlighted(renderedAttributes, diagramNodeTask);
		renderDiagramNodeTaskId(renderedAttributes, diagramNodeTask);
		renderInitialized(renderedAttributes, diagramNodeTask);
		renderDiagramNodeTaskLocale(renderedAttributes, diagramNodeTask);
		renderName(renderedAttributes, diagramNodeTask);
		renderPreventOverlap(renderedAttributes, diagramNodeTask);
		renderRender(renderedAttributes, diagramNodeTask);
		renderRendered(renderedAttributes, diagramNodeTask);
		renderRequired(renderedAttributes, diagramNodeTask);
		renderSelected(renderedAttributes, diagramNodeTask);
		renderShapeBoundary(renderedAttributes, diagramNodeTask);
		renderShapeInvite(renderedAttributes, diagramNodeTask);
		renderShim(renderedAttributes, diagramNodeTask);
		renderSrcNode(renderedAttributes, diagramNodeTask);
		renderStrings(renderedAttributes, diagramNodeTask);
		renderTabIndex(renderedAttributes, diagramNodeTask);
		renderTransitions(renderedAttributes, diagramNodeTask);
		renderType(renderedAttributes, diagramNodeTask);
		renderVisible(renderedAttributes, diagramNodeTask);
		renderWidth(renderedAttributes, diagramNodeTask);
		renderX(renderedAttributes, diagramNodeTask);
		renderXy(renderedAttributes, diagramNodeTask);
		renderY(renderedAttributes, diagramNodeTask);
		renderZIndex(renderedAttributes, diagramNodeTask);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlignChange(renderedAfterEvents, diagramNodeTask);
		renderAfterAlignOnChange(renderedAfterEvents, diagramNodeTask);
		renderAfterBodyContentChange(renderedAfterEvents, diagramNodeTask);
		renderAfterBoundingBoxChange(renderedAfterEvents, diagramNodeTask);
		renderAfterBuilderChange(renderedAfterEvents, diagramNodeTask);
		renderAfterCenteredChange(renderedAfterEvents, diagramNodeTask);
		renderAfterConnectorsChange(renderedAfterEvents, diagramNodeTask);
		renderAfterConstrainChange(renderedAfterEvents, diagramNodeTask);
		renderAfterContentBoxChange(renderedAfterEvents, diagramNodeTask);
		renderAfterControlsToolbarChange(renderedAfterEvents, diagramNodeTask);
		renderAfterDescriptionChange(renderedAfterEvents, diagramNodeTask);
		renderAfterDestroyedChange(renderedAfterEvents, diagramNodeTask);
		renderAfterDisabledChange(renderedAfterEvents, diagramNodeTask);
		renderAfterFillHeightChange(renderedAfterEvents, diagramNodeTask);
		renderAfterFocusedChange(renderedAfterEvents, diagramNodeTask);
		renderAfterFooterContentChange(renderedAfterEvents, diagramNodeTask);
		renderAfterGraphicChange(renderedAfterEvents, diagramNodeTask);
		renderAfterHeaderContentChange(renderedAfterEvents, diagramNodeTask);
		renderAfterHeightChange(renderedAfterEvents, diagramNodeTask);
		renderAfterHighlightBoundaryStrokeChange(renderedAfterEvents, diagramNodeTask);
		renderAfterHighlightedChange(renderedAfterEvents, diagramNodeTask);
		renderAfterIdChange(renderedAfterEvents, diagramNodeTask);
		renderAfterInitializedChange(renderedAfterEvents, diagramNodeTask);
		renderAfterLocaleChange(renderedAfterEvents, diagramNodeTask);
		renderAfterNameChange(renderedAfterEvents, diagramNodeTask);
		renderAfterPreventOverlapChange(renderedAfterEvents, diagramNodeTask);
		renderAfterRenderChange(renderedAfterEvents, diagramNodeTask);
		renderAfterRenderedChange(renderedAfterEvents, diagramNodeTask);
		renderAfterRequiredChange(renderedAfterEvents, diagramNodeTask);
		renderAfterSelectedChange(renderedAfterEvents, diagramNodeTask);
		renderAfterShapeBoundaryChange(renderedAfterEvents, diagramNodeTask);
		renderAfterShapeInviteChange(renderedAfterEvents, diagramNodeTask);
		renderAfterShimChange(renderedAfterEvents, diagramNodeTask);
		renderAfterSrcNodeChange(renderedAfterEvents, diagramNodeTask);
		renderAfterStringsChange(renderedAfterEvents, diagramNodeTask);
		renderAfterTabIndexChange(renderedAfterEvents, diagramNodeTask);
		renderAfterTransitionsChange(renderedAfterEvents, diagramNodeTask);
		renderAfterTypeChange(renderedAfterEvents, diagramNodeTask);
		renderAfterVisibleChange(renderedAfterEvents, diagramNodeTask);
		renderAfterWidthChange(renderedAfterEvents, diagramNodeTask);
		renderAfterXChange(renderedAfterEvents, diagramNodeTask);
		renderAfterXyChange(renderedAfterEvents, diagramNodeTask);
		renderAfterYChange(renderedAfterEvents, diagramNodeTask);
		renderAfterZIndexChange(renderedAfterEvents, diagramNodeTask);

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

		renderOnAlignChange(renderedOnEvents, diagramNodeTask);
		renderOnAlignOnChange(renderedOnEvents, diagramNodeTask);
		renderOnBodyContentChange(renderedOnEvents, diagramNodeTask);
		renderOnBoundingBoxChange(renderedOnEvents, diagramNodeTask);
		renderOnBuilderChange(renderedOnEvents, diagramNodeTask);
		renderOnCenteredChange(renderedOnEvents, diagramNodeTask);
		renderOnConnectorsChange(renderedOnEvents, diagramNodeTask);
		renderOnConstrainChange(renderedOnEvents, diagramNodeTask);
		renderOnContentBoxChange(renderedOnEvents, diagramNodeTask);
		renderOnControlsToolbarChange(renderedOnEvents, diagramNodeTask);
		renderOnDescriptionChange(renderedOnEvents, diagramNodeTask);
		renderOnDestroyedChange(renderedOnEvents, diagramNodeTask);
		renderOnDisabledChange(renderedOnEvents, diagramNodeTask);
		renderOnFillHeightChange(renderedOnEvents, diagramNodeTask);
		renderOnFocusedChange(renderedOnEvents, diagramNodeTask);
		renderOnFooterContentChange(renderedOnEvents, diagramNodeTask);
		renderOnGraphicChange(renderedOnEvents, diagramNodeTask);
		renderOnHeaderContentChange(renderedOnEvents, diagramNodeTask);
		renderOnHeightChange(renderedOnEvents, diagramNodeTask);
		renderOnHighlightBoundaryStrokeChange(renderedOnEvents, diagramNodeTask);
		renderOnHighlightedChange(renderedOnEvents, diagramNodeTask);
		renderOnIdChange(renderedOnEvents, diagramNodeTask);
		renderOnInitializedChange(renderedOnEvents, diagramNodeTask);
		renderOnLocaleChange(renderedOnEvents, diagramNodeTask);
		renderOnNameChange(renderedOnEvents, diagramNodeTask);
		renderOnPreventOverlapChange(renderedOnEvents, diagramNodeTask);
		renderOnRenderChange(renderedOnEvents, diagramNodeTask);
		renderOnRenderedChange(renderedOnEvents, diagramNodeTask);
		renderOnRequiredChange(renderedOnEvents, diagramNodeTask);
		renderOnSelectedChange(renderedOnEvents, diagramNodeTask);
		renderOnShapeBoundaryChange(renderedOnEvents, diagramNodeTask);
		renderOnShapeInviteChange(renderedOnEvents, diagramNodeTask);
		renderOnShimChange(renderedOnEvents, diagramNodeTask);
		renderOnSrcNodeChange(renderedOnEvents, diagramNodeTask);
		renderOnStringsChange(renderedOnEvents, diagramNodeTask);
		renderOnTabIndexChange(renderedOnEvents, diagramNodeTask);
		renderOnTransitionsChange(renderedOnEvents, diagramNodeTask);
		renderOnTypeChange(renderedOnEvents, diagramNodeTask);
		renderOnVisibleChange(renderedOnEvents, diagramNodeTask);
		renderOnWidthChange(renderedOnEvents, diagramNodeTask);
		renderOnXChange(renderedOnEvents, diagramNodeTask);
		renderOnXyChange(renderedOnEvents, diagramNodeTask);
		renderOnYChange(renderedOnEvents, diagramNodeTask);
		renderOnZIndexChange(renderedOnEvents, diagramNodeTask);

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

	protected void renderAlign(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object align = diagramNodeTask.getAlign();

		if (align != null) {
			renderedAttributes.add(renderObject(DiagramNodeTask.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object alignOn = diagramNodeTask.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(DiagramNodeTask.ALIGN_ON, alignOn));
		}
	}

	protected void renderDiagramNodeTaskBodyContent(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object diagramNodeTaskBodyContent = diagramNodeTask.getDiagramNodeTaskBodyContent();

		if (diagramNodeTaskBodyContent != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.DIAGRAM_NODE_TASK_BODY_CONTENT, diagramNodeTaskBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String boundingBox = diagramNodeTask.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object builder = diagramNodeTask.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.BUILDER, builder));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object centered = diagramNodeTask.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.CENTERED, centered));
		}
	}

	protected void renderConnectors(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String connectors = diagramNodeTask.getConnectors();

		if (connectors != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.CONNECTORS, connectors));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object constrain = diagramNodeTask.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String contentBox = diagramNodeTask.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.CONTENT_BOX, contentBox));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object controlsToolbar = diagramNodeTask.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(DiagramNodeTask.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDescription(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String description = diagramNodeTask.getDescription();

		if (description != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.DESCRIPTION, description));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean destroyed = diagramNodeTask.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeTask.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean disabled = diagramNodeTask.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeTask.DISABLED, disabled));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object fillHeight = diagramNodeTask.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean focused = diagramNodeTask.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeTask.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object footerContent = diagramNodeTask.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderGraphic(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object graphic = diagramNodeTask.getGraphic();

		if (graphic != null) {
			renderedAttributes.add(renderObject(DiagramNodeTask.GRAPHIC, graphic));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object headerContent = diagramNodeTask.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object height = diagramNodeTask.getHeight();

		if (height != null) {
			renderedAttributes.add(renderNumber(DiagramNodeTask.HEIGHT, height));
		}
	}

	protected void renderHighlightBoundaryStroke(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object highlightBoundaryStroke = diagramNodeTask.getHighlightBoundaryStroke();

		if (highlightBoundaryStroke != null) {
			renderedAttributes.add(renderObject(DiagramNodeTask.HIGHLIGHT_BOUNDARY_STROKE, highlightBoundaryStroke));
		}
	}

	protected void renderHighlighted(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean highlighted = diagramNodeTask.getHighlighted();

		if (highlighted != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeTask.HIGHLIGHTED, highlighted));
		}
	}

	protected void renderDiagramNodeTaskId(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String diagramNodeTaskId = diagramNodeTask.getDiagramNodeTaskId();

		if (diagramNodeTaskId != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.DIAGRAM_NODE_TASK_ID, diagramNodeTaskId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean initialized = diagramNodeTask.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeTask.INITIALIZED, initialized));
		}
	}

	protected void renderDiagramNodeTaskLocale(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String diagramNodeTaskLocale = diagramNodeTask.getDiagramNodeTaskLocale();

		if (diagramNodeTaskLocale != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.DIAGRAM_NODE_TASK_LOCALE, diagramNodeTaskLocale));
		}
	}

	protected void renderName(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String name = diagramNodeTask.getName();

		if (name != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.NAME, name));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean preventOverlap = diagramNodeTask.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeTask.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object render = diagramNodeTask.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean rendered = diagramNodeTask.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeTask.RENDERED, rendered));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean required = diagramNodeTask.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeTask.REQUIRED, required));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean selected = diagramNodeTask.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeTask.SELECTED, selected));
		}
	}

	protected void renderShapeBoundary(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object shapeBoundary = diagramNodeTask.getShapeBoundary();

		if (shapeBoundary != null) {
			renderedAttributes.add(renderObject(DiagramNodeTask.SHAPE_BOUNDARY, shapeBoundary));
		}
	}

	protected void renderShapeInvite(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object shapeInvite = diagramNodeTask.getShapeInvite();

		if (shapeInvite != null) {
			renderedAttributes.add(renderObject(DiagramNodeTask.SHAPE_INVITE, shapeInvite));
		}
	}

	protected void renderShim(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean shim = diagramNodeTask.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeTask.SHIM, shim));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String srcNode = diagramNodeTask.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object strings = diagramNodeTask.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(DiagramNodeTask.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object tabIndex = diagramNodeTask.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(DiagramNodeTask.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTransitions(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String transitions = diagramNodeTask.getTransitions();

		if (transitions != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.TRANSITIONS, transitions));
		}
	}

	protected void renderType(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String type = diagramNodeTask.getType();

		if (type != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.TYPE, type));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean visible = diagramNodeTask.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeTask.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object width = diagramNodeTask.getWidth();

		if (width != null) {
			renderedAttributes.add(renderNumber(DiagramNodeTask.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object x = diagramNodeTask.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(DiagramNodeTask.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object xy = diagramNodeTask.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(DiagramNodeTask.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object y = diagramNodeTask.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(DiagramNodeTask.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object zIndex = diagramNodeTask.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(DiagramNodeTask.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterAlignChange = diagramNodeTask.getAfterAlignChange();

		if (afterAlignChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_ALIGN_CHANGE, afterAlignChange));
		}
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterAlignOnChange = diagramNodeTask.getAfterAlignOnChange();

		if (afterAlignOnChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterBodyContentChange = diagramNodeTask.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterBoundingBoxChange = diagramNodeTask.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterBuilderChange = diagramNodeTask.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterCenteredChange = diagramNodeTask.getAfterCenteredChange();

		if (afterCenteredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_CENTERED_CHANGE, afterCenteredChange));
		}
	}

	protected void renderAfterConnectorsChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterConnectorsChange = diagramNodeTask.getAfterConnectorsChange();

		if (afterConnectorsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_CONNECTORS_CHANGE, afterConnectorsChange));
		}
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterConstrainChange = diagramNodeTask.getAfterConstrainChange();

		if (afterConstrainChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterContentBoxChange = diagramNodeTask.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterControlsToolbarChange = diagramNodeTask.getAfterControlsToolbarChange();

		if (afterControlsToolbarChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
		}
	}

	protected void renderAfterDescriptionChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterDescriptionChange = diagramNodeTask.getAfterDescriptionChange();

		if (afterDescriptionChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_DESCRIPTION_CHANGE, afterDescriptionChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterDestroyedChange = diagramNodeTask.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterDisabledChange = diagramNodeTask.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterFillHeightChange = diagramNodeTask.getAfterFillHeightChange();

		if (afterFillHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterFocusedChange = diagramNodeTask.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterFooterContentChange = diagramNodeTask.getAfterFooterContentChange();

		if (afterFooterContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
		}
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterGraphicChange = diagramNodeTask.getAfterGraphicChange();

		if (afterGraphicChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
		}
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterHeaderContentChange = diagramNodeTask.getAfterHeaderContentChange();

		if (afterHeaderContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterHeightChange = diagramNodeTask.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterHighlightBoundaryStrokeChange = diagramNodeTask.getAfterHighlightBoundaryStrokeChange();

		if (afterHighlightBoundaryStrokeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, afterHighlightBoundaryStrokeChange));
		}
	}

	protected void renderAfterHighlightedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterHighlightedChange = diagramNodeTask.getAfterHighlightedChange();

		if (afterHighlightedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_HIGHLIGHTED_CHANGE, afterHighlightedChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterIdChange = diagramNodeTask.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterInitializedChange = diagramNodeTask.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterLocaleChange = diagramNodeTask.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterNameChange = diagramNodeTask.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterPreventOverlapChange = diagramNodeTask.getAfterPreventOverlapChange();

		if (afterPreventOverlapChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterRenderChange = diagramNodeTask.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterRenderedChange = diagramNodeTask.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterRequiredChange = diagramNodeTask.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterSelectedChange = diagramNodeTask.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterShapeBoundaryChange = diagramNodeTask.getAfterShapeBoundaryChange();

		if (afterShapeBoundaryChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_SHAPE_BOUNDARY_CHANGE, afterShapeBoundaryChange));
		}
	}

	protected void renderAfterShapeInviteChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterShapeInviteChange = diagramNodeTask.getAfterShapeInviteChange();

		if (afterShapeInviteChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_SHAPE_INVITE_CHANGE, afterShapeInviteChange));
		}
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterShimChange = diagramNodeTask.getAfterShimChange();

		if (afterShimChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_SHIM_CHANGE, afterShimChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterSrcNodeChange = diagramNodeTask.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterStringsChange = diagramNodeTask.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterTabIndexChange = diagramNodeTask.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTransitionsChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterTransitionsChange = diagramNodeTask.getAfterTransitionsChange();

		if (afterTransitionsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_TRANSITIONS_CHANGE, afterTransitionsChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterTypeChange = diagramNodeTask.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterVisibleChange = diagramNodeTask.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterWidthChange = diagramNodeTask.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterXChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterXChange = diagramNodeTask.getAfterXChange();

		if (afterXChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_XCHANGE, afterXChange));
		}
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterXyChange = diagramNodeTask.getAfterXyChange();

		if (afterXyChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_XY_CHANGE, afterXyChange));
		}
	}

	protected void renderAfterYChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterYChange = diagramNodeTask.getAfterYChange();

		if (afterYChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_YCHANGE, afterYChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterZIndexChange = diagramNodeTask.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onAlignChange = diagramNodeTask.getOnAlignChange();

		if (onAlignChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_ALIGN_CHANGE, onAlignChange));
		}
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onAlignOnChange = diagramNodeTask.getOnAlignOnChange();

		if (onAlignOnChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_ALIGN_ON_CHANGE, onAlignOnChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onBodyContentChange = diagramNodeTask.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onBoundingBoxChange = diagramNodeTask.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onBuilderChange = diagramNodeTask.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onCenteredChange = diagramNodeTask.getOnCenteredChange();

		if (onCenteredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_CENTERED_CHANGE, onCenteredChange));
		}
	}

	protected void renderOnConnectorsChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onConnectorsChange = diagramNodeTask.getOnConnectorsChange();

		if (onConnectorsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_CONNECTORS_CHANGE, onConnectorsChange));
		}
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onConstrainChange = diagramNodeTask.getOnConstrainChange();

		if (onConstrainChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_CONSTRAIN_CHANGE, onConstrainChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onContentBoxChange = diagramNodeTask.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onControlsToolbarChange = diagramNodeTask.getOnControlsToolbarChange();

		if (onControlsToolbarChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
		}
	}

	protected void renderOnDescriptionChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onDescriptionChange = diagramNodeTask.getOnDescriptionChange();

		if (onDescriptionChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_DESCRIPTION_CHANGE, onDescriptionChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onDestroyedChange = diagramNodeTask.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onDisabledChange = diagramNodeTask.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onFillHeightChange = diagramNodeTask.getOnFillHeightChange();

		if (onFillHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onFocusedChange = diagramNodeTask.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onFooterContentChange = diagramNodeTask.getOnFooterContentChange();

		if (onFooterContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
		}
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onGraphicChange = diagramNodeTask.getOnGraphicChange();

		if (onGraphicChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_GRAPHIC_CHANGE, onGraphicChange));
		}
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onHeaderContentChange = diagramNodeTask.getOnHeaderContentChange();

		if (onHeaderContentChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onHeightChange = diagramNodeTask.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onHighlightBoundaryStrokeChange = diagramNodeTask.getOnHighlightBoundaryStrokeChange();

		if (onHighlightBoundaryStrokeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, onHighlightBoundaryStrokeChange));
		}
	}

	protected void renderOnHighlightedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onHighlightedChange = diagramNodeTask.getOnHighlightedChange();

		if (onHighlightedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_HIGHLIGHTED_CHANGE, onHighlightedChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onIdChange = diagramNodeTask.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onInitializedChange = diagramNodeTask.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onLocaleChange = diagramNodeTask.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onNameChange = diagramNodeTask.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onPreventOverlapChange = diagramNodeTask.getOnPreventOverlapChange();

		if (onPreventOverlapChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onRenderChange = diagramNodeTask.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onRenderedChange = diagramNodeTask.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onRequiredChange = diagramNodeTask.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onSelectedChange = diagramNodeTask.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onShapeBoundaryChange = diagramNodeTask.getOnShapeBoundaryChange();

		if (onShapeBoundaryChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_SHAPE_BOUNDARY_CHANGE, onShapeBoundaryChange));
		}
	}

	protected void renderOnShapeInviteChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onShapeInviteChange = diagramNodeTask.getOnShapeInviteChange();

		if (onShapeInviteChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_SHAPE_INVITE_CHANGE, onShapeInviteChange));
		}
	}

	protected void renderOnShimChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onShimChange = diagramNodeTask.getOnShimChange();

		if (onShimChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_SHIM_CHANGE, onShimChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onSrcNodeChange = diagramNodeTask.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onStringsChange = diagramNodeTask.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onTabIndexChange = diagramNodeTask.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTransitionsChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onTransitionsChange = diagramNodeTask.getOnTransitionsChange();

		if (onTransitionsChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_TRANSITIONS_CHANGE, onTransitionsChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onTypeChange = diagramNodeTask.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onVisibleChange = diagramNodeTask.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onWidthChange = diagramNodeTask.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnXChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onXChange = diagramNodeTask.getOnXChange();

		if (onXChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_XCHANGE, onXChange));
		}
	}

	protected void renderOnXyChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onXyChange = diagramNodeTask.getOnXyChange();

		if (onXyChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_XY_CHANGE, onXyChange));
		}
	}

	protected void renderOnYChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onYChange = diagramNodeTask.getOnYChange();

		if (onYChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_YCHANGE, onYChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onZIndexChange = diagramNodeTask.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}