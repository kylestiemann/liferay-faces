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
package com.liferay.faces.alloy.component.diagramnodefork;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class DiagramNodeForkBase extends javax.faces.component.UIPanel {

	public static final String ALIGN = "align";
	public static final String ALIGN_ON = "alignOn";
	public static final String DIAGRAMNODEFORK_BODY_CONTENT = "diagramnodeforkBodyContent";
	public static final String BOUNDING_BOX = "boundingBox";
	public static final String BUILDER = "builder";
	public static final String CENTERED = "centered";
	public static final String CONNECTORS = "connectors";
	public static final String CONSTRAIN = "constrain";
	public static final String CONTENT_BOX = "contentBox";
	public static final String CONTROLS_TOOLBAR = "controlsToolbar";
	public static final String DESCRIPTION = "description";
	public static final String DESTROYED = "destroyed";
	public static final String DISABLED = "disabled";
	public static final String FILL_HEIGHT = "fillHeight";
	public static final String FOCUSED = "focused";
	public static final String FOOTER_CONTENT = "footerContent";
	public static final String GRAPHIC = "graphic";
	public static final String HEADER_CONTENT = "headerContent";
	public static final String HEIGHT = "height";
	public static final String HIGHLIGHT_BOUNDARY_STROKE = "highlightBoundaryStroke";
	public static final String HIGHLIGHTED = "highlighted";
	public static final String DIAGRAMNODEFORK_ID = "diagramnodeforkId";
	public static final String INITIALIZED = "initialized";
	public static final String DIAGRAMNODEFORK_LOCALE = "diagramnodeforkLocale";
	public static final String NAME = "name";
	public static final String PREVENT_OVERLAP = "preventOverlap";
	public static final String RENDER = "render";
	public static final String RENDERED = "rendered";
	public static final String REQUIRED = "required";
	public static final String SELECTED = "selected";
	public static final String SHAPE_BOUNDARY = "shapeBoundary";
	public static final String SHAPE_INVITE = "shapeInvite";
	public static final String SHIM = "shim";
	public static final String SRC_NODE = "srcNode";
	public static final String STRINGS = "strings";
	public static final String TAB_INDEX = "tabIndex";
	public static final String TRANSITIONS = "transitions";
	public static final String TYPE = "type";
	public static final String VISIBLE = "visible";
	public static final String WIDTH = "width";
	public static final String X = "x";
	public static final String XY = "xy";
	public static final String Y = "y";
	public static final String Z_INDEX = "zIndex";
	public static final String AFTER_ALIGN_CHANGE = "afterAlignChange";
	public static final String AFTER_ALIGN_ON_CHANGE = "afterAlignOnChange";
	public static final String AFTER_BODY_CONTENT_CHANGE = "afterBodyContentChange";
	public static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	public static final String AFTER_BUILDER_CHANGE = "afterBuilderChange";
	public static final String AFTER_CENTERED_CHANGE = "afterCenteredChange";
	public static final String AFTER_CONNECTORS_CHANGE = "afterConnectorsChange";
	public static final String AFTER_CONSTRAIN_CHANGE = "afterConstrainChange";
	public static final String AFTER_CONTENT_BOX_CHANGE = "afterContentBoxChange";
	public static final String AFTER_CONTROLS_TOOLBAR_CHANGE = "afterControlsToolbarChange";
	public static final String AFTER_DESCRIPTION_CHANGE = "afterDescriptionChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	public static final String AFTER_FILL_HEIGHT_CHANGE = "afterFillHeightChange";
	public static final String AFTER_FOCUSED_CHANGE = "afterFocusedChange";
	public static final String AFTER_FOOTER_CONTENT_CHANGE = "afterFooterContentChange";
	public static final String AFTER_GRAPHIC_CHANGE = "afterGraphicChange";
	public static final String AFTER_HEADER_CONTENT_CHANGE = "afterHeaderContentChange";
	public static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	public static final String AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE = "afterHighlightBoundaryStrokeChange";
	public static final String AFTER_HIGHLIGHTED_CHANGE = "afterHighlightedChange";
	public static final String AFTER_ID_CHANGE = "afterIdChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_LOCALE_CHANGE = "afterLocaleChange";
	public static final String AFTER_NAME_CHANGE = "afterNameChange";
	public static final String AFTER_PREVENT_OVERLAP_CHANGE = "afterPreventOverlapChange";
	public static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	public static final String AFTER_RENDERED_CHANGE = "afterRenderedChange";
	public static final String AFTER_REQUIRED_CHANGE = "afterRequiredChange";
	public static final String AFTER_SELECTED_CHANGE = "afterSelectedChange";
	public static final String AFTER_SHAPE_BOUNDARY_CHANGE = "afterShapeBoundaryChange";
	public static final String AFTER_SHAPE_INVITE_CHANGE = "afterShapeInviteChange";
	public static final String AFTER_SHIM_CHANGE = "afterShimChange";
	public static final String AFTER_SRC_NODE_CHANGE = "afterSrcNodeChange";
	public static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	public static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	public static final String AFTER_TRANSITIONS_CHANGE = "afterTransitionsChange";
	public static final String AFTER_TYPE_CHANGE = "afterTypeChange";
	public static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	public static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	public static final String AFTER_XCHANGE = "afterXChange";
	public static final String AFTER_XY_CHANGE = "afterXyChange";
	public static final String AFTER_YCHANGE = "afterYChange";
	public static final String AFTER_ZINDEX_CHANGE = "afterZIndexChange";
	public static final String ON_ALIGN_CHANGE = "onAlignChange";
	public static final String ON_ALIGN_ON_CHANGE = "onAlignOnChange";
	public static final String ON_BODY_CONTENT_CHANGE = "onBodyContentChange";
	public static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	public static final String ON_BUILDER_CHANGE = "onBuilderChange";
	public static final String ON_CENTERED_CHANGE = "onCenteredChange";
	public static final String ON_CONNECTORS_CHANGE = "onConnectorsChange";
	public static final String ON_CONSTRAIN_CHANGE = "onConstrainChange";
	public static final String ON_CONTENT_BOX_CHANGE = "onContentBoxChange";
	public static final String ON_CONTROLS_TOOLBAR_CHANGE = "onControlsToolbarChange";
	public static final String ON_DESCRIPTION_CHANGE = "onDescriptionChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_DISABLED_CHANGE = "onDisabledChange";
	public static final String ON_FILL_HEIGHT_CHANGE = "onFillHeightChange";
	public static final String ON_FOCUSED_CHANGE = "onFocusedChange";
	public static final String ON_FOOTER_CONTENT_CHANGE = "onFooterContentChange";
	public static final String ON_GRAPHIC_CHANGE = "onGraphicChange";
	public static final String ON_HEADER_CONTENT_CHANGE = "onHeaderContentChange";
	public static final String ON_HEIGHT_CHANGE = "onHeightChange";
	public static final String ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE = "onHighlightBoundaryStrokeChange";
	public static final String ON_HIGHLIGHTED_CHANGE = "onHighlightedChange";
	public static final String ON_ID_CHANGE = "onIdChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_LOCALE_CHANGE = "onLocaleChange";
	public static final String ON_NAME_CHANGE = "onNameChange";
	public static final String ON_PREVENT_OVERLAP_CHANGE = "onPreventOverlapChange";
	public static final String ON_RENDER_CHANGE = "onRenderChange";
	public static final String ON_RENDERED_CHANGE = "onRenderedChange";
	public static final String ON_REQUIRED_CHANGE = "onRequiredChange";
	public static final String ON_SELECTED_CHANGE = "onSelectedChange";
	public static final String ON_SHAPE_BOUNDARY_CHANGE = "onShapeBoundaryChange";
	public static final String ON_SHAPE_INVITE_CHANGE = "onShapeInviteChange";
	public static final String ON_SHIM_CHANGE = "onShimChange";
	public static final String ON_SRC_NODE_CHANGE = "onSrcNodeChange";
	public static final String ON_STRINGS_CHANGE = "onStringsChange";
	public static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	public static final String ON_TRANSITIONS_CHANGE = "onTransitionsChange";
	public static final String ON_TYPE_CHANGE = "onTypeChange";
	public static final String ON_VISIBLE_CHANGE = "onVisibleChange";
	public static final String ON_WIDTH_CHANGE = "onWidthChange";
	public static final String ON_XCHANGE = "onXChange";
	public static final String ON_XY_CHANGE = "onXyChange";
	public static final String ON_YCHANGE = "onYChange";
	public static final String ON_ZINDEX_CHANGE = "onZIndexChange";

	public java.lang.Object getAlign() {
		return (java.lang.Object) getStateHelper().eval(ALIGN, null);
	}

	public void setAlign(java.lang.Object align) {
		getStateHelper().put(ALIGN, align);
	}

	public java.lang.Object getAlignOn() {
		return (java.lang.Object) getStateHelper().eval(ALIGN_ON, null);
	}

	public void setAlignOn(java.lang.Object alignOn) {
		getStateHelper().put(ALIGN_ON, alignOn);
	}

	public java.lang.Object getDiagramnodeforkBodyContent() {
		return (java.lang.Object) getStateHelper().eval(DIAGRAMNODEFORK_BODY_CONTENT, null);
	}

	public void setDiagramnodeforkBodyContent(java.lang.Object diagramnodeforkBodyContent) {
		getStateHelper().put(DIAGRAMNODEFORK_BODY_CONTENT, diagramnodeforkBodyContent);
	}

	public java.lang.String getBoundingBox() {
		return (java.lang.String) getStateHelper().eval(BOUNDING_BOX, null);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		getStateHelper().put(BOUNDING_BOX, boundingBox);
	}

	public java.lang.Object getBuilder() {
		return (java.lang.Object) getStateHelper().eval(BUILDER, null);
	}

	public void setBuilder(java.lang.Object builder) {
		getStateHelper().put(BUILDER, builder);
	}

	public java.lang.Object getCentered() {
		return (java.lang.Object) getStateHelper().eval(CENTERED, null);
	}

	public void setCentered(java.lang.Object centered) {
		getStateHelper().put(CENTERED, centered);
	}

	public java.lang.String getConnectors() {
		return (java.lang.String) getStateHelper().eval(CONNECTORS, null);
	}

	public void setConnectors(java.lang.String connectors) {
		getStateHelper().put(CONNECTORS, connectors);
	}

	public java.lang.Object getConstrain() {
		return (java.lang.Object) getStateHelper().eval(CONSTRAIN, null);
	}

	public void setConstrain(java.lang.Object constrain) {
		getStateHelper().put(CONSTRAIN, constrain);
	}

	public java.lang.String getContentBox() {
		return (java.lang.String) getStateHelper().eval(CONTENT_BOX, null);
	}

	public void setContentBox(java.lang.String contentBox) {
		getStateHelper().put(CONTENT_BOX, contentBox);
	}

	public java.lang.Object getControlsToolbar() {
		return (java.lang.Object) getStateHelper().eval(CONTROLS_TOOLBAR, null);
	}

	public void setControlsToolbar(java.lang.Object controlsToolbar) {
		getStateHelper().put(CONTROLS_TOOLBAR, controlsToolbar);
	}

	public java.lang.String getDescription() {
		return (java.lang.String) getStateHelper().eval(DESCRIPTION, null);
	}

	public void setDescription(java.lang.String description) {
		getStateHelper().put(DESCRIPTION, description);
	}

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.Boolean getDisabled() {
		return (java.lang.Boolean) getStateHelper().eval(DISABLED, null);
	}

	public void setDisabled(java.lang.Boolean disabled) {
		getStateHelper().put(DISABLED, disabled);
	}

	public java.lang.Object getFillHeight() {
		return (java.lang.Object) getStateHelper().eval(FILL_HEIGHT, null);
	}

	public void setFillHeight(java.lang.Object fillHeight) {
		getStateHelper().put(FILL_HEIGHT, fillHeight);
	}

	public java.lang.Boolean getFocused() {
		return (java.lang.Boolean) getStateHelper().eval(FOCUSED, null);
	}

	public void setFocused(java.lang.Boolean focused) {
		getStateHelper().put(FOCUSED, focused);
	}

	public java.lang.Object getFooterContent() {
		return (java.lang.Object) getStateHelper().eval(FOOTER_CONTENT, null);
	}

	public void setFooterContent(java.lang.Object footerContent) {
		getStateHelper().put(FOOTER_CONTENT, footerContent);
	}

	public java.lang.Object getGraphic() {
		return (java.lang.Object) getStateHelper().eval(GRAPHIC, null);
	}

	public void setGraphic(java.lang.Object graphic) {
		getStateHelper().put(GRAPHIC, graphic);
	}

	public java.lang.Object getHeaderContent() {
		return (java.lang.Object) getStateHelper().eval(HEADER_CONTENT, null);
	}

	public void setHeaderContent(java.lang.Object headerContent) {
		getStateHelper().put(HEADER_CONTENT, headerContent);
	}

	public java.lang.Object getHeight() {
		return (java.lang.Object) getStateHelper().eval(HEIGHT, null);
	}

	public void setHeight(java.lang.Object height) {
		getStateHelper().put(HEIGHT, height);
	}

	public java.lang.Object getHighlightBoundaryStroke() {
		return (java.lang.Object) getStateHelper().eval(HIGHLIGHT_BOUNDARY_STROKE, null);
	}

	public void setHighlightBoundaryStroke(java.lang.Object highlightBoundaryStroke) {
		getStateHelper().put(HIGHLIGHT_BOUNDARY_STROKE, highlightBoundaryStroke);
	}

	public java.lang.Boolean getHighlighted() {
		return (java.lang.Boolean) getStateHelper().eval(HIGHLIGHTED, null);
	}

	public void setHighlighted(java.lang.Boolean highlighted) {
		getStateHelper().put(HIGHLIGHTED, highlighted);
	}

	public java.lang.String getDiagramnodeforkId() {
		return (java.lang.String) getStateHelper().eval(DIAGRAMNODEFORK_ID, null);
	}

	public void setDiagramnodeforkId(java.lang.String diagramnodeforkId) {
		getStateHelper().put(DIAGRAMNODEFORK_ID, diagramnodeforkId);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.String getDiagramnodeforkLocale() {
		return (java.lang.String) getStateHelper().eval(DIAGRAMNODEFORK_LOCALE, null);
	}

	public void setDiagramnodeforkLocale(java.lang.String diagramnodeforkLocale) {
		getStateHelper().put(DIAGRAMNODEFORK_LOCALE, diagramnodeforkLocale);
	}

	public java.lang.String getName() {
		return (java.lang.String) getStateHelper().eval(NAME, null);
	}

	public void setName(java.lang.String name) {
		getStateHelper().put(NAME, name);
	}

	public java.lang.Boolean getPreventOverlap() {
		return (java.lang.Boolean) getStateHelper().eval(PREVENT_OVERLAP, null);
	}

	public void setPreventOverlap(java.lang.Boolean preventOverlap) {
		getStateHelper().put(PREVENT_OVERLAP, preventOverlap);
	}

	public java.lang.Object getRender() {
		return (java.lang.Object) getStateHelper().eval(RENDER, null);
	}

	public void setRender(java.lang.Object render) {
		getStateHelper().put(RENDER, render);
	}

	public java.lang.Boolean getRendered() {
		return (java.lang.Boolean) getStateHelper().eval(RENDERED, null);
	}

	public void setRendered(java.lang.Boolean rendered) {
		getStateHelper().put(RENDERED, rendered);
	}

	public java.lang.Boolean getRequired() {
		return (java.lang.Boolean) getStateHelper().eval(REQUIRED, null);
	}

	public void setRequired(java.lang.Boolean required) {
		getStateHelper().put(REQUIRED, required);
	}

	public java.lang.Boolean getSelected() {
		return (java.lang.Boolean) getStateHelper().eval(SELECTED, null);
	}

	public void setSelected(java.lang.Boolean selected) {
		getStateHelper().put(SELECTED, selected);
	}

	public java.lang.Object getShapeBoundary() {
		return (java.lang.Object) getStateHelper().eval(SHAPE_BOUNDARY, null);
	}

	public void setShapeBoundary(java.lang.Object shapeBoundary) {
		getStateHelper().put(SHAPE_BOUNDARY, shapeBoundary);
	}

	public java.lang.Object getShapeInvite() {
		return (java.lang.Object) getStateHelper().eval(SHAPE_INVITE, null);
	}

	public void setShapeInvite(java.lang.Object shapeInvite) {
		getStateHelper().put(SHAPE_INVITE, shapeInvite);
	}

	public java.lang.Boolean getShim() {
		return (java.lang.Boolean) getStateHelper().eval(SHIM, null);
	}

	public void setShim(java.lang.Boolean shim) {
		getStateHelper().put(SHIM, shim);
	}

	public java.lang.String getSrcNode() {
		return (java.lang.String) getStateHelper().eval(SRC_NODE, null);
	}

	public void setSrcNode(java.lang.String srcNode) {
		getStateHelper().put(SRC_NODE, srcNode);
	}

	public java.lang.Object getStrings() {
		return (java.lang.Object) getStateHelper().eval(STRINGS, null);
	}

	public void setStrings(java.lang.Object strings) {
		getStateHelper().put(STRINGS, strings);
	}

	public java.lang.Object getTabIndex() {
		return (java.lang.Object) getStateHelper().eval(TAB_INDEX, null);
	}

	public void setTabIndex(java.lang.Object tabIndex) {
		getStateHelper().put(TAB_INDEX, tabIndex);
	}

	public java.lang.String getTransitions() {
		return (java.lang.String) getStateHelper().eval(TRANSITIONS, null);
	}

	public void setTransitions(java.lang.String transitions) {
		getStateHelper().put(TRANSITIONS, transitions);
	}

	public java.lang.String getType() {
		return (java.lang.String) getStateHelper().eval(TYPE, null);
	}

	public void setType(java.lang.String type) {
		getStateHelper().put(TYPE, type);
	}

	public java.lang.Boolean getVisible() {
		return (java.lang.Boolean) getStateHelper().eval(VISIBLE, null);
	}

	public void setVisible(java.lang.Boolean visible) {
		getStateHelper().put(VISIBLE, visible);
	}

	public java.lang.Object getWidth() {
		return (java.lang.Object) getStateHelper().eval(WIDTH, null);
	}

	public void setWidth(java.lang.Object width) {
		getStateHelper().put(WIDTH, width);
	}

	public java.lang.Object getX() {
		return (java.lang.Object) getStateHelper().eval(X, null);
	}

	public void setX(java.lang.Object x) {
		getStateHelper().put(X, x);
	}

	public java.lang.Object getXy() {
		return (java.lang.Object) getStateHelper().eval(XY, null);
	}

	public void setXy(java.lang.Object xy) {
		getStateHelper().put(XY, xy);
	}

	public java.lang.Object getY() {
		return (java.lang.Object) getStateHelper().eval(Y, null);
	}

	public void setY(java.lang.Object y) {
		getStateHelper().put(Y, y);
	}

	public java.lang.Object getZIndex() {
		return (java.lang.Object) getStateHelper().eval(Z_INDEX, null);
	}

	public void setZIndex(java.lang.Object zIndex) {
		getStateHelper().put(Z_INDEX, zIndex);
	}

	public java.lang.String getAfterAlignChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALIGN_CHANGE, null);
	}

	public void setAfterAlignChange(java.lang.String afterAlignChange) {
		getStateHelper().put(AFTER_ALIGN_CHANGE, afterAlignChange);
	}

	public java.lang.String getAfterAlignOnChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALIGN_ON_CHANGE, null);
	}

	public void setAfterAlignOnChange(java.lang.String afterAlignOnChange) {
		getStateHelper().put(AFTER_ALIGN_ON_CHANGE, afterAlignOnChange);
	}

	public java.lang.String getAfterBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BODY_CONTENT_CHANGE, null);
	}

	public void setAfterBodyContentChange(java.lang.String afterBodyContentChange) {
		getStateHelper().put(AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange);
	}

	public java.lang.String getAfterBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BOUNDING_BOX_CHANGE, null);
	}

	public void setAfterBoundingBoxChange(java.lang.String afterBoundingBoxChange) {
		getStateHelper().put(AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange);
	}

	public java.lang.String getAfterBuilderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BUILDER_CHANGE, null);
	}

	public void setAfterBuilderChange(java.lang.String afterBuilderChange) {
		getStateHelper().put(AFTER_BUILDER_CHANGE, afterBuilderChange);
	}

	public java.lang.String getAfterCenteredChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CENTERED_CHANGE, null);
	}

	public void setAfterCenteredChange(java.lang.String afterCenteredChange) {
		getStateHelper().put(AFTER_CENTERED_CHANGE, afterCenteredChange);
	}

	public java.lang.String getAfterConnectorsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONNECTORS_CHANGE, null);
	}

	public void setAfterConnectorsChange(java.lang.String afterConnectorsChange) {
		getStateHelper().put(AFTER_CONNECTORS_CHANGE, afterConnectorsChange);
	}

	public java.lang.String getAfterConstrainChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONSTRAIN_CHANGE, null);
	}

	public void setAfterConstrainChange(java.lang.String afterConstrainChange) {
		getStateHelper().put(AFTER_CONSTRAIN_CHANGE, afterConstrainChange);
	}

	public java.lang.String getAfterContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_BOX_CHANGE, null);
	}

	public void setAfterContentBoxChange(java.lang.String afterContentBoxChange) {
		getStateHelper().put(AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange);
	}

	public java.lang.String getAfterControlsToolbarChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTROLS_TOOLBAR_CHANGE, null);
	}

	public void setAfterControlsToolbarChange(java.lang.String afterControlsToolbarChange) {
		getStateHelper().put(AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange);
	}

	public java.lang.String getAfterDescriptionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESCRIPTION_CHANGE, null);
	}

	public void setAfterDescriptionChange(java.lang.String afterDescriptionChange) {
		getStateHelper().put(AFTER_DESCRIPTION_CHANGE, afterDescriptionChange);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterDisabledChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DISABLED_CHANGE, null);
	}

	public void setAfterDisabledChange(java.lang.String afterDisabledChange) {
		getStateHelper().put(AFTER_DISABLED_CHANGE, afterDisabledChange);
	}

	public java.lang.String getAfterFillHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FILL_HEIGHT_CHANGE, null);
	}

	public void setAfterFillHeightChange(java.lang.String afterFillHeightChange) {
		getStateHelper().put(AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange);
	}

	public java.lang.String getAfterFocusedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOCUSED_CHANGE, null);
	}

	public void setAfterFocusedChange(java.lang.String afterFocusedChange) {
		getStateHelper().put(AFTER_FOCUSED_CHANGE, afterFocusedChange);
	}

	public java.lang.String getAfterFooterContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOOTER_CONTENT_CHANGE, null);
	}

	public void setAfterFooterContentChange(java.lang.String afterFooterContentChange) {
		getStateHelper().put(AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange);
	}

	public java.lang.String getAfterGraphicChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_GRAPHIC_CHANGE, null);
	}

	public void setAfterGraphicChange(java.lang.String afterGraphicChange) {
		getStateHelper().put(AFTER_GRAPHIC_CHANGE, afterGraphicChange);
	}

	public java.lang.String getAfterHeaderContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADER_CONTENT_CHANGE, null);
	}

	public void setAfterHeaderContentChange(java.lang.String afterHeaderContentChange) {
		getStateHelper().put(AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange);
	}

	public java.lang.String getAfterHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEIGHT_CHANGE, null);
	}

	public void setAfterHeightChange(java.lang.String afterHeightChange) {
		getStateHelper().put(AFTER_HEIGHT_CHANGE, afterHeightChange);
	}

	public java.lang.String getAfterHighlightBoundaryStrokeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, null);
	}

	public void setAfterHighlightBoundaryStrokeChange(java.lang.String afterHighlightBoundaryStrokeChange) {
		getStateHelper().put(AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, afterHighlightBoundaryStrokeChange);
	}

	public java.lang.String getAfterHighlightedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIGHLIGHTED_CHANGE, null);
	}

	public void setAfterHighlightedChange(java.lang.String afterHighlightedChange) {
		getStateHelper().put(AFTER_HIGHLIGHTED_CHANGE, afterHighlightedChange);
	}

	public java.lang.String getAfterIdChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ID_CHANGE, null);
	}

	public void setAfterIdChange(java.lang.String afterIdChange) {
		getStateHelper().put(AFTER_ID_CHANGE, afterIdChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterLocaleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOCALE_CHANGE, null);
	}

	public void setAfterLocaleChange(java.lang.String afterLocaleChange) {
		getStateHelper().put(AFTER_LOCALE_CHANGE, afterLocaleChange);
	}

	public java.lang.String getAfterNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NAME_CHANGE, null);
	}

	public void setAfterNameChange(java.lang.String afterNameChange) {
		getStateHelper().put(AFTER_NAME_CHANGE, afterNameChange);
	}

	public java.lang.String getAfterPreventOverlapChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PREVENT_OVERLAP_CHANGE, null);
	}

	public void setAfterPreventOverlapChange(java.lang.String afterPreventOverlapChange) {
		getStateHelper().put(AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange);
	}

	public java.lang.String getAfterRenderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_CHANGE, null);
	}

	public void setAfterRenderChange(java.lang.String afterRenderChange) {
		getStateHelper().put(AFTER_RENDER_CHANGE, afterRenderChange);
	}

	public java.lang.String getAfterRenderedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDERED_CHANGE, null);
	}

	public void setAfterRenderedChange(java.lang.String afterRenderedChange) {
		getStateHelper().put(AFTER_RENDERED_CHANGE, afterRenderedChange);
	}

	public java.lang.String getAfterRequiredChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_REQUIRED_CHANGE, null);
	}

	public void setAfterRequiredChange(java.lang.String afterRequiredChange) {
		getStateHelper().put(AFTER_REQUIRED_CHANGE, afterRequiredChange);
	}

	public java.lang.String getAfterSelectedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECTED_CHANGE, null);
	}

	public void setAfterSelectedChange(java.lang.String afterSelectedChange) {
		getStateHelper().put(AFTER_SELECTED_CHANGE, afterSelectedChange);
	}

	public java.lang.String getAfterShapeBoundaryChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHAPE_BOUNDARY_CHANGE, null);
	}

	public void setAfterShapeBoundaryChange(java.lang.String afterShapeBoundaryChange) {
		getStateHelper().put(AFTER_SHAPE_BOUNDARY_CHANGE, afterShapeBoundaryChange);
	}

	public java.lang.String getAfterShapeInviteChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHAPE_INVITE_CHANGE, null);
	}

	public void setAfterShapeInviteChange(java.lang.String afterShapeInviteChange) {
		getStateHelper().put(AFTER_SHAPE_INVITE_CHANGE, afterShapeInviteChange);
	}

	public java.lang.String getAfterShimChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHIM_CHANGE, null);
	}

	public void setAfterShimChange(java.lang.String afterShimChange) {
		getStateHelper().put(AFTER_SHIM_CHANGE, afterShimChange);
	}

	public java.lang.String getAfterSrcNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SRC_NODE_CHANGE, null);
	}

	public void setAfterSrcNodeChange(java.lang.String afterSrcNodeChange) {
		getStateHelper().put(AFTER_SRC_NODE_CHANGE, afterSrcNodeChange);
	}

	public java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	public void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	public java.lang.String getAfterTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_INDEX_CHANGE, null);
	}

	public void setAfterTabIndexChange(java.lang.String afterTabIndexChange) {
		getStateHelper().put(AFTER_TAB_INDEX_CHANGE, afterTabIndexChange);
	}

	public java.lang.String getAfterTransitionsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRANSITIONS_CHANGE, null);
	}

	public void setAfterTransitionsChange(java.lang.String afterTransitionsChange) {
		getStateHelper().put(AFTER_TRANSITIONS_CHANGE, afterTransitionsChange);
	}

	public java.lang.String getAfterTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TYPE_CHANGE, null);
	}

	public void setAfterTypeChange(java.lang.String afterTypeChange) {
		getStateHelper().put(AFTER_TYPE_CHANGE, afterTypeChange);
	}

	public java.lang.String getAfterVisibleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VISIBLE_CHANGE, null);
	}

	public void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		getStateHelper().put(AFTER_VISIBLE_CHANGE, afterVisibleChange);
	}

	public java.lang.String getAfterWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_WIDTH_CHANGE, null);
	}

	public void setAfterWidthChange(java.lang.String afterWidthChange) {
		getStateHelper().put(AFTER_WIDTH_CHANGE, afterWidthChange);
	}

	public java.lang.String getAfterXChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_XCHANGE, null);
	}

	public void setAfterXChange(java.lang.String afterXChange) {
		getStateHelper().put(AFTER_XCHANGE, afterXChange);
	}

	public java.lang.String getAfterXyChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_XY_CHANGE, null);
	}

	public void setAfterXyChange(java.lang.String afterXyChange) {
		getStateHelper().put(AFTER_XY_CHANGE, afterXyChange);
	}

	public java.lang.String getAfterYChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_YCHANGE, null);
	}

	public void setAfterYChange(java.lang.String afterYChange) {
		getStateHelper().put(AFTER_YCHANGE, afterYChange);
	}

	public java.lang.String getAfterZIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ZINDEX_CHANGE, null);
	}

	public void setAfterZIndexChange(java.lang.String afterZIndexChange) {
		getStateHelper().put(AFTER_ZINDEX_CHANGE, afterZIndexChange);
	}

	public java.lang.String getOnAlignChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALIGN_CHANGE, null);
	}

	public void setOnAlignChange(java.lang.String onAlignChange) {
		getStateHelper().put(ON_ALIGN_CHANGE, onAlignChange);
	}

	public java.lang.String getOnAlignOnChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALIGN_ON_CHANGE, null);
	}

	public void setOnAlignOnChange(java.lang.String onAlignOnChange) {
		getStateHelper().put(ON_ALIGN_ON_CHANGE, onAlignOnChange);
	}

	public java.lang.String getOnBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_BODY_CONTENT_CHANGE, null);
	}

	public void setOnBodyContentChange(java.lang.String onBodyContentChange) {
		getStateHelper().put(ON_BODY_CONTENT_CHANGE, onBodyContentChange);
	}

	public java.lang.String getOnBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_BOUNDING_BOX_CHANGE, null);
	}

	public void setOnBoundingBoxChange(java.lang.String onBoundingBoxChange) {
		getStateHelper().put(ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange);
	}

	public java.lang.String getOnBuilderChange() {
		return (java.lang.String) getStateHelper().eval(ON_BUILDER_CHANGE, null);
	}

	public void setOnBuilderChange(java.lang.String onBuilderChange) {
		getStateHelper().put(ON_BUILDER_CHANGE, onBuilderChange);
	}

	public java.lang.String getOnCenteredChange() {
		return (java.lang.String) getStateHelper().eval(ON_CENTERED_CHANGE, null);
	}

	public void setOnCenteredChange(java.lang.String onCenteredChange) {
		getStateHelper().put(ON_CENTERED_CHANGE, onCenteredChange);
	}

	public java.lang.String getOnConnectorsChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONNECTORS_CHANGE, null);
	}

	public void setOnConnectorsChange(java.lang.String onConnectorsChange) {
		getStateHelper().put(ON_CONNECTORS_CHANGE, onConnectorsChange);
	}

	public java.lang.String getOnConstrainChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONSTRAIN_CHANGE, null);
	}

	public void setOnConstrainChange(java.lang.String onConstrainChange) {
		getStateHelper().put(ON_CONSTRAIN_CHANGE, onConstrainChange);
	}

	public java.lang.String getOnContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_BOX_CHANGE, null);
	}

	public void setOnContentBoxChange(java.lang.String onContentBoxChange) {
		getStateHelper().put(ON_CONTENT_BOX_CHANGE, onContentBoxChange);
	}

	public java.lang.String getOnControlsToolbarChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTROLS_TOOLBAR_CHANGE, null);
	}

	public void setOnControlsToolbarChange(java.lang.String onControlsToolbarChange) {
		getStateHelper().put(ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange);
	}

	public java.lang.String getOnDescriptionChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESCRIPTION_CHANGE, null);
	}

	public void setOnDescriptionChange(java.lang.String onDescriptionChange) {
		getStateHelper().put(ON_DESCRIPTION_CHANGE, onDescriptionChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnDisabledChange() {
		return (java.lang.String) getStateHelper().eval(ON_DISABLED_CHANGE, null);
	}

	public void setOnDisabledChange(java.lang.String onDisabledChange) {
		getStateHelper().put(ON_DISABLED_CHANGE, onDisabledChange);
	}

	public java.lang.String getOnFillHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_FILL_HEIGHT_CHANGE, null);
	}

	public void setOnFillHeightChange(java.lang.String onFillHeightChange) {
		getStateHelper().put(ON_FILL_HEIGHT_CHANGE, onFillHeightChange);
	}

	public java.lang.String getOnFocusedChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOCUSED_CHANGE, null);
	}

	public void setOnFocusedChange(java.lang.String onFocusedChange) {
		getStateHelper().put(ON_FOCUSED_CHANGE, onFocusedChange);
	}

	public java.lang.String getOnFooterContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOOTER_CONTENT_CHANGE, null);
	}

	public void setOnFooterContentChange(java.lang.String onFooterContentChange) {
		getStateHelper().put(ON_FOOTER_CONTENT_CHANGE, onFooterContentChange);
	}

	public java.lang.String getOnGraphicChange() {
		return (java.lang.String) getStateHelper().eval(ON_GRAPHIC_CHANGE, null);
	}

	public void setOnGraphicChange(java.lang.String onGraphicChange) {
		getStateHelper().put(ON_GRAPHIC_CHANGE, onGraphicChange);
	}

	public java.lang.String getOnHeaderContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADER_CONTENT_CHANGE, null);
	}

	public void setOnHeaderContentChange(java.lang.String onHeaderContentChange) {
		getStateHelper().put(ON_HEADER_CONTENT_CHANGE, onHeaderContentChange);
	}

	public java.lang.String getOnHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEIGHT_CHANGE, null);
	}

	public void setOnHeightChange(java.lang.String onHeightChange) {
		getStateHelper().put(ON_HEIGHT_CHANGE, onHeightChange);
	}

	public java.lang.String getOnHighlightBoundaryStrokeChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, null);
	}

	public void setOnHighlightBoundaryStrokeChange(java.lang.String onHighlightBoundaryStrokeChange) {
		getStateHelper().put(ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, onHighlightBoundaryStrokeChange);
	}

	public java.lang.String getOnHighlightedChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIGHLIGHTED_CHANGE, null);
	}

	public void setOnHighlightedChange(java.lang.String onHighlightedChange) {
		getStateHelper().put(ON_HIGHLIGHTED_CHANGE, onHighlightedChange);
	}

	public java.lang.String getOnIdChange() {
		return (java.lang.String) getStateHelper().eval(ON_ID_CHANGE, null);
	}

	public void setOnIdChange(java.lang.String onIdChange) {
		getStateHelper().put(ON_ID_CHANGE, onIdChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnLocaleChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOCALE_CHANGE, null);
	}

	public void setOnLocaleChange(java.lang.String onLocaleChange) {
		getStateHelper().put(ON_LOCALE_CHANGE, onLocaleChange);
	}

	public java.lang.String getOnNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_NAME_CHANGE, null);
	}

	public void setOnNameChange(java.lang.String onNameChange) {
		getStateHelper().put(ON_NAME_CHANGE, onNameChange);
	}

	public java.lang.String getOnPreventOverlapChange() {
		return (java.lang.String) getStateHelper().eval(ON_PREVENT_OVERLAP_CHANGE, null);
	}

	public void setOnPreventOverlapChange(java.lang.String onPreventOverlapChange) {
		getStateHelper().put(ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange);
	}

	public java.lang.String getOnRenderChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_CHANGE, null);
	}

	public void setOnRenderChange(java.lang.String onRenderChange) {
		getStateHelper().put(ON_RENDER_CHANGE, onRenderChange);
	}

	public java.lang.String getOnRenderedChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDERED_CHANGE, null);
	}

	public void setOnRenderedChange(java.lang.String onRenderedChange) {
		getStateHelper().put(ON_RENDERED_CHANGE, onRenderedChange);
	}

	public java.lang.String getOnRequiredChange() {
		return (java.lang.String) getStateHelper().eval(ON_REQUIRED_CHANGE, null);
	}

	public void setOnRequiredChange(java.lang.String onRequiredChange) {
		getStateHelper().put(ON_REQUIRED_CHANGE, onRequiredChange);
	}

	public java.lang.String getOnSelectedChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECTED_CHANGE, null);
	}

	public void setOnSelectedChange(java.lang.String onSelectedChange) {
		getStateHelper().put(ON_SELECTED_CHANGE, onSelectedChange);
	}

	public java.lang.String getOnShapeBoundaryChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHAPE_BOUNDARY_CHANGE, null);
	}

	public void setOnShapeBoundaryChange(java.lang.String onShapeBoundaryChange) {
		getStateHelper().put(ON_SHAPE_BOUNDARY_CHANGE, onShapeBoundaryChange);
	}

	public java.lang.String getOnShapeInviteChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHAPE_INVITE_CHANGE, null);
	}

	public void setOnShapeInviteChange(java.lang.String onShapeInviteChange) {
		getStateHelper().put(ON_SHAPE_INVITE_CHANGE, onShapeInviteChange);
	}

	public java.lang.String getOnShimChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHIM_CHANGE, null);
	}

	public void setOnShimChange(java.lang.String onShimChange) {
		getStateHelper().put(ON_SHIM_CHANGE, onShimChange);
	}

	public java.lang.String getOnSrcNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_SRC_NODE_CHANGE, null);
	}

	public void setOnSrcNodeChange(java.lang.String onSrcNodeChange) {
		getStateHelper().put(ON_SRC_NODE_CHANGE, onSrcNodeChange);
	}

	public java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	public void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

	public java.lang.String getOnTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_INDEX_CHANGE, null);
	}

	public void setOnTabIndexChange(java.lang.String onTabIndexChange) {
		getStateHelper().put(ON_TAB_INDEX_CHANGE, onTabIndexChange);
	}

	public java.lang.String getOnTransitionsChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRANSITIONS_CHANGE, null);
	}

	public void setOnTransitionsChange(java.lang.String onTransitionsChange) {
		getStateHelper().put(ON_TRANSITIONS_CHANGE, onTransitionsChange);
	}

	public java.lang.String getOnTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TYPE_CHANGE, null);
	}

	public void setOnTypeChange(java.lang.String onTypeChange) {
		getStateHelper().put(ON_TYPE_CHANGE, onTypeChange);
	}

	public java.lang.String getOnVisibleChange() {
		return (java.lang.String) getStateHelper().eval(ON_VISIBLE_CHANGE, null);
	}

	public void setOnVisibleChange(java.lang.String onVisibleChange) {
		getStateHelper().put(ON_VISIBLE_CHANGE, onVisibleChange);
	}

	public java.lang.String getOnWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_WIDTH_CHANGE, null);
	}

	public void setOnWidthChange(java.lang.String onWidthChange) {
		getStateHelper().put(ON_WIDTH_CHANGE, onWidthChange);
	}

	public java.lang.String getOnXChange() {
		return (java.lang.String) getStateHelper().eval(ON_XCHANGE, null);
	}

	public void setOnXChange(java.lang.String onXChange) {
		getStateHelper().put(ON_XCHANGE, onXChange);
	}

	public java.lang.String getOnXyChange() {
		return (java.lang.String) getStateHelper().eval(ON_XY_CHANGE, null);
	}

	public void setOnXyChange(java.lang.String onXyChange) {
		getStateHelper().put(ON_XY_CHANGE, onXyChange);
	}

	public java.lang.String getOnYChange() {
		return (java.lang.String) getStateHelper().eval(ON_YCHANGE, null);
	}

	public void setOnYChange(java.lang.String onYChange) {
		getStateHelper().put(ON_YCHANGE, onYChange);
	}

	public java.lang.String getOnZIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_ZINDEX_CHANGE, null);
	}

	public void setOnZIndexChange(java.lang.String onZIndexChange) {
		getStateHelper().put(ON_ZINDEX_CHANGE, onZIndexChange);
	}

}