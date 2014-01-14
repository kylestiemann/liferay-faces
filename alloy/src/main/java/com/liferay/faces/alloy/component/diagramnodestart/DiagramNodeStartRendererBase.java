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

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, diagramNodeStart);

		bufferedResponseWriter.write("var diagramNodeStart = new Y.DiagramNodeStart");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderBuilder(bufferedResponseWriter, diagramNodeStart);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderConnectors(bufferedResponseWriter, diagramNodeStart);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderControlsToolbar(bufferedResponseWriter, diagramNodeStart);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDescription(bufferedResponseWriter, diagramNodeStart);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderGraphic(bufferedResponseWriter, diagramNodeStart);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeight(bufferedResponseWriter, diagramNodeStart);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHighlightBoundaryStroke(bufferedResponseWriter, diagramNodeStart);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHighlighted(bufferedResponseWriter, diagramNodeStart);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderName(bufferedResponseWriter, diagramNodeStart);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequired(bufferedResponseWriter, diagramNodeStart);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelected(bufferedResponseWriter, diagramNodeStart);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeBoundary(bufferedResponseWriter, diagramNodeStart);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeInvite(bufferedResponseWriter, diagramNodeStart);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, diagramNodeStart);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, diagramNodeStart);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTransitions(bufferedResponseWriter, diagramNodeStart);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderType(bufferedResponseWriter, diagramNodeStart);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderWidth(bufferedResponseWriter, diagramNodeStart);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderZIndex(bufferedResponseWriter, diagramNodeStart);

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