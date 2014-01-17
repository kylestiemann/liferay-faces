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

}