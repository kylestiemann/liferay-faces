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
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
@ResourceDependency(library = "aui", name = "aui.js")
public abstract class DiagramNodeRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DiagramNode diagramNode = (DiagramNode) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var diagramNode = new A.DiagramNode");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (diagramNode.getAlign() != null) {
			renderAlign(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getAlignOn() != null) {
			renderAlignOn(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getDiagramNodeBodyContent() != null) {
			renderDiagramNodeBodyContent(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getBuilder() != null) {
			renderBuilder(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getCentered() != null) {
			renderCentered(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getConnectors() != null) {
			renderConnectors(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getConstrain() != null) {
			renderConstrain(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getContentBox() != null) {
			renderContentBox(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getControlsToolbar() != null) {
			renderControlsToolbar(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getDescription() != null) {
			renderDescription(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getDisabled() != null) {
			renderDisabled(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getFillHeight() != null) {
			renderFillHeight(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getFocused() != null) {
			renderFocused(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getFooterContent() != null) {
			renderFooterContent(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getGraphic() != null) {
			renderGraphic(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getHeaderContent() != null) {
			renderHeaderContent(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getHeight() != null) {
			renderHeight(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getHighlightBoundaryStroke() != null) {
			renderHighlightBoundaryStroke(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getHighlighted() != null) {
			renderHighlighted(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getDiagramNodeId() != null) {
			renderDiagramNodeId(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getInitialized() != null) {
			renderInitialized(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getDiagramNodeLocale() != null) {
			renderDiagramNodeLocale(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getName() != null) {
			renderName(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getPreventOverlap() != null) {
			renderPreventOverlap(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getRender() != null) {
			renderRender(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getRendered() != null) {
			renderRendered(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getRequired() != null) {
			renderRequired(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getSelected() != null) {
			renderSelected(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getShapeBoundary() != null) {
			renderShapeBoundary(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getShapeInvite() != null) {
			renderShapeInvite(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getShim() != null) {
			renderShim(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getStrings() != null) {
			renderStrings(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getTransitions() != null) {
			renderTransitions(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getType() != null) {
			renderType(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getVisible() != null) {
			renderVisible(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getWidth() != null) {
			renderWidth(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getX() != null) {
			renderX(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getXy() != null) {
			renderXy(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getY() != null) {
			renderY(renderedAttributes, diagramNode);
		}
		
		if (diagramNode.getZIndex() != null) {
			renderZIndex(renderedAttributes, diagramNode);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (diagramNode.getAfterAlignChange() != null) {
			renderAfterAlignChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterAlignOnChange() != null) {
			renderAfterAlignOnChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterCenteredChange() != null) {
			renderAfterCenteredChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterConnectorsChange() != null) {
			renderAfterConnectorsChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterConstrainChange() != null) {
			renderAfterConstrainChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterControlsToolbarChange() != null) {
			renderAfterControlsToolbarChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterDescriptionChange() != null) {
			renderAfterDescriptionChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterFillHeightChange() != null) {
			renderAfterFillHeightChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterFooterContentChange() != null) {
			renderAfterFooterContentChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterGraphicChange() != null) {
			renderAfterGraphicChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterHeaderContentChange() != null) {
			renderAfterHeaderContentChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterHighlightBoundaryStrokeChange() != null) {
			renderAfterHighlightBoundaryStrokeChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterHighlightedChange() != null) {
			renderAfterHighlightedChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterPreventOverlapChange() != null) {
			renderAfterPreventOverlapChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterShapeBoundaryChange() != null) {
			renderAfterShapeBoundaryChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterShapeInviteChange() != null) {
			renderAfterShapeInviteChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterShimChange() != null) {
			renderAfterShimChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterTransitionsChange() != null) {
			renderAfterTransitionsChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterXChange() != null) {
			renderAfterXChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterXyChange() != null) {
			renderAfterXyChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterYChange() != null) {
			renderAfterYChange(renderedAfterEvents, diagramNode);
		}
		
		if (diagramNode.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, diagramNode);
		}
		

		Iterator<String> afterEventsIterator = renderedAfterEvents.iterator();

		while (afterEventsIterator.hasNext()) {
			responseWriter.write(afterEventsIterator.next());

			if (afterEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.COMMA);

		responseWriter.write("on");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedOnEvents = new ArrayList<String>();

		if (diagramNode.getOnAlignChange() != null) {
			renderOnAlignChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnAlignOnChange() != null) {
			renderOnAlignOnChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnCenteredChange() != null) {
			renderOnCenteredChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnConnectorsChange() != null) {
			renderOnConnectorsChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnConstrainChange() != null) {
			renderOnConstrainChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnControlsToolbarChange() != null) {
			renderOnControlsToolbarChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnDescriptionChange() != null) {
			renderOnDescriptionChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnFillHeightChange() != null) {
			renderOnFillHeightChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnFooterContentChange() != null) {
			renderOnFooterContentChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnGraphicChange() != null) {
			renderOnGraphicChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnHeaderContentChange() != null) {
			renderOnHeaderContentChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnHighlightBoundaryStrokeChange() != null) {
			renderOnHighlightBoundaryStrokeChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnHighlightedChange() != null) {
			renderOnHighlightedChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnPreventOverlapChange() != null) {
			renderOnPreventOverlapChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnShapeBoundaryChange() != null) {
			renderOnShapeBoundaryChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnShapeInviteChange() != null) {
			renderOnShapeInviteChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnShimChange() != null) {
			renderOnShimChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnTransitionsChange() != null) {
			renderOnTransitionsChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnXChange() != null) {
			renderOnXChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnXyChange() != null) {
			renderOnXyChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnYChange() != null) {
			renderOnYChange(renderedOnEvents, diagramNode);
		}
		
		if (diagramNode.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, diagramNode);
		}
		

		Iterator<String> onEventsIterator = renderedOnEvents.iterator();

		while (onEventsIterator.hasNext()) {
			responseWriter.write(onEventsIterator.next());

			if (onEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(".render()");
		responseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlign(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object align = diagramNode.getAlign();
		renderedAttributes.add(renderObject(DiagramNode.ALIGN, align));
	}

	protected void renderAlignOn(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object alignOn = diagramNode.getAlignOn();
		renderedAttributes.add(renderArray(DiagramNode.ALIGN_ON, alignOn));
	}

	protected void renderDiagramNodeBodyContent(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object diagramNodeBodyContent = diagramNode.getDiagramNodeBodyContent();
		renderedAttributes.add(renderString(DiagramNode.DIAGRAM_NODE_BODY_CONTENT, diagramNodeBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String boundingBox = diagramNode.getBoundingBox();
		renderedAttributes.add(renderString(DiagramNode.BOUNDING_BOX, boundingBox));
	}

	protected void renderBuilder(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object builder = diagramNode.getBuilder();
		renderedAttributes.add(renderString(DiagramNode.BUILDER, builder));
	}

	protected void renderCentered(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object centered = diagramNode.getCentered();
		renderedAttributes.add(renderString(DiagramNode.CENTERED, centered));
	}

	protected void renderConnectors(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String connectors = diagramNode.getConnectors();
		renderedAttributes.add(renderString(DiagramNode.CONNECTORS, connectors));
	}

	protected void renderConstrain(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object constrain = diagramNode.getConstrain();
		renderedAttributes.add(renderString(DiagramNode.CONSTRAIN, constrain));
	}

	protected void renderContentBox(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String contentBox = diagramNode.getContentBox();
		renderedAttributes.add(renderString(DiagramNode.CONTENT_BOX, contentBox));
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object controlsToolbar = diagramNode.getControlsToolbar();
		renderedAttributes.add(renderObject(DiagramNode.CONTROLS_TOOLBAR, controlsToolbar));
	}

	protected void renderDescription(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String description = diagramNode.getDescription();
		renderedAttributes.add(renderString(DiagramNode.DESCRIPTION, description));
	}

	protected void renderDestroyed(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean destroyed = diagramNode.getDestroyed();
		renderedAttributes.add(renderBoolean(DiagramNode.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean disabled = diagramNode.getDisabled();
		renderedAttributes.add(renderBoolean(DiagramNode.DISABLED, disabled));
	}

	protected void renderFillHeight(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object fillHeight = diagramNode.getFillHeight();
		renderedAttributes.add(renderString(DiagramNode.FILL_HEIGHT, fillHeight));
	}

	protected void renderFocused(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean focused = diagramNode.getFocused();
		renderedAttributes.add(renderBoolean(DiagramNode.FOCUSED, focused));
	}

	protected void renderFooterContent(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object footerContent = diagramNode.getFooterContent();
		renderedAttributes.add(renderString(DiagramNode.FOOTER_CONTENT, footerContent));
	}

	protected void renderGraphic(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object graphic = diagramNode.getGraphic();
		renderedAttributes.add(renderObject(DiagramNode.GRAPHIC, graphic));
	}

	protected void renderHeaderContent(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object headerContent = diagramNode.getHeaderContent();
		renderedAttributes.add(renderString(DiagramNode.HEADER_CONTENT, headerContent));
	}

	protected void renderHeight(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object height = diagramNode.getHeight();
		renderedAttributes.add(renderNumber(DiagramNode.HEIGHT, height));
	}

	protected void renderHighlightBoundaryStroke(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object highlightBoundaryStroke = diagramNode.getHighlightBoundaryStroke();
		renderedAttributes.add(renderObject(DiagramNode.HIGHLIGHT_BOUNDARY_STROKE, highlightBoundaryStroke));
	}

	protected void renderHighlighted(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean highlighted = diagramNode.getHighlighted();
		renderedAttributes.add(renderBoolean(DiagramNode.HIGHLIGHTED, highlighted));
	}

	protected void renderDiagramNodeId(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String diagramNodeId = diagramNode.getDiagramNodeId();
		renderedAttributes.add(renderString(DiagramNode.DIAGRAM_NODE_ID, diagramNodeId));
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean initialized = diagramNode.getInitialized();
		renderedAttributes.add(renderBoolean(DiagramNode.INITIALIZED, initialized));
	}

	protected void renderDiagramNodeLocale(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String diagramNodeLocale = diagramNode.getDiagramNodeLocale();
		renderedAttributes.add(renderString(DiagramNode.DIAGRAM_NODE_LOCALE, diagramNodeLocale));
	}

	protected void renderName(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String name = diagramNode.getName();
		renderedAttributes.add(renderString(DiagramNode.NAME, name));
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean preventOverlap = diagramNode.getPreventOverlap();
		renderedAttributes.add(renderBoolean(DiagramNode.PREVENT_OVERLAP, preventOverlap));
	}

	protected void renderRender(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object render = diagramNode.getRender();
		renderedAttributes.add(renderString(DiagramNode.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean rendered = diagramNode.getRendered();
		renderedAttributes.add(renderBoolean(DiagramNode.RENDERED, rendered));
	}

	protected void renderRequired(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean required = diagramNode.getRequired();
		renderedAttributes.add(renderBoolean(DiagramNode.REQUIRED, required));
	}

	protected void renderSelected(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean selected = diagramNode.getSelected();
		renderedAttributes.add(renderBoolean(DiagramNode.SELECTED, selected));
	}

	protected void renderShapeBoundary(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object shapeBoundary = diagramNode.getShapeBoundary();
		renderedAttributes.add(renderObject(DiagramNode.SHAPE_BOUNDARY, shapeBoundary));
	}

	protected void renderShapeInvite(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object shapeInvite = diagramNode.getShapeInvite();
		renderedAttributes.add(renderObject(DiagramNode.SHAPE_INVITE, shapeInvite));
	}

	protected void renderShim(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean shim = diagramNode.getShim();
		renderedAttributes.add(renderBoolean(DiagramNode.SHIM, shim));
	}

	protected void renderSrcNode(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String srcNode = diagramNode.getSrcNode();
		renderedAttributes.add(renderString(DiagramNode.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object strings = diagramNode.getStrings();
		renderedAttributes.add(renderObject(DiagramNode.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object tabIndex = diagramNode.getTabIndex();
		renderedAttributes.add(renderNumber(DiagramNode.TAB_INDEX, tabIndex));
	}

	protected void renderTransitions(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String transitions = diagramNode.getTransitions();
		renderedAttributes.add(renderString(DiagramNode.TRANSITIONS, transitions));
	}

	protected void renderType(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String type = diagramNode.getType();
		renderedAttributes.add(renderString(DiagramNode.TYPE, type));
	}

	protected void renderVisible(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Boolean visible = diagramNode.getVisible();
		renderedAttributes.add(renderBoolean(DiagramNode.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object width = diagramNode.getWidth();
		renderedAttributes.add(renderNumber(DiagramNode.WIDTH, width));
	}

	protected void renderX(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object x = diagramNode.getX();
		renderedAttributes.add(renderNumber(DiagramNode.X, x));
	}

	protected void renderXy(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object xy = diagramNode.getXy();
		renderedAttributes.add(renderArray(DiagramNode.XY, xy));
	}

	protected void renderY(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object y = diagramNode.getY();
		renderedAttributes.add(renderNumber(DiagramNode.Y, y));
	}

	protected void renderZIndex(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.Object zIndex = diagramNode.getZIndex();
		renderedAttributes.add(renderNumber(DiagramNode.Z_INDEX, zIndex));
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterAlignChange = diagramNode.getAfterAlignChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_ALIGN_CHANGE, afterAlignChange));
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterAlignOnChange = diagramNode.getAfterAlignOnChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterBodyContentChange = diagramNode.getAfterBodyContentChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterBoundingBoxChange = diagramNode.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterBuilderChange = diagramNode.getAfterBuilderChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterCenteredChange = diagramNode.getAfterCenteredChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_CENTERED_CHANGE, afterCenteredChange));
	}

	protected void renderAfterConnectorsChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterConnectorsChange = diagramNode.getAfterConnectorsChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_CONNECTORS_CHANGE, afterConnectorsChange));
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterConstrainChange = diagramNode.getAfterConstrainChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterContentBoxChange = diagramNode.getAfterContentBoxChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterControlsToolbarChange = diagramNode.getAfterControlsToolbarChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
	}

	protected void renderAfterDescriptionChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterDescriptionChange = diagramNode.getAfterDescriptionChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_DESCRIPTION_CHANGE, afterDescriptionChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterDestroyedChange = diagramNode.getAfterDestroyedChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterDisabledChange = diagramNode.getAfterDisabledChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterFillHeightChange = diagramNode.getAfterFillHeightChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterFocusedChange = diagramNode.getAfterFocusedChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterFooterContentChange = diagramNode.getAfterFooterContentChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterGraphicChange = diagramNode.getAfterGraphicChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterHeaderContentChange = diagramNode.getAfterHeaderContentChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterHeightChange = diagramNode.getAfterHeightChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterHighlightBoundaryStrokeChange = diagramNode.getAfterHighlightBoundaryStrokeChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, afterHighlightBoundaryStrokeChange));
	}

	protected void renderAfterHighlightedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterHighlightedChange = diagramNode.getAfterHighlightedChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_HIGHLIGHTED_CHANGE, afterHighlightedChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterIdChange = diagramNode.getAfterIdChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterInitializedChange = diagramNode.getAfterInitializedChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterLocaleChange = diagramNode.getAfterLocaleChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterNameChange = diagramNode.getAfterNameChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterPreventOverlapChange = diagramNode.getAfterPreventOverlapChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterRenderChange = diagramNode.getAfterRenderChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterRenderedChange = diagramNode.getAfterRenderedChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterRequiredChange = diagramNode.getAfterRequiredChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterSelectedChange = diagramNode.getAfterSelectedChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShapeBoundaryChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterShapeBoundaryChange = diagramNode.getAfterShapeBoundaryChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_SHAPE_BOUNDARY_CHANGE, afterShapeBoundaryChange));
	}

	protected void renderAfterShapeInviteChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterShapeInviteChange = diagramNode.getAfterShapeInviteChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_SHAPE_INVITE_CHANGE, afterShapeInviteChange));
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterShimChange = diagramNode.getAfterShimChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_SHIM_CHANGE, afterShimChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterSrcNodeChange = diagramNode.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterStringsChange = diagramNode.getAfterStringsChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterTabIndexChange = diagramNode.getAfterTabIndexChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTransitionsChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterTransitionsChange = diagramNode.getAfterTransitionsChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_TRANSITIONS_CHANGE, afterTransitionsChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterTypeChange = diagramNode.getAfterTypeChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterVisibleChange = diagramNode.getAfterVisibleChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterWidthChange = diagramNode.getAfterWidthChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterXChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterXChange = diagramNode.getAfterXChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_XCHANGE, afterXChange));
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterXyChange = diagramNode.getAfterXyChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_XY_CHANGE, afterXyChange));
	}

	protected void renderAfterYChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterYChange = diagramNode.getAfterYChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_YCHANGE, afterYChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String afterZIndexChange = diagramNode.getAfterZIndexChange();
		renderedAttributes.add(renderString(DiagramNode.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onAlignChange = diagramNode.getOnAlignChange();
		renderedAttributes.add(renderString(DiagramNode.ON_ALIGN_CHANGE, onAlignChange));
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onAlignOnChange = diagramNode.getOnAlignOnChange();
		renderedAttributes.add(renderString(DiagramNode.ON_ALIGN_ON_CHANGE, onAlignOnChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onBodyContentChange = diagramNode.getOnBodyContentChange();
		renderedAttributes.add(renderString(DiagramNode.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onBoundingBoxChange = diagramNode.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(DiagramNode.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onBuilderChange = diagramNode.getOnBuilderChange();
		renderedAttributes.add(renderString(DiagramNode.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onCenteredChange = diagramNode.getOnCenteredChange();
		renderedAttributes.add(renderString(DiagramNode.ON_CENTERED_CHANGE, onCenteredChange));
	}

	protected void renderOnConnectorsChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onConnectorsChange = diagramNode.getOnConnectorsChange();
		renderedAttributes.add(renderString(DiagramNode.ON_CONNECTORS_CHANGE, onConnectorsChange));
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onConstrainChange = diagramNode.getOnConstrainChange();
		renderedAttributes.add(renderString(DiagramNode.ON_CONSTRAIN_CHANGE, onConstrainChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onContentBoxChange = diagramNode.getOnContentBoxChange();
		renderedAttributes.add(renderString(DiagramNode.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onControlsToolbarChange = diagramNode.getOnControlsToolbarChange();
		renderedAttributes.add(renderString(DiagramNode.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
	}

	protected void renderOnDescriptionChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onDescriptionChange = diagramNode.getOnDescriptionChange();
		renderedAttributes.add(renderString(DiagramNode.ON_DESCRIPTION_CHANGE, onDescriptionChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onDestroyedChange = diagramNode.getOnDestroyedChange();
		renderedAttributes.add(renderString(DiagramNode.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onDisabledChange = diagramNode.getOnDisabledChange();
		renderedAttributes.add(renderString(DiagramNode.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onFillHeightChange = diagramNode.getOnFillHeightChange();
		renderedAttributes.add(renderString(DiagramNode.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onFocusedChange = diagramNode.getOnFocusedChange();
		renderedAttributes.add(renderString(DiagramNode.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onFooterContentChange = diagramNode.getOnFooterContentChange();
		renderedAttributes.add(renderString(DiagramNode.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onGraphicChange = diagramNode.getOnGraphicChange();
		renderedAttributes.add(renderString(DiagramNode.ON_GRAPHIC_CHANGE, onGraphicChange));
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onHeaderContentChange = diagramNode.getOnHeaderContentChange();
		renderedAttributes.add(renderString(DiagramNode.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onHeightChange = diagramNode.getOnHeightChange();
		renderedAttributes.add(renderString(DiagramNode.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onHighlightBoundaryStrokeChange = diagramNode.getOnHighlightBoundaryStrokeChange();
		renderedAttributes.add(renderString(DiagramNode.ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, onHighlightBoundaryStrokeChange));
	}

	protected void renderOnHighlightedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onHighlightedChange = diagramNode.getOnHighlightedChange();
		renderedAttributes.add(renderString(DiagramNode.ON_HIGHLIGHTED_CHANGE, onHighlightedChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onIdChange = diagramNode.getOnIdChange();
		renderedAttributes.add(renderString(DiagramNode.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onInitializedChange = diagramNode.getOnInitializedChange();
		renderedAttributes.add(renderString(DiagramNode.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onLocaleChange = diagramNode.getOnLocaleChange();
		renderedAttributes.add(renderString(DiagramNode.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onNameChange = diagramNode.getOnNameChange();
		renderedAttributes.add(renderString(DiagramNode.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onPreventOverlapChange = diagramNode.getOnPreventOverlapChange();
		renderedAttributes.add(renderString(DiagramNode.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onRenderChange = diagramNode.getOnRenderChange();
		renderedAttributes.add(renderString(DiagramNode.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onRenderedChange = diagramNode.getOnRenderedChange();
		renderedAttributes.add(renderString(DiagramNode.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onRequiredChange = diagramNode.getOnRequiredChange();
		renderedAttributes.add(renderString(DiagramNode.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onSelectedChange = diagramNode.getOnSelectedChange();
		renderedAttributes.add(renderString(DiagramNode.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShapeBoundaryChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onShapeBoundaryChange = diagramNode.getOnShapeBoundaryChange();
		renderedAttributes.add(renderString(DiagramNode.ON_SHAPE_BOUNDARY_CHANGE, onShapeBoundaryChange));
	}

	protected void renderOnShapeInviteChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onShapeInviteChange = diagramNode.getOnShapeInviteChange();
		renderedAttributes.add(renderString(DiagramNode.ON_SHAPE_INVITE_CHANGE, onShapeInviteChange));
	}

	protected void renderOnShimChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onShimChange = diagramNode.getOnShimChange();
		renderedAttributes.add(renderString(DiagramNode.ON_SHIM_CHANGE, onShimChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onSrcNodeChange = diagramNode.getOnSrcNodeChange();
		renderedAttributes.add(renderString(DiagramNode.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onStringsChange = diagramNode.getOnStringsChange();
		renderedAttributes.add(renderString(DiagramNode.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onTabIndexChange = diagramNode.getOnTabIndexChange();
		renderedAttributes.add(renderString(DiagramNode.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTransitionsChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onTransitionsChange = diagramNode.getOnTransitionsChange();
		renderedAttributes.add(renderString(DiagramNode.ON_TRANSITIONS_CHANGE, onTransitionsChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onTypeChange = diagramNode.getOnTypeChange();
		renderedAttributes.add(renderString(DiagramNode.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onVisibleChange = diagramNode.getOnVisibleChange();
		renderedAttributes.add(renderString(DiagramNode.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onWidthChange = diagramNode.getOnWidthChange();
		renderedAttributes.add(renderString(DiagramNode.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnXChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onXChange = diagramNode.getOnXChange();
		renderedAttributes.add(renderString(DiagramNode.ON_XCHANGE, onXChange));
	}

	protected void renderOnXyChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onXyChange = diagramNode.getOnXyChange();
		renderedAttributes.add(renderString(DiagramNode.ON_XY_CHANGE, onXyChange));
	}

	protected void renderOnYChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onYChange = diagramNode.getOnYChange();
		renderedAttributes.add(renderString(DiagramNode.ON_YCHANGE, onYChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, DiagramNode diagramNode) throws IOException {
		java.lang.String onZIndexChange = diagramNode.getOnZIndexChange();
		renderedAttributes.add(renderString(DiagramNode.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}