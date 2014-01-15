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
package com.liferay.faces.alloy.component.diagramnodecondition;

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
public abstract class DiagramNodeConditionRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		DiagramNodeCondition diagramNodeCondition = (DiagramNodeCondition) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var diagramNodeCondition = new A.DiagramNodeCondition");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlign(renrederedAttributes, diagramNodeCondition);
		renderAlignOn(renrederedAttributes, diagramNodeCondition);
		renderDiagramnodeconditionBodyContent(renrederedAttributes, diagramNodeCondition);
		renderBoundingBox(renrederedAttributes, diagramNodeCondition);
		renderBuilder(renrederedAttributes, diagramNodeCondition);
		renderCentered(renrederedAttributes, diagramNodeCondition);
		renderConnectors(renrederedAttributes, diagramNodeCondition);
		renderConstrain(renrederedAttributes, diagramNodeCondition);
		renderContentBox(renrederedAttributes, diagramNodeCondition);
		renderControlsToolbar(renrederedAttributes, diagramNodeCondition);
		renderDescription(renrederedAttributes, diagramNodeCondition);
		renderDestroyed(renrederedAttributes, diagramNodeCondition);
		renderDisabled(renrederedAttributes, diagramNodeCondition);
		renderFillHeight(renrederedAttributes, diagramNodeCondition);
		renderFocused(renrederedAttributes, diagramNodeCondition);
		renderFooterContent(renrederedAttributes, diagramNodeCondition);
		renderGraphic(renrederedAttributes, diagramNodeCondition);
		renderHeaderContent(renrederedAttributes, diagramNodeCondition);
		renderHeight(renrederedAttributes, diagramNodeCondition);
		renderHighlightBoundaryStroke(renrederedAttributes, diagramNodeCondition);
		renderHighlighted(renrederedAttributes, diagramNodeCondition);
		renderDiagramnodeconditionId(renrederedAttributes, diagramNodeCondition);
		renderInitialized(renrederedAttributes, diagramNodeCondition);
		renderDiagramnodeconditionLocale(renrederedAttributes, diagramNodeCondition);
		renderName(renrederedAttributes, diagramNodeCondition);
		renderPreventOverlap(renrederedAttributes, diagramNodeCondition);
		renderRender(renrederedAttributes, diagramNodeCondition);
		renderRendered(renrederedAttributes, diagramNodeCondition);
		renderRequired(renrederedAttributes, diagramNodeCondition);
		renderSelected(renrederedAttributes, diagramNodeCondition);
		renderShapeBoundary(renrederedAttributes, diagramNodeCondition);
		renderShapeInvite(renrederedAttributes, diagramNodeCondition);
		renderShim(renrederedAttributes, diagramNodeCondition);
		renderSrcNode(renrederedAttributes, diagramNodeCondition);
		renderStrings(renrederedAttributes, diagramNodeCondition);
		renderTabIndex(renrederedAttributes, diagramNodeCondition);
		renderTransitions(renrederedAttributes, diagramNodeCondition);
		renderType(renrederedAttributes, diagramNodeCondition);
		renderVisible(renrederedAttributes, diagramNodeCondition);
		renderWidth(renrederedAttributes, diagramNodeCondition);
		renderX(renrederedAttributes, diagramNodeCondition);
		renderXy(renrederedAttributes, diagramNodeCondition);
		renderY(renrederedAttributes, diagramNodeCondition);
		renderZIndex(renrederedAttributes, diagramNodeCondition);

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

	protected void renderAlign(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getAlign() != null) {
			renrederedAttributes.add(renderObject("align", diagramNodeCondition.getAlign()));
		}
	}

	protected void renderAlignOn(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getAlignOn() != null) {
			renrederedAttributes.add(renderArray("alignOn", diagramNodeCondition.getAlignOn()));
		}
	}

	protected void renderDiagramnodeconditionBodyContent(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getDiagramnodeconditionBodyContent() != null) {
			renrederedAttributes.add(renderString("diagramnodeconditionBodyContent", diagramNodeCondition.getDiagramnodeconditionBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", diagramNodeCondition.getBoundingBox()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getBuilder() != null) {
			renrederedAttributes.add(renderString("builder", diagramNodeCondition.getBuilder()));
		}
	}

	protected void renderCentered(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getCentered() != null) {
			renrederedAttributes.add(renderString("centered", diagramNodeCondition.getCentered()));
		}
	}

	protected void renderConnectors(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getConnectors() != null) {
			renrederedAttributes.add(renderString("connectors", diagramNodeCondition.getConnectors()));
		}
	}

	protected void renderConstrain(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getConstrain() != null) {
			renrederedAttributes.add(renderString("constrain", diagramNodeCondition.getConstrain()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", diagramNodeCondition.getContentBox()));
		}
	}

	protected void renderControlsToolbar(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getControlsToolbar() != null) {
			renrederedAttributes.add(renderObject("controlsToolbar", diagramNodeCondition.getControlsToolbar()));
		}
	}

	protected void renderDescription(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getDescription() != null) {
			renrederedAttributes.add(renderString("description", diagramNodeCondition.getDescription()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", diagramNodeCondition.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", diagramNodeCondition.getDisabled()));
		}
	}

	protected void renderFillHeight(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getFillHeight() != null) {
			renrederedAttributes.add(renderString("fillHeight", diagramNodeCondition.getFillHeight()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", diagramNodeCondition.getFocused()));
		}
	}

	protected void renderFooterContent(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getFooterContent() != null) {
			renrederedAttributes.add(renderString("footerContent", diagramNodeCondition.getFooterContent()));
		}
	}

	protected void renderGraphic(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getGraphic() != null) {
			renrederedAttributes.add(renderObject("graphic", diagramNodeCondition.getGraphic()));
		}
	}

	protected void renderHeaderContent(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getHeaderContent() != null) {
			renrederedAttributes.add(renderString("headerContent", diagramNodeCondition.getHeaderContent()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getHeight() != null) {
			renrederedAttributes.add(renderNumber("height", diagramNodeCondition.getHeight()));
		}
	}

	protected void renderHighlightBoundaryStroke(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getHighlightBoundaryStroke() != null) {
			renrederedAttributes.add(renderObject("highlightBoundaryStroke", diagramNodeCondition.getHighlightBoundaryStroke()));
		}
	}

	protected void renderHighlighted(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getHighlighted() != null) {
			renrederedAttributes.add(renderBoolean("highlighted", diagramNodeCondition.getHighlighted()));
		}
	}

	protected void renderDiagramnodeconditionId(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getDiagramnodeconditionId() != null) {
			renrederedAttributes.add(renderString("diagramnodeconditionId", diagramNodeCondition.getDiagramnodeconditionId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", diagramNodeCondition.getInitialized()));
		}
	}

	protected void renderDiagramnodeconditionLocale(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getDiagramnodeconditionLocale() != null) {
			renrederedAttributes.add(renderString("diagramnodeconditionLocale", diagramNodeCondition.getDiagramnodeconditionLocale()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getName() != null) {
			renrederedAttributes.add(renderString("name", diagramNodeCondition.getName()));
		}
	}

	protected void renderPreventOverlap(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getPreventOverlap() != null) {
			renrederedAttributes.add(renderBoolean("preventOverlap", diagramNodeCondition.getPreventOverlap()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getRender() != null) {
			renrederedAttributes.add(renderString("render", diagramNodeCondition.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", diagramNodeCondition.getRendered()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", diagramNodeCondition.getRequired()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", diagramNodeCondition.getSelected()));
		}
	}

	protected void renderShapeBoundary(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getShapeBoundary() != null) {
			renrederedAttributes.add(renderObject("shapeBoundary", diagramNodeCondition.getShapeBoundary()));
		}
	}

	protected void renderShapeInvite(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getShapeInvite() != null) {
			renrederedAttributes.add(renderObject("shapeInvite", diagramNodeCondition.getShapeInvite()));
		}
	}

	protected void renderShim(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getShim() != null) {
			renrederedAttributes.add(renderBoolean("shim", diagramNodeCondition.getShim()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", diagramNodeCondition.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", diagramNodeCondition.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", diagramNodeCondition.getTabIndex()));
		}
	}

	protected void renderTransitions(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getTransitions() != null) {
			renrederedAttributes.add(renderString("transitions", diagramNodeCondition.getTransitions()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getType() != null) {
			renrederedAttributes.add(renderString("type", diagramNodeCondition.getType()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", diagramNodeCondition.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getWidth() != null) {
			renrederedAttributes.add(renderNumber("width", diagramNodeCondition.getWidth()));
		}
	}

	protected void renderX(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getX() != null) {
			renrederedAttributes.add(renderNumber("x", diagramNodeCondition.getX()));
		}
	}

	protected void renderXy(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getXy() != null) {
			renrederedAttributes.add(renderArray("xy", diagramNodeCondition.getXy()));
		}
	}

	protected void renderY(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getY() != null) {
			renrederedAttributes.add(renderNumber("y", diagramNodeCondition.getY()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		if (diagramNodeCondition.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", diagramNodeCondition.getZIndex()));
		}
	}

}