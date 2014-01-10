/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class ConnectorBase extends javax.faces.component.UIPanel {

	private static final String ARROW_POINTS = "arrowPoints";
	private static final String BUILDER = "builder";
	private static final String COLOR = "color";
	private static final String COORD = "coord";
	private static final String GRAPHIC = "graphic";
	private static final String LAZY_DRAW = "lazyDraw";
	private static final String NAME = "name";
	private static final String NODE_NAME = "nodeName";
	private static final String P1 = "p1";
	private static final String P2 = "p2";
	private static final String SELECTED = "selected";
	private static final String SHAPE = "shape";
	private static final String SHAPE_ARROW = "shapeArrow";
	private static final String SHAPE_ARROW_HOVER = "shapeArrowHover";
	private static final String SHAPE_ARROW_SELECTED = "shapeArrowSelected";
	private static final String SHAPE_HOVER = "shapeHover";
	private static final String SHAPE_SELECTED = "shapeSelected";
	private static final String SHOW_NAME = "showName";
	private static final String TRANSITION = "transition";
	private static final String VISIBLE = "visible";
	private static final String AFTER_ARROW_POINTS_CHANGE = "afterArrowPointsChange";
	private static final String AFTER_BUILDER_CHANGE = "afterBuilderChange";
	private static final String AFTER_COLOR_CHANGE = "afterColorChange";
	private static final String AFTER_COORD_CHANGE = "afterCoordChange";
	private static final String AFTER_GRAPHIC_CHANGE = "afterGraphicChange";
	private static final String AFTER_LAZY_DRAW_CHANGE = "afterLazyDrawChange";
	private static final String AFTER_NAME_CHANGE = "afterNameChange";
	private static final String AFTER_NODE_NAME_CHANGE = "afterNodeNameChange";
	private static final String AFTER_P1_CHANGE = "afterP1Change";
	private static final String AFTER_P2_CHANGE = "afterP2Change";
	private static final String AFTER_SELECTED_CHANGE = "afterSelectedChange";
	private static final String AFTER_SHAPE_CHANGE = "afterShapeChange";
	private static final String AFTER_SHAPE_ARROW_CHANGE = "afterShapeArrowChange";
	private static final String AFTER_SHAPE_ARROW_HOVER_CHANGE = "afterShapeArrowHoverChange";
	private static final String AFTER_SHAPE_ARROW_SELECTED_CHANGE = "afterShapeArrowSelectedChange";
	private static final String AFTER_SHAPE_HOVER_CHANGE = "afterShapeHoverChange";
	private static final String AFTER_SHAPE_SELECTED_CHANGE = "afterShapeSelectedChange";
	private static final String AFTER_SHOW_NAME_CHANGE = "afterShowNameChange";
	private static final String AFTER_TRANSITION_CHANGE = "afterTransitionChange";
	private static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	private static final String ON_ARROW_POINTS_CHANGE = "onArrowPointsChange";
	private static final String ON_BUILDER_CHANGE = "onBuilderChange";
	private static final String ON_COLOR_CHANGE = "onColorChange";
	private static final String ON_COORD_CHANGE = "onCoordChange";
	private static final String ON_GRAPHIC_CHANGE = "onGraphicChange";
	private static final String ON_LAZY_DRAW_CHANGE = "onLazyDrawChange";
	private static final String ON_NAME_CHANGE = "onNameChange";
	private static final String ON_NODE_NAME_CHANGE = "onNodeNameChange";
	private static final String ON_P1_CHANGE = "onP1Change";
	private static final String ON_P2_CHANGE = "onP2Change";
	private static final String ON_SELECTED_CHANGE = "onSelectedChange";
	private static final String ON_SHAPE_CHANGE = "onShapeChange";
	private static final String ON_SHAPE_ARROW_CHANGE = "onShapeArrowChange";
	private static final String ON_SHAPE_ARROW_HOVER_CHANGE = "onShapeArrowHoverChange";
	private static final String ON_SHAPE_ARROW_SELECTED_CHANGE = "onShapeArrowSelectedChange";
	private static final String ON_SHAPE_HOVER_CHANGE = "onShapeHoverChange";
	private static final String ON_SHAPE_SELECTED_CHANGE = "onShapeSelectedChange";
	private static final String ON_SHOW_NAME_CHANGE = "onShowNameChange";
	private static final String ON_TRANSITION_CHANGE = "onTransitionChange";
	private static final String ON_VISIBLE_CHANGE = "onVisibleChange";

	protected java.lang.String getArrowPoints() {
		return (java.lang.String) getStateHelper().eval(ARROW_POINTS, null);
	}

	protected void setArrowPoints(java.lang.String arrowPoints) {
		getStateHelper().put(ARROW_POINTS, arrowPoints);
	}

	protected java.lang.Object getBuilder() {
		return (java.lang.Object) getStateHelper().eval(BUILDER, null);
	}

	protected void setBuilder(java.lang.Object builder) {
		getStateHelper().put(BUILDER, builder);
	}

	protected java.lang.String getColor() {
		return (java.lang.String) getStateHelper().eval(COLOR, null);
	}

	protected void setColor(java.lang.String color) {
		getStateHelper().put(COLOR, color);
	}

	protected java.lang.Object getCoord() {
		return (java.lang.Object) getStateHelper().eval(COORD, null);
	}

	protected void setCoord(java.lang.Object coord) {
		getStateHelper().put(COORD, coord);
	}

	protected java.lang.Object getGraphic() {
		return (java.lang.Object) getStateHelper().eval(GRAPHIC, null);
	}

	protected void setGraphic(java.lang.Object graphic) {
		getStateHelper().put(GRAPHIC, graphic);
	}

	protected java.lang.Boolean getLazyDraw() {
		return (java.lang.Boolean) getStateHelper().eval(LAZY_DRAW, null);
	}

	protected void setLazyDraw(java.lang.Boolean lazyDraw) {
		getStateHelper().put(LAZY_DRAW, lazyDraw);
	}

	protected java.lang.String getName() {
		return (java.lang.String) getStateHelper().eval(NAME, null);
	}

	protected void setName(java.lang.String name) {
		getStateHelper().put(NAME, name);
	}

	protected java.lang.String getNodeName() {
		return (java.lang.String) getStateHelper().eval(NODE_NAME, null);
	}

	protected void setNodeName(java.lang.String nodeName) {
		getStateHelper().put(NODE_NAME, nodeName);
	}

	protected java.lang.Object getP1() {
		return (java.lang.Object) getStateHelper().eval(P1, null);
	}

	protected void setP1(java.lang.Object p1) {
		getStateHelper().put(P1, p1);
	}

	protected java.lang.Object getP2() {
		return (java.lang.Object) getStateHelper().eval(P2, null);
	}

	protected void setP2(java.lang.Object p2) {
		getStateHelper().put(P2, p2);
	}

	protected java.lang.Boolean getSelected() {
		return (java.lang.Boolean) getStateHelper().eval(SELECTED, null);
	}

	protected void setSelected(java.lang.Boolean selected) {
		getStateHelper().put(SELECTED, selected);
	}

	protected java.lang.Object getShape() {
		return (java.lang.Object) getStateHelper().eval(SHAPE, null);
	}

	protected void setShape(java.lang.Object shape) {
		getStateHelper().put(SHAPE, shape);
	}

	protected java.lang.Object getShapeArrow() {
		return (java.lang.Object) getStateHelper().eval(SHAPE_ARROW, null);
	}

	protected void setShapeArrow(java.lang.Object shapeArrow) {
		getStateHelper().put(SHAPE_ARROW, shapeArrow);
	}

	protected java.lang.Object getShapeArrowHover() {
		return (java.lang.Object) getStateHelper().eval(SHAPE_ARROW_HOVER, null);
	}

	protected void setShapeArrowHover(java.lang.Object shapeArrowHover) {
		getStateHelper().put(SHAPE_ARROW_HOVER, shapeArrowHover);
	}

	protected java.lang.Object getShapeArrowSelected() {
		return (java.lang.Object) getStateHelper().eval(SHAPE_ARROW_SELECTED, null);
	}

	protected void setShapeArrowSelected(java.lang.Object shapeArrowSelected) {
		getStateHelper().put(SHAPE_ARROW_SELECTED, shapeArrowSelected);
	}

	protected java.lang.Object getShapeHover() {
		return (java.lang.Object) getStateHelper().eval(SHAPE_HOVER, null);
	}

	protected void setShapeHover(java.lang.Object shapeHover) {
		getStateHelper().put(SHAPE_HOVER, shapeHover);
	}

	protected java.lang.Object getShapeSelected() {
		return (java.lang.Object) getStateHelper().eval(SHAPE_SELECTED, null);
	}

	protected void setShapeSelected(java.lang.Object shapeSelected) {
		getStateHelper().put(SHAPE_SELECTED, shapeSelected);
	}

	protected java.lang.Boolean getShowName() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_NAME, null);
	}

	protected void setShowName(java.lang.Boolean showName) {
		getStateHelper().put(SHOW_NAME, showName);
	}

	protected java.lang.Object getTransition() {
		return (java.lang.Object) getStateHelper().eval(TRANSITION, null);
	}

	protected void setTransition(java.lang.Object transition) {
		getStateHelper().put(TRANSITION, transition);
	}

	protected java.lang.Boolean getVisible() {
		return (java.lang.Boolean) getStateHelper().eval(VISIBLE, null);
	}

	protected void setVisible(java.lang.Boolean visible) {
		getStateHelper().put(VISIBLE, visible);
	}

	protected java.lang.String getAfterArrowPointsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ARROW_POINTS_CHANGE, null);
	}

	protected void setAfterArrowPointsChange(java.lang.String afterArrowPointsChange) {
		getStateHelper().put(AFTER_ARROW_POINTS_CHANGE, afterArrowPointsChange);
	}

	protected java.lang.String getAfterBuilderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BUILDER_CHANGE, null);
	}

	protected void setAfterBuilderChange(java.lang.String afterBuilderChange) {
		getStateHelper().put(AFTER_BUILDER_CHANGE, afterBuilderChange);
	}

	protected java.lang.String getAfterColorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COLOR_CHANGE, null);
	}

	protected void setAfterColorChange(java.lang.String afterColorChange) {
		getStateHelper().put(AFTER_COLOR_CHANGE, afterColorChange);
	}

	protected java.lang.String getAfterCoordChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COORD_CHANGE, null);
	}

	protected void setAfterCoordChange(java.lang.String afterCoordChange) {
		getStateHelper().put(AFTER_COORD_CHANGE, afterCoordChange);
	}

	protected java.lang.String getAfterGraphicChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_GRAPHIC_CHANGE, null);
	}

	protected void setAfterGraphicChange(java.lang.String afterGraphicChange) {
		getStateHelper().put(AFTER_GRAPHIC_CHANGE, afterGraphicChange);
	}

	protected java.lang.String getAfterLazyDrawChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LAZY_DRAW_CHANGE, null);
	}

	protected void setAfterLazyDrawChange(java.lang.String afterLazyDrawChange) {
		getStateHelper().put(AFTER_LAZY_DRAW_CHANGE, afterLazyDrawChange);
	}

	protected java.lang.String getAfterNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NAME_CHANGE, null);
	}

	protected void setAfterNameChange(java.lang.String afterNameChange) {
		getStateHelper().put(AFTER_NAME_CHANGE, afterNameChange);
	}

	protected java.lang.String getAfterNodeNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NODE_NAME_CHANGE, null);
	}

	protected void setAfterNodeNameChange(java.lang.String afterNodeNameChange) {
		getStateHelper().put(AFTER_NODE_NAME_CHANGE, afterNodeNameChange);
	}

	protected java.lang.String getAfterP1Change() {
		return (java.lang.String) getStateHelper().eval(AFTER_P1_CHANGE, null);
	}

	protected void setAfterP1Change(java.lang.String afterP1Change) {
		getStateHelper().put(AFTER_P1_CHANGE, afterP1Change);
	}

	protected java.lang.String getAfterP2Change() {
		return (java.lang.String) getStateHelper().eval(AFTER_P2_CHANGE, null);
	}

	protected void setAfterP2Change(java.lang.String afterP2Change) {
		getStateHelper().put(AFTER_P2_CHANGE, afterP2Change);
	}

	protected java.lang.String getAfterSelectedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECTED_CHANGE, null);
	}

	protected void setAfterSelectedChange(java.lang.String afterSelectedChange) {
		getStateHelper().put(AFTER_SELECTED_CHANGE, afterSelectedChange);
	}

	protected java.lang.String getAfterShapeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHAPE_CHANGE, null);
	}

	protected void setAfterShapeChange(java.lang.String afterShapeChange) {
		getStateHelper().put(AFTER_SHAPE_CHANGE, afterShapeChange);
	}

	protected java.lang.String getAfterShapeArrowChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHAPE_ARROW_CHANGE, null);
	}

	protected void setAfterShapeArrowChange(java.lang.String afterShapeArrowChange) {
		getStateHelper().put(AFTER_SHAPE_ARROW_CHANGE, afterShapeArrowChange);
	}

	protected java.lang.String getAfterShapeArrowHoverChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHAPE_ARROW_HOVER_CHANGE, null);
	}

	protected void setAfterShapeArrowHoverChange(java.lang.String afterShapeArrowHoverChange) {
		getStateHelper().put(AFTER_SHAPE_ARROW_HOVER_CHANGE, afterShapeArrowHoverChange);
	}

	protected java.lang.String getAfterShapeArrowSelectedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHAPE_ARROW_SELECTED_CHANGE, null);
	}

	protected void setAfterShapeArrowSelectedChange(java.lang.String afterShapeArrowSelectedChange) {
		getStateHelper().put(AFTER_SHAPE_ARROW_SELECTED_CHANGE, afterShapeArrowSelectedChange);
	}

	protected java.lang.String getAfterShapeHoverChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHAPE_HOVER_CHANGE, null);
	}

	protected void setAfterShapeHoverChange(java.lang.String afterShapeHoverChange) {
		getStateHelper().put(AFTER_SHAPE_HOVER_CHANGE, afterShapeHoverChange);
	}

	protected java.lang.String getAfterShapeSelectedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHAPE_SELECTED_CHANGE, null);
	}

	protected void setAfterShapeSelectedChange(java.lang.String afterShapeSelectedChange) {
		getStateHelper().put(AFTER_SHAPE_SELECTED_CHANGE, afterShapeSelectedChange);
	}

	protected java.lang.String getAfterShowNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_NAME_CHANGE, null);
	}

	protected void setAfterShowNameChange(java.lang.String afterShowNameChange) {
		getStateHelper().put(AFTER_SHOW_NAME_CHANGE, afterShowNameChange);
	}

	protected java.lang.String getAfterTransitionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRANSITION_CHANGE, null);
	}

	protected void setAfterTransitionChange(java.lang.String afterTransitionChange) {
		getStateHelper().put(AFTER_TRANSITION_CHANGE, afterTransitionChange);
	}

	protected java.lang.String getAfterVisibleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VISIBLE_CHANGE, null);
	}

	protected void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		getStateHelper().put(AFTER_VISIBLE_CHANGE, afterVisibleChange);
	}

	protected java.lang.String getOnArrowPointsChange() {
		return (java.lang.String) getStateHelper().eval(ON_ARROW_POINTS_CHANGE, null);
	}

	protected void setOnArrowPointsChange(java.lang.String onArrowPointsChange) {
		getStateHelper().put(ON_ARROW_POINTS_CHANGE, onArrowPointsChange);
	}

	protected java.lang.String getOnBuilderChange() {
		return (java.lang.String) getStateHelper().eval(ON_BUILDER_CHANGE, null);
	}

	protected void setOnBuilderChange(java.lang.String onBuilderChange) {
		getStateHelper().put(ON_BUILDER_CHANGE, onBuilderChange);
	}

	protected java.lang.String getOnColorChange() {
		return (java.lang.String) getStateHelper().eval(ON_COLOR_CHANGE, null);
	}

	protected void setOnColorChange(java.lang.String onColorChange) {
		getStateHelper().put(ON_COLOR_CHANGE, onColorChange);
	}

	protected java.lang.String getOnCoordChange() {
		return (java.lang.String) getStateHelper().eval(ON_COORD_CHANGE, null);
	}

	protected void setOnCoordChange(java.lang.String onCoordChange) {
		getStateHelper().put(ON_COORD_CHANGE, onCoordChange);
	}

	protected java.lang.String getOnGraphicChange() {
		return (java.lang.String) getStateHelper().eval(ON_GRAPHIC_CHANGE, null);
	}

	protected void setOnGraphicChange(java.lang.String onGraphicChange) {
		getStateHelper().put(ON_GRAPHIC_CHANGE, onGraphicChange);
	}

	protected java.lang.String getOnLazyDrawChange() {
		return (java.lang.String) getStateHelper().eval(ON_LAZY_DRAW_CHANGE, null);
	}

	protected void setOnLazyDrawChange(java.lang.String onLazyDrawChange) {
		getStateHelper().put(ON_LAZY_DRAW_CHANGE, onLazyDrawChange);
	}

	protected java.lang.String getOnNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_NAME_CHANGE, null);
	}

	protected void setOnNameChange(java.lang.String onNameChange) {
		getStateHelper().put(ON_NAME_CHANGE, onNameChange);
	}

	protected java.lang.String getOnNodeNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_NODE_NAME_CHANGE, null);
	}

	protected void setOnNodeNameChange(java.lang.String onNodeNameChange) {
		getStateHelper().put(ON_NODE_NAME_CHANGE, onNodeNameChange);
	}

	protected java.lang.String getOnP1Change() {
		return (java.lang.String) getStateHelper().eval(ON_P1_CHANGE, null);
	}

	protected void setOnP1Change(java.lang.String onP1Change) {
		getStateHelper().put(ON_P1_CHANGE, onP1Change);
	}

	protected java.lang.String getOnP2Change() {
		return (java.lang.String) getStateHelper().eval(ON_P2_CHANGE, null);
	}

	protected void setOnP2Change(java.lang.String onP2Change) {
		getStateHelper().put(ON_P2_CHANGE, onP2Change);
	}

	protected java.lang.String getOnSelectedChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECTED_CHANGE, null);
	}

	protected void setOnSelectedChange(java.lang.String onSelectedChange) {
		getStateHelper().put(ON_SELECTED_CHANGE, onSelectedChange);
	}

	protected java.lang.String getOnShapeChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHAPE_CHANGE, null);
	}

	protected void setOnShapeChange(java.lang.String onShapeChange) {
		getStateHelper().put(ON_SHAPE_CHANGE, onShapeChange);
	}

	protected java.lang.String getOnShapeArrowChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHAPE_ARROW_CHANGE, null);
	}

	protected void setOnShapeArrowChange(java.lang.String onShapeArrowChange) {
		getStateHelper().put(ON_SHAPE_ARROW_CHANGE, onShapeArrowChange);
	}

	protected java.lang.String getOnShapeArrowHoverChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHAPE_ARROW_HOVER_CHANGE, null);
	}

	protected void setOnShapeArrowHoverChange(java.lang.String onShapeArrowHoverChange) {
		getStateHelper().put(ON_SHAPE_ARROW_HOVER_CHANGE, onShapeArrowHoverChange);
	}

	protected java.lang.String getOnShapeArrowSelectedChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHAPE_ARROW_SELECTED_CHANGE, null);
	}

	protected void setOnShapeArrowSelectedChange(java.lang.String onShapeArrowSelectedChange) {
		getStateHelper().put(ON_SHAPE_ARROW_SELECTED_CHANGE, onShapeArrowSelectedChange);
	}

	protected java.lang.String getOnShapeHoverChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHAPE_HOVER_CHANGE, null);
	}

	protected void setOnShapeHoverChange(java.lang.String onShapeHoverChange) {
		getStateHelper().put(ON_SHAPE_HOVER_CHANGE, onShapeHoverChange);
	}

	protected java.lang.String getOnShapeSelectedChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHAPE_SELECTED_CHANGE, null);
	}

	protected void setOnShapeSelectedChange(java.lang.String onShapeSelectedChange) {
		getStateHelper().put(ON_SHAPE_SELECTED_CHANGE, onShapeSelectedChange);
	}

	protected java.lang.String getOnShowNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_NAME_CHANGE, null);
	}

	protected void setOnShowNameChange(java.lang.String onShowNameChange) {
		getStateHelper().put(ON_SHOW_NAME_CHANGE, onShowNameChange);
	}

	protected java.lang.String getOnTransitionChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRANSITION_CHANGE, null);
	}

	protected void setOnTransitionChange(java.lang.String onTransitionChange) {
		getStateHelper().put(ON_TRANSITION_CHANGE, onTransitionChange);
	}

	protected java.lang.String getOnVisibleChange() {
		return (java.lang.String) getStateHelper().eval(ON_VISIBLE_CHANGE, null);
	}

	protected void setOnVisibleChange(java.lang.String onVisibleChange) {
		getStateHelper().put(ON_VISIBLE_CHANGE, onVisibleChange);
	}

}