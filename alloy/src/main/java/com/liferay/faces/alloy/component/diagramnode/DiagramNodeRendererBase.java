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

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.AUIRenderer;
import com.liferay.faces.alloy.renderkit.BufferedResponseWriter;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class DiagramNodeRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		DiagramNode diagramNode = (DiagramNode) uiComponent;
		encodeHTML(facesContext, diagramNode);
		encodeJavaScript(facesContext, diagramNode);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DiagramNode diagramNode) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DiagramNode diagramNode) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, diagramNode);

		bufferedResponseWriter.write("var diagramNode = new Y.DiagramNode");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderBuilder(bufferedResponseWriter, diagramNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderConnectors(bufferedResponseWriter, diagramNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderControlsToolbar(bufferedResponseWriter, diagramNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDescription(bufferedResponseWriter, diagramNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderGraphic(bufferedResponseWriter, diagramNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeight(bufferedResponseWriter, diagramNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHighlightBoundaryStroke(bufferedResponseWriter, diagramNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHighlighted(bufferedResponseWriter, diagramNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderName(bufferedResponseWriter, diagramNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequired(bufferedResponseWriter, diagramNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelected(bufferedResponseWriter, diagramNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeBoundary(bufferedResponseWriter, diagramNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeInvite(bufferedResponseWriter, diagramNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, diagramNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, diagramNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTransitions(bufferedResponseWriter, diagramNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderType(bufferedResponseWriter, diagramNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderWidth(bufferedResponseWriter, diagramNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderZIndex(bufferedResponseWriter, diagramNode);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, diagramNode);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderBuilder(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderString(responseWriter, "builder", diagramNode.getBuilder());
	}

	protected void renderConnectors(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderString(responseWriter, "connectors", diagramNode.getConnectors());
	}

	protected void renderControlsToolbar(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderObject(responseWriter, "controlsToolbar", diagramNode.getControlsToolbar());
	}

	protected void renderDescription(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderString(responseWriter, "description", diagramNode.getDescription());
	}

	protected void renderGraphic(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderObject(responseWriter, "graphic", diagramNode.getGraphic());
	}

	protected void renderHeight(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderNumber(responseWriter, "height", diagramNode.getHeight());
	}

	protected void renderHighlightBoundaryStroke(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderObject(responseWriter, "highlightBoundaryStroke", diagramNode.getHighlightBoundaryStroke());
	}

	protected void renderHighlighted(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderBoolean(responseWriter, "highlighted", diagramNode.getHighlighted());
	}

	protected void renderName(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderString(responseWriter, "name", diagramNode.getName());
	}

	protected void renderRequired(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderBoolean(responseWriter, "required", diagramNode.getRequired());
	}

	protected void renderSelected(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderBoolean(responseWriter, "selected", diagramNode.getSelected());
	}

	protected void renderShapeBoundary(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderObject(responseWriter, "shapeBoundary", diagramNode.getShapeBoundary());
	}

	protected void renderShapeInvite(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderObject(responseWriter, "shapeInvite", diagramNode.getShapeInvite());
	}

	protected void renderStrings(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderObject(responseWriter, "strings", diagramNode.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderNumber(responseWriter, "tabIndex", diagramNode.getTabIndex());
	}

	protected void renderTransitions(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderString(responseWriter, "transitions", diagramNode.getTransitions());
	}

	protected void renderType(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderString(responseWriter, "type", diagramNode.getType());
	}

	protected void renderWidth(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderNumber(responseWriter, "width", diagramNode.getWidth());
	}

	protected void renderZIndex(ResponseWriter responseWriter, DiagramNode diagramNode) throws IOException {
		renderNumber(responseWriter, "zIndex", diagramNode.getZIndex());
	}

}