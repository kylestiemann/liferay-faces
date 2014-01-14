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

import java.io.IOException;

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
public abstract class DiagramBuilderRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		DiagramBuilder diagramBuilder = (DiagramBuilder) uiComponent;
		encodeHTML(facesContext, diagramBuilder);
		encodeJavaScript(facesContext, diagramBuilder);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DiagramBuilder diagramBuilder) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DiagramBuilder diagramBuilder) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, diagramBuilder);

		bufferedResponseWriter.write("var diagramBuilder = new Y.DiagramBuilder");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAvailableFields(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderAvailableFieldsDragConfig(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderCanvas(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderConnector(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderContentContainer(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderCssClass(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderDropConfig(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderDropContainer(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderFields(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderFieldsContainer(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderFieldsDragConfig(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderGraphic(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderHideClass(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderHighlightDropZones(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderMaxFields(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderPropertyList(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderRender(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderShowSuggestConnector(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderSuggestConnectorOverlay(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderTabView(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderToolbar(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderToolbarContainer(responseWriter, diagramBuilder);
		responseWriter.write(StringPool.COMMA);
		renderUseARIA(responseWriter, diagramBuilder);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, diagramBuilder);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAvailableFields(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderArray(responseWriter, "availableFields", diagramBuilder.getAvailableFields());
	}

	protected void renderAvailableFieldsDragConfig(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderObject(responseWriter, "availableFieldsDragConfig", diagramBuilder.getAvailableFieldsDragConfig());
	}

	protected void renderCanvas(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderString(responseWriter, "canvas", diagramBuilder.getCanvas());
	}

	protected void renderConnector(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderString(responseWriter, "connector", diagramBuilder.getConnector());
	}

	protected void renderContentContainer(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderString(responseWriter, "contentContainer", diagramBuilder.getContentContainer());
	}

	protected void renderCssClass(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderString(responseWriter, "cssClass", diagramBuilder.getCssClass());
	}

	protected void renderDropConfig(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderObject(responseWriter, "dropConfig", diagramBuilder.getDropConfig());
	}

	protected void renderDropContainer(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderString(responseWriter, "dropContainer", diagramBuilder.getDropContainer());
	}

	protected void renderFields(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderArray(responseWriter, "fields", diagramBuilder.getFields());
	}

	protected void renderFieldsContainer(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderString(responseWriter, "fieldsContainer", diagramBuilder.getFieldsContainer());
	}

	protected void renderFieldsDragConfig(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderObject(responseWriter, "fieldsDragConfig", diagramBuilder.getFieldsDragConfig());
	}

	protected void renderGraphic(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderObject(responseWriter, "graphic", diagramBuilder.getGraphic());
	}

	protected void renderHideClass(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderString(responseWriter, "hideClass", diagramBuilder.getHideClass());
	}

	protected void renderHighlightDropZones(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderBoolean(responseWriter, "highlightDropZones", diagramBuilder.getHighlightDropZones());
	}

	protected void renderMaxFields(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderNumber(responseWriter, "maxFields", diagramBuilder.getMaxFields());
	}

	protected void renderPropertyList(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderObject(responseWriter, "propertyList", diagramBuilder.getPropertyList());
	}

	protected void renderRender(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderString(responseWriter, "render", diagramBuilder.getRender());
	}

	protected void renderShowSuggestConnector(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderBoolean(responseWriter, "showSuggestConnector", diagramBuilder.getShowSuggestConnector());
	}

	protected void renderStrings(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderObject(responseWriter, "strings", diagramBuilder.getStrings());
	}

	protected void renderSuggestConnectorOverlay(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderString(responseWriter, "suggestConnectorOverlay", diagramBuilder.getSuggestConnectorOverlay());
	}

	protected void renderTabView(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderObject(responseWriter, "tabView", diagramBuilder.getTabView());
	}

	protected void renderToolbar(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderObject(responseWriter, "toolbar", diagramBuilder.getToolbar());
	}

	protected void renderToolbarContainer(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderString(responseWriter, "toolbarContainer", diagramBuilder.getToolbarContainer());
	}

	protected void renderUseARIA(ResponseWriter responseWriter, DiagramBuilder diagramBuilder) throws IOException {
		renderBoolean(responseWriter, "useARIA", diagramBuilder.getUseARIA());
	}

}