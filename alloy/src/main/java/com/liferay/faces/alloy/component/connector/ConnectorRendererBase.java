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
import java.util.ArrayList;
import java.util.Iterator;

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

		bufferedResponseWriter.write("var connector = new A.Connector");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderArrowPoints(renrederedAttributes, connector);
		renderBuilder(renrederedAttributes, connector);
		renderColor(renrederedAttributes, connector);
		renderCoord(renrederedAttributes, connector);
		renderDestroyed(renrederedAttributes, connector);
		renderGraphic(renrederedAttributes, connector);
		renderInitialized(renrederedAttributes, connector);
		renderLazyDraw(renrederedAttributes, connector);
		renderName(renrederedAttributes, connector);
		renderNodeName(renrederedAttributes, connector);
		renderP1(renrederedAttributes, connector);
		renderP2(renrederedAttributes, connector);
		renderSelected(renrederedAttributes, connector);
		renderShape(renrederedAttributes, connector);
		renderShapeArrow(renrederedAttributes, connector);
		renderShapeArrowHover(renrederedAttributes, connector);
		renderShapeArrowSelected(renrederedAttributes, connector);
		renderShapeHover(renrederedAttributes, connector);
		renderShapeSelected(renrederedAttributes, connector);
		renderShowName(renrederedAttributes, connector);
		renderTransition(renrederedAttributes, connector);
		renderVisible(renrederedAttributes, connector);

		Iterator<String> it = renrederedAttributes.iterator();

		while (it.hasNext()) {
			bufferedResponseWriter.write(it.next());

			if (it.hasNext()) {
				bufferedResponseWriter.write(StringPool.COMMA);
			}
		}

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(".render()");
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, connector);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderArrowPoints(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getArrowPoints() != null) {
			renrederedAttributes.add(renderString("arrowPoints", connector.getArrowPoints()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getBuilder() != null) {
			renrederedAttributes.add(renderString("builder", connector.getBuilder()));
		}
	}

	protected void renderColor(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getColor() != null) {
			renrederedAttributes.add(renderString("color", connector.getColor()));
		}
	}

	protected void renderCoord(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getCoord() != null) {
			renrederedAttributes.add(renderString("coord", connector.getCoord()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", connector.getDestroyed()));
		}
	}

	protected void renderGraphic(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getGraphic() != null) {
			renrederedAttributes.add(renderString("graphic", connector.getGraphic()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", connector.getInitialized()));
		}
	}

	protected void renderLazyDraw(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getLazyDraw() != null) {
			renrederedAttributes.add(renderBoolean("lazyDraw", connector.getLazyDraw()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getName() != null) {
			renrederedAttributes.add(renderString("name", connector.getName()));
		}
	}

	protected void renderNodeName(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getNodeName() != null) {
			renrederedAttributes.add(renderString("nodeName", connector.getNodeName()));
		}
	}

	protected void renderP1(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getP1() != null) {
			renrederedAttributes.add(renderArray("p1", connector.getP1()));
		}
	}

	protected void renderP2(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getP2() != null) {
			renrederedAttributes.add(renderArray("p2", connector.getP2()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", connector.getSelected()));
		}
	}

	protected void renderShape(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getShape() != null) {
			renrederedAttributes.add(renderString("shape", connector.getShape()));
		}
	}

	protected void renderShapeArrow(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getShapeArrow() != null) {
			renrederedAttributes.add(renderString("shapeArrow", connector.getShapeArrow()));
		}
	}

	protected void renderShapeArrowHover(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getShapeArrowHover() != null) {
			renrederedAttributes.add(renderObject("shapeArrowHover", connector.getShapeArrowHover()));
		}
	}

	protected void renderShapeArrowSelected(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getShapeArrowSelected() != null) {
			renrederedAttributes.add(renderObject("shapeArrowSelected", connector.getShapeArrowSelected()));
		}
	}

	protected void renderShapeHover(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getShapeHover() != null) {
			renrederedAttributes.add(renderObject("shapeHover", connector.getShapeHover()));
		}
	}

	protected void renderShapeSelected(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getShapeSelected() != null) {
			renrederedAttributes.add(renderObject("shapeSelected", connector.getShapeSelected()));
		}
	}

	protected void renderShowName(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getShowName() != null) {
			renrederedAttributes.add(renderBoolean("showName", connector.getShowName()));
		}
	}

	protected void renderTransition(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getTransition() != null) {
			renrederedAttributes.add(renderObject("transition", connector.getTransition()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, Connector connector) throws IOException {
		if (connector.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", connector.getVisible()));
		}
	}

}