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

}