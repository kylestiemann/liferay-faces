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
public abstract class DiagramNodeStartRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		DiagramNodeStart diagramNodeStart = (DiagramNodeStart) uiComponent;
		encodeHTML(facesContext, diagramNodeStart);
		encodeJavaScript(facesContext, diagramNodeStart);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DiagramNodeStart diagramNodeStart) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DiagramNodeStart diagramNodeStart) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, diagramNodeStart);

		bufferedResponseWriter.write("var diagramNodeStart = new Y.DiagramNodeStart");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderBuilder(responseWriter, diagramNodeStart);
		responseWriter.write(StringPool.COMMA);
		renderConnectors(responseWriter, diagramNodeStart);
		responseWriter.write(StringPool.COMMA);
		renderControlsToolbar(responseWriter, diagramNodeStart);
		responseWriter.write(StringPool.COMMA);
		renderDescription(responseWriter, diagramNodeStart);
		responseWriter.write(StringPool.COMMA);
		renderGraphic(responseWriter, diagramNodeStart);
		responseWriter.write(StringPool.COMMA);
		renderHeight(responseWriter, diagramNodeStart);
		responseWriter.write(StringPool.COMMA);
		renderHighlightBoundaryStroke(responseWriter, diagramNodeStart);
		responseWriter.write(StringPool.COMMA);
		renderHighlighted(responseWriter, diagramNodeStart);
		responseWriter.write(StringPool.COMMA);
		renderName(responseWriter, diagramNodeStart);
		responseWriter.write(StringPool.COMMA);
		renderRequired(responseWriter, diagramNodeStart);
		responseWriter.write(StringPool.COMMA);
		renderSelected(responseWriter, diagramNodeStart);
		responseWriter.write(StringPool.COMMA);
		renderShapeBoundary(responseWriter, diagramNodeStart);
		responseWriter.write(StringPool.COMMA);
		renderShapeInvite(responseWriter, diagramNodeStart);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, diagramNodeStart);
		responseWriter.write(StringPool.COMMA);
		renderTabIndex(responseWriter, diagramNodeStart);
		responseWriter.write(StringPool.COMMA);
		renderTransitions(responseWriter, diagramNodeStart);
		responseWriter.write(StringPool.COMMA);
		renderType(responseWriter, diagramNodeStart);
		responseWriter.write(StringPool.COMMA);
		renderWidth(responseWriter, diagramNodeStart);
		responseWriter.write(StringPool.COMMA);
		renderZIndex(responseWriter, diagramNodeStart);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, diagramNodeStart);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderBuilder(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderString(responseWriter, "builder", diagramNodeStart.getBuilder());
	}

	protected void renderConnectors(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderString(responseWriter, "connectors", diagramNodeStart.getConnectors());
	}

	protected void renderControlsToolbar(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderObject(responseWriter, "controlsToolbar", diagramNodeStart.getControlsToolbar());
	}

	protected void renderDescription(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderString(responseWriter, "description", diagramNodeStart.getDescription());
	}

	protected void renderGraphic(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderObject(responseWriter, "graphic", diagramNodeStart.getGraphic());
	}

	protected void renderHeight(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderNumber(responseWriter, "height", diagramNodeStart.getHeight());
	}

	protected void renderHighlightBoundaryStroke(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderObject(responseWriter, "highlightBoundaryStroke", diagramNodeStart.getHighlightBoundaryStroke());
	}

	protected void renderHighlighted(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderBoolean(responseWriter, "highlighted", diagramNodeStart.getHighlighted());
	}

	protected void renderName(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderString(responseWriter, "name", diagramNodeStart.getName());
	}

	protected void renderRequired(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderBoolean(responseWriter, "required", diagramNodeStart.getRequired());
	}

	protected void renderSelected(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderBoolean(responseWriter, "selected", diagramNodeStart.getSelected());
	}

	protected void renderShapeBoundary(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderObject(responseWriter, "shapeBoundary", diagramNodeStart.getShapeBoundary());
	}

	protected void renderShapeInvite(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderObject(responseWriter, "shapeInvite", diagramNodeStart.getShapeInvite());
	}

	protected void renderStrings(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderObject(responseWriter, "strings", diagramNodeStart.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderNumber(responseWriter, "tabIndex", diagramNodeStart.getTabIndex());
	}

	protected void renderTransitions(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderString(responseWriter, "transitions", diagramNodeStart.getTransitions());
	}

	protected void renderType(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderString(responseWriter, "type", diagramNodeStart.getType());
	}

	protected void renderWidth(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderNumber(responseWriter, "width", diagramNodeStart.getWidth());
	}

	protected void renderZIndex(ResponseWriter responseWriter, DiagramNodeStart diagramNodeStart) throws IOException {
		renderNumber(responseWriter, "zIndex", diagramNodeStart.getZIndex());
	}

}