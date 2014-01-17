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
		renderDiagramnodetaskBodyContent(renderedAttributes, diagramNodeTask);
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
		renderDiagramnodetaskId(renderedAttributes, diagramNodeTask);
		renderInitialized(renderedAttributes, diagramNodeTask);
		renderDiagramnodetaskLocale(renderedAttributes, diagramNodeTask);
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

	protected void renderDiagramnodetaskBodyContent(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object diagramnodetaskBodyContent = diagramNodeTask.getDiagramnodetaskBodyContent();

		if (diagramnodetaskBodyContent != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.DIAGRAMNODETASK_BODY_CONTENT, diagramnodetaskBodyContent));
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

	protected void renderDiagramnodetaskId(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String diagramnodetaskId = diagramNodeTask.getDiagramnodetaskId();

		if (diagramnodetaskId != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.DIAGRAMNODETASK_ID, diagramnodetaskId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean initialized = diagramNodeTask.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(DiagramNodeTask.INITIALIZED, initialized));
		}
	}

	protected void renderDiagramnodetaskLocale(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String diagramnodetaskLocale = diagramNodeTask.getDiagramnodetaskLocale();

		if (diagramnodetaskLocale != null) {
			renderedAttributes.add(renderString(DiagramNodeTask.DIAGRAMNODETASK_LOCALE, diagramnodetaskLocale));
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

}