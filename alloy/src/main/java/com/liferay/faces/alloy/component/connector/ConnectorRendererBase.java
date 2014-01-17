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
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class ConnectorRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-connector";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Connector connector = (Connector) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var connector = new A.Connector");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderArrowPoints(renderedAttributes, connector);
		renderBuilder(renderedAttributes, connector);
		renderColor(renderedAttributes, connector);
		renderCoord(renderedAttributes, connector);
		renderDestroyed(renderedAttributes, connector);
		renderGraphic(renderedAttributes, connector);
		renderInitialized(renderedAttributes, connector);
		renderLazyDraw(renderedAttributes, connector);
		renderName(renderedAttributes, connector);
		renderNodeName(renderedAttributes, connector);
		renderP1(renderedAttributes, connector);
		renderP2(renderedAttributes, connector);
		renderSelected(renderedAttributes, connector);
		renderShape(renderedAttributes, connector);
		renderShapeArrow(renderedAttributes, connector);
		renderShapeArrowHover(renderedAttributes, connector);
		renderShapeArrowSelected(renderedAttributes, connector);
		renderShapeHover(renderedAttributes, connector);
		renderShapeSelected(renderedAttributes, connector);
		renderShowName(renderedAttributes, connector);
		renderTransition(renderedAttributes, connector);
		renderVisible(renderedAttributes, connector);

		Iterator<String> it = renderedAttributes.iterator();

		while (it.hasNext()) {
			responseWriter.write(it.next());

			if (it.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(".render()");
		responseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderArrowPoints(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String arrowPoints = connector.getArrowPoints();

		if (arrowPoints != null) {
			renderedAttributes.add(renderString(Connector.ARROW_POINTS, arrowPoints));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String builder = connector.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderString(Connector.BUILDER, builder));
		}
	}

	protected void renderColor(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String color = connector.getColor();

		if (color != null) {
			renderedAttributes.add(renderString(Connector.COLOR, color));
		}
	}

	protected void renderCoord(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String coord = connector.getCoord();

		if (coord != null) {
			renderedAttributes.add(renderString(Connector.COORD, coord));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Boolean destroyed = connector.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Connector.DESTROYED, destroyed));
		}
	}

	protected void renderGraphic(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Object graphic = connector.getGraphic();

		if (graphic != null) {
			renderedAttributes.add(renderString(Connector.GRAPHIC, graphic));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Boolean initialized = connector.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Connector.INITIALIZED, initialized));
		}
	}

	protected void renderLazyDraw(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Boolean lazyDraw = connector.getLazyDraw();

		if (lazyDraw != null) {
			renderedAttributes.add(renderBoolean(Connector.LAZY_DRAW, lazyDraw));
		}
	}

	protected void renderName(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String name = connector.getName();

		if (name != null) {
			renderedAttributes.add(renderString(Connector.NAME, name));
		}
	}

	protected void renderNodeName(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String nodeName = connector.getNodeName();

		if (nodeName != null) {
			renderedAttributes.add(renderString(Connector.NODE_NAME, nodeName));
		}
	}

	protected void renderP1(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Object p1 = connector.getP1();

		if (p1 != null) {
			renderedAttributes.add(renderArray(Connector.P1, p1));
		}
	}

	protected void renderP2(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Object p2 = connector.getP2();

		if (p2 != null) {
			renderedAttributes.add(renderArray(Connector.P2, p2));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Boolean selected = connector.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(Connector.SELECTED, selected));
		}
	}

	protected void renderShape(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String shape = connector.getShape();

		if (shape != null) {
			renderedAttributes.add(renderString(Connector.SHAPE, shape));
		}
	}

	protected void renderShapeArrow(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String shapeArrow = connector.getShapeArrow();

		if (shapeArrow != null) {
			renderedAttributes.add(renderString(Connector.SHAPE_ARROW, shapeArrow));
		}
	}

	protected void renderShapeArrowHover(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Object shapeArrowHover = connector.getShapeArrowHover();

		if (shapeArrowHover != null) {
			renderedAttributes.add(renderObject(Connector.SHAPE_ARROW_HOVER, shapeArrowHover));
		}
	}

	protected void renderShapeArrowSelected(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Object shapeArrowSelected = connector.getShapeArrowSelected();

		if (shapeArrowSelected != null) {
			renderedAttributes.add(renderObject(Connector.SHAPE_ARROW_SELECTED, shapeArrowSelected));
		}
	}

	protected void renderShapeHover(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Object shapeHover = connector.getShapeHover();

		if (shapeHover != null) {
			renderedAttributes.add(renderObject(Connector.SHAPE_HOVER, shapeHover));
		}
	}

	protected void renderShapeSelected(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Object shapeSelected = connector.getShapeSelected();

		if (shapeSelected != null) {
			renderedAttributes.add(renderObject(Connector.SHAPE_SELECTED, shapeSelected));
		}
	}

	protected void renderShowName(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Boolean showName = connector.getShowName();

		if (showName != null) {
			renderedAttributes.add(renderBoolean(Connector.SHOW_NAME, showName));
		}
	}

	protected void renderTransition(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Object transition = connector.getTransition();

		if (transition != null) {
			renderedAttributes.add(renderObject(Connector.TRANSITION, transition));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Boolean visible = connector.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(Connector.VISIBLE, visible));
		}
	}

}