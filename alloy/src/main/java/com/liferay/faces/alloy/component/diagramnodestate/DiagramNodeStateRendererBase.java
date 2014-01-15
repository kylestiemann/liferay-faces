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
package com.liferay.faces.alloy.component.diagramnodestate;

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
public abstract class DiagramNodeStateRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		DiagramNodeState diagramNodeState = (DiagramNodeState) uiComponent;
		encodeHTML(facesContext, diagramNodeState);
		encodeJavaScript(facesContext, diagramNodeState);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DiagramNodeState diagramNodeState) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DiagramNodeState diagramNodeState) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, diagramNodeState);

		bufferedResponseWriter.write("var diagramNodeState = new A.DiagramNodeState");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlign(renrederedAttributes, diagramNodeState);
		renderAlignOn(renrederedAttributes, diagramNodeState);
		renderDiagramnodestateBodyContent(renrederedAttributes, diagramNodeState);
		renderBoundingBox(renrederedAttributes, diagramNodeState);
		renderBuilder(renrederedAttributes, diagramNodeState);
		renderCentered(renrederedAttributes, diagramNodeState);
		renderConnectors(renrederedAttributes, diagramNodeState);
		renderConstrain(renrederedAttributes, diagramNodeState);
		renderContentBox(renrederedAttributes, diagramNodeState);
		renderControlsToolbar(renrederedAttributes, diagramNodeState);
		renderDescription(renrederedAttributes, diagramNodeState);
		renderDestroyed(renrederedAttributes, diagramNodeState);
		renderDisabled(renrederedAttributes, diagramNodeState);
		renderFillHeight(renrederedAttributes, diagramNodeState);
		renderFocused(renrederedAttributes, diagramNodeState);
		renderFooterContent(renrederedAttributes, diagramNodeState);
		renderGraphic(renrederedAttributes, diagramNodeState);
		renderHeaderContent(renrederedAttributes, diagramNodeState);
		renderHeight(renrederedAttributes, diagramNodeState);
		renderHighlightBoundaryStroke(renrederedAttributes, diagramNodeState);
		renderHighlighted(renrederedAttributes, diagramNodeState);
		renderDiagramnodestateId(renrederedAttributes, diagramNodeState);
		renderInitialized(renrederedAttributes, diagramNodeState);
		renderDiagramnodestateLocale(renrederedAttributes, diagramNodeState);
		renderName(renrederedAttributes, diagramNodeState);
		renderPreventOverlap(renrederedAttributes, diagramNodeState);
		renderRender(renrederedAttributes, diagramNodeState);
		renderRendered(renrederedAttributes, diagramNodeState);
		renderRequired(renrederedAttributes, diagramNodeState);
		renderSelected(renrederedAttributes, diagramNodeState);
		renderShapeBoundary(renrederedAttributes, diagramNodeState);
		renderShapeInvite(renrederedAttributes, diagramNodeState);
		renderShim(renrederedAttributes, diagramNodeState);
		renderSrcNode(renrederedAttributes, diagramNodeState);
		renderStrings(renrederedAttributes, diagramNodeState);
		renderTabIndex(renrederedAttributes, diagramNodeState);
		renderTransitions(renrederedAttributes, diagramNodeState);
		renderType(renrederedAttributes, diagramNodeState);
		renderVisible(renrederedAttributes, diagramNodeState);
		renderWidth(renrederedAttributes, diagramNodeState);
		renderX(renrederedAttributes, diagramNodeState);
		renderXy(renrederedAttributes, diagramNodeState);
		renderY(renrederedAttributes, diagramNodeState);
		renderZIndex(renrederedAttributes, diagramNodeState);

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

		endJavaScript(facesContext);

		handleBuffer(facesContext, diagramNodeState);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlign(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getAlign() != null) {
			renrederedAttributes.add(renderObject("align", diagramNodeState.getAlign()));
		}
	}

	protected void renderAlignOn(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getAlignOn() != null) {
			renrederedAttributes.add(renderArray("alignOn", diagramNodeState.getAlignOn()));
		}
	}

	protected void renderDiagramnodestateBodyContent(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getDiagramnodestateBodyContent() != null) {
			renrederedAttributes.add(renderString("diagramnodestateBodyContent", diagramNodeState.getDiagramnodestateBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", diagramNodeState.getBoundingBox()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getBuilder() != null) {
			renrederedAttributes.add(renderString("builder", diagramNodeState.getBuilder()));
		}
	}

	protected void renderCentered(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getCentered() != null) {
			renrederedAttributes.add(renderString("centered", diagramNodeState.getCentered()));
		}
	}

	protected void renderConnectors(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getConnectors() != null) {
			renrederedAttributes.add(renderString("connectors", diagramNodeState.getConnectors()));
		}
	}

	protected void renderConstrain(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getConstrain() != null) {
			renrederedAttributes.add(renderString("constrain", diagramNodeState.getConstrain()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", diagramNodeState.getContentBox()));
		}
	}

	protected void renderControlsToolbar(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getControlsToolbar() != null) {
			renrederedAttributes.add(renderObject("controlsToolbar", diagramNodeState.getControlsToolbar()));
		}
	}

	protected void renderDescription(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getDescription() != null) {
			renrederedAttributes.add(renderString("description", diagramNodeState.getDescription()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", diagramNodeState.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", diagramNodeState.getDisabled()));
		}
	}

	protected void renderFillHeight(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getFillHeight() != null) {
			renrederedAttributes.add(renderString("fillHeight", diagramNodeState.getFillHeight()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", diagramNodeState.getFocused()));
		}
	}

	protected void renderFooterContent(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getFooterContent() != null) {
			renrederedAttributes.add(renderString("footerContent", diagramNodeState.getFooterContent()));
		}
	}

	protected void renderGraphic(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getGraphic() != null) {
			renrederedAttributes.add(renderObject("graphic", diagramNodeState.getGraphic()));
		}
	}

	protected void renderHeaderContent(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getHeaderContent() != null) {
			renrederedAttributes.add(renderString("headerContent", diagramNodeState.getHeaderContent()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getHeight() != null) {
			renrederedAttributes.add(renderNumber("height", diagramNodeState.getHeight()));
		}
	}

	protected void renderHighlightBoundaryStroke(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getHighlightBoundaryStroke() != null) {
			renrederedAttributes.add(renderObject("highlightBoundaryStroke", diagramNodeState.getHighlightBoundaryStroke()));
		}
	}

	protected void renderHighlighted(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getHighlighted() != null) {
			renrederedAttributes.add(renderBoolean("highlighted", diagramNodeState.getHighlighted()));
		}
	}

	protected void renderDiagramnodestateId(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getDiagramnodestateId() != null) {
			renrederedAttributes.add(renderString("diagramnodestateId", diagramNodeState.getDiagramnodestateId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", diagramNodeState.getInitialized()));
		}
	}

	protected void renderDiagramnodestateLocale(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getDiagramnodestateLocale() != null) {
			renrederedAttributes.add(renderString("diagramnodestateLocale", diagramNodeState.getDiagramnodestateLocale()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getName() != null) {
			renrederedAttributes.add(renderString("name", diagramNodeState.getName()));
		}
	}

	protected void renderPreventOverlap(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getPreventOverlap() != null) {
			renrederedAttributes.add(renderBoolean("preventOverlap", diagramNodeState.getPreventOverlap()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getRender() != null) {
			renrederedAttributes.add(renderString("render", diagramNodeState.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", diagramNodeState.getRendered()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", diagramNodeState.getRequired()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", diagramNodeState.getSelected()));
		}
	}

	protected void renderShapeBoundary(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getShapeBoundary() != null) {
			renrederedAttributes.add(renderObject("shapeBoundary", diagramNodeState.getShapeBoundary()));
		}
	}

	protected void renderShapeInvite(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getShapeInvite() != null) {
			renrederedAttributes.add(renderObject("shapeInvite", diagramNodeState.getShapeInvite()));
		}
	}

	protected void renderShim(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getShim() != null) {
			renrederedAttributes.add(renderBoolean("shim", diagramNodeState.getShim()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", diagramNodeState.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", diagramNodeState.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", diagramNodeState.getTabIndex()));
		}
	}

	protected void renderTransitions(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getTransitions() != null) {
			renrederedAttributes.add(renderString("transitions", diagramNodeState.getTransitions()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getType() != null) {
			renrederedAttributes.add(renderString("type", diagramNodeState.getType()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", diagramNodeState.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getWidth() != null) {
			renrederedAttributes.add(renderNumber("width", diagramNodeState.getWidth()));
		}
	}

	protected void renderX(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getX() != null) {
			renrederedAttributes.add(renderNumber("x", diagramNodeState.getX()));
		}
	}

	protected void renderXy(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getXy() != null) {
			renrederedAttributes.add(renderArray("xy", diagramNodeState.getXy()));
		}
	}

	protected void renderY(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getY() != null) {
			renrederedAttributes.add(renderNumber("y", diagramNodeState.getY()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		if (diagramNodeState.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", diagramNodeState.getZIndex()));
		}
	}

}