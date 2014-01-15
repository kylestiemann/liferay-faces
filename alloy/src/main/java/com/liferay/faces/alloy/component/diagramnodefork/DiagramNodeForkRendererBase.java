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
public abstract class DiagramNodeForkRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		DiagramNodeFork diagramNodeFork = (DiagramNodeFork) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var diagramNodeFork = new A.DiagramNodeFork");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlign(renrederedAttributes, diagramNodeFork);
		renderAlignOn(renrederedAttributes, diagramNodeFork);
		renderDiagramnodeforkBodyContent(renrederedAttributes, diagramNodeFork);
		renderBoundingBox(renrederedAttributes, diagramNodeFork);
		renderBuilder(renrederedAttributes, diagramNodeFork);
		renderCentered(renrederedAttributes, diagramNodeFork);
		renderConnectors(renrederedAttributes, diagramNodeFork);
		renderConstrain(renrederedAttributes, diagramNodeFork);
		renderContentBox(renrederedAttributes, diagramNodeFork);
		renderControlsToolbar(renrederedAttributes, diagramNodeFork);
		renderDescription(renrederedAttributes, diagramNodeFork);
		renderDestroyed(renrederedAttributes, diagramNodeFork);
		renderDisabled(renrederedAttributes, diagramNodeFork);
		renderFillHeight(renrederedAttributes, diagramNodeFork);
		renderFocused(renrederedAttributes, diagramNodeFork);
		renderFooterContent(renrederedAttributes, diagramNodeFork);
		renderGraphic(renrederedAttributes, diagramNodeFork);
		renderHeaderContent(renrederedAttributes, diagramNodeFork);
		renderHeight(renrederedAttributes, diagramNodeFork);
		renderHighlightBoundaryStroke(renrederedAttributes, diagramNodeFork);
		renderHighlighted(renrederedAttributes, diagramNodeFork);
		renderDiagramnodeforkId(renrederedAttributes, diagramNodeFork);
		renderInitialized(renrederedAttributes, diagramNodeFork);
		renderDiagramnodeforkLocale(renrederedAttributes, diagramNodeFork);
		renderName(renrederedAttributes, diagramNodeFork);
		renderPreventOverlap(renrederedAttributes, diagramNodeFork);
		renderRender(renrederedAttributes, diagramNodeFork);
		renderRendered(renrederedAttributes, diagramNodeFork);
		renderRequired(renrederedAttributes, diagramNodeFork);
		renderSelected(renrederedAttributes, diagramNodeFork);
		renderShapeBoundary(renrederedAttributes, diagramNodeFork);
		renderShapeInvite(renrederedAttributes, diagramNodeFork);
		renderShim(renrederedAttributes, diagramNodeFork);
		renderSrcNode(renrederedAttributes, diagramNodeFork);
		renderStrings(renrederedAttributes, diagramNodeFork);
		renderTabIndex(renrederedAttributes, diagramNodeFork);
		renderTransitions(renrederedAttributes, diagramNodeFork);
		renderType(renrederedAttributes, diagramNodeFork);
		renderVisible(renrederedAttributes, diagramNodeFork);
		renderWidth(renrederedAttributes, diagramNodeFork);
		renderX(renrederedAttributes, diagramNodeFork);
		renderXy(renrederedAttributes, diagramNodeFork);
		renderY(renrederedAttributes, diagramNodeFork);
		renderZIndex(renrederedAttributes, diagramNodeFork);

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

	protected void renderAlign(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getAlign() != null) {
			renrederedAttributes.add(renderObject("align", diagramNodeFork.getAlign()));
		}
	}

	protected void renderAlignOn(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getAlignOn() != null) {
			renrederedAttributes.add(renderArray("alignOn", diagramNodeFork.getAlignOn()));
		}
	}

	protected void renderDiagramnodeforkBodyContent(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getDiagramnodeforkBodyContent() != null) {
			renrederedAttributes.add(renderString("diagramnodeforkBodyContent", diagramNodeFork.getDiagramnodeforkBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", diagramNodeFork.getBoundingBox()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getBuilder() != null) {
			renrederedAttributes.add(renderString("builder", diagramNodeFork.getBuilder()));
		}
	}

	protected void renderCentered(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getCentered() != null) {
			renrederedAttributes.add(renderString("centered", diagramNodeFork.getCentered()));
		}
	}

	protected void renderConnectors(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getConnectors() != null) {
			renrederedAttributes.add(renderString("connectors", diagramNodeFork.getConnectors()));
		}
	}

	protected void renderConstrain(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getConstrain() != null) {
			renrederedAttributes.add(renderString("constrain", diagramNodeFork.getConstrain()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", diagramNodeFork.getContentBox()));
		}
	}

	protected void renderControlsToolbar(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getControlsToolbar() != null) {
			renrederedAttributes.add(renderObject("controlsToolbar", diagramNodeFork.getControlsToolbar()));
		}
	}

	protected void renderDescription(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getDescription() != null) {
			renrederedAttributes.add(renderString("description", diagramNodeFork.getDescription()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", diagramNodeFork.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", diagramNodeFork.getDisabled()));
		}
	}

	protected void renderFillHeight(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getFillHeight() != null) {
			renrederedAttributes.add(renderString("fillHeight", diagramNodeFork.getFillHeight()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", diagramNodeFork.getFocused()));
		}
	}

	protected void renderFooterContent(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getFooterContent() != null) {
			renrederedAttributes.add(renderString("footerContent", diagramNodeFork.getFooterContent()));
		}
	}

	protected void renderGraphic(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getGraphic() != null) {
			renrederedAttributes.add(renderObject("graphic", diagramNodeFork.getGraphic()));
		}
	}

	protected void renderHeaderContent(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getHeaderContent() != null) {
			renrederedAttributes.add(renderString("headerContent", diagramNodeFork.getHeaderContent()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getHeight() != null) {
			renrederedAttributes.add(renderNumber("height", diagramNodeFork.getHeight()));
		}
	}

	protected void renderHighlightBoundaryStroke(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getHighlightBoundaryStroke() != null) {
			renrederedAttributes.add(renderObject("highlightBoundaryStroke", diagramNodeFork.getHighlightBoundaryStroke()));
		}
	}

	protected void renderHighlighted(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getHighlighted() != null) {
			renrederedAttributes.add(renderBoolean("highlighted", diagramNodeFork.getHighlighted()));
		}
	}

	protected void renderDiagramnodeforkId(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getDiagramnodeforkId() != null) {
			renrederedAttributes.add(renderString("diagramnodeforkId", diagramNodeFork.getDiagramnodeforkId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", diagramNodeFork.getInitialized()));
		}
	}

	protected void renderDiagramnodeforkLocale(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getDiagramnodeforkLocale() != null) {
			renrederedAttributes.add(renderString("diagramnodeforkLocale", diagramNodeFork.getDiagramnodeforkLocale()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getName() != null) {
			renrederedAttributes.add(renderString("name", diagramNodeFork.getName()));
		}
	}

	protected void renderPreventOverlap(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getPreventOverlap() != null) {
			renrederedAttributes.add(renderBoolean("preventOverlap", diagramNodeFork.getPreventOverlap()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getRender() != null) {
			renrederedAttributes.add(renderString("render", diagramNodeFork.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", diagramNodeFork.getRendered()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", diagramNodeFork.getRequired()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", diagramNodeFork.getSelected()));
		}
	}

	protected void renderShapeBoundary(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getShapeBoundary() != null) {
			renrederedAttributes.add(renderObject("shapeBoundary", diagramNodeFork.getShapeBoundary()));
		}
	}

	protected void renderShapeInvite(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getShapeInvite() != null) {
			renrederedAttributes.add(renderObject("shapeInvite", diagramNodeFork.getShapeInvite()));
		}
	}

	protected void renderShim(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getShim() != null) {
			renrederedAttributes.add(renderBoolean("shim", diagramNodeFork.getShim()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", diagramNodeFork.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", diagramNodeFork.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", diagramNodeFork.getTabIndex()));
		}
	}

	protected void renderTransitions(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getTransitions() != null) {
			renrederedAttributes.add(renderString("transitions", diagramNodeFork.getTransitions()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getType() != null) {
			renrederedAttributes.add(renderString("type", diagramNodeFork.getType()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", diagramNodeFork.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getWidth() != null) {
			renrederedAttributes.add(renderNumber("width", diagramNodeFork.getWidth()));
		}
	}

	protected void renderX(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getX() != null) {
			renrederedAttributes.add(renderNumber("x", diagramNodeFork.getX()));
		}
	}

	protected void renderXy(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getXy() != null) {
			renrederedAttributes.add(renderArray("xy", diagramNodeFork.getXy()));
		}
	}

	protected void renderY(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getY() != null) {
			renrederedAttributes.add(renderNumber("y", diagramNodeFork.getY()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		if (diagramNodeFork.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", diagramNodeFork.getZIndex()));
		}
	}

}