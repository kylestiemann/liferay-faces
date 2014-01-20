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

		if (connector.getArrowPoints() != null) {
			renderArrowPoints(renderedAttributes, connector);
		}
		
		if (connector.getBuilder() != null) {
			renderBuilder(renderedAttributes, connector);
		}
		
		if (connector.getColor() != null) {
			renderColor(renderedAttributes, connector);
		}
		
		if (connector.getCoord() != null) {
			renderCoord(renderedAttributes, connector);
		}
		
		if (connector.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, connector);
		}
		
		if (connector.getGraphic() != null) {
			renderGraphic(renderedAttributes, connector);
		}
		
		if (connector.getInitialized() != null) {
			renderInitialized(renderedAttributes, connector);
		}
		
		if (connector.getLazyDraw() != null) {
			renderLazyDraw(renderedAttributes, connector);
		}
		
		if (connector.getName() != null) {
			renderName(renderedAttributes, connector);
		}
		
		if (connector.getNodeName() != null) {
			renderNodeName(renderedAttributes, connector);
		}
		
		if (connector.getP1() != null) {
			renderP1(renderedAttributes, connector);
		}
		
		if (connector.getP2() != null) {
			renderP2(renderedAttributes, connector);
		}
		
		if (connector.getSelected() != null) {
			renderSelected(renderedAttributes, connector);
		}
		
		if (connector.getShape() != null) {
			renderShape(renderedAttributes, connector);
		}
		
		if (connector.getShapeArrow() != null) {
			renderShapeArrow(renderedAttributes, connector);
		}
		
		if (connector.getShapeArrowHover() != null) {
			renderShapeArrowHover(renderedAttributes, connector);
		}
		
		if (connector.getShapeArrowSelected() != null) {
			renderShapeArrowSelected(renderedAttributes, connector);
		}
		
		if (connector.getShapeHover() != null) {
			renderShapeHover(renderedAttributes, connector);
		}
		
		if (connector.getShapeSelected() != null) {
			renderShapeSelected(renderedAttributes, connector);
		}
		
		if (connector.getShowName() != null) {
			renderShowName(renderedAttributes, connector);
		}
		
		if (connector.getTransition() != null) {
			renderTransition(renderedAttributes, connector);
		}
		
		if (connector.getVisible() != null) {
			renderVisible(renderedAttributes, connector);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (connector.getAfterArrowPointsChange() != null) {
			renderAfterArrowPointsChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterColorChange() != null) {
			renderAfterColorChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterCoordChange() != null) {
			renderAfterCoordChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterGraphicChange() != null) {
			renderAfterGraphicChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterLazyDrawChange() != null) {
			renderAfterLazyDrawChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterNodeNameChange() != null) {
			renderAfterNodeNameChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterP1Change() != null) {
			renderAfterP1Change(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterP2Change() != null) {
			renderAfterP2Change(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterShapeChange() != null) {
			renderAfterShapeChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterShapeArrowChange() != null) {
			renderAfterShapeArrowChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterShapeArrowHoverChange() != null) {
			renderAfterShapeArrowHoverChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterShapeArrowSelectedChange() != null) {
			renderAfterShapeArrowSelectedChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterShapeHoverChange() != null) {
			renderAfterShapeHoverChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterShapeSelectedChange() != null) {
			renderAfterShapeSelectedChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterShowNameChange() != null) {
			renderAfterShowNameChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterTransitionChange() != null) {
			renderAfterTransitionChange(renderedAfterEvents, connector);
		}
		
		if (connector.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, connector);
		}
		

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

		if (connector.getOnArrowPointsChange() != null) {
			renderOnArrowPointsChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnColorChange() != null) {
			renderOnColorChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnCoordChange() != null) {
			renderOnCoordChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnGraphicChange() != null) {
			renderOnGraphicChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnLazyDrawChange() != null) {
			renderOnLazyDrawChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnNodeNameChange() != null) {
			renderOnNodeNameChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnP1Change() != null) {
			renderOnP1Change(renderedOnEvents, connector);
		}
		
		if (connector.getOnP2Change() != null) {
			renderOnP2Change(renderedOnEvents, connector);
		}
		
		if (connector.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnShapeChange() != null) {
			renderOnShapeChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnShapeArrowChange() != null) {
			renderOnShapeArrowChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnShapeArrowHoverChange() != null) {
			renderOnShapeArrowHoverChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnShapeArrowSelectedChange() != null) {
			renderOnShapeArrowSelectedChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnShapeHoverChange() != null) {
			renderOnShapeHoverChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnShapeSelectedChange() != null) {
			renderOnShapeSelectedChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnShowNameChange() != null) {
			renderOnShowNameChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnTransitionChange() != null) {
			renderOnTransitionChange(renderedOnEvents, connector);
		}
		
		if (connector.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, connector);
		}
		

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
		renderedAttributes.add(renderString(Connector.ARROW_POINTS, arrowPoints));
	}

	protected void renderBuilder(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String builder = connector.getBuilder();
		renderedAttributes.add(renderString(Connector.BUILDER, builder));
	}

	protected void renderColor(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String color = connector.getColor();
		renderedAttributes.add(renderString(Connector.COLOR, color));
	}

	protected void renderCoord(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String coord = connector.getCoord();
		renderedAttributes.add(renderString(Connector.COORD, coord));
	}

	protected void renderDestroyed(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Boolean destroyed = connector.getDestroyed();
		renderedAttributes.add(renderBoolean(Connector.DESTROYED, destroyed));
	}

	protected void renderGraphic(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Object graphic = connector.getGraphic();
		renderedAttributes.add(renderString(Connector.GRAPHIC, graphic));
	}

	protected void renderInitialized(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Boolean initialized = connector.getInitialized();
		renderedAttributes.add(renderBoolean(Connector.INITIALIZED, initialized));
	}

	protected void renderLazyDraw(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Boolean lazyDraw = connector.getLazyDraw();
		renderedAttributes.add(renderBoolean(Connector.LAZY_DRAW, lazyDraw));
	}

	protected void renderName(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String name = connector.getName();
		renderedAttributes.add(renderString(Connector.NAME, name));
	}

	protected void renderNodeName(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String nodeName = connector.getNodeName();
		renderedAttributes.add(renderString(Connector.NODE_NAME, nodeName));
	}

	protected void renderP1(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Object p1 = connector.getP1();
		renderedAttributes.add(renderArray(Connector.P1, p1));
	}

	protected void renderP2(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Object p2 = connector.getP2();
		renderedAttributes.add(renderArray(Connector.P2, p2));
	}

	protected void renderSelected(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Boolean selected = connector.getSelected();
		renderedAttributes.add(renderBoolean(Connector.SELECTED, selected));
	}

	protected void renderShape(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String shape = connector.getShape();
		renderedAttributes.add(renderString(Connector.SHAPE, shape));
	}

	protected void renderShapeArrow(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String shapeArrow = connector.getShapeArrow();
		renderedAttributes.add(renderString(Connector.SHAPE_ARROW, shapeArrow));
	}

	protected void renderShapeArrowHover(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Object shapeArrowHover = connector.getShapeArrowHover();
		renderedAttributes.add(renderObject(Connector.SHAPE_ARROW_HOVER, shapeArrowHover));
	}

	protected void renderShapeArrowSelected(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Object shapeArrowSelected = connector.getShapeArrowSelected();
		renderedAttributes.add(renderObject(Connector.SHAPE_ARROW_SELECTED, shapeArrowSelected));
	}

	protected void renderShapeHover(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Object shapeHover = connector.getShapeHover();
		renderedAttributes.add(renderObject(Connector.SHAPE_HOVER, shapeHover));
	}

	protected void renderShapeSelected(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Object shapeSelected = connector.getShapeSelected();
		renderedAttributes.add(renderObject(Connector.SHAPE_SELECTED, shapeSelected));
	}

	protected void renderShowName(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Boolean showName = connector.getShowName();
		renderedAttributes.add(renderBoolean(Connector.SHOW_NAME, showName));
	}

	protected void renderTransition(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Object transition = connector.getTransition();
		renderedAttributes.add(renderObject(Connector.TRANSITION, transition));
	}

	protected void renderVisible(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.Boolean visible = connector.getVisible();
		renderedAttributes.add(renderBoolean(Connector.VISIBLE, visible));
	}

	protected void renderAfterArrowPointsChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterArrowPointsChange = connector.getAfterArrowPointsChange();
		renderedAttributes.add(renderString(Connector.AFTER_ARROW_POINTS_CHANGE, afterArrowPointsChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterBuilderChange = connector.getAfterBuilderChange();
		renderedAttributes.add(renderString(Connector.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterColorChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterColorChange = connector.getAfterColorChange();
		renderedAttributes.add(renderString(Connector.AFTER_COLOR_CHANGE, afterColorChange));
	}

	protected void renderAfterCoordChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterCoordChange = connector.getAfterCoordChange();
		renderedAttributes.add(renderString(Connector.AFTER_COORD_CHANGE, afterCoordChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterDestroyedChange = connector.getAfterDestroyedChange();
		renderedAttributes.add(renderString(Connector.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterGraphicChange = connector.getAfterGraphicChange();
		renderedAttributes.add(renderString(Connector.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterInitializedChange = connector.getAfterInitializedChange();
		renderedAttributes.add(renderString(Connector.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLazyDrawChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterLazyDrawChange = connector.getAfterLazyDrawChange();
		renderedAttributes.add(renderString(Connector.AFTER_LAZY_DRAW_CHANGE, afterLazyDrawChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterNameChange = connector.getAfterNameChange();
		renderedAttributes.add(renderString(Connector.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterNodeNameChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterNodeNameChange = connector.getAfterNodeNameChange();
		renderedAttributes.add(renderString(Connector.AFTER_NODE_NAME_CHANGE, afterNodeNameChange));
	}

	protected void renderAfterP1Change(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterP1Change = connector.getAfterP1Change();
		renderedAttributes.add(renderString(Connector.AFTER_P1_CHANGE, afterP1Change));
	}

	protected void renderAfterP2Change(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterP2Change = connector.getAfterP2Change();
		renderedAttributes.add(renderString(Connector.AFTER_P2_CHANGE, afterP2Change));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterSelectedChange = connector.getAfterSelectedChange();
		renderedAttributes.add(renderString(Connector.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShapeChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterShapeChange = connector.getAfterShapeChange();
		renderedAttributes.add(renderString(Connector.AFTER_SHAPE_CHANGE, afterShapeChange));
	}

	protected void renderAfterShapeArrowChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterShapeArrowChange = connector.getAfterShapeArrowChange();
		renderedAttributes.add(renderString(Connector.AFTER_SHAPE_ARROW_CHANGE, afterShapeArrowChange));
	}

	protected void renderAfterShapeArrowHoverChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterShapeArrowHoverChange = connector.getAfterShapeArrowHoverChange();
		renderedAttributes.add(renderString(Connector.AFTER_SHAPE_ARROW_HOVER_CHANGE, afterShapeArrowHoverChange));
	}

	protected void renderAfterShapeArrowSelectedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterShapeArrowSelectedChange = connector.getAfterShapeArrowSelectedChange();
		renderedAttributes.add(renderString(Connector.AFTER_SHAPE_ARROW_SELECTED_CHANGE, afterShapeArrowSelectedChange));
	}

	protected void renderAfterShapeHoverChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterShapeHoverChange = connector.getAfterShapeHoverChange();
		renderedAttributes.add(renderString(Connector.AFTER_SHAPE_HOVER_CHANGE, afterShapeHoverChange));
	}

	protected void renderAfterShapeSelectedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterShapeSelectedChange = connector.getAfterShapeSelectedChange();
		renderedAttributes.add(renderString(Connector.AFTER_SHAPE_SELECTED_CHANGE, afterShapeSelectedChange));
	}

	protected void renderAfterShowNameChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterShowNameChange = connector.getAfterShowNameChange();
		renderedAttributes.add(renderString(Connector.AFTER_SHOW_NAME_CHANGE, afterShowNameChange));
	}

	protected void renderAfterTransitionChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterTransitionChange = connector.getAfterTransitionChange();
		renderedAttributes.add(renderString(Connector.AFTER_TRANSITION_CHANGE, afterTransitionChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String afterVisibleChange = connector.getAfterVisibleChange();
		renderedAttributes.add(renderString(Connector.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderOnArrowPointsChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onArrowPointsChange = connector.getOnArrowPointsChange();
		renderedAttributes.add(renderString(Connector.ON_ARROW_POINTS_CHANGE, onArrowPointsChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onBuilderChange = connector.getOnBuilderChange();
		renderedAttributes.add(renderString(Connector.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnColorChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onColorChange = connector.getOnColorChange();
		renderedAttributes.add(renderString(Connector.ON_COLOR_CHANGE, onColorChange));
	}

	protected void renderOnCoordChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onCoordChange = connector.getOnCoordChange();
		renderedAttributes.add(renderString(Connector.ON_COORD_CHANGE, onCoordChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onDestroyedChange = connector.getOnDestroyedChange();
		renderedAttributes.add(renderString(Connector.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onGraphicChange = connector.getOnGraphicChange();
		renderedAttributes.add(renderString(Connector.ON_GRAPHIC_CHANGE, onGraphicChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onInitializedChange = connector.getOnInitializedChange();
		renderedAttributes.add(renderString(Connector.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLazyDrawChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onLazyDrawChange = connector.getOnLazyDrawChange();
		renderedAttributes.add(renderString(Connector.ON_LAZY_DRAW_CHANGE, onLazyDrawChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onNameChange = connector.getOnNameChange();
		renderedAttributes.add(renderString(Connector.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnNodeNameChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onNodeNameChange = connector.getOnNodeNameChange();
		renderedAttributes.add(renderString(Connector.ON_NODE_NAME_CHANGE, onNodeNameChange));
	}

	protected void renderOnP1Change(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onP1Change = connector.getOnP1Change();
		renderedAttributes.add(renderString(Connector.ON_P1_CHANGE, onP1Change));
	}

	protected void renderOnP2Change(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onP2Change = connector.getOnP2Change();
		renderedAttributes.add(renderString(Connector.ON_P2_CHANGE, onP2Change));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onSelectedChange = connector.getOnSelectedChange();
		renderedAttributes.add(renderString(Connector.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShapeChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onShapeChange = connector.getOnShapeChange();
		renderedAttributes.add(renderString(Connector.ON_SHAPE_CHANGE, onShapeChange));
	}

	protected void renderOnShapeArrowChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onShapeArrowChange = connector.getOnShapeArrowChange();
		renderedAttributes.add(renderString(Connector.ON_SHAPE_ARROW_CHANGE, onShapeArrowChange));
	}

	protected void renderOnShapeArrowHoverChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onShapeArrowHoverChange = connector.getOnShapeArrowHoverChange();
		renderedAttributes.add(renderString(Connector.ON_SHAPE_ARROW_HOVER_CHANGE, onShapeArrowHoverChange));
	}

	protected void renderOnShapeArrowSelectedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onShapeArrowSelectedChange = connector.getOnShapeArrowSelectedChange();
		renderedAttributes.add(renderString(Connector.ON_SHAPE_ARROW_SELECTED_CHANGE, onShapeArrowSelectedChange));
	}

	protected void renderOnShapeHoverChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onShapeHoverChange = connector.getOnShapeHoverChange();
		renderedAttributes.add(renderString(Connector.ON_SHAPE_HOVER_CHANGE, onShapeHoverChange));
	}

	protected void renderOnShapeSelectedChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onShapeSelectedChange = connector.getOnShapeSelectedChange();
		renderedAttributes.add(renderString(Connector.ON_SHAPE_SELECTED_CHANGE, onShapeSelectedChange));
	}

	protected void renderOnShowNameChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onShowNameChange = connector.getOnShowNameChange();
		renderedAttributes.add(renderString(Connector.ON_SHOW_NAME_CHANGE, onShowNameChange));
	}

	protected void renderOnTransitionChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onTransitionChange = connector.getOnTransitionChange();
		renderedAttributes.add(renderString(Connector.ON_TRANSITION_CHANGE, onTransitionChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Connector connector) throws IOException {
		java.lang.String onVisibleChange = connector.getOnVisibleChange();
		renderedAttributes.add(renderString(Connector.ON_VISIBLE_CHANGE, onVisibleChange));
	}

}