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

}