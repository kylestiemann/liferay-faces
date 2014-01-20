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

import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
@ResourceDependency(library = "aui", name = "aui.js")
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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterArrowPointsChange(renderedAfterEvents, connector);
		renderAfterBuilderChange(renderedAfterEvents, connector);
		renderAfterColorChange(renderedAfterEvents, connector);
		renderAfterCoordChange(renderedAfterEvents, connector);
		renderAfterDestroyedChange(renderedAfterEvents, connector);
		renderAfterGraphicChange(renderedAfterEvents, connector);
		renderAfterInitializedChange(renderedAfterEvents, connector);
		renderAfterLazyDrawChange(renderedAfterEvents, connector);
		renderAfterNameChange(renderedAfterEvents, connector);
		renderAfterNodeNameChange(renderedAfterEvents, connector);
		renderAfterP1Change(renderedAfterEvents, connector);
		renderAfterP2Change(renderedAfterEvents, connector);
		renderAfterSelectedChange(renderedAfterEvents, connector);
		renderAfterShapeChange(renderedAfterEvents, connector);
		renderAfterShapeArrowChange(renderedAfterEvents, connector);
		renderAfterShapeArrowHoverChange(renderedAfterEvents, connector);
		renderAfterShapeArrowSelectedChange(renderedAfterEvents, connector);
		renderAfterShapeHoverChange(renderedAfterEvents, connector);
		renderAfterShapeSelectedChange(renderedAfterEvents, connector);
		renderAfterShowNameChange(renderedAfterEvents, connector);
		renderAfterTransitionChange(renderedAfterEvents, connector);
		renderAfterVisibleChange(renderedAfterEvents, connector);

		Iterator<String> afterEventsIterator = renderedAfterEvents.iterator();

		while (afterEventsIterator.hasNext()) {
			responseWriter.write(afterEventsIterator.next());

			if (afterEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.COMMA);

		responseWriter.write("on");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedOnEvents = new ArrayList<String>();

		renderOnArrowPointsChange(renderedOnEvents, connector);
		renderOnBuilderChange(renderedOnEvents, connector);
		renderOnColorChange(renderedOnEvents, connector);
		renderOnCoordChange(renderedOnEvents, connector);
		renderOnDestroyedChange(renderedOnEvents, connector);
		renderOnGraphicChange(renderedOnEvents, connector);
		renderOnInitializedChange(renderedOnEvents, connector);
		renderOnLazyDrawChange(renderedOnEvents, connector);
		renderOnNameChange(renderedOnEvents, connector);
		renderOnNodeNameChange(renderedOnEvents, connector);
		renderOnP1Change(renderedOnEvents, connector);
		renderOnP2Change(renderedOnEvents, connector);
		renderOnSelectedChange(renderedOnEvents, connector);
		renderOnShapeChange(renderedOnEvents, connector);
		renderOnShapeArrowChange(renderedOnEvents, connector);
		renderOnShapeArrowHoverChange(renderedOnEvents, connector);
		renderOnShapeArrowSelectedChange(renderedOnEvents, connector);
		renderOnShapeHoverChange(renderedOnEvents, connector);
		renderOnShapeSelectedChange(renderedOnEvents, connector);
		renderOnShowNameChange(renderedOnEvents, connector);
		renderOnTransitionChange(renderedOnEvents, connector);
		renderOnVisibleChange(renderedOnEvents, connector);

		Iterator<String> onEventsIterator = renderedOnEvents.iterator();

		while (onEventsIterator.hasNext()) {
			responseWriter.write(onEventsIterator.next());

			if (onEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
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

	protected void renderAfterArrowPointsChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterArrowPointsChange = connector.getAfterArrowPointsChange();

		if (afterArrowPointsChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_ARROW_POINTS_CHANGE, afterArrowPointsChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterBuilderChange = connector.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterColorChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterColorChange = connector.getAfterColorChange();

		if (afterColorChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_COLOR_CHANGE, afterColorChange));
		}
	}

	protected void renderAfterCoordChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterCoordChange = connector.getAfterCoordChange();

		if (afterCoordChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_COORD_CHANGE, afterCoordChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterDestroyedChange = connector.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterGraphicChange = connector.getAfterGraphicChange();

		if (afterGraphicChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterInitializedChange = connector.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLazyDrawChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterLazyDrawChange = connector.getAfterLazyDrawChange();

		if (afterLazyDrawChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_LAZY_DRAW_CHANGE, afterLazyDrawChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterNameChange = connector.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterNodeNameChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterNodeNameChange = connector.getAfterNodeNameChange();

		if (afterNodeNameChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_NODE_NAME_CHANGE, afterNodeNameChange));
		}
	}

	protected void renderAfterP1Change(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterP1Change = connector.getAfterP1Change();

		if (afterP1Change != null) {
			renderedAttributes.add(renderString(Connector.AFTER_P1_CHANGE, afterP1Change));
		}
	}

	protected void renderAfterP2Change(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterP2Change = connector.getAfterP2Change();

		if (afterP2Change != null) {
			renderedAttributes.add(renderString(Connector.AFTER_P2_CHANGE, afterP2Change));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterSelectedChange = connector.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShapeChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterShapeChange = connector.getAfterShapeChange();

		if (afterShapeChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_SHAPE_CHANGE, afterShapeChange));
		}
	}

	protected void renderAfterShapeArrowChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterShapeArrowChange = connector.getAfterShapeArrowChange();

		if (afterShapeArrowChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_SHAPE_ARROW_CHANGE, afterShapeArrowChange));
		}
	}

	protected void renderAfterShapeArrowHoverChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterShapeArrowHoverChange = connector.getAfterShapeArrowHoverChange();

		if (afterShapeArrowHoverChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_SHAPE_ARROW_HOVER_CHANGE, afterShapeArrowHoverChange));
		}
	}

	protected void renderAfterShapeArrowSelectedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterShapeArrowSelectedChange = connector.getAfterShapeArrowSelectedChange();

		if (afterShapeArrowSelectedChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_SHAPE_ARROW_SELECTED_CHANGE, afterShapeArrowSelectedChange));
		}
	}

	protected void renderAfterShapeHoverChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterShapeHoverChange = connector.getAfterShapeHoverChange();

		if (afterShapeHoverChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_SHAPE_HOVER_CHANGE, afterShapeHoverChange));
		}
	}

	protected void renderAfterShapeSelectedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterShapeSelectedChange = connector.getAfterShapeSelectedChange();

		if (afterShapeSelectedChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_SHAPE_SELECTED_CHANGE, afterShapeSelectedChange));
		}
	}

	protected void renderAfterShowNameChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterShowNameChange = connector.getAfterShowNameChange();

		if (afterShowNameChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_SHOW_NAME_CHANGE, afterShowNameChange));
		}
	}

	protected void renderAfterTransitionChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterTransitionChange = connector.getAfterTransitionChange();

		if (afterTransitionChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_TRANSITION_CHANGE, afterTransitionChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterVisibleChange = connector.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(Connector.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderOnArrowPointsChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onArrowPointsChange = connector.getOnArrowPointsChange();

		if (onArrowPointsChange != null) {
			renderedAttributes.add(renderString(Connector.ON_ARROW_POINTS_CHANGE, onArrowPointsChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onBuilderChange = connector.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(Connector.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnColorChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onColorChange = connector.getOnColorChange();

		if (onColorChange != null) {
			renderedAttributes.add(renderString(Connector.ON_COLOR_CHANGE, onColorChange));
		}
	}

	protected void renderOnCoordChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onCoordChange = connector.getOnCoordChange();

		if (onCoordChange != null) {
			renderedAttributes.add(renderString(Connector.ON_COORD_CHANGE, onCoordChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onDestroyedChange = connector.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(Connector.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onGraphicChange = connector.getOnGraphicChange();

		if (onGraphicChange != null) {
			renderedAttributes.add(renderString(Connector.ON_GRAPHIC_CHANGE, onGraphicChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onInitializedChange = connector.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(Connector.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLazyDrawChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onLazyDrawChange = connector.getOnLazyDrawChange();

		if (onLazyDrawChange != null) {
			renderedAttributes.add(renderString(Connector.ON_LAZY_DRAW_CHANGE, onLazyDrawChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onNameChange = connector.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(Connector.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnNodeNameChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onNodeNameChange = connector.getOnNodeNameChange();

		if (onNodeNameChange != null) {
			renderedAttributes.add(renderString(Connector.ON_NODE_NAME_CHANGE, onNodeNameChange));
		}
	}

	protected void renderOnP1Change(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onP1Change = connector.getOnP1Change();

		if (onP1Change != null) {
			renderedAttributes.add(renderString(Connector.ON_P1_CHANGE, onP1Change));
		}
	}

	protected void renderOnP2Change(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onP2Change = connector.getOnP2Change();

		if (onP2Change != null) {
			renderedAttributes.add(renderString(Connector.ON_P2_CHANGE, onP2Change));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onSelectedChange = connector.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(Connector.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShapeChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onShapeChange = connector.getOnShapeChange();

		if (onShapeChange != null) {
			renderedAttributes.add(renderString(Connector.ON_SHAPE_CHANGE, onShapeChange));
		}
	}

	protected void renderOnShapeArrowChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onShapeArrowChange = connector.getOnShapeArrowChange();

		if (onShapeArrowChange != null) {
			renderedAttributes.add(renderString(Connector.ON_SHAPE_ARROW_CHANGE, onShapeArrowChange));
		}
	}

	protected void renderOnShapeArrowHoverChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onShapeArrowHoverChange = connector.getOnShapeArrowHoverChange();

		if (onShapeArrowHoverChange != null) {
			renderedAttributes.add(renderString(Connector.ON_SHAPE_ARROW_HOVER_CHANGE, onShapeArrowHoverChange));
		}
	}

	protected void renderOnShapeArrowSelectedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onShapeArrowSelectedChange = connector.getOnShapeArrowSelectedChange();

		if (onShapeArrowSelectedChange != null) {
			renderedAttributes.add(renderString(Connector.ON_SHAPE_ARROW_SELECTED_CHANGE, onShapeArrowSelectedChange));
		}
	}

	protected void renderOnShapeHoverChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onShapeHoverChange = connector.getOnShapeHoverChange();

		if (onShapeHoverChange != null) {
			renderedAttributes.add(renderString(Connector.ON_SHAPE_HOVER_CHANGE, onShapeHoverChange));
		}
	}

	protected void renderOnShapeSelectedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onShapeSelectedChange = connector.getOnShapeSelectedChange();

		if (onShapeSelectedChange != null) {
			renderedAttributes.add(renderString(Connector.ON_SHAPE_SELECTED_CHANGE, onShapeSelectedChange));
		}
	}

	protected void renderOnShowNameChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onShowNameChange = connector.getOnShowNameChange();

		if (onShowNameChange != null) {
			renderedAttributes.add(renderString(Connector.ON_SHOW_NAME_CHANGE, onShowNameChange));
		}
	}

	protected void renderOnTransitionChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onTransitionChange = connector.getOnTransitionChange();

		if (onTransitionChange != null) {
			renderedAttributes.add(renderString(Connector.ON_TRANSITION_CHANGE, onTransitionChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onVisibleChange = connector.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(Connector.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

}