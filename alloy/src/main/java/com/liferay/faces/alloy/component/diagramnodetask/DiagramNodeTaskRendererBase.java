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
package com.liferay.faces.alloy.component.diagramnodetask;

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
public abstract class DiagramNodeTaskRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		DiagramNodeTask diagramNodeTask = (DiagramNodeTask) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var diagramNodeTask = new A.DiagramNodeTask");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlign(renrederedAttributes, diagramNodeTask);
		renderAlignOn(renrederedAttributes, diagramNodeTask);
		renderDiagramnodetaskBodyContent(renrederedAttributes, diagramNodeTask);
		renderBoundingBox(renrederedAttributes, diagramNodeTask);
		renderBuilder(renrederedAttributes, diagramNodeTask);
		renderCentered(renrederedAttributes, diagramNodeTask);
		renderConnectors(renrederedAttributes, diagramNodeTask);
		renderConstrain(renrederedAttributes, diagramNodeTask);
		renderContentBox(renrederedAttributes, diagramNodeTask);
		renderControlsToolbar(renrederedAttributes, diagramNodeTask);
		renderDescription(renrederedAttributes, diagramNodeTask);
		renderDestroyed(renrederedAttributes, diagramNodeTask);
		renderDisabled(renrederedAttributes, diagramNodeTask);
		renderFillHeight(renrederedAttributes, diagramNodeTask);
		renderFocused(renrederedAttributes, diagramNodeTask);
		renderFooterContent(renrederedAttributes, diagramNodeTask);
		renderGraphic(renrederedAttributes, diagramNodeTask);
		renderHeaderContent(renrederedAttributes, diagramNodeTask);
		renderHeight(renrederedAttributes, diagramNodeTask);
		renderHighlightBoundaryStroke(renrederedAttributes, diagramNodeTask);
		renderHighlighted(renrederedAttributes, diagramNodeTask);
		renderDiagramnodetaskId(renrederedAttributes, diagramNodeTask);
		renderInitialized(renrederedAttributes, diagramNodeTask);
		renderDiagramnodetaskLocale(renrederedAttributes, diagramNodeTask);
		renderName(renrederedAttributes, diagramNodeTask);
		renderPreventOverlap(renrederedAttributes, diagramNodeTask);
		renderRender(renrederedAttributes, diagramNodeTask);
		renderRendered(renrederedAttributes, diagramNodeTask);
		renderRequired(renrederedAttributes, diagramNodeTask);
		renderSelected(renrederedAttributes, diagramNodeTask);
		renderShapeBoundary(renrederedAttributes, diagramNodeTask);
		renderShapeInvite(renrederedAttributes, diagramNodeTask);
		renderShim(renrederedAttributes, diagramNodeTask);
		renderSrcNode(renrederedAttributes, diagramNodeTask);
		renderStrings(renrederedAttributes, diagramNodeTask);
		renderTabIndex(renrederedAttributes, diagramNodeTask);
		renderTransitions(renrederedAttributes, diagramNodeTask);
		renderType(renrederedAttributes, diagramNodeTask);
		renderVisible(renrederedAttributes, diagramNodeTask);
		renderWidth(renrederedAttributes, diagramNodeTask);
		renderX(renrederedAttributes, diagramNodeTask);
		renderXy(renrederedAttributes, diagramNodeTask);
		renderY(renrederedAttributes, diagramNodeTask);
		renderZIndex(renrederedAttributes, diagramNodeTask);

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

	protected void renderAlign(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getAlign() != null) {
			renrederedAttributes.add(renderObject("align", diagramNodeTask.getAlign()));
		}
	}

	protected void renderAlignOn(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getAlignOn() != null) {
			renrederedAttributes.add(renderArray("alignOn", diagramNodeTask.getAlignOn()));
		}
	}

	protected void renderDiagramnodetaskBodyContent(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getDiagramnodetaskBodyContent() != null) {
			renrederedAttributes.add(renderString("diagramnodetaskBodyContent", diagramNodeTask.getDiagramnodetaskBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", diagramNodeTask.getBoundingBox()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getBuilder() != null) {
			renrederedAttributes.add(renderString("builder", diagramNodeTask.getBuilder()));
		}
	}

	protected void renderCentered(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getCentered() != null) {
			renrederedAttributes.add(renderString("centered", diagramNodeTask.getCentered()));
		}
	}

	protected void renderConnectors(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getConnectors() != null) {
			renrederedAttributes.add(renderString("connectors", diagramNodeTask.getConnectors()));
		}
	}

	protected void renderConstrain(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getConstrain() != null) {
			renrederedAttributes.add(renderString("constrain", diagramNodeTask.getConstrain()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", diagramNodeTask.getContentBox()));
		}
	}

	protected void renderControlsToolbar(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getControlsToolbar() != null) {
			renrederedAttributes.add(renderObject("controlsToolbar", diagramNodeTask.getControlsToolbar()));
		}
	}

	protected void renderDescription(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getDescription() != null) {
			renrederedAttributes.add(renderString("description", diagramNodeTask.getDescription()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", diagramNodeTask.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", diagramNodeTask.getDisabled()));
		}
	}

	protected void renderFillHeight(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getFillHeight() != null) {
			renrederedAttributes.add(renderString("fillHeight", diagramNodeTask.getFillHeight()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", diagramNodeTask.getFocused()));
		}
	}

	protected void renderFooterContent(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getFooterContent() != null) {
			renrederedAttributes.add(renderString("footerContent", diagramNodeTask.getFooterContent()));
		}
	}

	protected void renderGraphic(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getGraphic() != null) {
			renrederedAttributes.add(renderObject("graphic", diagramNodeTask.getGraphic()));
		}
	}

	protected void renderHeaderContent(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getHeaderContent() != null) {
			renrederedAttributes.add(renderString("headerContent", diagramNodeTask.getHeaderContent()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getHeight() != null) {
			renrederedAttributes.add(renderNumber("height", diagramNodeTask.getHeight()));
		}
	}

	protected void renderHighlightBoundaryStroke(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getHighlightBoundaryStroke() != null) {
			renrederedAttributes.add(renderObject("highlightBoundaryStroke", diagramNodeTask.getHighlightBoundaryStroke()));
		}
	}

	protected void renderHighlighted(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getHighlighted() != null) {
			renrederedAttributes.add(renderBoolean("highlighted", diagramNodeTask.getHighlighted()));
		}
	}

	protected void renderDiagramnodetaskId(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getDiagramnodetaskId() != null) {
			renrederedAttributes.add(renderString("diagramnodetaskId", diagramNodeTask.getDiagramnodetaskId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", diagramNodeTask.getInitialized()));
		}
	}

	protected void renderDiagramnodetaskLocale(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getDiagramnodetaskLocale() != null) {
			renrederedAttributes.add(renderString("diagramnodetaskLocale", diagramNodeTask.getDiagramnodetaskLocale()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getName() != null) {
			renrederedAttributes.add(renderString("name", diagramNodeTask.getName()));
		}
	}

	protected void renderPreventOverlap(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getPreventOverlap() != null) {
			renrederedAttributes.add(renderBoolean("preventOverlap", diagramNodeTask.getPreventOverlap()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getRender() != null) {
			renrederedAttributes.add(renderString("render", diagramNodeTask.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", diagramNodeTask.getRendered()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", diagramNodeTask.getRequired()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", diagramNodeTask.getSelected()));
		}
	}

	protected void renderShapeBoundary(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getShapeBoundary() != null) {
			renrederedAttributes.add(renderObject("shapeBoundary", diagramNodeTask.getShapeBoundary()));
		}
	}

	protected void renderShapeInvite(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getShapeInvite() != null) {
			renrederedAttributes.add(renderObject("shapeInvite", diagramNodeTask.getShapeInvite()));
		}
	}

	protected void renderShim(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getShim() != null) {
			renrederedAttributes.add(renderBoolean("shim", diagramNodeTask.getShim()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", diagramNodeTask.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", diagramNodeTask.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", diagramNodeTask.getTabIndex()));
		}
	}

	protected void renderTransitions(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getTransitions() != null) {
			renrederedAttributes.add(renderString("transitions", diagramNodeTask.getTransitions()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getType() != null) {
			renrederedAttributes.add(renderString("type", diagramNodeTask.getType()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", diagramNodeTask.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getWidth() != null) {
			renrederedAttributes.add(renderNumber("width", diagramNodeTask.getWidth()));
		}
	}

	protected void renderX(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getX() != null) {
			renrederedAttributes.add(renderNumber("x", diagramNodeTask.getX()));
		}
	}

	protected void renderXy(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getXy() != null) {
			renrederedAttributes.add(renderArray("xy", diagramNodeTask.getXy()));
		}
	}

	protected void renderY(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getY() != null) {
			renrederedAttributes.add(renderNumber("y", diagramNodeTask.getY()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		if (diagramNodeTask.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", diagramNodeTask.getZIndex()));
		}
	}

}