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

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, diagramNodeEnd);

		bufferedResponseWriter.write("var diagramNodeEnd = new Y.DiagramNodeEnd");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderBuilder(bufferedResponseWriter, diagramNodeEnd);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderConnectors(bufferedResponseWriter, diagramNodeEnd);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderControlsToolbar(bufferedResponseWriter, diagramNodeEnd);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDescription(bufferedResponseWriter, diagramNodeEnd);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderGraphic(bufferedResponseWriter, diagramNodeEnd);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeight(bufferedResponseWriter, diagramNodeEnd);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHighlightBoundaryStroke(bufferedResponseWriter, diagramNodeEnd);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHighlighted(bufferedResponseWriter, diagramNodeEnd);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderName(bufferedResponseWriter, diagramNodeEnd);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequired(bufferedResponseWriter, diagramNodeEnd);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelected(bufferedResponseWriter, diagramNodeEnd);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeBoundary(bufferedResponseWriter, diagramNodeEnd);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeInvite(bufferedResponseWriter, diagramNodeEnd);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, diagramNodeEnd);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, diagramNodeEnd);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTransitions(bufferedResponseWriter, diagramNodeEnd);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderType(bufferedResponseWriter, diagramNodeEnd);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderWidth(bufferedResponseWriter, diagramNodeEnd);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderZIndex(bufferedResponseWriter, diagramNodeEnd);

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