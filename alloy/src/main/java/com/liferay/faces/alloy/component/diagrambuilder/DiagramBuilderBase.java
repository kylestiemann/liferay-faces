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
package com.liferay.faces.alloy.component.diagrambuilder;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class DiagramBuilderBase extends javax.faces.component.UIPanel {

	public static final String AVAILABLE_FIELDS = "availableFields";
	public static final String AVAILABLE_FIELDS_DRAG_CONFIG = "availableFieldsDragConfig";
	public static final String BOUNDING_BOX = "boundingBox";
	public static final String CANVAS = "canvas";
	public static final String CONNECTOR = "connector";
	public static final String CONTENT_BOX = "contentBox";
	public static final String CONTENT_CONTAINER = "contentContainer";
	public static final String CSS_CLASS = "cssClass";
	public static final String DESTROYED = "destroyed";
	public static final String DISABLED = "disabled";
	public static final String DROP_CONFIG = "dropConfig";
	public static final String DROP_CONTAINER = "dropContainer";
	public static final String FIELDS = "fields";
	public static final String FIELDS_CONTAINER = "fieldsContainer";
	public static final String FIELDS_DRAG_CONFIG = "fieldsDragConfig";
	public static final String FOCUSED = "focused";
	public static final String GRAPHIC = "graphic";
	public static final String HEIGHT = "height";
	public static final String HIDE_CLASS = "hideClass";
	public static final String HIGHLIGHT_DROP_ZONES = "highlightDropZones";
	public static final String DIAGRAMBUILDER_ID = "diagrambuilderId";
	public static final String INITIALIZED = "initialized";
	public static final String DIAGRAMBUILDER_LOCALE = "diagrambuilderLocale";
	public static final String MAX_FIELDS = "maxFields";
	public static final String PROPERTY_LIST = "propertyList";
	public static final String RENDER = "render";
	public static final String RENDERED = "rendered";
	public static final String SHOW_SUGGEST_CONNECTOR = "showSuggestConnector";
	public static final String SRC_NODE = "srcNode";
	public static final String STRINGS = "strings";
	public static final String SUGGEST_CONNECTOR_OVERLAY = "suggestConnectorOverlay";
	public static final String TAB_INDEX = "tabIndex";
	public static final String TAB_VIEW = "tabView";
	public static final String TOOLBAR = "toolbar";
	public static final String TOOLBAR_CONTAINER = "toolbarContainer";
	public static final String USE_ARIA = "useARIA";
	public static final String VISIBLE = "visible";
	public static final String WIDTH = "width";
	public static final String AFTER_AVAILABLE_FIELDS_CHANGE = "afterAvailableFieldsChange";
	public static final String AFTER_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE = "afterAvailableFieldsDragConfigChange";
	public static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	public static final String AFTER_CANVAS_CHANGE = "afterCanvasChange";
	public static final String AFTER_CONNECTOR_CHANGE = "afterConnectorChange";
	public static final String AFTER_CONTENT_BOX_CHANGE = "afterContentBoxChange";
	public static final String AFTER_CONTENT_CONTAINER_CHANGE = "afterContentContainerChange";
	public static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	public static final String AFTER_DROP_CONFIG_CHANGE = "afterDropConfigChange";
	public static final String AFTER_DROP_CONTAINER_CHANGE = "afterDropContainerChange";
	public static final String AFTER_FIELDS_CHANGE = "afterFieldsChange";
	public static final String AFTER_FIELDS_CONTAINER_CHANGE = "afterFieldsContainerChange";
	public static final String AFTER_FIELDS_DRAG_CONFIG_CHANGE = "afterFieldsDragConfigChange";
	public static final String AFTER_FOCUSED_CHANGE = "afterFocusedChange";
	public static final String AFTER_GRAPHIC_CHANGE = "afterGraphicChange";
	public static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	public static final String AFTER_HIDE_CLASS_CHANGE = "afterHideClassChange";
	public static final String AFTER_HIGHLIGHT_DROP_ZONES_CHANGE = "afterHighlightDropZonesChange";
	public static final String AFTER_ID_CHANGE = "afterIdChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_LOCALE_CHANGE = "afterLocaleChange";
	public static final String AFTER_MAX_FIELDS_CHANGE = "afterMaxFieldsChange";
	public static final String AFTER_PROPERTY_LIST_CHANGE = "afterPropertyListChange";
	public static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	public static final String AFTER_RENDERED_CHANGE = "afterRenderedChange";
	public static final String AFTER_SHOW_SUGGEST_CONNECTOR_CHANGE = "afterShowSuggestConnectorChange";
	public static final String AFTER_SRC_NODE_CHANGE = "afterSrcNodeChange";
	public static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	public static final String AFTER_SUGGEST_CONNECTOR_OVERLAY_CHANGE = "afterSuggestConnectorOverlayChange";
	public static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	public static final String AFTER_TAB_VIEW_CHANGE = "afterTabViewChange";
	public static final String AFTER_TOOLBAR_CHANGE = "afterToolbarChange";
	public static final String AFTER_TOOLBAR_CONTAINER_CHANGE = "afterToolbarContainerChange";
	public static final String AFTER_USE_ARIACHANGE = "afterUseARIAChange";
	public static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	public static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	public static final String ON_AVAILABLE_FIELDS_CHANGE = "onAvailableFieldsChange";
	public static final String ON_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE = "onAvailableFieldsDragConfigChange";
	public static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	public static final String ON_CANVAS_CHANGE = "onCanvasChange";
	public static final String ON_CONNECTOR_CHANGE = "onConnectorChange";
	public static final String ON_CONTENT_BOX_CHANGE = "onContentBoxChange";
	public static final String ON_CONTENT_CONTAINER_CHANGE = "onContentContainerChange";
	public static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_DISABLED_CHANGE = "onDisabledChange";
	public static final String ON_DROP_CONFIG_CHANGE = "onDropConfigChange";
	public static final String ON_DROP_CONTAINER_CHANGE = "onDropContainerChange";
	public static final String ON_FIELDS_CHANGE = "onFieldsChange";
	public static final String ON_FIELDS_CONTAINER_CHANGE = "onFieldsContainerChange";
	public static final String ON_FIELDS_DRAG_CONFIG_CHANGE = "onFieldsDragConfigChange";
	public static final String ON_FOCUSED_CHANGE = "onFocusedChange";
	public static final String ON_GRAPHIC_CHANGE = "onGraphicChange";
	public static final String ON_HEIGHT_CHANGE = "onHeightChange";
	public static final String ON_HIDE_CLASS_CHANGE = "onHideClassChange";
	public static final String ON_HIGHLIGHT_DROP_ZONES_CHANGE = "onHighlightDropZonesChange";
	public static final String ON_ID_CHANGE = "onIdChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_LOCALE_CHANGE = "onLocaleChange";
	public static final String ON_MAX_FIELDS_CHANGE = "onMaxFieldsChange";
	public static final String ON_PROPERTY_LIST_CHANGE = "onPropertyListChange";
	public static final String ON_RENDER_CHANGE = "onRenderChange";
	public static final String ON_RENDERED_CHANGE = "onRenderedChange";
	public static final String ON_SHOW_SUGGEST_CONNECTOR_CHANGE = "onShowSuggestConnectorChange";
	public static final String ON_SRC_NODE_CHANGE = "onSrcNodeChange";
	public static final String ON_STRINGS_CHANGE = "onStringsChange";
	public static final String ON_SUGGEST_CONNECTOR_OVERLAY_CHANGE = "onSuggestConnectorOverlayChange";
	public static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	public static final String ON_TAB_VIEW_CHANGE = "onTabViewChange";
	public static final String ON_TOOLBAR_CHANGE = "onToolbarChange";
	public static final String ON_TOOLBAR_CONTAINER_CHANGE = "onToolbarContainerChange";
	public static final String ON_USE_ARIACHANGE = "onUseARIAChange";
	public static final String ON_VISIBLE_CHANGE = "onVisibleChange";
	public static final String ON_WIDTH_CHANGE = "onWidthChange";

	public java.lang.Object getAvailableFields() {
		return (java.lang.Object) getStateHelper().eval(AVAILABLE_FIELDS, null);
	}

	public void setAvailableFields(java.lang.Object availableFields) {
		getStateHelper().put(AVAILABLE_FIELDS, availableFields);
	}

	public java.lang.Object getAvailableFieldsDragConfig() {
		return (java.lang.Object) getStateHelper().eval(AVAILABLE_FIELDS_DRAG_CONFIG, null);
	}

	public void setAvailableFieldsDragConfig(java.lang.Object availableFieldsDragConfig) {
		getStateHelper().put(AVAILABLE_FIELDS_DRAG_CONFIG, availableFieldsDragConfig);
	}

	public java.lang.String getBoundingBox() {
		return (java.lang.String) getStateHelper().eval(BOUNDING_BOX, null);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		getStateHelper().put(BOUNDING_BOX, boundingBox);
	}

	public java.lang.String getCanvas() {
		return (java.lang.String) getStateHelper().eval(CANVAS, null);
	}

	public void setCanvas(java.lang.String canvas) {
		getStateHelper().put(CANVAS, canvas);
	}

	public java.lang.String getConnector() {
		return (java.lang.String) getStateHelper().eval(CONNECTOR, null);
	}

	public void setConnector(java.lang.String connector) {
		getStateHelper().put(CONNECTOR, connector);
	}

	public java.lang.String getContentBox() {
		return (java.lang.String) getStateHelper().eval(CONTENT_BOX, null);
	}

	public void setContentBox(java.lang.String contentBox) {
		getStateHelper().put(CONTENT_BOX, contentBox);
	}

	public java.lang.String getContentContainer() {
		return (java.lang.String) getStateHelper().eval(CONTENT_CONTAINER, null);
	}

	public void setContentContainer(java.lang.String contentContainer) {
		getStateHelper().put(CONTENT_CONTAINER, contentContainer);
	}

	public java.lang.String getCssClass() {
		return (java.lang.String) getStateHelper().eval(CSS_CLASS, null);
	}

	public void setCssClass(java.lang.String cssClass) {
		getStateHelper().put(CSS_CLASS, cssClass);
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

	public java.lang.Object getDropConfig() {
		return (java.lang.Object) getStateHelper().eval(DROP_CONFIG, null);
	}

	public void setDropConfig(java.lang.Object dropConfig) {
		getStateHelper().put(DROP_CONFIG, dropConfig);
	}

	public java.lang.String getDropContainer() {
		return (java.lang.String) getStateHelper().eval(DROP_CONTAINER, null);
	}

	public void setDropContainer(java.lang.String dropContainer) {
		getStateHelper().put(DROP_CONTAINER, dropContainer);
	}

	public java.lang.Object getFields() {
		return (java.lang.Object) getStateHelper().eval(FIELDS, null);
	}

	public void setFields(java.lang.Object fields) {
		getStateHelper().put(FIELDS, fields);
	}

	public java.lang.String getFieldsContainer() {
		return (java.lang.String) getStateHelper().eval(FIELDS_CONTAINER, null);
	}

	public void setFieldsContainer(java.lang.String fieldsContainer) {
		getStateHelper().put(FIELDS_CONTAINER, fieldsContainer);
	}

	public java.lang.Object getFieldsDragConfig() {
		return (java.lang.Object) getStateHelper().eval(FIELDS_DRAG_CONFIG, null);
	}

	public void setFieldsDragConfig(java.lang.Object fieldsDragConfig) {
		getStateHelper().put(FIELDS_DRAG_CONFIG, fieldsDragConfig);
	}

	public java.lang.Boolean getFocused() {
		return (java.lang.Boolean) getStateHelper().eval(FOCUSED, null);
	}

	public void setFocused(java.lang.Boolean focused) {
		getStateHelper().put(FOCUSED, focused);
	}

	public java.lang.Object getGraphic() {
		return (java.lang.Object) getStateHelper().eval(GRAPHIC, null);
	}

	public void setGraphic(java.lang.Object graphic) {
		getStateHelper().put(GRAPHIC, graphic);
	}

	public java.lang.Object getHeight() {
		return (java.lang.Object) getStateHelper().eval(HEIGHT, null);
	}

	public void setHeight(java.lang.Object height) {
		getStateHelper().put(HEIGHT, height);
	}

	public java.lang.String getHideClass() {
		return (java.lang.String) getStateHelper().eval(HIDE_CLASS, null);
	}

	public void setHideClass(java.lang.String hideClass) {
		getStateHelper().put(HIDE_CLASS, hideClass);
	}

	public java.lang.Boolean getHighlightDropZones() {
		return (java.lang.Boolean) getStateHelper().eval(HIGHLIGHT_DROP_ZONES, null);
	}

	public void setHighlightDropZones(java.lang.Boolean highlightDropZones) {
		getStateHelper().put(HIGHLIGHT_DROP_ZONES, highlightDropZones);
	}

	public java.lang.String getDiagrambuilderId() {
		return (java.lang.String) getStateHelper().eval(DIAGRAMBUILDER_ID, null);
	}

	public void setDiagrambuilderId(java.lang.String diagrambuilderId) {
		getStateHelper().put(DIAGRAMBUILDER_ID, diagrambuilderId);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.String getDiagrambuilderLocale() {
		return (java.lang.String) getStateHelper().eval(DIAGRAMBUILDER_LOCALE, null);
	}

	public void setDiagrambuilderLocale(java.lang.String diagrambuilderLocale) {
		getStateHelper().put(DIAGRAMBUILDER_LOCALE, diagrambuilderLocale);
	}

	public java.lang.Object getMaxFields() {
		return (java.lang.Object) getStateHelper().eval(MAX_FIELDS, null);
	}

	public void setMaxFields(java.lang.Object maxFields) {
		getStateHelper().put(MAX_FIELDS, maxFields);
	}

	public java.lang.Object getPropertyList() {
		return (java.lang.Object) getStateHelper().eval(PROPERTY_LIST, null);
	}

	public void setPropertyList(java.lang.Object propertyList) {
		getStateHelper().put(PROPERTY_LIST, propertyList);
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

	public java.lang.Boolean getShowSuggestConnector() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_SUGGEST_CONNECTOR, null);
	}

	public void setShowSuggestConnector(java.lang.Boolean showSuggestConnector) {
		getStateHelper().put(SHOW_SUGGEST_CONNECTOR, showSuggestConnector);
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

	public java.lang.String getSuggestConnectorOverlay() {
		return (java.lang.String) getStateHelper().eval(SUGGEST_CONNECTOR_OVERLAY, null);
	}

	public void setSuggestConnectorOverlay(java.lang.String suggestConnectorOverlay) {
		getStateHelper().put(SUGGEST_CONNECTOR_OVERLAY, suggestConnectorOverlay);
	}

	public java.lang.Object getTabIndex() {
		return (java.lang.Object) getStateHelper().eval(TAB_INDEX, null);
	}

	public void setTabIndex(java.lang.Object tabIndex) {
		getStateHelper().put(TAB_INDEX, tabIndex);
	}

	public java.lang.Object getTabView() {
		return (java.lang.Object) getStateHelper().eval(TAB_VIEW, null);
	}

	public void setTabView(java.lang.Object tabView) {
		getStateHelper().put(TAB_VIEW, tabView);
	}

	public java.lang.Object getToolbar() {
		return (java.lang.Object) getStateHelper().eval(TOOLBAR, null);
	}

	public void setToolbar(java.lang.Object toolbar) {
		getStateHelper().put(TOOLBAR, toolbar);
	}

	public java.lang.String getToolbarContainer() {
		return (java.lang.String) getStateHelper().eval(TOOLBAR_CONTAINER, null);
	}

	public void setToolbarContainer(java.lang.String toolbarContainer) {
		getStateHelper().put(TOOLBAR_CONTAINER, toolbarContainer);
	}

	public java.lang.Boolean getUseARIA() {
		return (java.lang.Boolean) getStateHelper().eval(USE_ARIA, null);
	}

	public void setUseARIA(java.lang.Boolean useARIA) {
		getStateHelper().put(USE_ARIA, useARIA);
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

	public java.lang.String getAfterAvailableFieldsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_AVAILABLE_FIELDS_CHANGE, null);
	}

	public void setAfterAvailableFieldsChange(java.lang.String afterAvailableFieldsChange) {
		getStateHelper().put(AFTER_AVAILABLE_FIELDS_CHANGE, afterAvailableFieldsChange);
	}

	public java.lang.String getAfterAvailableFieldsDragConfigChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE, null);
	}

	public void setAfterAvailableFieldsDragConfigChange(java.lang.String afterAvailableFieldsDragConfigChange) {
		getStateHelper().put(AFTER_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE, afterAvailableFieldsDragConfigChange);
	}

	public java.lang.String getAfterBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BOUNDING_BOX_CHANGE, null);
	}

	public void setAfterBoundingBoxChange(java.lang.String afterBoundingBoxChange) {
		getStateHelper().put(AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange);
	}

	public java.lang.String getAfterCanvasChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CANVAS_CHANGE, null);
	}

	public void setAfterCanvasChange(java.lang.String afterCanvasChange) {
		getStateHelper().put(AFTER_CANVAS_CHANGE, afterCanvasChange);
	}

	public java.lang.String getAfterConnectorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONNECTOR_CHANGE, null);
	}

	public void setAfterConnectorChange(java.lang.String afterConnectorChange) {
		getStateHelper().put(AFTER_CONNECTOR_CHANGE, afterConnectorChange);
	}

	public java.lang.String getAfterContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_BOX_CHANGE, null);
	}

	public void setAfterContentBoxChange(java.lang.String afterContentBoxChange) {
		getStateHelper().put(AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange);
	}

	public java.lang.String getAfterContentContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_CONTAINER_CHANGE, null);
	}

	public void setAfterContentContainerChange(java.lang.String afterContentContainerChange) {
		getStateHelper().put(AFTER_CONTENT_CONTAINER_CHANGE, afterContentContainerChange);
	}

	public java.lang.String getAfterCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASS_CHANGE, null);
	}

	public void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		getStateHelper().put(AFTER_CSS_CLASS_CHANGE, afterCssClassChange);
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

	public java.lang.String getAfterDropConfigChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DROP_CONFIG_CHANGE, null);
	}

	public void setAfterDropConfigChange(java.lang.String afterDropConfigChange) {
		getStateHelper().put(AFTER_DROP_CONFIG_CHANGE, afterDropConfigChange);
	}

	public java.lang.String getAfterDropContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DROP_CONTAINER_CHANGE, null);
	}

	public void setAfterDropContainerChange(java.lang.String afterDropContainerChange) {
		getStateHelper().put(AFTER_DROP_CONTAINER_CHANGE, afterDropContainerChange);
	}

	public java.lang.String getAfterFieldsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FIELDS_CHANGE, null);
	}

	public void setAfterFieldsChange(java.lang.String afterFieldsChange) {
		getStateHelper().put(AFTER_FIELDS_CHANGE, afterFieldsChange);
	}

	public java.lang.String getAfterFieldsContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FIELDS_CONTAINER_CHANGE, null);
	}

	public void setAfterFieldsContainerChange(java.lang.String afterFieldsContainerChange) {
		getStateHelper().put(AFTER_FIELDS_CONTAINER_CHANGE, afterFieldsContainerChange);
	}

	public java.lang.String getAfterFieldsDragConfigChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FIELDS_DRAG_CONFIG_CHANGE, null);
	}

	public void setAfterFieldsDragConfigChange(java.lang.String afterFieldsDragConfigChange) {
		getStateHelper().put(AFTER_FIELDS_DRAG_CONFIG_CHANGE, afterFieldsDragConfigChange);
	}

	public java.lang.String getAfterFocusedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOCUSED_CHANGE, null);
	}

	public void setAfterFocusedChange(java.lang.String afterFocusedChange) {
		getStateHelper().put(AFTER_FOCUSED_CHANGE, afterFocusedChange);
	}

	public java.lang.String getAfterGraphicChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_GRAPHIC_CHANGE, null);
	}

	public void setAfterGraphicChange(java.lang.String afterGraphicChange) {
		getStateHelper().put(AFTER_GRAPHIC_CHANGE, afterGraphicChange);
	}

	public java.lang.String getAfterHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEIGHT_CHANGE, null);
	}

	public void setAfterHeightChange(java.lang.String afterHeightChange) {
		getStateHelper().put(AFTER_HEIGHT_CHANGE, afterHeightChange);
	}

	public java.lang.String getAfterHideClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_CLASS_CHANGE, null);
	}

	public void setAfterHideClassChange(java.lang.String afterHideClassChange) {
		getStateHelper().put(AFTER_HIDE_CLASS_CHANGE, afterHideClassChange);
	}

	public java.lang.String getAfterHighlightDropZonesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIGHLIGHT_DROP_ZONES_CHANGE, null);
	}

	public void setAfterHighlightDropZonesChange(java.lang.String afterHighlightDropZonesChange) {
		getStateHelper().put(AFTER_HIGHLIGHT_DROP_ZONES_CHANGE, afterHighlightDropZonesChange);
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

	public java.lang.String getAfterMaxFieldsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MAX_FIELDS_CHANGE, null);
	}

	public void setAfterMaxFieldsChange(java.lang.String afterMaxFieldsChange) {
		getStateHelper().put(AFTER_MAX_FIELDS_CHANGE, afterMaxFieldsChange);
	}

	public java.lang.String getAfterPropertyListChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PROPERTY_LIST_CHANGE, null);
	}

	public void setAfterPropertyListChange(java.lang.String afterPropertyListChange) {
		getStateHelper().put(AFTER_PROPERTY_LIST_CHANGE, afterPropertyListChange);
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

	public java.lang.String getAfterShowSuggestConnectorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_SUGGEST_CONNECTOR_CHANGE, null);
	}

	public void setAfterShowSuggestConnectorChange(java.lang.String afterShowSuggestConnectorChange) {
		getStateHelper().put(AFTER_SHOW_SUGGEST_CONNECTOR_CHANGE, afterShowSuggestConnectorChange);
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

	public java.lang.String getAfterSuggestConnectorOverlayChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SUGGEST_CONNECTOR_OVERLAY_CHANGE, null);
	}

	public void setAfterSuggestConnectorOverlayChange(java.lang.String afterSuggestConnectorOverlayChange) {
		getStateHelper().put(AFTER_SUGGEST_CONNECTOR_OVERLAY_CHANGE, afterSuggestConnectorOverlayChange);
	}

	public java.lang.String getAfterTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_INDEX_CHANGE, null);
	}

	public void setAfterTabIndexChange(java.lang.String afterTabIndexChange) {
		getStateHelper().put(AFTER_TAB_INDEX_CHANGE, afterTabIndexChange);
	}

	public java.lang.String getAfterTabViewChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_VIEW_CHANGE, null);
	}

	public void setAfterTabViewChange(java.lang.String afterTabViewChange) {
		getStateHelper().put(AFTER_TAB_VIEW_CHANGE, afterTabViewChange);
	}

	public java.lang.String getAfterToolbarChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOOLBAR_CHANGE, null);
	}

	public void setAfterToolbarChange(java.lang.String afterToolbarChange) {
		getStateHelper().put(AFTER_TOOLBAR_CHANGE, afterToolbarChange);
	}

	public java.lang.String getAfterToolbarContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOOLBAR_CONTAINER_CHANGE, null);
	}

	public void setAfterToolbarContainerChange(java.lang.String afterToolbarContainerChange) {
		getStateHelper().put(AFTER_TOOLBAR_CONTAINER_CHANGE, afterToolbarContainerChange);
	}

	public java.lang.String getAfterUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_ARIACHANGE, null);
	}

	public void setAfterUseARIAChange(java.lang.String afterUseARIAChange) {
		getStateHelper().put(AFTER_USE_ARIACHANGE, afterUseARIAChange);
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

	public java.lang.String getOnAvailableFieldsChange() {
		return (java.lang.String) getStateHelper().eval(ON_AVAILABLE_FIELDS_CHANGE, null);
	}

	public void setOnAvailableFieldsChange(java.lang.String onAvailableFieldsChange) {
		getStateHelper().put(ON_AVAILABLE_FIELDS_CHANGE, onAvailableFieldsChange);
	}

	public java.lang.String getOnAvailableFieldsDragConfigChange() {
		return (java.lang.String) getStateHelper().eval(ON_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE, null);
	}

	public void setOnAvailableFieldsDragConfigChange(java.lang.String onAvailableFieldsDragConfigChange) {
		getStateHelper().put(ON_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE, onAvailableFieldsDragConfigChange);
	}

	public java.lang.String getOnBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_BOUNDING_BOX_CHANGE, null);
	}

	public void setOnBoundingBoxChange(java.lang.String onBoundingBoxChange) {
		getStateHelper().put(ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange);
	}

	public java.lang.String getOnCanvasChange() {
		return (java.lang.String) getStateHelper().eval(ON_CANVAS_CHANGE, null);
	}

	public void setOnCanvasChange(java.lang.String onCanvasChange) {
		getStateHelper().put(ON_CANVAS_CHANGE, onCanvasChange);
	}

	public java.lang.String getOnConnectorChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONNECTOR_CHANGE, null);
	}

	public void setOnConnectorChange(java.lang.String onConnectorChange) {
		getStateHelper().put(ON_CONNECTOR_CHANGE, onConnectorChange);
	}

	public java.lang.String getOnContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_BOX_CHANGE, null);
	}

	public void setOnContentBoxChange(java.lang.String onContentBoxChange) {
		getStateHelper().put(ON_CONTENT_BOX_CHANGE, onContentBoxChange);
	}

	public java.lang.String getOnContentContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_CONTAINER_CHANGE, null);
	}

	public void setOnContentContainerChange(java.lang.String onContentContainerChange) {
		getStateHelper().put(ON_CONTENT_CONTAINER_CHANGE, onContentContainerChange);
	}

	public java.lang.String getOnCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASS_CHANGE, null);
	}

	public void setOnCssClassChange(java.lang.String onCssClassChange) {
		getStateHelper().put(ON_CSS_CLASS_CHANGE, onCssClassChange);
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

	public java.lang.String getOnDropConfigChange() {
		return (java.lang.String) getStateHelper().eval(ON_DROP_CONFIG_CHANGE, null);
	}

	public void setOnDropConfigChange(java.lang.String onDropConfigChange) {
		getStateHelper().put(ON_DROP_CONFIG_CHANGE, onDropConfigChange);
	}

	public java.lang.String getOnDropContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_DROP_CONTAINER_CHANGE, null);
	}

	public void setOnDropContainerChange(java.lang.String onDropContainerChange) {
		getStateHelper().put(ON_DROP_CONTAINER_CHANGE, onDropContainerChange);
	}

	public java.lang.String getOnFieldsChange() {
		return (java.lang.String) getStateHelper().eval(ON_FIELDS_CHANGE, null);
	}

	public void setOnFieldsChange(java.lang.String onFieldsChange) {
		getStateHelper().put(ON_FIELDS_CHANGE, onFieldsChange);
	}

	public java.lang.String getOnFieldsContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_FIELDS_CONTAINER_CHANGE, null);
	}

	public void setOnFieldsContainerChange(java.lang.String onFieldsContainerChange) {
		getStateHelper().put(ON_FIELDS_CONTAINER_CHANGE, onFieldsContainerChange);
	}

	public java.lang.String getOnFieldsDragConfigChange() {
		return (java.lang.String) getStateHelper().eval(ON_FIELDS_DRAG_CONFIG_CHANGE, null);
	}

	public void setOnFieldsDragConfigChange(java.lang.String onFieldsDragConfigChange) {
		getStateHelper().put(ON_FIELDS_DRAG_CONFIG_CHANGE, onFieldsDragConfigChange);
	}

	public java.lang.String getOnFocusedChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOCUSED_CHANGE, null);
	}

	public void setOnFocusedChange(java.lang.String onFocusedChange) {
		getStateHelper().put(ON_FOCUSED_CHANGE, onFocusedChange);
	}

	public java.lang.String getOnGraphicChange() {
		return (java.lang.String) getStateHelper().eval(ON_GRAPHIC_CHANGE, null);
	}

	public void setOnGraphicChange(java.lang.String onGraphicChange) {
		getStateHelper().put(ON_GRAPHIC_CHANGE, onGraphicChange);
	}

	public java.lang.String getOnHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEIGHT_CHANGE, null);
	}

	public void setOnHeightChange(java.lang.String onHeightChange) {
		getStateHelper().put(ON_HEIGHT_CHANGE, onHeightChange);
	}

	public java.lang.String getOnHideClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_CLASS_CHANGE, null);
	}

	public void setOnHideClassChange(java.lang.String onHideClassChange) {
		getStateHelper().put(ON_HIDE_CLASS_CHANGE, onHideClassChange);
	}

	public java.lang.String getOnHighlightDropZonesChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIGHLIGHT_DROP_ZONES_CHANGE, null);
	}

	public void setOnHighlightDropZonesChange(java.lang.String onHighlightDropZonesChange) {
		getStateHelper().put(ON_HIGHLIGHT_DROP_ZONES_CHANGE, onHighlightDropZonesChange);
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

	public java.lang.String getOnMaxFieldsChange() {
		return (java.lang.String) getStateHelper().eval(ON_MAX_FIELDS_CHANGE, null);
	}

	public void setOnMaxFieldsChange(java.lang.String onMaxFieldsChange) {
		getStateHelper().put(ON_MAX_FIELDS_CHANGE, onMaxFieldsChange);
	}

	public java.lang.String getOnPropertyListChange() {
		return (java.lang.String) getStateHelper().eval(ON_PROPERTY_LIST_CHANGE, null);
	}

	public void setOnPropertyListChange(java.lang.String onPropertyListChange) {
		getStateHelper().put(ON_PROPERTY_LIST_CHANGE, onPropertyListChange);
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

	public java.lang.String getOnShowSuggestConnectorChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_SUGGEST_CONNECTOR_CHANGE, null);
	}

	public void setOnShowSuggestConnectorChange(java.lang.String onShowSuggestConnectorChange) {
		getStateHelper().put(ON_SHOW_SUGGEST_CONNECTOR_CHANGE, onShowSuggestConnectorChange);
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

	public java.lang.String getOnSuggestConnectorOverlayChange() {
		return (java.lang.String) getStateHelper().eval(ON_SUGGEST_CONNECTOR_OVERLAY_CHANGE, null);
	}

	public void setOnSuggestConnectorOverlayChange(java.lang.String onSuggestConnectorOverlayChange) {
		getStateHelper().put(ON_SUGGEST_CONNECTOR_OVERLAY_CHANGE, onSuggestConnectorOverlayChange);
	}

	public java.lang.String getOnTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_INDEX_CHANGE, null);
	}

	public void setOnTabIndexChange(java.lang.String onTabIndexChange) {
		getStateHelper().put(ON_TAB_INDEX_CHANGE, onTabIndexChange);
	}

	public java.lang.String getOnTabViewChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_VIEW_CHANGE, null);
	}

	public void setOnTabViewChange(java.lang.String onTabViewChange) {
		getStateHelper().put(ON_TAB_VIEW_CHANGE, onTabViewChange);
	}

	public java.lang.String getOnToolbarChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOOLBAR_CHANGE, null);
	}

	public void setOnToolbarChange(java.lang.String onToolbarChange) {
		getStateHelper().put(ON_TOOLBAR_CHANGE, onToolbarChange);
	}

	public java.lang.String getOnToolbarContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOOLBAR_CONTAINER_CHANGE, null);
	}

	public void setOnToolbarContainerChange(java.lang.String onToolbarContainerChange) {
		getStateHelper().put(ON_TOOLBAR_CONTAINER_CHANGE, onToolbarContainerChange);
	}

	public java.lang.String getOnUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_ARIACHANGE, null);
	}

	public void setOnUseARIAChange(java.lang.String onUseARIAChange) {
		getStateHelper().put(ON_USE_ARIACHANGE, onUseARIAChange);
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

}