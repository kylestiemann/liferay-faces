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
package com.liferay.faces.alloy.component.diagramnodejoin;

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
public abstract class DiagramNodeJoinRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		DiagramNodeJoin diagramNodeJoin = (DiagramNodeJoin) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var diagramNodeJoin = new A.DiagramNodeJoin");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlign(renrederedAttributes, diagramNodeJoin);
		renderAlignOn(renrederedAttributes, diagramNodeJoin);
		renderDiagramnodejoinBodyContent(renrederedAttributes, diagramNodeJoin);
		renderBoundingBox(renrederedAttributes, diagramNodeJoin);
		renderBuilder(renrederedAttributes, diagramNodeJoin);
		renderCentered(renrederedAttributes, diagramNodeJoin);
		renderConnectors(renrederedAttributes, diagramNodeJoin);
		renderConstrain(renrederedAttributes, diagramNodeJoin);
		renderContentBox(renrederedAttributes, diagramNodeJoin);
		renderControlsToolbar(renrederedAttributes, diagramNodeJoin);
		renderDescription(renrederedAttributes, diagramNodeJoin);
		renderDestroyed(renrederedAttributes, diagramNodeJoin);
		renderDisabled(renrederedAttributes, diagramNodeJoin);
		renderFillHeight(renrederedAttributes, diagramNodeJoin);
		renderFocused(renrederedAttributes, diagramNodeJoin);
		renderFooterContent(renrederedAttributes, diagramNodeJoin);
		renderGraphic(renrederedAttributes, diagramNodeJoin);
		renderHeaderContent(renrederedAttributes, diagramNodeJoin);
		renderHeight(renrederedAttributes, diagramNodeJoin);
		renderHighlightBoundaryStroke(renrederedAttributes, diagramNodeJoin);
		renderHighlighted(renrederedAttributes, diagramNodeJoin);
		renderDiagramnodejoinId(renrederedAttributes, diagramNodeJoin);
		renderInitialized(renrederedAttributes, diagramNodeJoin);
		renderDiagramnodejoinLocale(renrederedAttributes, diagramNodeJoin);
		renderName(renrederedAttributes, diagramNodeJoin);
		renderPreventOverlap(renrederedAttributes, diagramNodeJoin);
		renderRender(renrederedAttributes, diagramNodeJoin);
		renderRendered(renrederedAttributes, diagramNodeJoin);
		renderRequired(renrederedAttributes, diagramNodeJoin);
		renderSelected(renrederedAttributes, diagramNodeJoin);
		renderShapeBoundary(renrederedAttributes, diagramNodeJoin);
		renderShapeInvite(renrederedAttributes, diagramNodeJoin);
		renderShim(renrederedAttributes, diagramNodeJoin);
		renderSrcNode(renrederedAttributes, diagramNodeJoin);
		renderStrings(renrederedAttributes, diagramNodeJoin);
		renderTabIndex(renrederedAttributes, diagramNodeJoin);
		renderTransitions(renrederedAttributes, diagramNodeJoin);
		renderType(renrederedAttributes, diagramNodeJoin);
		renderVisible(renrederedAttributes, diagramNodeJoin);
		renderWidth(renrederedAttributes, diagramNodeJoin);
		renderX(renrederedAttributes, diagramNodeJoin);
		renderXy(renrederedAttributes, diagramNodeJoin);
		renderY(renrederedAttributes, diagramNodeJoin);
		renderZIndex(renrederedAttributes, diagramNodeJoin);

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

	protected void renderAlign(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getAlign() != null) {
			renrederedAttributes.add(renderObject("align", diagramNodeJoin.getAlign()));
		}
	}

	protected void renderAlignOn(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getAlignOn() != null) {
			renrederedAttributes.add(renderArray("alignOn", diagramNodeJoin.getAlignOn()));
		}
	}

	protected void renderDiagramnodejoinBodyContent(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getDiagramnodejoinBodyContent() != null) {
			renrederedAttributes.add(renderString("diagramnodejoinBodyContent", diagramNodeJoin.getDiagramnodejoinBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", diagramNodeJoin.getBoundingBox()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getBuilder() != null) {
			renrederedAttributes.add(renderString("builder", diagramNodeJoin.getBuilder()));
		}
	}

	protected void renderCentered(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getCentered() != null) {
			renrederedAttributes.add(renderString("centered", diagramNodeJoin.getCentered()));
		}
	}

	protected void renderConnectors(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getConnectors() != null) {
			renrederedAttributes.add(renderString("connectors", diagramNodeJoin.getConnectors()));
		}
	}

	protected void renderConstrain(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getConstrain() != null) {
			renrederedAttributes.add(renderString("constrain", diagramNodeJoin.getConstrain()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", diagramNodeJoin.getContentBox()));
		}
	}

	protected void renderControlsToolbar(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getControlsToolbar() != null) {
			renrederedAttributes.add(renderObject("controlsToolbar", diagramNodeJoin.getControlsToolbar()));
		}
	}

	protected void renderDescription(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getDescription() != null) {
			renrederedAttributes.add(renderString("description", diagramNodeJoin.getDescription()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", diagramNodeJoin.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", diagramNodeJoin.getDisabled()));
		}
	}

	protected void renderFillHeight(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getFillHeight() != null) {
			renrederedAttributes.add(renderString("fillHeight", diagramNodeJoin.getFillHeight()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", diagramNodeJoin.getFocused()));
		}
	}

	protected void renderFooterContent(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getFooterContent() != null) {
			renrederedAttributes.add(renderString("footerContent", diagramNodeJoin.getFooterContent()));
		}
	}

	protected void renderGraphic(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getGraphic() != null) {
			renrederedAttributes.add(renderObject("graphic", diagramNodeJoin.getGraphic()));
		}
	}

	protected void renderHeaderContent(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getHeaderContent() != null) {
			renrederedAttributes.add(renderString("headerContent", diagramNodeJoin.getHeaderContent()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getHeight() != null) {
			renrederedAttributes.add(renderNumber("height", diagramNodeJoin.getHeight()));
		}
	}

	protected void renderHighlightBoundaryStroke(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getHighlightBoundaryStroke() != null) {
			renrederedAttributes.add(renderObject("highlightBoundaryStroke", diagramNodeJoin.getHighlightBoundaryStroke()));
		}
	}

	protected void renderHighlighted(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getHighlighted() != null) {
			renrederedAttributes.add(renderBoolean("highlighted", diagramNodeJoin.getHighlighted()));
		}
	}

	protected void renderDiagramnodejoinId(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getDiagramnodejoinId() != null) {
			renrederedAttributes.add(renderString("diagramnodejoinId", diagramNodeJoin.getDiagramnodejoinId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", diagramNodeJoin.getInitialized()));
		}
	}

	protected void renderDiagramnodejoinLocale(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getDiagramnodejoinLocale() != null) {
			renrederedAttributes.add(renderString("diagramnodejoinLocale", diagramNodeJoin.getDiagramnodejoinLocale()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getName() != null) {
			renrederedAttributes.add(renderString("name", diagramNodeJoin.getName()));
		}
	}

	protected void renderPreventOverlap(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getPreventOverlap() != null) {
			renrederedAttributes.add(renderBoolean("preventOverlap", diagramNodeJoin.getPreventOverlap()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getRender() != null) {
			renrederedAttributes.add(renderString("render", diagramNodeJoin.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", diagramNodeJoin.getRendered()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", diagramNodeJoin.getRequired()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", diagramNodeJoin.getSelected()));
		}
	}

	protected void renderShapeBoundary(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getShapeBoundary() != null) {
			renrederedAttributes.add(renderObject("shapeBoundary", diagramNodeJoin.getShapeBoundary()));
		}
	}

	protected void renderShapeInvite(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getShapeInvite() != null) {
			renrederedAttributes.add(renderObject("shapeInvite", diagramNodeJoin.getShapeInvite()));
		}
	}

	protected void renderShim(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getShim() != null) {
			renrederedAttributes.add(renderBoolean("shim", diagramNodeJoin.getShim()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", diagramNodeJoin.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", diagramNodeJoin.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", diagramNodeJoin.getTabIndex()));
		}
	}

	protected void renderTransitions(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getTransitions() != null) {
			renrederedAttributes.add(renderString("transitions", diagramNodeJoin.getTransitions()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getType() != null) {
			renrederedAttributes.add(renderString("type", diagramNodeJoin.getType()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", diagramNodeJoin.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getWidth() != null) {
			renrederedAttributes.add(renderNumber("width", diagramNodeJoin.getWidth()));
		}
	}

	protected void renderX(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getX() != null) {
			renrederedAttributes.add(renderNumber("x", diagramNodeJoin.getX()));
		}
	}

	protected void renderXy(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getXy() != null) {
			renrederedAttributes.add(renderArray("xy", diagramNodeJoin.getXy()));
		}
	}

	protected void renderY(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getY() != null) {
			renrederedAttributes.add(renderNumber("y", diagramNodeJoin.getY()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		if (diagramNodeJoin.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", diagramNodeJoin.getZIndex()));
		}
	}

}