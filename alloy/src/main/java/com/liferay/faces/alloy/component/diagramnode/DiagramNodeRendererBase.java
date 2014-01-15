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
package com.liferay.faces.alloy.component.diagramnode;

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
public abstract class DiagramNodeRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		DiagramNode diagramNode = (DiagramNode) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var diagramNode = new A.DiagramNode");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlign(renrederedAttributes, diagramNode);
		renderAlignOn(renrederedAttributes, diagramNode);
		renderDiagramnodeBodyContent(renrederedAttributes, diagramNode);
		renderBoundingBox(renrederedAttributes, diagramNode);
		renderBuilder(renrederedAttributes, diagramNode);
		renderCentered(renrederedAttributes, diagramNode);
		renderConnectors(renrederedAttributes, diagramNode);
		renderConstrain(renrederedAttributes, diagramNode);
		renderContentBox(renrederedAttributes, diagramNode);
		renderControlsToolbar(renrederedAttributes, diagramNode);
		renderDescription(renrederedAttributes, diagramNode);
		renderDestroyed(renrederedAttributes, diagramNode);
		renderDisabled(renrederedAttributes, diagramNode);
		renderFillHeight(renrederedAttributes, diagramNode);
		renderFocused(renrederedAttributes, diagramNode);
		renderFooterContent(renrederedAttributes, diagramNode);
		renderGraphic(renrederedAttributes, diagramNode);
		renderHeaderContent(renrederedAttributes, diagramNode);
		renderHeight(renrederedAttributes, diagramNode);
		renderHighlightBoundaryStroke(renrederedAttributes, diagramNode);
		renderHighlighted(renrederedAttributes, diagramNode);
		renderDiagramnodeId(renrederedAttributes, diagramNode);
		renderInitialized(renrederedAttributes, diagramNode);
		renderDiagramnodeLocale(renrederedAttributes, diagramNode);
		renderName(renrederedAttributes, diagramNode);
		renderPreventOverlap(renrederedAttributes, diagramNode);
		renderRender(renrederedAttributes, diagramNode);
		renderRendered(renrederedAttributes, diagramNode);
		renderRequired(renrederedAttributes, diagramNode);
		renderSelected(renrederedAttributes, diagramNode);
		renderShapeBoundary(renrederedAttributes, diagramNode);
		renderShapeInvite(renrederedAttributes, diagramNode);
		renderShim(renrederedAttributes, diagramNode);
		renderSrcNode(renrederedAttributes, diagramNode);
		renderStrings(renrederedAttributes, diagramNode);
		renderTabIndex(renrederedAttributes, diagramNode);
		renderTransitions(renrederedAttributes, diagramNode);
		renderType(renrederedAttributes, diagramNode);
		renderVisible(renrederedAttributes, diagramNode);
		renderWidth(renrederedAttributes, diagramNode);
		renderX(renrederedAttributes, diagramNode);
		renderXy(renrederedAttributes, diagramNode);
		renderY(renrederedAttributes, diagramNode);
		renderZIndex(renrederedAttributes, diagramNode);

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

	protected void renderAlign(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getAlign() != null) {
			renrederedAttributes.add(renderObject("align", diagramNode.getAlign()));
		}
	}

	protected void renderAlignOn(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getAlignOn() != null) {
			renrederedAttributes.add(renderArray("alignOn", diagramNode.getAlignOn()));
		}
	}

	protected void renderDiagramnodeBodyContent(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getDiagramnodeBodyContent() != null) {
			renrederedAttributes.add(renderString("diagramnodeBodyContent", diagramNode.getDiagramnodeBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", diagramNode.getBoundingBox()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getBuilder() != null) {
			renrederedAttributes.add(renderString("builder", diagramNode.getBuilder()));
		}
	}

	protected void renderCentered(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getCentered() != null) {
			renrederedAttributes.add(renderString("centered", diagramNode.getCentered()));
		}
	}

	protected void renderConnectors(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getConnectors() != null) {
			renrederedAttributes.add(renderString("connectors", diagramNode.getConnectors()));
		}
	}

	protected void renderConstrain(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getConstrain() != null) {
			renrederedAttributes.add(renderString("constrain", diagramNode.getConstrain()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", diagramNode.getContentBox()));
		}
	}

	protected void renderControlsToolbar(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getControlsToolbar() != null) {
			renrederedAttributes.add(renderObject("controlsToolbar", diagramNode.getControlsToolbar()));
		}
	}

	protected void renderDescription(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getDescription() != null) {
			renrederedAttributes.add(renderString("description", diagramNode.getDescription()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", diagramNode.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", diagramNode.getDisabled()));
		}
	}

	protected void renderFillHeight(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getFillHeight() != null) {
			renrederedAttributes.add(renderString("fillHeight", diagramNode.getFillHeight()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", diagramNode.getFocused()));
		}
	}

	protected void renderFooterContent(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getFooterContent() != null) {
			renrederedAttributes.add(renderString("footerContent", diagramNode.getFooterContent()));
		}
	}

	protected void renderGraphic(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getGraphic() != null) {
			renrederedAttributes.add(renderObject("graphic", diagramNode.getGraphic()));
		}
	}

	protected void renderHeaderContent(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getHeaderContent() != null) {
			renrederedAttributes.add(renderString("headerContent", diagramNode.getHeaderContent()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getHeight() != null) {
			renrederedAttributes.add(renderNumber("height", diagramNode.getHeight()));
		}
	}

	protected void renderHighlightBoundaryStroke(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getHighlightBoundaryStroke() != null) {
			renrederedAttributes.add(renderObject("highlightBoundaryStroke", diagramNode.getHighlightBoundaryStroke()));
		}
	}

	protected void renderHighlighted(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getHighlighted() != null) {
			renrederedAttributes.add(renderBoolean("highlighted", diagramNode.getHighlighted()));
		}
	}

	protected void renderDiagramnodeId(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getDiagramnodeId() != null) {
			renrederedAttributes.add(renderString("diagramnodeId", diagramNode.getDiagramnodeId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", diagramNode.getInitialized()));
		}
	}

	protected void renderDiagramnodeLocale(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getDiagramnodeLocale() != null) {
			renrederedAttributes.add(renderString("diagramnodeLocale", diagramNode.getDiagramnodeLocale()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getName() != null) {
			renrederedAttributes.add(renderString("name", diagramNode.getName()));
		}
	}

	protected void renderPreventOverlap(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getPreventOverlap() != null) {
			renrederedAttributes.add(renderBoolean("preventOverlap", diagramNode.getPreventOverlap()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getRender() != null) {
			renrederedAttributes.add(renderString("render", diagramNode.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", diagramNode.getRendered()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", diagramNode.getRequired()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", diagramNode.getSelected()));
		}
	}

	protected void renderShapeBoundary(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getShapeBoundary() != null) {
			renrederedAttributes.add(renderObject("shapeBoundary", diagramNode.getShapeBoundary()));
		}
	}

	protected void renderShapeInvite(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getShapeInvite() != null) {
			renrederedAttributes.add(renderObject("shapeInvite", diagramNode.getShapeInvite()));
		}
	}

	protected void renderShim(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getShim() != null) {
			renrederedAttributes.add(renderBoolean("shim", diagramNode.getShim()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", diagramNode.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", diagramNode.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", diagramNode.getTabIndex()));
		}
	}

	protected void renderTransitions(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getTransitions() != null) {
			renrederedAttributes.add(renderString("transitions", diagramNode.getTransitions()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getType() != null) {
			renrederedAttributes.add(renderString("type", diagramNode.getType()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", diagramNode.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getWidth() != null) {
			renrederedAttributes.add(renderNumber("width", diagramNode.getWidth()));
		}
	}

	protected void renderX(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getX() != null) {
			renrederedAttributes.add(renderNumber("x", diagramNode.getX()));
		}
	}

	protected void renderXy(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getXy() != null) {
			renrederedAttributes.add(renderArray("xy", diagramNode.getXy()));
		}
	}

	protected void renderY(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getY() != null) {
			renrederedAttributes.add(renderNumber("y", diagramNode.getY()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, DiagramNode diagramNode) throws IOException {
		if (diagramNode.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", diagramNode.getZIndex()));
		}
	}

}