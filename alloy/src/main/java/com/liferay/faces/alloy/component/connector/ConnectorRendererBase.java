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
package com.liferay.faces.alloy.component.connector;

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
public abstract class ConnectorRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-connector";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Connector connector = (Connector) uiComponent;
		encodeHTML(facesContext, connector);
		encodeJavaScript(facesContext, connector);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Connector connector) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Connector connector) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, connector);

		bufferedResponseWriter.write("var connector = new Y.Connector");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderArrowPoints(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderBuilder(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderColor(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCoord(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderGraphic(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLazyDraw(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderName(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNodeName(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderP1(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderP2(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelected(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShape(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeArrow(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeArrowHover(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeArrowSelected(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeHover(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShapeSelected(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShowName(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTransition(bufferedResponseWriter, connector);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderVisible(bufferedResponseWriter, connector);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, connector);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderArrowPoints(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderString(responseWriter, "arrowPoints", connector.getArrowPoints());
	}

	protected void renderBuilder(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderString(responseWriter, "builder", connector.getBuilder());
	}

	protected void renderColor(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderString(responseWriter, "color", connector.getColor());
	}

	protected void renderCoord(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderString(responseWriter, "coord", connector.getCoord());
	}

	protected void renderGraphic(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderString(responseWriter, "graphic", connector.getGraphic());
	}

	protected void renderLazyDraw(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderBoolean(responseWriter, "lazyDraw", connector.getLazyDraw());
	}

	protected void renderName(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderString(responseWriter, "name", connector.getName());
	}

	protected void renderNodeName(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderString(responseWriter, "nodeName", connector.getNodeName());
	}

	protected void renderP1(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderArray(responseWriter, "p1", connector.getP1());
	}

	protected void renderP2(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderArray(responseWriter, "p2", connector.getP2());
	}

	protected void renderSelected(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderBoolean(responseWriter, "selected", connector.getSelected());
	}

	protected void renderShape(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderString(responseWriter, "shape", connector.getShape());
	}

	protected void renderShapeArrow(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderString(responseWriter, "shapeArrow", connector.getShapeArrow());
	}

	protected void renderShapeArrowHover(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderObject(responseWriter, "shapeArrowHover", connector.getShapeArrowHover());
	}

	protected void renderShapeArrowSelected(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderObject(responseWriter, "shapeArrowSelected", connector.getShapeArrowSelected());
	}

	protected void renderShapeHover(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderObject(responseWriter, "shapeHover", connector.getShapeHover());
	}

	protected void renderShapeSelected(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderObject(responseWriter, "shapeSelected", connector.getShapeSelected());
	}

	protected void renderShowName(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderBoolean(responseWriter, "showName", connector.getShowName());
	}

	protected void renderTransition(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderObject(responseWriter, "transition", connector.getTransition());
	}

	protected void renderVisible(ResponseWriter responseWriter, Connector connector) throws IOException {
		renderBoolean(responseWriter, "visible", connector.getVisible());
	}

}