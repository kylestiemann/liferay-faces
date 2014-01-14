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
package com.liferay.faces.alloy.component.diagramnodejoin;

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
public abstract class DiagramNodeJoinRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		DiagramNodeJoin diagramNodeJoin = (DiagramNodeJoin) uiComponent;
		encodeHTML(facesContext, diagramNodeJoin);
		encodeJavaScript(facesContext, diagramNodeJoin);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DiagramNodeJoin diagramNodeJoin) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DiagramNodeJoin diagramNodeJoin) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, diagramNodeJoin);

		bufferedResponseWriter.write("var diagramNodeJoin = new Y.DiagramNodeJoin");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderBuilder(bufferedResponseWriter, diagramNodeJoin);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderConnectors(bufferedResponseWriter, diagramNodeJoin);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderControlsToolbar(bufferedResponseWriter, diagramNodeJoin);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDescription(bufferedResponseWriter, diagramNodeJoin);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderGraphic(bufferedResponseWriter, diagramNodeJoin);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeight(bufferedResponseWriter, diagramNodeJoin);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHighlightBoundaryStroke(bufferedResponseWriter, diagramNodeJoin);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHighlighted(bufferedResponseWriter, diagramNodeJoin);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderName(bufferedResponseWriter, diagramNodeJoin);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequired(bufferedResponseWriter, diagramNodeJoin);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelected(bufferedResponseWriter, diagramNodeJoin);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeBoundary(bufferedResponseWriter, diagramNodeJoin);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeInvite(bufferedResponseWriter, diagramNodeJoin);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, diagramNodeJoin);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, diagramNodeJoin);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTransitions(bufferedResponseWriter, diagramNodeJoin);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderType(bufferedResponseWriter, diagramNodeJoin);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderWidth(bufferedResponseWriter, diagramNodeJoin);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderZIndex(bufferedResponseWriter, diagramNodeJoin);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, diagramNodeJoin);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderBuilder(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderString(responseWriter, "builder", diagramNodeJoin.getBuilder());
	}

	protected void renderConnectors(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderString(responseWriter, "connectors", diagramNodeJoin.getConnectors());
	}

	protected void renderControlsToolbar(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderObject(responseWriter, "controlsToolbar", diagramNodeJoin.getControlsToolbar());
	}

	protected void renderDescription(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderString(responseWriter, "description", diagramNodeJoin.getDescription());
	}

	protected void renderGraphic(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderObject(responseWriter, "graphic", diagramNodeJoin.getGraphic());
	}

	protected void renderHeight(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderNumber(responseWriter, "height", diagramNodeJoin.getHeight());
	}

	protected void renderHighlightBoundaryStroke(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderObject(responseWriter, "highlightBoundaryStroke", diagramNodeJoin.getHighlightBoundaryStroke());
	}

	protected void renderHighlighted(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderBoolean(responseWriter, "highlighted", diagramNodeJoin.getHighlighted());
	}

	protected void renderName(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderString(responseWriter, "name", diagramNodeJoin.getName());
	}

	protected void renderRequired(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderBoolean(responseWriter, "required", diagramNodeJoin.getRequired());
	}

	protected void renderSelected(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderBoolean(responseWriter, "selected", diagramNodeJoin.getSelected());
	}

	protected void renderShapeBoundary(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderObject(responseWriter, "shapeBoundary", diagramNodeJoin.getShapeBoundary());
	}

	protected void renderShapeInvite(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderObject(responseWriter, "shapeInvite", diagramNodeJoin.getShapeInvite());
	}

	protected void renderStrings(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderObject(responseWriter, "strings", diagramNodeJoin.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderNumber(responseWriter, "tabIndex", diagramNodeJoin.getTabIndex());
	}

	protected void renderTransitions(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderString(responseWriter, "transitions", diagramNodeJoin.getTransitions());
	}

	protected void renderType(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderString(responseWriter, "type", diagramNodeJoin.getType());
	}

	protected void renderWidth(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderNumber(responseWriter, "width", diagramNodeJoin.getWidth());
	}

	protected void renderZIndex(ResponseWriter responseWriter, DiagramNodeJoin diagramNodeJoin) throws IOException {
		renderNumber(responseWriter, "zIndex", diagramNodeJoin.getZIndex());
	}

}