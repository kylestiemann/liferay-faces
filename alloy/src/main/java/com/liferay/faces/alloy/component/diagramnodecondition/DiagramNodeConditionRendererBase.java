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

}