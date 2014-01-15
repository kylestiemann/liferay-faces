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
package com.liferay.faces.alloy.component.diagramnodestart;

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
public abstract class DiagramNodeStartRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		DiagramNodeStart diagramNodeStart = (DiagramNodeStart) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var diagramNodeStart = new A.DiagramNodeStart");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlign(renrederedAttributes, diagramNodeStart);
		renderAlignOn(renrederedAttributes, diagramNodeStart);
		renderDiagramnodestartBodyContent(renrederedAttributes, diagramNodeStart);
		renderBoundingBox(renrederedAttributes, diagramNodeStart);
		renderBuilder(renrederedAttributes, diagramNodeStart);
		renderCentered(renrederedAttributes, diagramNodeStart);
		renderConnectors(renrederedAttributes, diagramNodeStart);
		renderConstrain(renrederedAttributes, diagramNodeStart);
		renderContentBox(renrederedAttributes, diagramNodeStart);
		renderControlsToolbar(renrederedAttributes, diagramNodeStart);
		renderDescription(renrederedAttributes, diagramNodeStart);
		renderDestroyed(renrederedAttributes, diagramNodeStart);
		renderDisabled(renrederedAttributes, diagramNodeStart);
		renderFillHeight(renrederedAttributes, diagramNodeStart);
		renderFocused(renrederedAttributes, diagramNodeStart);
		renderFooterContent(renrederedAttributes, diagramNodeStart);
		renderGraphic(renrederedAttributes, diagramNodeStart);
		renderHeaderContent(renrederedAttributes, diagramNodeStart);
		renderHeight(renrederedAttributes, diagramNodeStart);
		renderHighlightBoundaryStroke(renrederedAttributes, diagramNodeStart);
		renderHighlighted(renrederedAttributes, diagramNodeStart);
		renderDiagramnodestartId(renrederedAttributes, diagramNodeStart);
		renderInitialized(renrederedAttributes, diagramNodeStart);
		renderDiagramnodestartLocale(renrederedAttributes, diagramNodeStart);
		renderName(renrederedAttributes, diagramNodeStart);
		renderPreventOverlap(renrederedAttributes, diagramNodeStart);
		renderRender(renrederedAttributes, diagramNodeStart);
		renderRendered(renrederedAttributes, diagramNodeStart);
		renderRequired(renrederedAttributes, diagramNodeStart);
		renderSelected(renrederedAttributes, diagramNodeStart);
		renderShapeBoundary(renrederedAttributes, diagramNodeStart);
		renderShapeInvite(renrederedAttributes, diagramNodeStart);
		renderShim(renrederedAttributes, diagramNodeStart);
		renderSrcNode(renrederedAttributes, diagramNodeStart);
		renderStrings(renrederedAttributes, diagramNodeStart);
		renderTabIndex(renrederedAttributes, diagramNodeStart);
		renderTransitions(renrederedAttributes, diagramNodeStart);
		renderType(renrederedAttributes, diagramNodeStart);
		renderVisible(renrederedAttributes, diagramNodeStart);
		renderWidth(renrederedAttributes, diagramNodeStart);
		renderX(renrederedAttributes, diagramNodeStart);
		renderXy(renrederedAttributes, diagramNodeStart);
		renderY(renrederedAttributes, diagramNodeStart);
		renderZIndex(renrederedAttributes, diagramNodeStart);

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

	protected void renderAlign(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getAlign() != null) {
			renrederedAttributes.add(renderObject("align", diagramNodeStart.getAlign()));
		}
	}

	protected void renderAlignOn(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getAlignOn() != null) {
			renrederedAttributes.add(renderArray("alignOn", diagramNodeStart.getAlignOn()));
		}
	}

	protected void renderDiagramnodestartBodyContent(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getDiagramnodestartBodyContent() != null) {
			renrederedAttributes.add(renderString("diagramnodestartBodyContent", diagramNodeStart.getDiagramnodestartBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", diagramNodeStart.getBoundingBox()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getBuilder() != null) {
			renrederedAttributes.add(renderString("builder", diagramNodeStart.getBuilder()));
		}
	}

	protected void renderCentered(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getCentered() != null) {
			renrederedAttributes.add(renderString("centered", diagramNodeStart.getCentered()));
		}
	}

	protected void renderConnectors(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getConnectors() != null) {
			renrederedAttributes.add(renderString("connectors", diagramNodeStart.getConnectors()));
		}
	}

	protected void renderConstrain(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getConstrain() != null) {
			renrederedAttributes.add(renderString("constrain", diagramNodeStart.getConstrain()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", diagramNodeStart.getContentBox()));
		}
	}

	protected void renderControlsToolbar(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getControlsToolbar() != null) {
			renrederedAttributes.add(renderObject("controlsToolbar", diagramNodeStart.getControlsToolbar()));
		}
	}

	protected void renderDescription(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getDescription() != null) {
			renrederedAttributes.add(renderString("description", diagramNodeStart.getDescription()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", diagramNodeStart.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", diagramNodeStart.getDisabled()));
		}
	}

	protected void renderFillHeight(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getFillHeight() != null) {
			renrederedAttributes.add(renderString("fillHeight", diagramNodeStart.getFillHeight()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", diagramNodeStart.getFocused()));
		}
	}

	protected void renderFooterContent(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getFooterContent() != null) {
			renrederedAttributes.add(renderString("footerContent", diagramNodeStart.getFooterContent()));
		}
	}

	protected void renderGraphic(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getGraphic() != null) {
			renrederedAttributes.add(renderObject("graphic", diagramNodeStart.getGraphic()));
		}
	}

	protected void renderHeaderContent(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getHeaderContent() != null) {
			renrederedAttributes.add(renderString("headerContent", diagramNodeStart.getHeaderContent()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getHeight() != null) {
			renrederedAttributes.add(renderNumber("height", diagramNodeStart.getHeight()));
		}
	}

	protected void renderHighlightBoundaryStroke(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getHighlightBoundaryStroke() != null) {
			renrederedAttributes.add(renderObject("highlightBoundaryStroke", diagramNodeStart.getHighlightBoundaryStroke()));
		}
	}

	protected void renderHighlighted(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getHighlighted() != null) {
			renrederedAttributes.add(renderBoolean("highlighted", diagramNodeStart.getHighlighted()));
		}
	}

	protected void renderDiagramnodestartId(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getDiagramnodestartId() != null) {
			renrederedAttributes.add(renderString("diagramnodestartId", diagramNodeStart.getDiagramnodestartId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", diagramNodeStart.getInitialized()));
		}
	}

	protected void renderDiagramnodestartLocale(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getDiagramnodestartLocale() != null) {
			renrederedAttributes.add(renderString("diagramnodestartLocale", diagramNodeStart.getDiagramnodestartLocale()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getName() != null) {
			renrederedAttributes.add(renderString("name", diagramNodeStart.getName()));
		}
	}

	protected void renderPreventOverlap(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getPreventOverlap() != null) {
			renrederedAttributes.add(renderBoolean("preventOverlap", diagramNodeStart.getPreventOverlap()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getRender() != null) {
			renrederedAttributes.add(renderString("render", diagramNodeStart.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", diagramNodeStart.getRendered()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", diagramNodeStart.getRequired()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", diagramNodeStart.getSelected()));
		}
	}

	protected void renderShapeBoundary(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getShapeBoundary() != null) {
			renrederedAttributes.add(renderObject("shapeBoundary", diagramNodeStart.getShapeBoundary()));
		}
	}

	protected void renderShapeInvite(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getShapeInvite() != null) {
			renrederedAttributes.add(renderObject("shapeInvite", diagramNodeStart.getShapeInvite()));
		}
	}

	protected void renderShim(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getShim() != null) {
			renrederedAttributes.add(renderBoolean("shim", diagramNodeStart.getShim()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", diagramNodeStart.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", diagramNodeStart.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", diagramNodeStart.getTabIndex()));
		}
	}

	protected void renderTransitions(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getTransitions() != null) {
			renrederedAttributes.add(renderString("transitions", diagramNodeStart.getTransitions()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getType() != null) {
			renrederedAttributes.add(renderString("type", diagramNodeStart.getType()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", diagramNodeStart.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getWidth() != null) {
			renrederedAttributes.add(renderNumber("width", diagramNodeStart.getWidth()));
		}
	}

	protected void renderX(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getX() != null) {
			renrederedAttributes.add(renderNumber("x", diagramNodeStart.getX()));
		}
	}

	protected void renderXy(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getXy() != null) {
			renrederedAttributes.add(renderArray("xy", diagramNodeStart.getXy()));
		}
	}

	protected void renderY(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getY() != null) {
			renrederedAttributes.add(renderNumber("y", diagramNodeStart.getY()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		if (diagramNodeStart.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", diagramNodeStart.getZIndex()));
		}
	}

}