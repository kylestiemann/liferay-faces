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
public abstract class DiagramNodeStateRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DiagramNodeState diagramNodeState = (DiagramNodeState) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var diagramNodeState = new A.DiagramNodeState");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (diagramNodeState.getAlign() != null) {
			renderAlign(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getAlignOn() != null) {
			renderAlignOn(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getDiagramNodeStateBodyContent() != null) {
			renderDiagramNodeStateBodyContent(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getBuilder() != null) {
			renderBuilder(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getCentered() != null) {
			renderCentered(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getConnectors() != null) {
			renderConnectors(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getConstrain() != null) {
			renderConstrain(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getContentBox() != null) {
			renderContentBox(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getControlsToolbar() != null) {
			renderControlsToolbar(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getDescription() != null) {
			renderDescription(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getDisabled() != null) {
			renderDisabled(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getFillHeight() != null) {
			renderFillHeight(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getFocused() != null) {
			renderFocused(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getFooterContent() != null) {
			renderFooterContent(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getGraphic() != null) {
			renderGraphic(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getHeaderContent() != null) {
			renderHeaderContent(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getHeight() != null) {
			renderHeight(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getHighlightBoundaryStroke() != null) {
			renderHighlightBoundaryStroke(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getHighlighted() != null) {
			renderHighlighted(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getDiagramNodeStateId() != null) {
			renderDiagramNodeStateId(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getInitialized() != null) {
			renderInitialized(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getDiagramNodeStateLocale() != null) {
			renderDiagramNodeStateLocale(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getName() != null) {
			renderName(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getPreventOverlap() != null) {
			renderPreventOverlap(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getRender() != null) {
			renderRender(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getRendered() != null) {
			renderRendered(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getRequired() != null) {
			renderRequired(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getSelected() != null) {
			renderSelected(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getShapeBoundary() != null) {
			renderShapeBoundary(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getShapeInvite() != null) {
			renderShapeInvite(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getShim() != null) {
			renderShim(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getStrings() != null) {
			renderStrings(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getTransitions() != null) {
			renderTransitions(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getType() != null) {
			renderType(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getVisible() != null) {
			renderVisible(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getWidth() != null) {
			renderWidth(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getX() != null) {
			renderX(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getXy() != null) {
			renderXy(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getY() != null) {
			renderY(renderedAttributes, diagramNodeState);
		}
		
		if (diagramNodeState.getZIndex() != null) {
			renderZIndex(renderedAttributes, diagramNodeState);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (diagramNodeState.getAfterAlignChange() != null) {
			renderAfterAlignChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterAlignOnChange() != null) {
			renderAfterAlignOnChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterCenteredChange() != null) {
			renderAfterCenteredChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterConnectorsChange() != null) {
			renderAfterConnectorsChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterConstrainChange() != null) {
			renderAfterConstrainChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterControlsToolbarChange() != null) {
			renderAfterControlsToolbarChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterDescriptionChange() != null) {
			renderAfterDescriptionChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterFillHeightChange() != null) {
			renderAfterFillHeightChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterFooterContentChange() != null) {
			renderAfterFooterContentChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterGraphicChange() != null) {
			renderAfterGraphicChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterHeaderContentChange() != null) {
			renderAfterHeaderContentChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterHighlightBoundaryStrokeChange() != null) {
			renderAfterHighlightBoundaryStrokeChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterHighlightedChange() != null) {
			renderAfterHighlightedChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterPreventOverlapChange() != null) {
			renderAfterPreventOverlapChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterShapeBoundaryChange() != null) {
			renderAfterShapeBoundaryChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterShapeInviteChange() != null) {
			renderAfterShapeInviteChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterShimChange() != null) {
			renderAfterShimChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterTransitionsChange() != null) {
			renderAfterTransitionsChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterXChange() != null) {
			renderAfterXChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterXyChange() != null) {
			renderAfterXyChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterYChange() != null) {
			renderAfterYChange(renderedAfterEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, diagramNodeState);
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

		if (diagramNodeState.getOnAlignChange() != null) {
			renderOnAlignChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnAlignOnChange() != null) {
			renderOnAlignOnChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnCenteredChange() != null) {
			renderOnCenteredChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnConnectorsChange() != null) {
			renderOnConnectorsChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnConstrainChange() != null) {
			renderOnConstrainChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnControlsToolbarChange() != null) {
			renderOnControlsToolbarChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnDescriptionChange() != null) {
			renderOnDescriptionChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnFillHeightChange() != null) {
			renderOnFillHeightChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnFooterContentChange() != null) {
			renderOnFooterContentChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnGraphicChange() != null) {
			renderOnGraphicChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnHeaderContentChange() != null) {
			renderOnHeaderContentChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnHighlightBoundaryStrokeChange() != null) {
			renderOnHighlightBoundaryStrokeChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnHighlightedChange() != null) {
			renderOnHighlightedChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnPreventOverlapChange() != null) {
			renderOnPreventOverlapChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnShapeBoundaryChange() != null) {
			renderOnShapeBoundaryChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnShapeInviteChange() != null) {
			renderOnShapeInviteChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnShimChange() != null) {
			renderOnShimChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnTransitionsChange() != null) {
			renderOnTransitionsChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnXChange() != null) {
			renderOnXChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnXyChange() != null) {
			renderOnXyChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnYChange() != null) {
			renderOnYChange(renderedOnEvents, diagramNodeState);
		}
		
		if (diagramNodeState.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, diagramNodeState);
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

	protected void renderAlign(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object align = diagramNodeState.getAlign();
		renderedAttributes.add(renderObject(DiagramNodeState.ALIGN, align));
	}

	protected void renderAlignOn(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object alignOn = diagramNodeState.getAlignOn();
		renderedAttributes.add(renderArray(DiagramNodeState.ALIGN_ON, alignOn));
	}

	protected void renderDiagramNodeStateBodyContent(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object diagramNodeStateBodyContent = diagramNodeState.getDiagramNodeStateBodyContent();
		renderedAttributes.add(renderString(DiagramNodeState.DIAGRAM_NODE_STATE_BODY_CONTENT, diagramNodeStateBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String boundingBox = diagramNodeState.getBoundingBox();
		renderedAttributes.add(renderString(DiagramNodeState.BOUNDING_BOX, boundingBox));
	}

	protected void renderBuilder(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object builder = diagramNodeState.getBuilder();
		renderedAttributes.add(renderString(DiagramNodeState.BUILDER, builder));
	}

	protected void renderCentered(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object centered = diagramNodeState.getCentered();
		renderedAttributes.add(renderString(DiagramNodeState.CENTERED, centered));
	}

	protected void renderConnectors(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String connectors = diagramNodeState.getConnectors();
		renderedAttributes.add(renderString(DiagramNodeState.CONNECTORS, connectors));
	}

	protected void renderConstrain(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object constrain = diagramNodeState.getConstrain();
		renderedAttributes.add(renderString(DiagramNodeState.CONSTRAIN, constrain));
	}

	protected void renderContentBox(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String contentBox = diagramNodeState.getContentBox();
		renderedAttributes.add(renderString(DiagramNodeState.CONTENT_BOX, contentBox));
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object controlsToolbar = diagramNodeState.getControlsToolbar();
		renderedAttributes.add(renderObject(DiagramNodeState.CONTROLS_TOOLBAR, controlsToolbar));
	}

	protected void renderDescription(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String description = diagramNodeState.getDescription();
		renderedAttributes.add(renderString(DiagramNodeState.DESCRIPTION, description));
	}

	protected void renderDestroyed(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean destroyed = diagramNodeState.getDestroyed();
		renderedAttributes.add(renderBoolean(DiagramNodeState.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean disabled = diagramNodeState.getDisabled();
		renderedAttributes.add(renderBoolean(DiagramNodeState.DISABLED, disabled));
	}

	protected void renderFillHeight(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object fillHeight = diagramNodeState.getFillHeight();
		renderedAttributes.add(renderString(DiagramNodeState.FILL_HEIGHT, fillHeight));
	}

	protected void renderFocused(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean focused = diagramNodeState.getFocused();
		renderedAttributes.add(renderBoolean(DiagramNodeState.FOCUSED, focused));
	}

	protected void renderFooterContent(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object footerContent = diagramNodeState.getFooterContent();
		renderedAttributes.add(renderString(DiagramNodeState.FOOTER_CONTENT, footerContent));
	}

	protected void renderGraphic(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object graphic = diagramNodeState.getGraphic();
		renderedAttributes.add(renderObject(DiagramNodeState.GRAPHIC, graphic));
	}

	protected void renderHeaderContent(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object headerContent = diagramNodeState.getHeaderContent();
		renderedAttributes.add(renderString(DiagramNodeState.HEADER_CONTENT, headerContent));
	}

	protected void renderHeight(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object height = diagramNodeState.getHeight();
		renderedAttributes.add(renderNumber(DiagramNodeState.HEIGHT, height));
	}

	protected void renderHighlightBoundaryStroke(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object highlightBoundaryStroke = diagramNodeState.getHighlightBoundaryStroke();
		renderedAttributes.add(renderObject(DiagramNodeState.HIGHLIGHT_BOUNDARY_STROKE, highlightBoundaryStroke));
	}

	protected void renderHighlighted(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean highlighted = diagramNodeState.getHighlighted();
		renderedAttributes.add(renderBoolean(DiagramNodeState.HIGHLIGHTED, highlighted));
	}

	protected void renderDiagramNodeStateId(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String diagramNodeStateId = diagramNodeState.getDiagramNodeStateId();
		renderedAttributes.add(renderString(DiagramNodeState.DIAGRAM_NODE_STATE_ID, diagramNodeStateId));
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean initialized = diagramNodeState.getInitialized();
		renderedAttributes.add(renderBoolean(DiagramNodeState.INITIALIZED, initialized));
	}

	protected void renderDiagramNodeStateLocale(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String diagramNodeStateLocale = diagramNodeState.getDiagramNodeStateLocale();
		renderedAttributes.add(renderString(DiagramNodeState.DIAGRAM_NODE_STATE_LOCALE, diagramNodeStateLocale));
	}

	protected void renderName(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String name = diagramNodeState.getName();
		renderedAttributes.add(renderString(DiagramNodeState.NAME, name));
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean preventOverlap = diagramNodeState.getPreventOverlap();
		renderedAttributes.add(renderBoolean(DiagramNodeState.PREVENT_OVERLAP, preventOverlap));
	}

	protected void renderRender(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object render = diagramNodeState.getRender();
		renderedAttributes.add(renderString(DiagramNodeState.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean rendered = diagramNodeState.getRendered();
		renderedAttributes.add(renderBoolean(DiagramNodeState.RENDERED, rendered));
	}

	protected void renderRequired(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean required = diagramNodeState.getRequired();
		renderedAttributes.add(renderBoolean(DiagramNodeState.REQUIRED, required));
	}

	protected void renderSelected(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean selected = diagramNodeState.getSelected();
		renderedAttributes.add(renderBoolean(DiagramNodeState.SELECTED, selected));
	}

	protected void renderShapeBoundary(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object shapeBoundary = diagramNodeState.getShapeBoundary();
		renderedAttributes.add(renderObject(DiagramNodeState.SHAPE_BOUNDARY, shapeBoundary));
	}

	protected void renderShapeInvite(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object shapeInvite = diagramNodeState.getShapeInvite();
		renderedAttributes.add(renderObject(DiagramNodeState.SHAPE_INVITE, shapeInvite));
	}

	protected void renderShim(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean shim = diagramNodeState.getShim();
		renderedAttributes.add(renderBoolean(DiagramNodeState.SHIM, shim));
	}

	protected void renderSrcNode(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String srcNode = diagramNodeState.getSrcNode();
		renderedAttributes.add(renderString(DiagramNodeState.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object strings = diagramNodeState.getStrings();
		renderedAttributes.add(renderObject(DiagramNodeState.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object tabIndex = diagramNodeState.getTabIndex();
		renderedAttributes.add(renderNumber(DiagramNodeState.TAB_INDEX, tabIndex));
	}

	protected void renderTransitions(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String transitions = diagramNodeState.getTransitions();
		renderedAttributes.add(renderString(DiagramNodeState.TRANSITIONS, transitions));
	}

	protected void renderType(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String type = diagramNodeState.getType();
		renderedAttributes.add(renderString(DiagramNodeState.TYPE, type));
	}

	protected void renderVisible(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Boolean visible = diagramNodeState.getVisible();
		renderedAttributes.add(renderBoolean(DiagramNodeState.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object width = diagramNodeState.getWidth();
		renderedAttributes.add(renderNumber(DiagramNodeState.WIDTH, width));
	}

	protected void renderX(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object x = diagramNodeState.getX();
		renderedAttributes.add(renderNumber(DiagramNodeState.X, x));
	}

	protected void renderXy(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object xy = diagramNodeState.getXy();
		renderedAttributes.add(renderArray(DiagramNodeState.XY, xy));
	}

	protected void renderY(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object y = diagramNodeState.getY();
		renderedAttributes.add(renderNumber(DiagramNodeState.Y, y));
	}

	protected void renderZIndex(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.Object zIndex = diagramNodeState.getZIndex();
		renderedAttributes.add(renderNumber(DiagramNodeState.Z_INDEX, zIndex));
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterAlignChange = diagramNodeState.getAfterAlignChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_ALIGN_CHANGE, afterAlignChange));
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterAlignOnChange = diagramNodeState.getAfterAlignOnChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterBodyContentChange = diagramNodeState.getAfterBodyContentChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterBoundingBoxChange = diagramNodeState.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterBuilderChange = diagramNodeState.getAfterBuilderChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterCenteredChange = diagramNodeState.getAfterCenteredChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_CENTERED_CHANGE, afterCenteredChange));
	}

	protected void renderAfterConnectorsChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterConnectorsChange = diagramNodeState.getAfterConnectorsChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_CONNECTORS_CHANGE, afterConnectorsChange));
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterConstrainChange = diagramNodeState.getAfterConstrainChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterContentBoxChange = diagramNodeState.getAfterContentBoxChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterControlsToolbarChange = diagramNodeState.getAfterControlsToolbarChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
	}

	protected void renderAfterDescriptionChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterDescriptionChange = diagramNodeState.getAfterDescriptionChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_DESCRIPTION_CHANGE, afterDescriptionChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterDestroyedChange = diagramNodeState.getAfterDestroyedChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterDisabledChange = diagramNodeState.getAfterDisabledChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterFillHeightChange = diagramNodeState.getAfterFillHeightChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterFocusedChange = diagramNodeState.getAfterFocusedChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterFooterContentChange = diagramNodeState.getAfterFooterContentChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterGraphicChange = diagramNodeState.getAfterGraphicChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterHeaderContentChange = diagramNodeState.getAfterHeaderContentChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterHeightChange = diagramNodeState.getAfterHeightChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterHighlightBoundaryStrokeChange = diagramNodeState.getAfterHighlightBoundaryStrokeChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, afterHighlightBoundaryStrokeChange));
	}

	protected void renderAfterHighlightedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterHighlightedChange = diagramNodeState.getAfterHighlightedChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_HIGHLIGHTED_CHANGE, afterHighlightedChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterIdChange = diagramNodeState.getAfterIdChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterInitializedChange = diagramNodeState.getAfterInitializedChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterLocaleChange = diagramNodeState.getAfterLocaleChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterNameChange = diagramNodeState.getAfterNameChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterPreventOverlapChange = diagramNodeState.getAfterPreventOverlapChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterRenderChange = diagramNodeState.getAfterRenderChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterRenderedChange = diagramNodeState.getAfterRenderedChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterRequiredChange = diagramNodeState.getAfterRequiredChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterSelectedChange = diagramNodeState.getAfterSelectedChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterShapeBoundaryChange = diagramNodeState.getAfterShapeBoundaryChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_SHAPE_BOUNDARY_CHANGE, afterShapeBoundaryChange));
	}

	protected void renderAfterShapeInviteChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterShapeInviteChange = diagramNodeState.getAfterShapeInviteChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_SHAPE_INVITE_CHANGE, afterShapeInviteChange));
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterShimChange = diagramNodeState.getAfterShimChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_SHIM_CHANGE, afterShimChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterSrcNodeChange = diagramNodeState.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterStringsChange = diagramNodeState.getAfterStringsChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterTabIndexChange = diagramNodeState.getAfterTabIndexChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTransitionsChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterTransitionsChange = diagramNodeState.getAfterTransitionsChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_TRANSITIONS_CHANGE, afterTransitionsChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterTypeChange = diagramNodeState.getAfterTypeChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterVisibleChange = diagramNodeState.getAfterVisibleChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterWidthChange = diagramNodeState.getAfterWidthChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterXChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterXChange = diagramNodeState.getAfterXChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_XCHANGE, afterXChange));
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterXyChange = diagramNodeState.getAfterXyChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_XY_CHANGE, afterXyChange));
	}

	protected void renderAfterYChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterYChange = diagramNodeState.getAfterYChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_YCHANGE, afterYChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String afterZIndexChange = diagramNodeState.getAfterZIndexChange();
		renderedAttributes.add(renderString(DiagramNodeState.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onAlignChange = diagramNodeState.getOnAlignChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_ALIGN_CHANGE, onAlignChange));
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onAlignOnChange = diagramNodeState.getOnAlignOnChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_ALIGN_ON_CHANGE, onAlignOnChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onBodyContentChange = diagramNodeState.getOnBodyContentChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onBoundingBoxChange = diagramNodeState.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onBuilderChange = diagramNodeState.getOnBuilderChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onCenteredChange = diagramNodeState.getOnCenteredChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_CENTERED_CHANGE, onCenteredChange));
	}

	protected void renderOnConnectorsChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onConnectorsChange = diagramNodeState.getOnConnectorsChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_CONNECTORS_CHANGE, onConnectorsChange));
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onConstrainChange = diagramNodeState.getOnConstrainChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_CONSTRAIN_CHANGE, onConstrainChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onContentBoxChange = diagramNodeState.getOnContentBoxChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onControlsToolbarChange = diagramNodeState.getOnControlsToolbarChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
	}

	protected void renderOnDescriptionChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onDescriptionChange = diagramNodeState.getOnDescriptionChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_DESCRIPTION_CHANGE, onDescriptionChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onDestroyedChange = diagramNodeState.getOnDestroyedChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onDisabledChange = diagramNodeState.getOnDisabledChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onFillHeightChange = diagramNodeState.getOnFillHeightChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onFocusedChange = diagramNodeState.getOnFocusedChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onFooterContentChange = diagramNodeState.getOnFooterContentChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onGraphicChange = diagramNodeState.getOnGraphicChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_GRAPHIC_CHANGE, onGraphicChange));
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onHeaderContentChange = diagramNodeState.getOnHeaderContentChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onHeightChange = diagramNodeState.getOnHeightChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onHighlightBoundaryStrokeChange = diagramNodeState.getOnHighlightBoundaryStrokeChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, onHighlightBoundaryStrokeChange));
	}

	protected void renderOnHighlightedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onHighlightedChange = diagramNodeState.getOnHighlightedChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_HIGHLIGHTED_CHANGE, onHighlightedChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onIdChange = diagramNodeState.getOnIdChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onInitializedChange = diagramNodeState.getOnInitializedChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onLocaleChange = diagramNodeState.getOnLocaleChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onNameChange = diagramNodeState.getOnNameChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onPreventOverlapChange = diagramNodeState.getOnPreventOverlapChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onRenderChange = diagramNodeState.getOnRenderChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onRenderedChange = diagramNodeState.getOnRenderedChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onRequiredChange = diagramNodeState.getOnRequiredChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onSelectedChange = diagramNodeState.getOnSelectedChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onShapeBoundaryChange = diagramNodeState.getOnShapeBoundaryChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_SHAPE_BOUNDARY_CHANGE, onShapeBoundaryChange));
	}

	protected void renderOnShapeInviteChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onShapeInviteChange = diagramNodeState.getOnShapeInviteChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_SHAPE_INVITE_CHANGE, onShapeInviteChange));
	}

	protected void renderOnShimChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onShimChange = diagramNodeState.getOnShimChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_SHIM_CHANGE, onShimChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onSrcNodeChange = diagramNodeState.getOnSrcNodeChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onStringsChange = diagramNodeState.getOnStringsChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onTabIndexChange = diagramNodeState.getOnTabIndexChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTransitionsChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onTransitionsChange = diagramNodeState.getOnTransitionsChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_TRANSITIONS_CHANGE, onTransitionsChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onTypeChange = diagramNodeState.getOnTypeChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onVisibleChange = diagramNodeState.getOnVisibleChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onWidthChange = diagramNodeState.getOnWidthChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnXChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onXChange = diagramNodeState.getOnXChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_XCHANGE, onXChange));
	}

	protected void renderOnXyChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onXyChange = diagramNodeState.getOnXyChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_XY_CHANGE, onXyChange));
	}

	protected void renderOnYChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onYChange = diagramNodeState.getOnYChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_YCHANGE, onYChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, DiagramNodeState diagramNodeState) throws IOException {
		java.lang.String onZIndexChange = diagramNodeState.getOnZIndexChange();
		renderedAttributes.add(renderString(DiagramNodeState.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}