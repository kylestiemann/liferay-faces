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

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class ConnectorBase extends javax.faces.component.UIPanel {

	public static final String ARROW_POINTS = "arrowPoints";
	public static final String BUILDER = "builder";
	public static final String COLOR = "color";
	public static final String COORD = "coord";
	public static final String DESTROYED = "destroyed";
	public static final String GRAPHIC = "graphic";
	public static final String INITIALIZED = "initialized";
	public static final String LAZY_DRAW = "lazyDraw";
	public static final String NAME = "name";
	public static final String NODE_NAME = "nodeName";
	public static final String P1 = "p1";
	public static final String P2 = "p2";
	public static final String SELECTED = "selected";
	public static final String SHAPE = "shape";
	public static final String SHAPE_ARROW = "shapeArrow";
	public static final String SHAPE_ARROW_HOVER = "shapeArrowHover";
	public static final String SHAPE_ARROW_SELECTED = "shapeArrowSelected";
	public static final String SHAPE_HOVER = "shapeHover";
	public static final String SHAPE_SELECTED = "shapeSelected";
	public static final String SHOW_NAME = "showName";
	public static final String TRANSITION = "transition";
	public static final String VISIBLE = "visible";
	public static final String AFTER_ARROW_POINTS_CHANGE = "afterArrowPointsChange";
	public static final String AFTER_BUILDER_CHANGE = "afterBuilderChange";
	public static final String AFTER_COLOR_CHANGE = "afterColorChange";
	public static final String AFTER_COORD_CHANGE = "afterCoordChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_GRAPHIC_CHANGE = "afterGraphicChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_LAZY_DRAW_CHANGE = "afterLazyDrawChange";
	public static final String AFTER_NAME_CHANGE = "afterNameChange";
	public static final String AFTER_NODE_NAME_CHANGE = "afterNodeNameChange";
	public static final String AFTER_P1_CHANGE = "afterP1Change";
	public static final String AFTER_P2_CHANGE = "afterP2Change";
	public static final String AFTER_SELECTED_CHANGE = "afterSelectedChange";
	public static final String AFTER_SHAPE_CHANGE = "afterShapeChange";
	public static final String AFTER_SHAPE_ARROW_CHANGE = "afterShapeArrowChange";
	public static final String AFTER_SHAPE_ARROW_HOVER_CHANGE = "afterShapeArrowHoverChange";
	public static final String AFTER_SHAPE_ARROW_SELECTED_CHANGE = "afterShapeArrowSelectedChange";
	public static final String AFTER_SHAPE_HOVER_CHANGE = "afterShapeHoverChange";
	public static final String AFTER_SHAPE_SELECTED_CHANGE = "afterShapeSelectedChange";
	public static final String AFTER_SHOW_NAME_CHANGE = "afterShowNameChange";
	public static final String AFTER_TRANSITION_CHANGE = "afterTransitionChange";
	public static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	public static final String ON_ARROW_POINTS_CHANGE = "onArrowPointsChange";
	public static final String ON_BUILDER_CHANGE = "onBuilderChange";
	public static final String ON_COLOR_CHANGE = "onColorChange";
	public static final String ON_COORD_CHANGE = "onCoordChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_GRAPHIC_CHANGE = "onGraphicChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_LAZY_DRAW_CHANGE = "onLazyDrawChange";
	public static final String ON_NAME_CHANGE = "onNameChange";
	public static final String ON_NODE_NAME_CHANGE = "onNodeNameChange";
	public static final String ON_P1_CHANGE = "onP1Change";
	public static final String ON_P2_CHANGE = "onP2Change";
	public static final String ON_SELECTED_CHANGE = "onSelectedChange";
	public static final String ON_SHAPE_CHANGE = "onShapeChange";
	public static final String ON_SHAPE_ARROW_CHANGE = "onShapeArrowChange";
	public static final String ON_SHAPE_ARROW_HOVER_CHANGE = "onShapeArrowHoverChange";
	public static final String ON_SHAPE_ARROW_SELECTED_CHANGE = "onShapeArrowSelectedChange";
	public static final String ON_SHAPE_HOVER_CHANGE = "onShapeHoverChange";
	public static final String ON_SHAPE_SELECTED_CHANGE = "onShapeSelectedChange";
	public static final String ON_SHOW_NAME_CHANGE = "onShowNameChange";
	public static final String ON_TRANSITION_CHANGE = "onTransitionChange";
	public static final String ON_VISIBLE_CHANGE = "onVisibleChange";

	public java.lang.String getArrowPoints() {
		return (java.lang.String) getStateHelper().eval(ARROW_POINTS, null);
	}

	public void setArrowPoints(java.lang.String arrowPoints) {
		getStateHelper().put(ARROW_POINTS, arrowPoints);
	}

	public java.lang.String getBuilder() {
		return (java.lang.String) getStateHelper().eval(BUILDER, null);
	}

	public void setBuilder(java.lang.String builder) {
		getStateHelper().put(BUILDER, builder);
	}

	public java.lang.String getColor() {
		return (java.lang.String) getStateHelper().eval(COLOR, null);
	}

	public void setColor(java.lang.String color) {
		getStateHelper().put(COLOR, color);
	}

	public java.lang.String getCoord() {
		return (java.lang.String) getStateHelper().eval(COORD, null);
	}

	public void setCoord(java.lang.String coord) {
		getStateHelper().put(COORD, coord);
	}

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.Object getGraphic() {
		return (java.lang.Object) getStateHelper().eval(GRAPHIC, null);
	}

	public void setGraphic(java.lang.Object graphic) {
		getStateHelper().put(GRAPHIC, graphic);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.Boolean getLazyDraw() {
		return (java.lang.Boolean) getStateHelper().eval(LAZY_DRAW, null);
	}

	public void setLazyDraw(java.lang.Boolean lazyDraw) {
		getStateHelper().put(LAZY_DRAW, lazyDraw);
	}

	public java.lang.String getName() {
		return (java.lang.String) getStateHelper().eval(NAME, null);
	}

	public void setName(java.lang.String name) {
		getStateHelper().put(NAME, name);
	}

	public java.lang.String getNodeName() {
		return (java.lang.String) getStateHelper().eval(NODE_NAME, null);
	}

	public void setNodeName(java.lang.String nodeName) {
		getStateHelper().put(NODE_NAME, nodeName);
	}

	public java.lang.Object getP1() {
		return (java.lang.Object) getStateHelper().eval(P1, null);
	}

	public void setP1(java.lang.Object p1) {
		getStateHelper().put(P1, p1);
	}

	public java.lang.Object getP2() {
		return (java.lang.Object) getStateHelper().eval(P2, null);
	}

	public void setP2(java.lang.Object p2) {
		getStateHelper().put(P2, p2);
	}

	public java.lang.Boolean getSelected() {
		return (java.lang.Boolean) getStateHelper().eval(SELECTED, null);
	}

	public void setSelected(java.lang.Boolean selected) {
		getStateHelper().put(SELECTED, selected);
	}

	public java.lang.String getShape() {
		return (java.lang.String) getStateHelper().eval(SHAPE, null);
	}

	public void setShape(java.lang.String shape) {
		getStateHelper().put(SHAPE, shape);
	}

	public java.lang.String getShapeArrow() {
		return (java.lang.String) getStateHelper().eval(SHAPE_ARROW, null);
	}

	public void setShapeArrow(java.lang.String shapeArrow) {
		getStateHelper().put(SHAPE_ARROW, shapeArrow);
	}

	public java.lang.Object getShapeArrowHover() {
		return (java.lang.Object) getStateHelper().eval(SHAPE_ARROW_HOVER, null);
	}

	public void setShapeArrowHover(java.lang.Object shapeArrowHover) {
		getStateHelper().put(SHAPE_ARROW_HOVER, shapeArrowHover);
	}

	public java.lang.Object getShapeArrowSelected() {
		return (java.lang.Object) getStateHelper().eval(SHAPE_ARROW_SELECTED, null);
	}

	public void setShapeArrowSelected(java.lang.Object shapeArrowSelected) {
		getStateHelper().put(SHAPE_ARROW_SELECTED, shapeArrowSelected);
	}

	public java.lang.Object getShapeHover() {
		return (java.lang.Object) getStateHelper().eval(SHAPE_HOVER, null);
	}

	public void setShapeHover(java.lang.Object shapeHover) {
		getStateHelper().put(SHAPE_HOVER, shapeHover);
	}

	public java.lang.Object getShapeSelected() {
		return (java.lang.Object) getStateHelper().eval(SHAPE_SELECTED, null);
	}

	public void setShapeSelected(java.lang.Object shapeSelected) {
		getStateHelper().put(SHAPE_SELECTED, shapeSelected);
	}

	public java.lang.Boolean getShowName() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_NAME, null);
	}

	public void setShowName(java.lang.Boolean showName) {
		getStateHelper().put(SHOW_NAME, showName);
	}

	public java.lang.Object getTransition() {
		return (java.lang.Object) getStateHelper().eval(TRANSITION, null);
	}

	public void setTransition(java.lang.Object transition) {
		getStateHelper().put(TRANSITION, transition);
	}

	public java.lang.Boolean getVisible() {
		return (java.lang.Boolean) getStateHelper().eval(VISIBLE, null);
	}

	public void setVisible(java.lang.Boolean visible) {
		getStateHelper().put(VISIBLE, visible);
	}

	public java.lang.String getAfterArrowPointsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ARROW_POINTS_CHANGE, null);
	}

	public void setAfterArrowPointsChange(java.lang.String afterArrowPointsChange) {
		getStateHelper().put(AFTER_ARROW_POINTS_CHANGE, afterArrowPointsChange);
	}

	public java.lang.String getAfterBuilderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BUILDER_CHANGE, null);
	}

	public void setAfterBuilderChange(java.lang.String afterBuilderChange) {
		getStateHelper().put(AFTER_BUILDER_CHANGE, afterBuilderChange);
	}

	public java.lang.String getAfterColorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COLOR_CHANGE, null);
	}

	public void setAfterColorChange(java.lang.String afterColorChange) {
		getStateHelper().put(AFTER_COLOR_CHANGE, afterColorChange);
	}

	public java.lang.String getAfterCoordChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COORD_CHANGE, null);
	}

	public void setAfterCoordChange(java.lang.String afterCoordChange) {
		getStateHelper().put(AFTER_COORD_CHANGE, afterCoordChange);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterGraphicChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_GRAPHIC_CHANGE, null);
	}

	public void setAfterGraphicChange(java.lang.String afterGraphicChange) {
		getStateHelper().put(AFTER_GRAPHIC_CHANGE, afterGraphicChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterLazyDrawChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LAZY_DRAW_CHANGE, null);
	}

	public void setAfterLazyDrawChange(java.lang.String afterLazyDrawChange) {
		getStateHelper().put(AFTER_LAZY_DRAW_CHANGE, afterLazyDrawChange);
	}

	public java.lang.String getAfterNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NAME_CHANGE, null);
	}

	public void setAfterNameChange(java.lang.String afterNameChange) {
		getStateHelper().put(AFTER_NAME_CHANGE, afterNameChange);
	}

	public java.lang.String getAfterNodeNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NODE_NAME_CHANGE, null);
	}

	public void setAfterNodeNameChange(java.lang.String afterNodeNameChange) {
		getStateHelper().put(AFTER_NODE_NAME_CHANGE, afterNodeNameChange);
	}

	public java.lang.String getAfterP1Change() {
		return (java.lang.String) getStateHelper().eval(AFTER_P1_CHANGE, null);
	}

	public void setAfterP1Change(java.lang.String afterP1Change) {
		getStateHelper().put(AFTER_P1_CHANGE, afterP1Change);
	}

	public java.lang.String getAfterP2Change() {
		return (java.lang.String) getStateHelper().eval(AFTER_P2_CHANGE, null);
	}

	public void setAfterP2Change(java.lang.String afterP2Change) {
		getStateHelper().put(AFTER_P2_CHANGE, afterP2Change);
	}

	public java.lang.String getAfterSelectedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECTED_CHANGE, null);
	}

	public void setAfterSelectedChange(java.lang.String afterSelectedChange) {
		getStateHelper().put(AFTER_SELECTED_CHANGE, afterSelectedChange);
	}

	public java.lang.String getAfterShapeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHAPE_CHANGE, null);
	}

	public void setAfterShapeChange(java.lang.String afterShapeChange) {
		getStateHelper().put(AFTER_SHAPE_CHANGE, afterShapeChange);
	}

	public java.lang.String getAfterShapeArrowChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHAPE_ARROW_CHANGE, null);
	}

	public void setAfterShapeArrowChange(java.lang.String afterShapeArrowChange) {
		getStateHelper().put(AFTER_SHAPE_ARROW_CHANGE, afterShapeArrowChange);
	}

	public java.lang.String getAfterShapeArrowHoverChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHAPE_ARROW_HOVER_CHANGE, null);
	}

	public void setAfterShapeArrowHoverChange(java.lang.String afterShapeArrowHoverChange) {
		getStateHelper().put(AFTER_SHAPE_ARROW_HOVER_CHANGE, afterShapeArrowHoverChange);
	}

	public java.lang.String getAfterShapeArrowSelectedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHAPE_ARROW_SELECTED_CHANGE, null);
	}

	public void setAfterShapeArrowSelectedChange(java.lang.String afterShapeArrowSelectedChange) {
		getStateHelper().put(AFTER_SHAPE_ARROW_SELECTED_CHANGE, afterShapeArrowSelectedChange);
	}

	public java.lang.String getAfterShapeHoverChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHAPE_HOVER_CHANGE, null);
	}

	public void setAfterShapeHoverChange(java.lang.String afterShapeHoverChange) {
		getStateHelper().put(AFTER_SHAPE_HOVER_CHANGE, afterShapeHoverChange);
	}

	public java.lang.String getAfterShapeSelectedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHAPE_SELECTED_CHANGE, null);
	}

	public void setAfterShapeSelectedChange(java.lang.String afterShapeSelectedChange) {
		getStateHelper().put(AFTER_SHAPE_SELECTED_CHANGE, afterShapeSelectedChange);
	}

	public java.lang.String getAfterShowNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_NAME_CHANGE, null);
	}

	public void setAfterShowNameChange(java.lang.String afterShowNameChange) {
		getStateHelper().put(AFTER_SHOW_NAME_CHANGE, afterShowNameChange);
	}

	public java.lang.String getAfterTransitionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRANSITION_CHANGE, null);
	}

	public void setAfterTransitionChange(java.lang.String afterTransitionChange) {
		getStateHelper().put(AFTER_TRANSITION_CHANGE, afterTransitionChange);
	}

	public java.lang.String getAfterVisibleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VISIBLE_CHANGE, null);
	}

	public void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		getStateHelper().put(AFTER_VISIBLE_CHANGE, afterVisibleChange);
	}

	public java.lang.String getOnArrowPointsChange() {
		return (java.lang.String) getStateHelper().eval(ON_ARROW_POINTS_CHANGE, null);
	}

	public void setOnArrowPointsChange(java.lang.String onArrowPointsChange) {
		getStateHelper().put(ON_ARROW_POINTS_CHANGE, onArrowPointsChange);
	}

	public java.lang.String getOnBuilderChange() {
		return (java.lang.String) getStateHelper().eval(ON_BUILDER_CHANGE, null);
	}

	public void setOnBuilderChange(java.lang.String onBuilderChange) {
		getStateHelper().put(ON_BUILDER_CHANGE, onBuilderChange);
	}

	public java.lang.String getOnColorChange() {
		return (java.lang.String) getStateHelper().eval(ON_COLOR_CHANGE, null);
	}

	public void setOnColorChange(java.lang.String onColorChange) {
		getStateHelper().put(ON_COLOR_CHANGE, onColorChange);
	}

	public java.lang.String getOnCoordChange() {
		return (java.lang.String) getStateHelper().eval(ON_COORD_CHANGE, null);
	}

	public void setOnCoordChange(java.lang.String onCoordChange) {
		getStateHelper().put(ON_COORD_CHANGE, onCoordChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnGraphicChange() {
		return (java.lang.String) getStateHelper().eval(ON_GRAPHIC_CHANGE, null);
	}

	public void setOnGraphicChange(java.lang.String onGraphicChange) {
		getStateHelper().put(ON_GRAPHIC_CHANGE, onGraphicChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnLazyDrawChange() {
		return (java.lang.String) getStateHelper().eval(ON_LAZY_DRAW_CHANGE, null);
	}

	public void setOnLazyDrawChange(java.lang.String onLazyDrawChange) {
		getStateHelper().put(ON_LAZY_DRAW_CHANGE, onLazyDrawChange);
	}

	public java.lang.String getOnNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_NAME_CHANGE, null);
	}

	public void setOnNameChange(java.lang.String onNameChange) {
		getStateHelper().put(ON_NAME_CHANGE, onNameChange);
	}

	public java.lang.String getOnNodeNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_NODE_NAME_CHANGE, null);
	}

	public void setOnNodeNameChange(java.lang.String onNodeNameChange) {
		getStateHelper().put(ON_NODE_NAME_CHANGE, onNodeNameChange);
	}

	public java.lang.String getOnP1Change() {
		return (java.lang.String) getStateHelper().eval(ON_P1_CHANGE, null);
	}

	public void setOnP1Change(java.lang.String onP1Change) {
		getStateHelper().put(ON_P1_CHANGE, onP1Change);
	}

	public java.lang.String getOnP2Change() {
		return (java.lang.String) getStateHelper().eval(ON_P2_CHANGE, null);
	}

	public void setOnP2Change(java.lang.String onP2Change) {
		getStateHelper().put(ON_P2_CHANGE, onP2Change);
	}

	public java.lang.String getOnSelectedChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECTED_CHANGE, null);
	}

	public void setOnSelectedChange(java.lang.String onSelectedChange) {
		getStateHelper().put(ON_SELECTED_CHANGE, onSelectedChange);
	}

	public java.lang.String getOnShapeChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHAPE_CHANGE, null);
	}

	public void setOnShapeChange(java.lang.String onShapeChange) {
		getStateHelper().put(ON_SHAPE_CHANGE, onShapeChange);
	}

	public java.lang.String getOnShapeArrowChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHAPE_ARROW_CHANGE, null);
	}

	public void setOnShapeArrowChange(java.lang.String onShapeArrowChange) {
		getStateHelper().put(ON_SHAPE_ARROW_CHANGE, onShapeArrowChange);
	}

	public java.lang.String getOnShapeArrowHoverChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHAPE_ARROW_HOVER_CHANGE, null);
	}

	public void setOnShapeArrowHoverChange(java.lang.String onShapeArrowHoverChange) {
		getStateHelper().put(ON_SHAPE_ARROW_HOVER_CHANGE, onShapeArrowHoverChange);
	}

	public java.lang.String getOnShapeArrowSelectedChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHAPE_ARROW_SELECTED_CHANGE, null);
	}

	public void setOnShapeArrowSelectedChange(java.lang.String onShapeArrowSelectedChange) {
		getStateHelper().put(ON_SHAPE_ARROW_SELECTED_CHANGE, onShapeArrowSelectedChange);
	}

	public java.lang.String getOnShapeHoverChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHAPE_HOVER_CHANGE, null);
	}

	public void setOnShapeHoverChange(java.lang.String onShapeHoverChange) {
		getStateHelper().put(ON_SHAPE_HOVER_CHANGE, onShapeHoverChange);
	}

	public java.lang.String getOnShapeSelectedChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHAPE_SELECTED_CHANGE, null);
	}

	public void setOnShapeSelectedChange(java.lang.String onShapeSelectedChange) {
		getStateHelper().put(ON_SHAPE_SELECTED_CHANGE, onShapeSelectedChange);
	}

	public java.lang.String getOnShowNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_NAME_CHANGE, null);
	}

	public void setOnShowNameChange(java.lang.String onShowNameChange) {
		getStateHelper().put(ON_SHOW_NAME_CHANGE, onShowNameChange);
	}

	public java.lang.String getOnTransitionChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRANSITION_CHANGE, null);
	}

	public void setOnTransitionChange(java.lang.String onTransitionChange) {
		getStateHelper().put(ON_TRANSITION_CHANGE, onTransitionChange);
	}

	public java.lang.String getOnVisibleChange() {
		return (java.lang.String) getStateHelper().eval(ON_VISIBLE_CHANGE, null);
	}

	public void setOnVisibleChange(java.lang.String onVisibleChange) {
		getStateHelper().put(ON_VISIBLE_CHANGE, onVisibleChange);
	}

}