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

}