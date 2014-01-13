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

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class DiagramNodeEndBase extends javax.faces.component.UIPanel {

	private static final String BUILDER = "builder";
	private static final String CONNECTORS = "connectors";
	private static final String CONTROLS_TOOLBAR = "controlsToolbar";
	private static final String DESCRIPTION = "description";
	private static final String GRAPHIC = "graphic";
	private static final String HEIGHT = "height";
	private static final String HIGHLIGHT_BOUNDARY_STROKE = "highlightBoundaryStroke";
	private static final String HIGHLIGHTED = "highlighted";
	private static final String NAME = "name";
	private static final String REQUIRED = "required";
	private static final String SELECTED = "selected";
	private static final String SHAPE_BOUNDARY = "shapeBoundary";
	private static final String SHAPE_INVITE = "shapeInvite";
	private static final String STRINGS = "strings";
	private static final String TAB_INDEX = "tabIndex";
	private static final String TRANSITIONS = "transitions";
	private static final String TYPE = "type";
	private static final String WIDTH = "width";
	private static final String Z_INDEX = "zIndex";
	private static final String AFTER_BUILDER_CHANGE = "afterBuilderChange";
	private static final String AFTER_CONNECTORS_CHANGE = "afterConnectorsChange";
	private static final String AFTER_CONTROLS_TOOLBAR_CHANGE = "afterControlsToolbarChange";
	private static final String AFTER_DESCRIPTION_CHANGE = "afterDescriptionChange";
	private static final String AFTER_GRAPHIC_CHANGE = "afterGraphicChange";
	private static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	private static final String AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE = "afterHighlightBoundaryStrokeChange";
	private static final String AFTER_HIGHLIGHTED_CHANGE = "afterHighlightedChange";
	private static final String AFTER_NAME_CHANGE = "afterNameChange";
	private static final String AFTER_REQUIRED_CHANGE = "afterRequiredChange";
	private static final String AFTER_SELECTED_CHANGE = "afterSelectedChange";
	private static final String AFTER_SHAPE_BOUNDARY_CHANGE = "afterShapeBoundaryChange";
	private static final String AFTER_SHAPE_INVITE_CHANGE = "afterShapeInviteChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	private static final String AFTER_TRANSITIONS_CHANGE = "afterTransitionsChange";
	private static final String AFTER_TYPE_CHANGE = "afterTypeChange";
	private static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	private static final String AFTER_ZINDEX_CHANGE = "afterZIndexChange";
	private static final String ON_BUILDER_CHANGE = "onBuilderChange";
	private static final String ON_CONNECTORS_CHANGE = "onConnectorsChange";
	private static final String ON_CONTROLS_TOOLBAR_CHANGE = "onControlsToolbarChange";
	private static final String ON_DESCRIPTION_CHANGE = "onDescriptionChange";
	private static final String ON_GRAPHIC_CHANGE = "onGraphicChange";
	private static final String ON_HEIGHT_CHANGE = "onHeightChange";
	private static final String ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE = "onHighlightBoundaryStrokeChange";
	private static final String ON_HIGHLIGHTED_CHANGE = "onHighlightedChange";
	private static final String ON_NAME_CHANGE = "onNameChange";
	private static final String ON_REQUIRED_CHANGE = "onRequiredChange";
	private static final String ON_SELECTED_CHANGE = "onSelectedChange";
	private static final String ON_SHAPE_BOUNDARY_CHANGE = "onShapeBoundaryChange";
	private static final String ON_SHAPE_INVITE_CHANGE = "onShapeInviteChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	private static final String ON_TRANSITIONS_CHANGE = "onTransitionsChange";
	private static final String ON_TYPE_CHANGE = "onTypeChange";
	private static final String ON_WIDTH_CHANGE = "onWidthChange";
	private static final String ON_ZINDEX_CHANGE = "onZIndexChange";

	protected java.lang.Object getBuilder() {
		return (java.lang.Object) getStateHelper().eval(BUILDER, null);
	}

	protected void setBuilder(java.lang.Object builder) {
		getStateHelper().put(BUILDER, builder);
	}

	protected java.lang.Object getConnectors() {
		return (java.lang.Object) getStateHelper().eval(CONNECTORS, null);
	}

	protected void setConnectors(java.lang.Object connectors) {
		getStateHelper().put(CONNECTORS, connectors);
	}

	protected java.lang.Object getControlsToolbar() {
		return (java.lang.Object) getStateHelper().eval(CONTROLS_TOOLBAR, null);
	}

	protected void setControlsToolbar(java.lang.Object controlsToolbar) {
		getStateHelper().put(CONTROLS_TOOLBAR, controlsToolbar);
	}

	protected java.lang.String getDescription() {
		return (java.lang.String) getStateHelper().eval(DESCRIPTION, null);
	}

	protected void setDescription(java.lang.String description) {
		getStateHelper().put(DESCRIPTION, description);
	}

	protected java.lang.Object getGraphic() {
		return (java.lang.Object) getStateHelper().eval(GRAPHIC, null);
	}

	protected void setGraphic(java.lang.Object graphic) {
		getStateHelper().put(GRAPHIC, graphic);
	}

	protected java.lang.Object getHeight() {
		return (java.lang.Object) getStateHelper().eval(HEIGHT, null);
	}

	protected void setHeight(java.lang.Object height) {
		getStateHelper().put(HEIGHT, height);
	}

	protected java.lang.Object getHighlightBoundaryStroke() {
		return (java.lang.Object) getStateHelper().eval(HIGHLIGHT_BOUNDARY_STROKE, null);
	}

	protected void setHighlightBoundaryStroke(java.lang.Object highlightBoundaryStroke) {
		getStateHelper().put(HIGHLIGHT_BOUNDARY_STROKE, highlightBoundaryStroke);
	}

	protected java.lang.Boolean getHighlighted() {
		return (java.lang.Boolean) getStateHelper().eval(HIGHLIGHTED, null);
	}

	protected void setHighlighted(java.lang.Boolean highlighted) {
		getStateHelper().put(HIGHLIGHTED, highlighted);
	}

	protected java.lang.String getName() {
		return (java.lang.String) getStateHelper().eval(NAME, null);
	}

	protected void setName(java.lang.String name) {
		getStateHelper().put(NAME, name);
	}

	protected java.lang.Boolean getRequired() {
		return (java.lang.Boolean) getStateHelper().eval(REQUIRED, null);
	}

	protected void setRequired(java.lang.Boolean required) {
		getStateHelper().put(REQUIRED, required);
	}

	protected java.lang.Boolean getSelected() {
		return (java.lang.Boolean) getStateHelper().eval(SELECTED, null);
	}

	protected void setSelected(java.lang.Boolean selected) {
		getStateHelper().put(SELECTED, selected);
	}

	protected java.lang.Object getShapeBoundary() {
		return (java.lang.Object) getStateHelper().eval(SHAPE_BOUNDARY, null);
	}

	protected void setShapeBoundary(java.lang.Object shapeBoundary) {
		getStateHelper().put(SHAPE_BOUNDARY, shapeBoundary);
	}

	protected java.lang.Object getShapeInvite() {
		return (java.lang.Object) getStateHelper().eval(SHAPE_INVITE, null);
	}

	protected void setShapeInvite(java.lang.Object shapeInvite) {
		getStateHelper().put(SHAPE_INVITE, shapeInvite);
	}

	protected java.lang.Object getStrings() {
		return (java.lang.Object) getStateHelper().eval(STRINGS, null);
	}

	protected void setStrings(java.lang.Object strings) {
		getStateHelper().put(STRINGS, strings);
	}

	protected java.lang.Object getTabIndex() {
		return (java.lang.Object) getStateHelper().eval(TAB_INDEX, null);
	}

	protected void setTabIndex(java.lang.Object tabIndex) {
		getStateHelper().put(TAB_INDEX, tabIndex);
	}

	protected java.lang.Object getTransitions() {
		return (java.lang.Object) getStateHelper().eval(TRANSITIONS, null);
	}

	protected void setTransitions(java.lang.Object transitions) {
		getStateHelper().put(TRANSITIONS, transitions);
	}

	protected java.lang.String getType() {
		return (java.lang.String) getStateHelper().eval(TYPE, null);
	}

	protected void setType(java.lang.String type) {
		getStateHelper().put(TYPE, type);
	}

	protected java.lang.Object getWidth() {
		return (java.lang.Object) getStateHelper().eval(WIDTH, null);
	}

	protected void setWidth(java.lang.Object width) {
		getStateHelper().put(WIDTH, width);
	}

	protected java.lang.Object getZIndex() {
		return (java.lang.Object) getStateHelper().eval(Z_INDEX, null);
	}

	protected void setZIndex(java.lang.Object zIndex) {
		getStateHelper().put(Z_INDEX, zIndex);
	}

	protected java.lang.String getAfterBuilderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BUILDER_CHANGE, null);
	}

	protected void setAfterBuilderChange(java.lang.String afterBuilderChange) {
		getStateHelper().put(AFTER_BUILDER_CHANGE, afterBuilderChange);
	}

	protected java.lang.String getAfterConnectorsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONNECTORS_CHANGE, null);
	}

	protected void setAfterConnectorsChange(java.lang.String afterConnectorsChange) {
		getStateHelper().put(AFTER_CONNECTORS_CHANGE, afterConnectorsChange);
	}

	protected java.lang.String getAfterControlsToolbarChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTROLS_TOOLBAR_CHANGE, null);
	}

	protected void setAfterControlsToolbarChange(java.lang.String afterControlsToolbarChange) {
		getStateHelper().put(AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange);
	}

	protected java.lang.String getAfterDescriptionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESCRIPTION_CHANGE, null);
	}

	protected void setAfterDescriptionChange(java.lang.String afterDescriptionChange) {
		getStateHelper().put(AFTER_DESCRIPTION_CHANGE, afterDescriptionChange);
	}

	protected java.lang.String getAfterGraphicChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_GRAPHIC_CHANGE, null);
	}

	protected void setAfterGraphicChange(java.lang.String afterGraphicChange) {
		getStateHelper().put(AFTER_GRAPHIC_CHANGE, afterGraphicChange);
	}

	protected java.lang.String getAfterHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEIGHT_CHANGE, null);
	}

	protected void setAfterHeightChange(java.lang.String afterHeightChange) {
		getStateHelper().put(AFTER_HEIGHT_CHANGE, afterHeightChange);
	}

	protected java.lang.String getAfterHighlightBoundaryStrokeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, null);
	}

	protected void setAfterHighlightBoundaryStrokeChange(java.lang.String afterHighlightBoundaryStrokeChange) {
		getStateHelper().put(AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, afterHighlightBoundaryStrokeChange);
	}

	protected java.lang.String getAfterHighlightedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIGHLIGHTED_CHANGE, null);
	}

	protected void setAfterHighlightedChange(java.lang.String afterHighlightedChange) {
		getStateHelper().put(AFTER_HIGHLIGHTED_CHANGE, afterHighlightedChange);
	}

	protected java.lang.String getAfterNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NAME_CHANGE, null);
	}

	protected void setAfterNameChange(java.lang.String afterNameChange) {
		getStateHelper().put(AFTER_NAME_CHANGE, afterNameChange);
	}

	protected java.lang.String getAfterRequiredChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_REQUIRED_CHANGE, null);
	}

	protected void setAfterRequiredChange(java.lang.String afterRequiredChange) {
		getStateHelper().put(AFTER_REQUIRED_CHANGE, afterRequiredChange);
	}

	protected java.lang.String getAfterSelectedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECTED_CHANGE, null);
	}

	protected void setAfterSelectedChange(java.lang.String afterSelectedChange) {
		getStateHelper().put(AFTER_SELECTED_CHANGE, afterSelectedChange);
	}

	protected java.lang.String getAfterShapeBoundaryChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHAPE_BOUNDARY_CHANGE, null);
	}

	protected void setAfterShapeBoundaryChange(java.lang.String afterShapeBoundaryChange) {
		getStateHelper().put(AFTER_SHAPE_BOUNDARY_CHANGE, afterShapeBoundaryChange);
	}

	protected java.lang.String getAfterShapeInviteChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHAPE_INVITE_CHANGE, null);
	}

	protected void setAfterShapeInviteChange(java.lang.String afterShapeInviteChange) {
		getStateHelper().put(AFTER_SHAPE_INVITE_CHANGE, afterShapeInviteChange);
	}

	protected java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	protected void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	protected java.lang.String getAfterTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_INDEX_CHANGE, null);
	}

	protected void setAfterTabIndexChange(java.lang.String afterTabIndexChange) {
		getStateHelper().put(AFTER_TAB_INDEX_CHANGE, afterTabIndexChange);
	}

	protected java.lang.String getAfterTransitionsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRANSITIONS_CHANGE, null);
	}

	protected void setAfterTransitionsChange(java.lang.String afterTransitionsChange) {
		getStateHelper().put(AFTER_TRANSITIONS_CHANGE, afterTransitionsChange);
	}

	protected java.lang.String getAfterTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TYPE_CHANGE, null);
	}

	protected void setAfterTypeChange(java.lang.String afterTypeChange) {
		getStateHelper().put(AFTER_TYPE_CHANGE, afterTypeChange);
	}

	protected java.lang.String getAfterWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_WIDTH_CHANGE, null);
	}

	protected void setAfterWidthChange(java.lang.String afterWidthChange) {
		getStateHelper().put(AFTER_WIDTH_CHANGE, afterWidthChange);
	}

	protected java.lang.String getAfterZIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ZINDEX_CHANGE, null);
	}

	protected void setAfterZIndexChange(java.lang.String afterZIndexChange) {
		getStateHelper().put(AFTER_ZINDEX_CHANGE, afterZIndexChange);
	}

	protected java.lang.String getOnBuilderChange() {
		return (java.lang.String) getStateHelper().eval(ON_BUILDER_CHANGE, null);
	}

	protected void setOnBuilderChange(java.lang.String onBuilderChange) {
		getStateHelper().put(ON_BUILDER_CHANGE, onBuilderChange);
	}

	protected java.lang.String getOnConnectorsChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONNECTORS_CHANGE, null);
	}

	protected void setOnConnectorsChange(java.lang.String onConnectorsChange) {
		getStateHelper().put(ON_CONNECTORS_CHANGE, onConnectorsChange);
	}

	protected java.lang.String getOnControlsToolbarChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTROLS_TOOLBAR_CHANGE, null);
	}

	protected void setOnControlsToolbarChange(java.lang.String onControlsToolbarChange) {
		getStateHelper().put(ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange);
	}

	protected java.lang.String getOnDescriptionChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESCRIPTION_CHANGE, null);
	}

	protected void setOnDescriptionChange(java.lang.String onDescriptionChange) {
		getStateHelper().put(ON_DESCRIPTION_CHANGE, onDescriptionChange);
	}

	protected java.lang.String getOnGraphicChange() {
		return (java.lang.String) getStateHelper().eval(ON_GRAPHIC_CHANGE, null);
	}

	protected void setOnGraphicChange(java.lang.String onGraphicChange) {
		getStateHelper().put(ON_GRAPHIC_CHANGE, onGraphicChange);
	}

	protected java.lang.String getOnHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEIGHT_CHANGE, null);
	}

	protected void setOnHeightChange(java.lang.String onHeightChange) {
		getStateHelper().put(ON_HEIGHT_CHANGE, onHeightChange);
	}

	protected java.lang.String getOnHighlightBoundaryStrokeChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, null);
	}

	protected void setOnHighlightBoundaryStrokeChange(java.lang.String onHighlightBoundaryStrokeChange) {
		getStateHelper().put(ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, onHighlightBoundaryStrokeChange);
	}

	protected java.lang.String getOnHighlightedChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIGHLIGHTED_CHANGE, null);
	}

	protected void setOnHighlightedChange(java.lang.String onHighlightedChange) {
		getStateHelper().put(ON_HIGHLIGHTED_CHANGE, onHighlightedChange);
	}

	protected java.lang.String getOnNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_NAME_CHANGE, null);
	}

	protected void setOnNameChange(java.lang.String onNameChange) {
		getStateHelper().put(ON_NAME_CHANGE, onNameChange);
	}

	protected java.lang.String getOnRequiredChange() {
		return (java.lang.String) getStateHelper().eval(ON_REQUIRED_CHANGE, null);
	}

	protected void setOnRequiredChange(java.lang.String onRequiredChange) {
		getStateHelper().put(ON_REQUIRED_CHANGE, onRequiredChange);
	}

	protected java.lang.String getOnSelectedChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECTED_CHANGE, null);
	}

	protected void setOnSelectedChange(java.lang.String onSelectedChange) {
		getStateHelper().put(ON_SELECTED_CHANGE, onSelectedChange);
	}

	protected java.lang.String getOnShapeBoundaryChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHAPE_BOUNDARY_CHANGE, null);
	}

	protected void setOnShapeBoundaryChange(java.lang.String onShapeBoundaryChange) {
		getStateHelper().put(ON_SHAPE_BOUNDARY_CHANGE, onShapeBoundaryChange);
	}

	protected java.lang.String getOnShapeInviteChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHAPE_INVITE_CHANGE, null);
	}

	protected void setOnShapeInviteChange(java.lang.String onShapeInviteChange) {
		getStateHelper().put(ON_SHAPE_INVITE_CHANGE, onShapeInviteChange);
	}

	protected java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	protected void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

	protected java.lang.String getOnTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_INDEX_CHANGE, null);
	}

	protected void setOnTabIndexChange(java.lang.String onTabIndexChange) {
		getStateHelper().put(ON_TAB_INDEX_CHANGE, onTabIndexChange);
	}

	protected java.lang.String getOnTransitionsChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRANSITIONS_CHANGE, null);
	}

	protected void setOnTransitionsChange(java.lang.String onTransitionsChange) {
		getStateHelper().put(ON_TRANSITIONS_CHANGE, onTransitionsChange);
	}

	protected java.lang.String getOnTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TYPE_CHANGE, null);
	}

	protected void setOnTypeChange(java.lang.String onTypeChange) {
		getStateHelper().put(ON_TYPE_CHANGE, onTypeChange);
	}

	protected java.lang.String getOnWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_WIDTH_CHANGE, null);
	}

	protected void setOnWidthChange(java.lang.String onWidthChange) {
		getStateHelper().put(ON_WIDTH_CHANGE, onWidthChange);
	}

	protected java.lang.String getOnZIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_ZINDEX_CHANGE, null);
	}

	protected void setOnZIndexChange(java.lang.String onZIndexChange) {
		getStateHelper().put(ON_ZINDEX_CHANGE, onZIndexChange);
	}

}