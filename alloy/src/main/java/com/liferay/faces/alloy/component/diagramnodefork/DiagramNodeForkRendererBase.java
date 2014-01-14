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
public abstract class DiagramNodeForkRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		DiagramNodeFork diagramNodeFork = (DiagramNodeFork) uiComponent;
		encodeHTML(facesContext, diagramNodeFork);
		encodeJavaScript(facesContext, diagramNodeFork);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DiagramNodeFork diagramNodeFork) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DiagramNodeFork diagramNodeFork) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, diagramNodeFork);

		bufferedResponseWriter.write("var diagramNodeFork = new Y.DiagramNodeFork");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderBuilder(responseWriter, diagramNodeFork);
		responseWriter.write(StringPool.COMMA);
		renderConnectors(responseWriter, diagramNodeFork);
		responseWriter.write(StringPool.COMMA);
		renderControlsToolbar(responseWriter, diagramNodeFork);
		responseWriter.write(StringPool.COMMA);
		renderDescription(responseWriter, diagramNodeFork);
		responseWriter.write(StringPool.COMMA);
		renderGraphic(responseWriter, diagramNodeFork);
		responseWriter.write(StringPool.COMMA);
		renderHeight(responseWriter, diagramNodeFork);
		responseWriter.write(StringPool.COMMA);
		renderHighlightBoundaryStroke(responseWriter, diagramNodeFork);
		responseWriter.write(StringPool.COMMA);
		renderHighlighted(responseWriter, diagramNodeFork);
		responseWriter.write(StringPool.COMMA);
		renderName(responseWriter, diagramNodeFork);
		responseWriter.write(StringPool.COMMA);
		renderRequired(responseWriter, diagramNodeFork);
		responseWriter.write(StringPool.COMMA);
		renderSelected(responseWriter, diagramNodeFork);
		responseWriter.write(StringPool.COMMA);
		renderShapeBoundary(responseWriter, diagramNodeFork);
		responseWriter.write(StringPool.COMMA);
		renderShapeInvite(responseWriter, diagramNodeFork);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, diagramNodeFork);
		responseWriter.write(StringPool.COMMA);
		renderTabIndex(responseWriter, diagramNodeFork);
		responseWriter.write(StringPool.COMMA);
		renderTransitions(responseWriter, diagramNodeFork);
		responseWriter.write(StringPool.COMMA);
		renderType(responseWriter, diagramNodeFork);
		responseWriter.write(StringPool.COMMA);
		renderWidth(responseWriter, diagramNodeFork);
		responseWriter.write(StringPool.COMMA);
		renderZIndex(responseWriter, diagramNodeFork);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, diagramNodeFork);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderBuilder(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderString(responseWriter, "builder", diagramNodeFork.getBuilder());
	}

	protected void renderConnectors(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderString(responseWriter, "connectors", diagramNodeFork.getConnectors());
	}

	protected void renderControlsToolbar(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderObject(responseWriter, "controlsToolbar", diagramNodeFork.getControlsToolbar());
	}

	protected void renderDescription(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderString(responseWriter, "description", diagramNodeFork.getDescription());
	}

	protected void renderGraphic(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderObject(responseWriter, "graphic", diagramNodeFork.getGraphic());
	}

	protected void renderHeight(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderNumber(responseWriter, "height", diagramNodeFork.getHeight());
	}

	protected void renderHighlightBoundaryStroke(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderObject(responseWriter, "highlightBoundaryStroke", diagramNodeFork.getHighlightBoundaryStroke());
	}

	protected void renderHighlighted(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderBoolean(responseWriter, "highlighted", diagramNodeFork.getHighlighted());
	}

	protected void renderName(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderString(responseWriter, "name", diagramNodeFork.getName());
	}

	protected void renderRequired(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderBoolean(responseWriter, "required", diagramNodeFork.getRequired());
	}

	protected void renderSelected(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderBoolean(responseWriter, "selected", diagramNodeFork.getSelected());
	}

	protected void renderShapeBoundary(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderObject(responseWriter, "shapeBoundary", diagramNodeFork.getShapeBoundary());
	}

	protected void renderShapeInvite(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderObject(responseWriter, "shapeInvite", diagramNodeFork.getShapeInvite());
	}

	protected void renderStrings(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderObject(responseWriter, "strings", diagramNodeFork.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderNumber(responseWriter, "tabIndex", diagramNodeFork.getTabIndex());
	}

	protected void renderTransitions(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderString(responseWriter, "transitions", diagramNodeFork.getTransitions());
	}

	protected void renderType(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderString(responseWriter, "type", diagramNodeFork.getType());
	}

	protected void renderWidth(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderNumber(responseWriter, "width", diagramNodeFork.getWidth());
	}

	protected void renderZIndex(ResponseWriter responseWriter, DiagramNodeFork diagramNodeFork) throws IOException {
		renderNumber(responseWriter, "zIndex", diagramNodeFork.getZIndex());
	}

}