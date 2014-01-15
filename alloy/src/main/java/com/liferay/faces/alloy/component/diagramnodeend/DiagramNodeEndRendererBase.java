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
public abstract class DiagramNodeEndRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		DiagramNodeEnd diagramNodeEnd = (DiagramNodeEnd) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var diagramNodeEnd = new A.DiagramNodeEnd");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlign(renrederedAttributes, diagramNodeEnd);
		renderAlignOn(renrederedAttributes, diagramNodeEnd);
		renderDiagramnodeendBodyContent(renrederedAttributes, diagramNodeEnd);
		renderBoundingBox(renrederedAttributes, diagramNodeEnd);
		renderBuilder(renrederedAttributes, diagramNodeEnd);
		renderCentered(renrederedAttributes, diagramNodeEnd);
		renderConnectors(renrederedAttributes, diagramNodeEnd);
		renderConstrain(renrederedAttributes, diagramNodeEnd);
		renderContentBox(renrederedAttributes, diagramNodeEnd);
		renderControlsToolbar(renrederedAttributes, diagramNodeEnd);
		renderDescription(renrederedAttributes, diagramNodeEnd);
		renderDestroyed(renrederedAttributes, diagramNodeEnd);
		renderDisabled(renrederedAttributes, diagramNodeEnd);
		renderFillHeight(renrederedAttributes, diagramNodeEnd);
		renderFocused(renrederedAttributes, diagramNodeEnd);
		renderFooterContent(renrederedAttributes, diagramNodeEnd);
		renderGraphic(renrederedAttributes, diagramNodeEnd);
		renderHeaderContent(renrederedAttributes, diagramNodeEnd);
		renderHeight(renrederedAttributes, diagramNodeEnd);
		renderHighlightBoundaryStroke(renrederedAttributes, diagramNodeEnd);
		renderHighlighted(renrederedAttributes, diagramNodeEnd);
		renderDiagramnodeendId(renrederedAttributes, diagramNodeEnd);
		renderInitialized(renrederedAttributes, diagramNodeEnd);
		renderDiagramnodeendLocale(renrederedAttributes, diagramNodeEnd);
		renderName(renrederedAttributes, diagramNodeEnd);
		renderPreventOverlap(renrederedAttributes, diagramNodeEnd);
		renderRender(renrederedAttributes, diagramNodeEnd);
		renderRendered(renrederedAttributes, diagramNodeEnd);
		renderRequired(renrederedAttributes, diagramNodeEnd);
		renderSelected(renrederedAttributes, diagramNodeEnd);
		renderShapeBoundary(renrederedAttributes, diagramNodeEnd);
		renderShapeInvite(renrederedAttributes, diagramNodeEnd);
		renderShim(renrederedAttributes, diagramNodeEnd);
		renderSrcNode(renrederedAttributes, diagramNodeEnd);
		renderStrings(renrederedAttributes, diagramNodeEnd);
		renderTabIndex(renrederedAttributes, diagramNodeEnd);
		renderTransitions(renrederedAttributes, diagramNodeEnd);
		renderType(renrederedAttributes, diagramNodeEnd);
		renderVisible(renrederedAttributes, diagramNodeEnd);
		renderWidth(renrederedAttributes, diagramNodeEnd);
		renderX(renrederedAttributes, diagramNodeEnd);
		renderXy(renrederedAttributes, diagramNodeEnd);
		renderY(renrederedAttributes, diagramNodeEnd);
		renderZIndex(renrederedAttributes, diagramNodeEnd);

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

	protected void renderAlign(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getAlign() != null) {
			renrederedAttributes.add(renderObject("align", diagramNodeEnd.getAlign()));
		}
	}

	protected void renderAlignOn(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getAlignOn() != null) {
			renrederedAttributes.add(renderArray("alignOn", diagramNodeEnd.getAlignOn()));
		}
	}

	protected void renderDiagramnodeendBodyContent(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getDiagramnodeendBodyContent() != null) {
			renrederedAttributes.add(renderString("diagramnodeendBodyContent", diagramNodeEnd.getDiagramnodeendBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", diagramNodeEnd.getBoundingBox()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getBuilder() != null) {
			renrederedAttributes.add(renderString("builder", diagramNodeEnd.getBuilder()));
		}
	}

	protected void renderCentered(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getCentered() != null) {
			renrederedAttributes.add(renderString("centered", diagramNodeEnd.getCentered()));
		}
	}

	protected void renderConnectors(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getConnectors() != null) {
			renrederedAttributes.add(renderString("connectors", diagramNodeEnd.getConnectors()));
		}
	}

	protected void renderConstrain(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getConstrain() != null) {
			renrederedAttributes.add(renderString("constrain", diagramNodeEnd.getConstrain()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", diagramNodeEnd.getContentBox()));
		}
	}

	protected void renderControlsToolbar(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getControlsToolbar() != null) {
			renrederedAttributes.add(renderObject("controlsToolbar", diagramNodeEnd.getControlsToolbar()));
		}
	}

	protected void renderDescription(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getDescription() != null) {
			renrederedAttributes.add(renderString("description", diagramNodeEnd.getDescription()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", diagramNodeEnd.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", diagramNodeEnd.getDisabled()));
		}
	}

	protected void renderFillHeight(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getFillHeight() != null) {
			renrederedAttributes.add(renderString("fillHeight", diagramNodeEnd.getFillHeight()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", diagramNodeEnd.getFocused()));
		}
	}

	protected void renderFooterContent(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getFooterContent() != null) {
			renrederedAttributes.add(renderString("footerContent", diagramNodeEnd.getFooterContent()));
		}
	}

	protected void renderGraphic(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getGraphic() != null) {
			renrederedAttributes.add(renderObject("graphic", diagramNodeEnd.getGraphic()));
		}
	}

	protected void renderHeaderContent(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getHeaderContent() != null) {
			renrederedAttributes.add(renderString("headerContent", diagramNodeEnd.getHeaderContent()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getHeight() != null) {
			renrederedAttributes.add(renderNumber("height", diagramNodeEnd.getHeight()));
		}
	}

	protected void renderHighlightBoundaryStroke(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getHighlightBoundaryStroke() != null) {
			renrederedAttributes.add(renderObject("highlightBoundaryStroke", diagramNodeEnd.getHighlightBoundaryStroke()));
		}
	}

	protected void renderHighlighted(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getHighlighted() != null) {
			renrederedAttributes.add(renderBoolean("highlighted", diagramNodeEnd.getHighlighted()));
		}
	}

	protected void renderDiagramnodeendId(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getDiagramnodeendId() != null) {
			renrederedAttributes.add(renderString("diagramnodeendId", diagramNodeEnd.getDiagramnodeendId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", diagramNodeEnd.getInitialized()));
		}
	}

	protected void renderDiagramnodeendLocale(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getDiagramnodeendLocale() != null) {
			renrederedAttributes.add(renderString("diagramnodeendLocale", diagramNodeEnd.getDiagramnodeendLocale()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getName() != null) {
			renrederedAttributes.add(renderString("name", diagramNodeEnd.getName()));
		}
	}

	protected void renderPreventOverlap(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getPreventOverlap() != null) {
			renrederedAttributes.add(renderBoolean("preventOverlap", diagramNodeEnd.getPreventOverlap()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getRender() != null) {
			renrederedAttributes.add(renderString("render", diagramNodeEnd.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", diagramNodeEnd.getRendered()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", diagramNodeEnd.getRequired()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", diagramNodeEnd.getSelected()));
		}
	}

	protected void renderShapeBoundary(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getShapeBoundary() != null) {
			renrederedAttributes.add(renderObject("shapeBoundary", diagramNodeEnd.getShapeBoundary()));
		}
	}

	protected void renderShapeInvite(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getShapeInvite() != null) {
			renrederedAttributes.add(renderObject("shapeInvite", diagramNodeEnd.getShapeInvite()));
		}
	}

	protected void renderShim(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getShim() != null) {
			renrederedAttributes.add(renderBoolean("shim", diagramNodeEnd.getShim()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", diagramNodeEnd.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", diagramNodeEnd.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", diagramNodeEnd.getTabIndex()));
		}
	}

	protected void renderTransitions(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getTransitions() != null) {
			renrederedAttributes.add(renderString("transitions", diagramNodeEnd.getTransitions()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getType() != null) {
			renrederedAttributes.add(renderString("type", diagramNodeEnd.getType()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", diagramNodeEnd.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getWidth() != null) {
			renrederedAttributes.add(renderNumber("width", diagramNodeEnd.getWidth()));
		}
	}

	protected void renderX(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getX() != null) {
			renrederedAttributes.add(renderNumber("x", diagramNodeEnd.getX()));
		}
	}

	protected void renderXy(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getXy() != null) {
			renrederedAttributes.add(renderArray("xy", diagramNodeEnd.getXy()));
		}
	}

	protected void renderY(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getY() != null) {
			renrederedAttributes.add(renderNumber("y", diagramNodeEnd.getY()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		if (diagramNodeEnd.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", diagramNodeEnd.getZIndex()));
		}
	}

}