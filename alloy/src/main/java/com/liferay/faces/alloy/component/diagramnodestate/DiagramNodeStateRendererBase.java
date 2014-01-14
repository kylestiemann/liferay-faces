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
package com.liferay.faces.alloy.component.diagramnodestate;

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
public abstract class DiagramNodeStateRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		DiagramNodeState diagramNodeState = (DiagramNodeState) uiComponent;
		encodeHTML(facesContext, diagramNodeState);
		encodeJavaScript(facesContext, diagramNodeState);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DiagramNodeState diagramNodeState) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DiagramNodeState diagramNodeState) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, diagramNodeState);

		bufferedResponseWriter.write("var diagramNodeState = new Y.DiagramNodeState");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderBuilder(bufferedResponseWriter, diagramNodeState);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderConnectors(bufferedResponseWriter, diagramNodeState);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderControlsToolbar(bufferedResponseWriter, diagramNodeState);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDescription(bufferedResponseWriter, diagramNodeState);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderGraphic(bufferedResponseWriter, diagramNodeState);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeight(bufferedResponseWriter, diagramNodeState);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHighlightBoundaryStroke(bufferedResponseWriter, diagramNodeState);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHighlighted(bufferedResponseWriter, diagramNodeState);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderName(bufferedResponseWriter, diagramNodeState);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequired(bufferedResponseWriter, diagramNodeState);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelected(bufferedResponseWriter, diagramNodeState);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeBoundary(bufferedResponseWriter, diagramNodeState);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeInvite(bufferedResponseWriter, diagramNodeState);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, diagramNodeState);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, diagramNodeState);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTransitions(bufferedResponseWriter, diagramNodeState);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderType(bufferedResponseWriter, diagramNodeState);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderWidth(bufferedResponseWriter, diagramNodeState);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderZIndex(bufferedResponseWriter, diagramNodeState);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, diagramNodeState);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderBuilder(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderString(responseWriter, "builder", diagramNodeState.getBuilder());
	}

	protected void renderConnectors(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderString(responseWriter, "connectors", diagramNodeState.getConnectors());
	}

	protected void renderControlsToolbar(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderObject(responseWriter, "controlsToolbar", diagramNodeState.getControlsToolbar());
	}

	protected void renderDescription(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderString(responseWriter, "description", diagramNodeState.getDescription());
	}

	protected void renderGraphic(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderObject(responseWriter, "graphic", diagramNodeState.getGraphic());
	}

	protected void renderHeight(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderNumber(responseWriter, "height", diagramNodeState.getHeight());
	}

	protected void renderHighlightBoundaryStroke(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderObject(responseWriter, "highlightBoundaryStroke", diagramNodeState.getHighlightBoundaryStroke());
	}

	protected void renderHighlighted(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderBoolean(responseWriter, "highlighted", diagramNodeState.getHighlighted());
	}

	protected void renderName(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderString(responseWriter, "name", diagramNodeState.getName());
	}

	protected void renderRequired(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderBoolean(responseWriter, "required", diagramNodeState.getRequired());
	}

	protected void renderSelected(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderBoolean(responseWriter, "selected", diagramNodeState.getSelected());
	}

	protected void renderShapeBoundary(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderObject(responseWriter, "shapeBoundary", diagramNodeState.getShapeBoundary());
	}

	protected void renderShapeInvite(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderObject(responseWriter, "shapeInvite", diagramNodeState.getShapeInvite());
	}

	protected void renderStrings(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderObject(responseWriter, "strings", diagramNodeState.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderNumber(responseWriter, "tabIndex", diagramNodeState.getTabIndex());
	}

	protected void renderTransitions(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderString(responseWriter, "transitions", diagramNodeState.getTransitions());
	}

	protected void renderType(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderString(responseWriter, "type", diagramNodeState.getType());
	}

	protected void renderWidth(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderNumber(responseWriter, "width", diagramNodeState.getWidth());
	}

	protected void renderZIndex(ResponseWriter responseWriter, DiagramNodeState diagramNodeState) throws IOException {
		renderNumber(responseWriter, "zIndex", diagramNodeState.getZIndex());
	}

}