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

}