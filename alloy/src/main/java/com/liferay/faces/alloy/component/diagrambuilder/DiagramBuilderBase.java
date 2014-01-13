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

	private static final String AVAILABLE_FIELDS = "availableFields";
	private static final String AVAILABLE_FIELDS_DRAG_CONFIG = "availableFieldsDragConfig";
	private static final String CANVAS = "canvas";
	private static final String CONNECTOR = "connector";
	private static final String CONTENT_CONTAINER = "contentContainer";
	private static final String CSS_CLASS = "cssClass";
	private static final String DROP_CONFIG = "dropConfig";
	private static final String DROP_CONTAINER = "dropContainer";
	private static final String FIELDS = "fields";
	private static final String FIELDS_CONTAINER = "fieldsContainer";
	private static final String FIELDS_DRAG_CONFIG = "fieldsDragConfig";
	private static final String GRAPHIC = "graphic";
	private static final String HIDE_CLASS = "hideClass";
	private static final String HIGHLIGHT_DROP_ZONES = "highlightDropZones";
	private static final String MAX_FIELDS = "maxFields";
	private static final String PROPERTY_LIST = "propertyList";
	private static final String RENDER = "render";
	private static final String SHOW_SUGGEST_CONNECTOR = "showSuggestConnector";
	private static final String STRINGS = "strings";
	private static final String SUGGEST_CONNECTOR_OVERLAY = "suggestConnectorOverlay";
	private static final String TAB_VIEW = "tabView";
	private static final String TOOLBAR = "toolbar";
	private static final String TOOLBAR_CONTAINER = "toolbarContainer";
	private static final String USE_ARIA = "useARIA";
	private static final String AFTER_AVAILABLE_FIELDS_CHANGE = "afterAvailableFieldsChange";
	private static final String AFTER_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE = "afterAvailableFieldsDragConfigChange";
	private static final String AFTER_CANVAS_CHANGE = "afterCanvasChange";
	private static final String AFTER_CONNECTOR_CHANGE = "afterConnectorChange";
	private static final String AFTER_CONTENT_CONTAINER_CHANGE = "afterContentContainerChange";
	private static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	private static final String AFTER_DROP_CONFIG_CHANGE = "afterDropConfigChange";
	private static final String AFTER_DROP_CONTAINER_CHANGE = "afterDropContainerChange";
	private static final String AFTER_FIELDS_CHANGE = "afterFieldsChange";
	private static final String AFTER_FIELDS_CONTAINER_CHANGE = "afterFieldsContainerChange";
	private static final String AFTER_FIELDS_DRAG_CONFIG_CHANGE = "afterFieldsDragConfigChange";
	private static final String AFTER_GRAPHIC_CHANGE = "afterGraphicChange";
	private static final String AFTER_HIDE_CLASS_CHANGE = "afterHideClassChange";
	private static final String AFTER_HIGHLIGHT_DROP_ZONES_CHANGE = "afterHighlightDropZonesChange";
	private static final String AFTER_MAX_FIELDS_CHANGE = "afterMaxFieldsChange";
	private static final String AFTER_PROPERTY_LIST_CHANGE = "afterPropertyListChange";
	private static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	private static final String AFTER_SHOW_SUGGEST_CONNECTOR_CHANGE = "afterShowSuggestConnectorChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_SUGGEST_CONNECTOR_OVERLAY_CHANGE = "afterSuggestConnectorOverlayChange";
	private static final String AFTER_TAB_VIEW_CHANGE = "afterTabViewChange";
	private static final String AFTER_TOOLBAR_CHANGE = "afterToolbarChange";
	private static final String AFTER_TOOLBAR_CONTAINER_CHANGE = "afterToolbarContainerChange";
	private static final String AFTER_USE_ARIACHANGE = "afterUseARIAChange";
	private static final String ON_AVAILABLE_FIELDS_CHANGE = "onAvailableFieldsChange";
	private static final String ON_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE = "onAvailableFieldsDragConfigChange";
	private static final String ON_CANVAS_CHANGE = "onCanvasChange";
	private static final String ON_CONNECTOR_CHANGE = "onConnectorChange";
	private static final String ON_CONTENT_CONTAINER_CHANGE = "onContentContainerChange";
	private static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	private static final String ON_DROP_CONFIG_CHANGE = "onDropConfigChange";
	private static final String ON_DROP_CONTAINER_CHANGE = "onDropContainerChange";
	private static final String ON_FIELDS_CHANGE = "onFieldsChange";
	private static final String ON_FIELDS_CONTAINER_CHANGE = "onFieldsContainerChange";
	private static final String ON_FIELDS_DRAG_CONFIG_CHANGE = "onFieldsDragConfigChange";
	private static final String ON_GRAPHIC_CHANGE = "onGraphicChange";
	private static final String ON_HIDE_CLASS_CHANGE = "onHideClassChange";
	private static final String ON_HIGHLIGHT_DROP_ZONES_CHANGE = "onHighlightDropZonesChange";
	private static final String ON_MAX_FIELDS_CHANGE = "onMaxFieldsChange";
	private static final String ON_PROPERTY_LIST_CHANGE = "onPropertyListChange";
	private static final String ON_RENDER_CHANGE = "onRenderChange";
	private static final String ON_SHOW_SUGGEST_CONNECTOR_CHANGE = "onShowSuggestConnectorChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_SUGGEST_CONNECTOR_OVERLAY_CHANGE = "onSuggestConnectorOverlayChange";
	private static final String ON_TAB_VIEW_CHANGE = "onTabViewChange";
	private static final String ON_TOOLBAR_CHANGE = "onToolbarChange";
	private static final String ON_TOOLBAR_CONTAINER_CHANGE = "onToolbarContainerChange";
	private static final String ON_USE_ARIACHANGE = "onUseARIAChange";

	protected java.lang.Object getAvailableFields() {
		return (java.lang.Object) getStateHelper().eval(AVAILABLE_FIELDS, null);
	}

	protected void setAvailableFields(java.lang.Object availableFields) {
		getStateHelper().put(AVAILABLE_FIELDS, availableFields);
	}

	protected java.lang.Object getAvailableFieldsDragConfig() {
		return (java.lang.Object) getStateHelper().eval(AVAILABLE_FIELDS_DRAG_CONFIG, null);
	}

	protected void setAvailableFieldsDragConfig(java.lang.Object availableFieldsDragConfig) {
		getStateHelper().put(AVAILABLE_FIELDS_DRAG_CONFIG, availableFieldsDragConfig);
	}

	protected java.lang.Object getCanvas() {
		return (java.lang.Object) getStateHelper().eval(CANVAS, null);
	}

	protected void setCanvas(java.lang.Object canvas) {
		getStateHelper().put(CANVAS, canvas);
	}

	protected java.lang.Object getConnector() {
		return (java.lang.Object) getStateHelper().eval(CONNECTOR, null);
	}

	protected void setConnector(java.lang.Object connector) {
		getStateHelper().put(CONNECTOR, connector);
	}

	protected java.lang.Object getContentContainer() {
		return (java.lang.Object) getStateHelper().eval(CONTENT_CONTAINER, null);
	}

	protected void setContentContainer(java.lang.Object contentContainer) {
		getStateHelper().put(CONTENT_CONTAINER, contentContainer);
	}

	protected java.lang.String getCssClass() {
		return (java.lang.String) getStateHelper().eval(CSS_CLASS, null);
	}

	protected void setCssClass(java.lang.String cssClass) {
		getStateHelper().put(CSS_CLASS, cssClass);
	}

	protected java.lang.Object getDropConfig() {
		return (java.lang.Object) getStateHelper().eval(DROP_CONFIG, null);
	}

	protected void setDropConfig(java.lang.Object dropConfig) {
		getStateHelper().put(DROP_CONFIG, dropConfig);
	}

	protected java.lang.Object getDropContainer() {
		return (java.lang.Object) getStateHelper().eval(DROP_CONTAINER, null);
	}

	protected void setDropContainer(java.lang.Object dropContainer) {
		getStateHelper().put(DROP_CONTAINER, dropContainer);
	}

	protected java.lang.Object getFields() {
		return (java.lang.Object) getStateHelper().eval(FIELDS, null);
	}

	protected void setFields(java.lang.Object fields) {
		getStateHelper().put(FIELDS, fields);
	}

	protected java.lang.Object getFieldsContainer() {
		return (java.lang.Object) getStateHelper().eval(FIELDS_CONTAINER, null);
	}

	protected void setFieldsContainer(java.lang.Object fieldsContainer) {
		getStateHelper().put(FIELDS_CONTAINER, fieldsContainer);
	}

	protected java.lang.Object getFieldsDragConfig() {
		return (java.lang.Object) getStateHelper().eval(FIELDS_DRAG_CONFIG, null);
	}

	protected void setFieldsDragConfig(java.lang.Object fieldsDragConfig) {
		getStateHelper().put(FIELDS_DRAG_CONFIG, fieldsDragConfig);
	}

	protected java.lang.Object getGraphic() {
		return (java.lang.Object) getStateHelper().eval(GRAPHIC, null);
	}

	protected void setGraphic(java.lang.Object graphic) {
		getStateHelper().put(GRAPHIC, graphic);
	}

	protected java.lang.String getHideClass() {
		return (java.lang.String) getStateHelper().eval(HIDE_CLASS, null);
	}

	protected void setHideClass(java.lang.String hideClass) {
		getStateHelper().put(HIDE_CLASS, hideClass);
	}

	protected java.lang.Boolean getHighlightDropZones() {
		return (java.lang.Boolean) getStateHelper().eval(HIGHLIGHT_DROP_ZONES, null);
	}

	protected void setHighlightDropZones(java.lang.Boolean highlightDropZones) {
		getStateHelper().put(HIGHLIGHT_DROP_ZONES, highlightDropZones);
	}

	protected java.lang.Object getMaxFields() {
		return (java.lang.Object) getStateHelper().eval(MAX_FIELDS, null);
	}

	protected void setMaxFields(java.lang.Object maxFields) {
		getStateHelper().put(MAX_FIELDS, maxFields);
	}

	protected java.lang.Object getPropertyList() {
		return (java.lang.Object) getStateHelper().eval(PROPERTY_LIST, null);
	}

	protected void setPropertyList(java.lang.Object propertyList) {
		getStateHelper().put(PROPERTY_LIST, propertyList);
	}

	protected java.lang.Object getRender() {
		return (java.lang.Object) getStateHelper().eval(RENDER, null);
	}

	protected void setRender(java.lang.Object render) {
		getStateHelper().put(RENDER, render);
	}

	protected java.lang.Boolean getShowSuggestConnector() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_SUGGEST_CONNECTOR, null);
	}

	protected void setShowSuggestConnector(java.lang.Boolean showSuggestConnector) {
		getStateHelper().put(SHOW_SUGGEST_CONNECTOR, showSuggestConnector);
	}

	protected java.lang.Object getStrings() {
		return (java.lang.Object) getStateHelper().eval(STRINGS, null);
	}

	protected void setStrings(java.lang.Object strings) {
		getStateHelper().put(STRINGS, strings);
	}

	protected java.lang.Object getSuggestConnectorOverlay() {
		return (java.lang.Object) getStateHelper().eval(SUGGEST_CONNECTOR_OVERLAY, null);
	}

	protected void setSuggestConnectorOverlay(java.lang.Object suggestConnectorOverlay) {
		getStateHelper().put(SUGGEST_CONNECTOR_OVERLAY, suggestConnectorOverlay);
	}

	protected java.lang.Object getTabView() {
		return (java.lang.Object) getStateHelper().eval(TAB_VIEW, null);
	}

	protected void setTabView(java.lang.Object tabView) {
		getStateHelper().put(TAB_VIEW, tabView);
	}

	protected java.lang.Object getToolbar() {
		return (java.lang.Object) getStateHelper().eval(TOOLBAR, null);
	}

	protected void setToolbar(java.lang.Object toolbar) {
		getStateHelper().put(TOOLBAR, toolbar);
	}

	protected java.lang.Object getToolbarContainer() {
		return (java.lang.Object) getStateHelper().eval(TOOLBAR_CONTAINER, null);
	}

	protected void setToolbarContainer(java.lang.Object toolbarContainer) {
		getStateHelper().put(TOOLBAR_CONTAINER, toolbarContainer);
	}

	protected java.lang.Boolean getUseARIA() {
		return (java.lang.Boolean) getStateHelper().eval(USE_ARIA, null);
	}

	protected void setUseARIA(java.lang.Boolean useARIA) {
		getStateHelper().put(USE_ARIA, useARIA);
	}

	protected java.lang.String getAfterAvailableFieldsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_AVAILABLE_FIELDS_CHANGE, null);
	}

	protected void setAfterAvailableFieldsChange(java.lang.String afterAvailableFieldsChange) {
		getStateHelper().put(AFTER_AVAILABLE_FIELDS_CHANGE, afterAvailableFieldsChange);
	}

	protected java.lang.String getAfterAvailableFieldsDragConfigChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE, null);
	}

	protected void setAfterAvailableFieldsDragConfigChange(java.lang.String afterAvailableFieldsDragConfigChange) {
		getStateHelper().put(AFTER_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE, afterAvailableFieldsDragConfigChange);
	}

	protected java.lang.String getAfterCanvasChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CANVAS_CHANGE, null);
	}

	protected void setAfterCanvasChange(java.lang.String afterCanvasChange) {
		getStateHelper().put(AFTER_CANVAS_CHANGE, afterCanvasChange);
	}

	protected java.lang.String getAfterConnectorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONNECTOR_CHANGE, null);
	}

	protected void setAfterConnectorChange(java.lang.String afterConnectorChange) {
		getStateHelper().put(AFTER_CONNECTOR_CHANGE, afterConnectorChange);
	}

	protected java.lang.String getAfterContentContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_CONTAINER_CHANGE, null);
	}

	protected void setAfterContentContainerChange(java.lang.String afterContentContainerChange) {
		getStateHelper().put(AFTER_CONTENT_CONTAINER_CHANGE, afterContentContainerChange);
	}

	protected java.lang.String getAfterCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASS_CHANGE, null);
	}

	protected void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		getStateHelper().put(AFTER_CSS_CLASS_CHANGE, afterCssClassChange);
	}

	protected java.lang.String getAfterDropConfigChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DROP_CONFIG_CHANGE, null);
	}

	protected void setAfterDropConfigChange(java.lang.String afterDropConfigChange) {
		getStateHelper().put(AFTER_DROP_CONFIG_CHANGE, afterDropConfigChange);
	}

	protected java.lang.String getAfterDropContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DROP_CONTAINER_CHANGE, null);
	}

	protected void setAfterDropContainerChange(java.lang.String afterDropContainerChange) {
		getStateHelper().put(AFTER_DROP_CONTAINER_CHANGE, afterDropContainerChange);
	}

	protected java.lang.String getAfterFieldsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FIELDS_CHANGE, null);
	}

	protected void setAfterFieldsChange(java.lang.String afterFieldsChange) {
		getStateHelper().put(AFTER_FIELDS_CHANGE, afterFieldsChange);
	}

	protected java.lang.String getAfterFieldsContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FIELDS_CONTAINER_CHANGE, null);
	}

	protected void setAfterFieldsContainerChange(java.lang.String afterFieldsContainerChange) {
		getStateHelper().put(AFTER_FIELDS_CONTAINER_CHANGE, afterFieldsContainerChange);
	}

	protected java.lang.String getAfterFieldsDragConfigChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FIELDS_DRAG_CONFIG_CHANGE, null);
	}

	protected void setAfterFieldsDragConfigChange(java.lang.String afterFieldsDragConfigChange) {
		getStateHelper().put(AFTER_FIELDS_DRAG_CONFIG_CHANGE, afterFieldsDragConfigChange);
	}

	protected java.lang.String getAfterGraphicChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_GRAPHIC_CHANGE, null);
	}

	protected void setAfterGraphicChange(java.lang.String afterGraphicChange) {
		getStateHelper().put(AFTER_GRAPHIC_CHANGE, afterGraphicChange);
	}

	protected java.lang.String getAfterHideClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_CLASS_CHANGE, null);
	}

	protected void setAfterHideClassChange(java.lang.String afterHideClassChange) {
		getStateHelper().put(AFTER_HIDE_CLASS_CHANGE, afterHideClassChange);
	}

	protected java.lang.String getAfterHighlightDropZonesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIGHLIGHT_DROP_ZONES_CHANGE, null);
	}

	protected void setAfterHighlightDropZonesChange(java.lang.String afterHighlightDropZonesChange) {
		getStateHelper().put(AFTER_HIGHLIGHT_DROP_ZONES_CHANGE, afterHighlightDropZonesChange);
	}

	protected java.lang.String getAfterMaxFieldsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MAX_FIELDS_CHANGE, null);
	}

	protected void setAfterMaxFieldsChange(java.lang.String afterMaxFieldsChange) {
		getStateHelper().put(AFTER_MAX_FIELDS_CHANGE, afterMaxFieldsChange);
	}

	protected java.lang.String getAfterPropertyListChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PROPERTY_LIST_CHANGE, null);
	}

	protected void setAfterPropertyListChange(java.lang.String afterPropertyListChange) {
		getStateHelper().put(AFTER_PROPERTY_LIST_CHANGE, afterPropertyListChange);
	}

	protected java.lang.String getAfterRenderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_CHANGE, null);
	}

	protected void setAfterRenderChange(java.lang.String afterRenderChange) {
		getStateHelper().put(AFTER_RENDER_CHANGE, afterRenderChange);
	}

	protected java.lang.String getAfterShowSuggestConnectorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_SUGGEST_CONNECTOR_CHANGE, null);
	}

	protected void setAfterShowSuggestConnectorChange(java.lang.String afterShowSuggestConnectorChange) {
		getStateHelper().put(AFTER_SHOW_SUGGEST_CONNECTOR_CHANGE, afterShowSuggestConnectorChange);
	}

	protected java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	protected void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	protected java.lang.String getAfterSuggestConnectorOverlayChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SUGGEST_CONNECTOR_OVERLAY_CHANGE, null);
	}

	protected void setAfterSuggestConnectorOverlayChange(java.lang.String afterSuggestConnectorOverlayChange) {
		getStateHelper().put(AFTER_SUGGEST_CONNECTOR_OVERLAY_CHANGE, afterSuggestConnectorOverlayChange);
	}

	protected java.lang.String getAfterTabViewChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_VIEW_CHANGE, null);
	}

	protected void setAfterTabViewChange(java.lang.String afterTabViewChange) {
		getStateHelper().put(AFTER_TAB_VIEW_CHANGE, afterTabViewChange);
	}

	protected java.lang.String getAfterToolbarChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOOLBAR_CHANGE, null);
	}

	protected void setAfterToolbarChange(java.lang.String afterToolbarChange) {
		getStateHelper().put(AFTER_TOOLBAR_CHANGE, afterToolbarChange);
	}

	protected java.lang.String getAfterToolbarContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOOLBAR_CONTAINER_CHANGE, null);
	}

	protected void setAfterToolbarContainerChange(java.lang.String afterToolbarContainerChange) {
		getStateHelper().put(AFTER_TOOLBAR_CONTAINER_CHANGE, afterToolbarContainerChange);
	}

	protected java.lang.String getAfterUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_ARIACHANGE, null);
	}

	protected void setAfterUseARIAChange(java.lang.String afterUseARIAChange) {
		getStateHelper().put(AFTER_USE_ARIACHANGE, afterUseARIAChange);
	}

	protected java.lang.String getOnAvailableFieldsChange() {
		return (java.lang.String) getStateHelper().eval(ON_AVAILABLE_FIELDS_CHANGE, null);
	}

	protected void setOnAvailableFieldsChange(java.lang.String onAvailableFieldsChange) {
		getStateHelper().put(ON_AVAILABLE_FIELDS_CHANGE, onAvailableFieldsChange);
	}

	protected java.lang.String getOnAvailableFieldsDragConfigChange() {
		return (java.lang.String) getStateHelper().eval(ON_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE, null);
	}

	protected void setOnAvailableFieldsDragConfigChange(java.lang.String onAvailableFieldsDragConfigChange) {
		getStateHelper().put(ON_AVAILABLE_FIELDS_DRAG_CONFIG_CHANGE, onAvailableFieldsDragConfigChange);
	}

	protected java.lang.String getOnCanvasChange() {
		return (java.lang.String) getStateHelper().eval(ON_CANVAS_CHANGE, null);
	}

	protected void setOnCanvasChange(java.lang.String onCanvasChange) {
		getStateHelper().put(ON_CANVAS_CHANGE, onCanvasChange);
	}

	protected java.lang.String getOnConnectorChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONNECTOR_CHANGE, null);
	}

	protected void setOnConnectorChange(java.lang.String onConnectorChange) {
		getStateHelper().put(ON_CONNECTOR_CHANGE, onConnectorChange);
	}

	protected java.lang.String getOnContentContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_CONTAINER_CHANGE, null);
	}

	protected void setOnContentContainerChange(java.lang.String onContentContainerChange) {
		getStateHelper().put(ON_CONTENT_CONTAINER_CHANGE, onContentContainerChange);
	}

	protected java.lang.String getOnCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASS_CHANGE, null);
	}

	protected void setOnCssClassChange(java.lang.String onCssClassChange) {
		getStateHelper().put(ON_CSS_CLASS_CHANGE, onCssClassChange);
	}

	protected java.lang.String getOnDropConfigChange() {
		return (java.lang.String) getStateHelper().eval(ON_DROP_CONFIG_CHANGE, null);
	}

	protected void setOnDropConfigChange(java.lang.String onDropConfigChange) {
		getStateHelper().put(ON_DROP_CONFIG_CHANGE, onDropConfigChange);
	}

	protected java.lang.String getOnDropContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_DROP_CONTAINER_CHANGE, null);
	}

	protected void setOnDropContainerChange(java.lang.String onDropContainerChange) {
		getStateHelper().put(ON_DROP_CONTAINER_CHANGE, onDropContainerChange);
	}

	protected java.lang.String getOnFieldsChange() {
		return (java.lang.String) getStateHelper().eval(ON_FIELDS_CHANGE, null);
	}

	protected void setOnFieldsChange(java.lang.String onFieldsChange) {
		getStateHelper().put(ON_FIELDS_CHANGE, onFieldsChange);
	}

	protected java.lang.String getOnFieldsContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_FIELDS_CONTAINER_CHANGE, null);
	}

	protected void setOnFieldsContainerChange(java.lang.String onFieldsContainerChange) {
		getStateHelper().put(ON_FIELDS_CONTAINER_CHANGE, onFieldsContainerChange);
	}

	protected java.lang.String getOnFieldsDragConfigChange() {
		return (java.lang.String) getStateHelper().eval(ON_FIELDS_DRAG_CONFIG_CHANGE, null);
	}

	protected void setOnFieldsDragConfigChange(java.lang.String onFieldsDragConfigChange) {
		getStateHelper().put(ON_FIELDS_DRAG_CONFIG_CHANGE, onFieldsDragConfigChange);
	}

	protected java.lang.String getOnGraphicChange() {
		return (java.lang.String) getStateHelper().eval(ON_GRAPHIC_CHANGE, null);
	}

	protected void setOnGraphicChange(java.lang.String onGraphicChange) {
		getStateHelper().put(ON_GRAPHIC_CHANGE, onGraphicChange);
	}

	protected java.lang.String getOnHideClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_CLASS_CHANGE, null);
	}

	protected void setOnHideClassChange(java.lang.String onHideClassChange) {
		getStateHelper().put(ON_HIDE_CLASS_CHANGE, onHideClassChange);
	}

	protected java.lang.String getOnHighlightDropZonesChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIGHLIGHT_DROP_ZONES_CHANGE, null);
	}

	protected void setOnHighlightDropZonesChange(java.lang.String onHighlightDropZonesChange) {
		getStateHelper().put(ON_HIGHLIGHT_DROP_ZONES_CHANGE, onHighlightDropZonesChange);
	}

	protected java.lang.String getOnMaxFieldsChange() {
		return (java.lang.String) getStateHelper().eval(ON_MAX_FIELDS_CHANGE, null);
	}

	protected void setOnMaxFieldsChange(java.lang.String onMaxFieldsChange) {
		getStateHelper().put(ON_MAX_FIELDS_CHANGE, onMaxFieldsChange);
	}

	protected java.lang.String getOnPropertyListChange() {
		return (java.lang.String) getStateHelper().eval(ON_PROPERTY_LIST_CHANGE, null);
	}

	protected void setOnPropertyListChange(java.lang.String onPropertyListChange) {
		getStateHelper().put(ON_PROPERTY_LIST_CHANGE, onPropertyListChange);
	}

	protected java.lang.String getOnRenderChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_CHANGE, null);
	}

	protected void setOnRenderChange(java.lang.String onRenderChange) {
		getStateHelper().put(ON_RENDER_CHANGE, onRenderChange);
	}

	protected java.lang.String getOnShowSuggestConnectorChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_SUGGEST_CONNECTOR_CHANGE, null);
	}

	protected void setOnShowSuggestConnectorChange(java.lang.String onShowSuggestConnectorChange) {
		getStateHelper().put(ON_SHOW_SUGGEST_CONNECTOR_CHANGE, onShowSuggestConnectorChange);
	}

	protected java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	protected void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

	protected java.lang.String getOnSuggestConnectorOverlayChange() {
		return (java.lang.String) getStateHelper().eval(ON_SUGGEST_CONNECTOR_OVERLAY_CHANGE, null);
	}

	protected void setOnSuggestConnectorOverlayChange(java.lang.String onSuggestConnectorOverlayChange) {
		getStateHelper().put(ON_SUGGEST_CONNECTOR_OVERLAY_CHANGE, onSuggestConnectorOverlayChange);
	}

	protected java.lang.String getOnTabViewChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_VIEW_CHANGE, null);
	}

	protected void setOnTabViewChange(java.lang.String onTabViewChange) {
		getStateHelper().put(ON_TAB_VIEW_CHANGE, onTabViewChange);
	}

	protected java.lang.String getOnToolbarChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOOLBAR_CHANGE, null);
	}

	protected void setOnToolbarChange(java.lang.String onToolbarChange) {
		getStateHelper().put(ON_TOOLBAR_CHANGE, onToolbarChange);
	}

	protected java.lang.String getOnToolbarContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOOLBAR_CONTAINER_CHANGE, null);
	}

	protected void setOnToolbarContainerChange(java.lang.String onToolbarContainerChange) {
		getStateHelper().put(ON_TOOLBAR_CONTAINER_CHANGE, onToolbarContainerChange);
	}

	protected java.lang.String getOnUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_ARIACHANGE, null);
	}

	protected void setOnUseARIAChange(java.lang.String onUseARIAChange) {
		getStateHelper().put(ON_USE_ARIACHANGE, onUseARIAChange);
	}

}