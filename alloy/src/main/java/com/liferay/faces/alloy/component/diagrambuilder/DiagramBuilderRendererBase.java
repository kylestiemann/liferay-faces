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
public abstract class DiagramBuilderRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		DiagramBuilder diagramBuilder = (DiagramBuilder) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var diagramBuilder = new A.DiagramBuilder");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAvailableFields(renrederedAttributes, diagramBuilder);
		renderAvailableFieldsDragConfig(renrederedAttributes, diagramBuilder);
		renderBoundingBox(renrederedAttributes, diagramBuilder);
		renderCanvas(renrederedAttributes, diagramBuilder);
		renderConnector(renrederedAttributes, diagramBuilder);
		renderContentBox(renrederedAttributes, diagramBuilder);
		renderContentContainer(renrederedAttributes, diagramBuilder);
		renderCssClass(renrederedAttributes, diagramBuilder);
		renderDestroyed(renrederedAttributes, diagramBuilder);
		renderDisabled(renrederedAttributes, diagramBuilder);
		renderDropConfig(renrederedAttributes, diagramBuilder);
		renderDropContainer(renrederedAttributes, diagramBuilder);
		renderFields(renrederedAttributes, diagramBuilder);
		renderFieldsContainer(renrederedAttributes, diagramBuilder);
		renderFieldsDragConfig(renrederedAttributes, diagramBuilder);
		renderFocused(renrederedAttributes, diagramBuilder);
		renderGraphic(renrederedAttributes, diagramBuilder);
		renderHeight(renrederedAttributes, diagramBuilder);
		renderHideClass(renrederedAttributes, diagramBuilder);
		renderHighlightDropZones(renrederedAttributes, diagramBuilder);
		renderDiagrambuilderId(renrederedAttributes, diagramBuilder);
		renderInitialized(renrederedAttributes, diagramBuilder);
		renderDiagrambuilderLocale(renrederedAttributes, diagramBuilder);
		renderMaxFields(renrederedAttributes, diagramBuilder);
		renderPropertyList(renrederedAttributes, diagramBuilder);
		renderRender(renrederedAttributes, diagramBuilder);
		renderRendered(renrederedAttributes, diagramBuilder);
		renderShowSuggestConnector(renrederedAttributes, diagramBuilder);
		renderSrcNode(renrederedAttributes, diagramBuilder);
		renderStrings(renrederedAttributes, diagramBuilder);
		renderSuggestConnectorOverlay(renrederedAttributes, diagramBuilder);
		renderTabIndex(renrederedAttributes, diagramBuilder);
		renderTabView(renrederedAttributes, diagramBuilder);
		renderToolbar(renrederedAttributes, diagramBuilder);
		renderToolbarContainer(renrederedAttributes, diagramBuilder);
		renderUseARIA(renrederedAttributes, diagramBuilder);
		renderVisible(renrederedAttributes, diagramBuilder);
		renderWidth(renrederedAttributes, diagramBuilder);

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
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAvailableFields(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getAvailableFields() != null) {
			renrederedAttributes.add(renderArray("availableFields", diagramBuilder.getAvailableFields()));
		}
	}

	protected void renderAvailableFieldsDragConfig(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getAvailableFieldsDragConfig() != null) {
			renrederedAttributes.add(renderObject("availableFieldsDragConfig", diagramBuilder.getAvailableFieldsDragConfig()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", diagramBuilder.getBoundingBox()));
		}
	}

	protected void renderCanvas(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getCanvas() != null) {
			renrederedAttributes.add(renderString("canvas", diagramBuilder.getCanvas()));
		}
	}

	protected void renderConnector(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getConnector() != null) {
			renrederedAttributes.add(renderString("connector", diagramBuilder.getConnector()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", diagramBuilder.getContentBox()));
		}
	}

	protected void renderContentContainer(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getContentContainer() != null) {
			renrederedAttributes.add(renderString("contentContainer", diagramBuilder.getContentContainer()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", diagramBuilder.getCssClass()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", diagramBuilder.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", diagramBuilder.getDisabled()));
		}
	}

	protected void renderDropConfig(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getDropConfig() != null) {
			renrederedAttributes.add(renderObject("dropConfig", diagramBuilder.getDropConfig()));
		}
	}

	protected void renderDropContainer(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getDropContainer() != null) {
			renrederedAttributes.add(renderString("dropContainer", diagramBuilder.getDropContainer()));
		}
	}

	protected void renderFields(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getFields() != null) {
			renrederedAttributes.add(renderArray("fields", diagramBuilder.getFields()));
		}
	}

	protected void renderFieldsContainer(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getFieldsContainer() != null) {
			renrederedAttributes.add(renderString("fieldsContainer", diagramBuilder.getFieldsContainer()));
		}
	}

	protected void renderFieldsDragConfig(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getFieldsDragConfig() != null) {
			renrederedAttributes.add(renderObject("fieldsDragConfig", diagramBuilder.getFieldsDragConfig()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", diagramBuilder.getFocused()));
		}
	}

	protected void renderGraphic(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getGraphic() != null) {
			renrederedAttributes.add(renderObject("graphic", diagramBuilder.getGraphic()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getHeight() != null) {
			renrederedAttributes.add(renderString("height", diagramBuilder.getHeight()));
		}
	}

	protected void renderHideClass(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getHideClass() != null) {
			renrederedAttributes.add(renderString("hideClass", diagramBuilder.getHideClass()));
		}
	}

	protected void renderHighlightDropZones(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getHighlightDropZones() != null) {
			renrederedAttributes.add(renderBoolean("highlightDropZones", diagramBuilder.getHighlightDropZones()));
		}
	}

	protected void renderDiagrambuilderId(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getDiagrambuilderId() != null) {
			renrederedAttributes.add(renderString("diagrambuilderId", diagramBuilder.getDiagrambuilderId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", diagramBuilder.getInitialized()));
		}
	}

	protected void renderDiagrambuilderLocale(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getDiagrambuilderLocale() != null) {
			renrederedAttributes.add(renderString("diagrambuilderLocale", diagramBuilder.getDiagrambuilderLocale()));
		}
	}

	protected void renderMaxFields(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getMaxFields() != null) {
			renrederedAttributes.add(renderNumber("maxFields", diagramBuilder.getMaxFields()));
		}
	}

	protected void renderPropertyList(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getPropertyList() != null) {
			renrederedAttributes.add(renderObject("propertyList", diagramBuilder.getPropertyList()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getRender() != null) {
			renrederedAttributes.add(renderString("render", diagramBuilder.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", diagramBuilder.getRendered()));
		}
	}

	protected void renderShowSuggestConnector(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getShowSuggestConnector() != null) {
			renrederedAttributes.add(renderBoolean("showSuggestConnector", diagramBuilder.getShowSuggestConnector()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", diagramBuilder.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", diagramBuilder.getStrings()));
		}
	}

	protected void renderSuggestConnectorOverlay(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getSuggestConnectorOverlay() != null) {
			renrederedAttributes.add(renderString("suggestConnectorOverlay", diagramBuilder.getSuggestConnectorOverlay()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", diagramBuilder.getTabIndex()));
		}
	}

	protected void renderTabView(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getTabView() != null) {
			renrederedAttributes.add(renderObject("tabView", diagramBuilder.getTabView()));
		}
	}

	protected void renderToolbar(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getToolbar() != null) {
			renrederedAttributes.add(renderObject("toolbar", diagramBuilder.getToolbar()));
		}
	}

	protected void renderToolbarContainer(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getToolbarContainer() != null) {
			renrederedAttributes.add(renderString("toolbarContainer", diagramBuilder.getToolbarContainer()));
		}
	}

	protected void renderUseARIA(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getUseARIA() != null) {
			renrederedAttributes.add(renderBoolean("useARIA", diagramBuilder.getUseARIA()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", diagramBuilder.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, DiagramBuilder diagramBuilder) throws IOException {
		if (diagramBuilder.getWidth() != null) {
			renrederedAttributes.add(renderString("width", diagramBuilder.getWidth()));
		}
	}

}