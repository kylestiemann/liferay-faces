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
public abstract class DiagramNodeEndRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		DiagramNodeEnd diagramNodeEnd = (DiagramNodeEnd) uiComponent;
		encodeHTML(facesContext, diagramNodeEnd);
		encodeJavaScript(facesContext, diagramNodeEnd);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DiagramNodeEnd diagramNodeEnd) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DiagramNodeEnd diagramNodeEnd) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, diagramNodeEnd);

		bufferedResponseWriter.write("var diagramNodeEnd = new Y.DiagramNodeEnd");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderBuilder(responseWriter, diagramNodeEnd);
		responseWriter.write(StringPool.COMMA);
		renderConnectors(responseWriter, diagramNodeEnd);
		responseWriter.write(StringPool.COMMA);
		renderControlsToolbar(responseWriter, diagramNodeEnd);
		responseWriter.write(StringPool.COMMA);
		renderDescription(responseWriter, diagramNodeEnd);
		responseWriter.write(StringPool.COMMA);
		renderGraphic(responseWriter, diagramNodeEnd);
		responseWriter.write(StringPool.COMMA);
		renderHeight(responseWriter, diagramNodeEnd);
		responseWriter.write(StringPool.COMMA);
		renderHighlightBoundaryStroke(responseWriter, diagramNodeEnd);
		responseWriter.write(StringPool.COMMA);
		renderHighlighted(responseWriter, diagramNodeEnd);
		responseWriter.write(StringPool.COMMA);
		renderName(responseWriter, diagramNodeEnd);
		responseWriter.write(StringPool.COMMA);
		renderRequired(responseWriter, diagramNodeEnd);
		responseWriter.write(StringPool.COMMA);
		renderSelected(responseWriter, diagramNodeEnd);
		responseWriter.write(StringPool.COMMA);
		renderShapeBoundary(responseWriter, diagramNodeEnd);
		responseWriter.write(StringPool.COMMA);
		renderShapeInvite(responseWriter, diagramNodeEnd);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, diagramNodeEnd);
		responseWriter.write(StringPool.COMMA);
		renderTabIndex(responseWriter, diagramNodeEnd);
		responseWriter.write(StringPool.COMMA);
		renderTransitions(responseWriter, diagramNodeEnd);
		responseWriter.write(StringPool.COMMA);
		renderType(responseWriter, diagramNodeEnd);
		responseWriter.write(StringPool.COMMA);
		renderWidth(responseWriter, diagramNodeEnd);
		responseWriter.write(StringPool.COMMA);
		renderZIndex(responseWriter, diagramNodeEnd);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, diagramNodeEnd);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderBuilder(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderString(responseWriter, "builder", diagramNodeEnd.getBuilder());
	}

	protected void renderConnectors(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderString(responseWriter, "connectors", diagramNodeEnd.getConnectors());
	}

	protected void renderControlsToolbar(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderObject(responseWriter, "controlsToolbar", diagramNodeEnd.getControlsToolbar());
	}

	protected void renderDescription(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderString(responseWriter, "description", diagramNodeEnd.getDescription());
	}

	protected void renderGraphic(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderObject(responseWriter, "graphic", diagramNodeEnd.getGraphic());
	}

	protected void renderHeight(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderNumber(responseWriter, "height", diagramNodeEnd.getHeight());
	}

	protected void renderHighlightBoundaryStroke(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderObject(responseWriter, "highlightBoundaryStroke", diagramNodeEnd.getHighlightBoundaryStroke());
	}

	protected void renderHighlighted(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderBoolean(responseWriter, "highlighted", diagramNodeEnd.getHighlighted());
	}

	protected void renderName(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderString(responseWriter, "name", diagramNodeEnd.getName());
	}

	protected void renderRequired(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderBoolean(responseWriter, "required", diagramNodeEnd.getRequired());
	}

	protected void renderSelected(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderBoolean(responseWriter, "selected", diagramNodeEnd.getSelected());
	}

	protected void renderShapeBoundary(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderObject(responseWriter, "shapeBoundary", diagramNodeEnd.getShapeBoundary());
	}

	protected void renderShapeInvite(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderObject(responseWriter, "shapeInvite", diagramNodeEnd.getShapeInvite());
	}

	protected void renderStrings(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderObject(responseWriter, "strings", diagramNodeEnd.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderNumber(responseWriter, "tabIndex", diagramNodeEnd.getTabIndex());
	}

	protected void renderTransitions(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderString(responseWriter, "transitions", diagramNodeEnd.getTransitions());
	}

	protected void renderType(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderString(responseWriter, "type", diagramNodeEnd.getType());
	}

	protected void renderWidth(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderNumber(responseWriter, "width", diagramNodeEnd.getWidth());
	}

	protected void renderZIndex(ResponseWriter responseWriter, DiagramNodeEnd diagramNodeEnd) throws IOException {
		renderNumber(responseWriter, "zIndex", diagramNodeEnd.getZIndex());
	}

}