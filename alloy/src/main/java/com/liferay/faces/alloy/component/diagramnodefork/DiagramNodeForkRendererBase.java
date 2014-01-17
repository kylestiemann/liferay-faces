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

}