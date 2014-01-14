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
public abstract class DiagramNodeConditionRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		DiagramNodeCondition diagramNodeCondition = (DiagramNodeCondition) uiComponent;
		encodeHTML(facesContext, diagramNodeCondition);
		encodeJavaScript(facesContext, diagramNodeCondition);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DiagramNodeCondition diagramNodeCondition) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DiagramNodeCondition diagramNodeCondition) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, diagramNodeCondition);

		bufferedResponseWriter.write("var diagramNodeCondition = new Y.DiagramNodeCondition");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderBuilder(bufferedResponseWriter, diagramNodeCondition);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderConnectors(bufferedResponseWriter, diagramNodeCondition);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderControlsToolbar(bufferedResponseWriter, diagramNodeCondition);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDescription(bufferedResponseWriter, diagramNodeCondition);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderGraphic(bufferedResponseWriter, diagramNodeCondition);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeight(bufferedResponseWriter, diagramNodeCondition);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHighlightBoundaryStroke(bufferedResponseWriter, diagramNodeCondition);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHighlighted(bufferedResponseWriter, diagramNodeCondition);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderName(bufferedResponseWriter, diagramNodeCondition);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequired(bufferedResponseWriter, diagramNodeCondition);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelected(bufferedResponseWriter, diagramNodeCondition);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeBoundary(bufferedResponseWriter, diagramNodeCondition);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeInvite(bufferedResponseWriter, diagramNodeCondition);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, diagramNodeCondition);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, diagramNodeCondition);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTransitions(bufferedResponseWriter, diagramNodeCondition);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderType(bufferedResponseWriter, diagramNodeCondition);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderWidth(bufferedResponseWriter, diagramNodeCondition);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderZIndex(bufferedResponseWriter, diagramNodeCondition);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, diagramNodeCondition);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderBuilder(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderString(responseWriter, "builder", diagramNodeCondition.getBuilder());
	}

	protected void renderConnectors(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderString(responseWriter, "connectors", diagramNodeCondition.getConnectors());
	}

	protected void renderControlsToolbar(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderObject(responseWriter, "controlsToolbar", diagramNodeCondition.getControlsToolbar());
	}

	protected void renderDescription(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderString(responseWriter, "description", diagramNodeCondition.getDescription());
	}

	protected void renderGraphic(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderObject(responseWriter, "graphic", diagramNodeCondition.getGraphic());
	}

	protected void renderHeight(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderNumber(responseWriter, "height", diagramNodeCondition.getHeight());
	}

	protected void renderHighlightBoundaryStroke(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderObject(responseWriter, "highlightBoundaryStroke", diagramNodeCondition.getHighlightBoundaryStroke());
	}

	protected void renderHighlighted(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderBoolean(responseWriter, "highlighted", diagramNodeCondition.getHighlighted());
	}

	protected void renderName(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderString(responseWriter, "name", diagramNodeCondition.getName());
	}

	protected void renderRequired(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderBoolean(responseWriter, "required", diagramNodeCondition.getRequired());
	}

	protected void renderSelected(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderBoolean(responseWriter, "selected", diagramNodeCondition.getSelected());
	}

	protected void renderShapeBoundary(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderObject(responseWriter, "shapeBoundary", diagramNodeCondition.getShapeBoundary());
	}

	protected void renderShapeInvite(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderObject(responseWriter, "shapeInvite", diagramNodeCondition.getShapeInvite());
	}

	protected void renderStrings(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderObject(responseWriter, "strings", diagramNodeCondition.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderNumber(responseWriter, "tabIndex", diagramNodeCondition.getTabIndex());
	}

	protected void renderTransitions(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderString(responseWriter, "transitions", diagramNodeCondition.getTransitions());
	}

	protected void renderType(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderString(responseWriter, "type", diagramNodeCondition.getType());
	}

	protected void renderWidth(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderNumber(responseWriter, "width", diagramNodeCondition.getWidth());
	}

	protected void renderZIndex(ResponseWriter responseWriter, DiagramNodeCondition diagramNodeCondition) throws IOException {
		renderNumber(responseWriter, "zIndex", diagramNodeCondition.getZIndex());
	}

}