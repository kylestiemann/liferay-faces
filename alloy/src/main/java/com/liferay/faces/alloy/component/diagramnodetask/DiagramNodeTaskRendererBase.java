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
public abstract class DiagramNodeTaskRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		DiagramNodeTask diagramNodeTask = (DiagramNodeTask) uiComponent;
		encodeHTML(facesContext, diagramNodeTask);
		encodeJavaScript(facesContext, diagramNodeTask);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DiagramNodeTask diagramNodeTask) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DiagramNodeTask diagramNodeTask) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, diagramNodeTask);

		bufferedResponseWriter.write("var diagramNodeTask = new Y.DiagramNodeTask");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderBuilder(bufferedResponseWriter, diagramNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderConnectors(bufferedResponseWriter, diagramNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderControlsToolbar(bufferedResponseWriter, diagramNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDescription(bufferedResponseWriter, diagramNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderGraphic(bufferedResponseWriter, diagramNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeight(bufferedResponseWriter, diagramNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHighlightBoundaryStroke(bufferedResponseWriter, diagramNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHighlighted(bufferedResponseWriter, diagramNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderName(bufferedResponseWriter, diagramNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequired(bufferedResponseWriter, diagramNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelected(bufferedResponseWriter, diagramNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeBoundary(bufferedResponseWriter, diagramNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeInvite(bufferedResponseWriter, diagramNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, diagramNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, diagramNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTransitions(bufferedResponseWriter, diagramNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderType(bufferedResponseWriter, diagramNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderWidth(bufferedResponseWriter, diagramNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderZIndex(bufferedResponseWriter, diagramNodeTask);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, diagramNodeTask);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderBuilder(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderString(responseWriter, "builder", diagramNodeTask.getBuilder());
	}

	protected void renderConnectors(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderString(responseWriter, "connectors", diagramNodeTask.getConnectors());
	}

	protected void renderControlsToolbar(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderObject(responseWriter, "controlsToolbar", diagramNodeTask.getControlsToolbar());
	}

	protected void renderDescription(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderString(responseWriter, "description", diagramNodeTask.getDescription());
	}

	protected void renderGraphic(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderObject(responseWriter, "graphic", diagramNodeTask.getGraphic());
	}

	protected void renderHeight(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderNumber(responseWriter, "height", diagramNodeTask.getHeight());
	}

	protected void renderHighlightBoundaryStroke(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderObject(responseWriter, "highlightBoundaryStroke", diagramNodeTask.getHighlightBoundaryStroke());
	}

	protected void renderHighlighted(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderBoolean(responseWriter, "highlighted", diagramNodeTask.getHighlighted());
	}

	protected void renderName(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderString(responseWriter, "name", diagramNodeTask.getName());
	}

	protected void renderRequired(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderBoolean(responseWriter, "required", diagramNodeTask.getRequired());
	}

	protected void renderSelected(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderBoolean(responseWriter, "selected", diagramNodeTask.getSelected());
	}

	protected void renderShapeBoundary(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderObject(responseWriter, "shapeBoundary", diagramNodeTask.getShapeBoundary());
	}

	protected void renderShapeInvite(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderObject(responseWriter, "shapeInvite", diagramNodeTask.getShapeInvite());
	}

	protected void renderStrings(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderObject(responseWriter, "strings", diagramNodeTask.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderNumber(responseWriter, "tabIndex", diagramNodeTask.getTabIndex());
	}

	protected void renderTransitions(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderString(responseWriter, "transitions", diagramNodeTask.getTransitions());
	}

	protected void renderType(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderString(responseWriter, "type", diagramNodeTask.getType());
	}

	protected void renderWidth(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderNumber(responseWriter, "width", diagramNodeTask.getWidth());
	}

	protected void renderZIndex(ResponseWriter responseWriter, DiagramNodeTask diagramNodeTask) throws IOException {
		renderNumber(responseWriter, "zIndex", diagramNodeTask.getZIndex());
	}

}