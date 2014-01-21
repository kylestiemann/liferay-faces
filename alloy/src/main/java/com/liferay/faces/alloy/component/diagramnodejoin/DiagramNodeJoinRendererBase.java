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
public abstract class DiagramNodeJoinRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DiagramNodeJoin diagramNodeJoin = (DiagramNodeJoin) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var diagramNodeJoin = new A.DiagramNodeJoin");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (diagramNodeJoin.getAlign() != null) {
			renderAlign(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAlignOn() != null) {
			renderAlignOn(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getDiagramNodeJoinBodyContent() != null) {
			renderDiagramNodeJoinBodyContent(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getBuilder() != null) {
			renderBuilder(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getCentered() != null) {
			renderCentered(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getConnectors() != null) {
			renderConnectors(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getConstrain() != null) {
			renderConstrain(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getContentBox() != null) {
			renderContentBox(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getControlsToolbar() != null) {
			renderControlsToolbar(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getDescription() != null) {
			renderDescription(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getDisabled() != null) {
			renderDisabled(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getFillHeight() != null) {
			renderFillHeight(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getFocused() != null) {
			renderFocused(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getFooterContent() != null) {
			renderFooterContent(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getGraphic() != null) {
			renderGraphic(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getHeaderContent() != null) {
			renderHeaderContent(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getHeight() != null) {
			renderHeight(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getHighlightBoundaryStroke() != null) {
			renderHighlightBoundaryStroke(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getHighlighted() != null) {
			renderHighlighted(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getDiagramNodeJoinId() != null) {
			renderDiagramNodeJoinId(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getInitialized() != null) {
			renderInitialized(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getDiagramNodeJoinLocale() != null) {
			renderDiagramNodeJoinLocale(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getName() != null) {
			renderName(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getPreventOverlap() != null) {
			renderPreventOverlap(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getRender() != null) {
			renderRender(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getRendered() != null) {
			renderRendered(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getRequired() != null) {
			renderRequired(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getSelected() != null) {
			renderSelected(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getShapeBoundary() != null) {
			renderShapeBoundary(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getShapeInvite() != null) {
			renderShapeInvite(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getShim() != null) {
			renderShim(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getStrings() != null) {
			renderStrings(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getTransitions() != null) {
			renderTransitions(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getType() != null) {
			renderType(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getVisible() != null) {
			renderVisible(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getWidth() != null) {
			renderWidth(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getX() != null) {
			renderX(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getXy() != null) {
			renderXy(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getY() != null) {
			renderY(renderedAttributes, diagramNodeJoin);
		}

		if (diagramNodeJoin.getZIndex() != null) {
			renderZIndex(renderedAttributes, diagramNodeJoin);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (diagramNodeJoin.getAfterAlignChange() != null) {
			renderAfterAlignChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterAlignOnChange() != null) {
			renderAfterAlignOnChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterCenteredChange() != null) {
			renderAfterCenteredChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterConnectorsChange() != null) {
			renderAfterConnectorsChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterConstrainChange() != null) {
			renderAfterConstrainChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterControlsToolbarChange() != null) {
			renderAfterControlsToolbarChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterDescriptionChange() != null) {
			renderAfterDescriptionChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterFillHeightChange() != null) {
			renderAfterFillHeightChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterFooterContentChange() != null) {
			renderAfterFooterContentChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterGraphicChange() != null) {
			renderAfterGraphicChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterHeaderContentChange() != null) {
			renderAfterHeaderContentChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterHighlightBoundaryStrokeChange() != null) {
			renderAfterHighlightBoundaryStrokeChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterHighlightedChange() != null) {
			renderAfterHighlightedChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterPreventOverlapChange() != null) {
			renderAfterPreventOverlapChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterShapeBoundaryChange() != null) {
			renderAfterShapeBoundaryChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterShapeInviteChange() != null) {
			renderAfterShapeInviteChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterShimChange() != null) {
			renderAfterShimChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterTransitionsChange() != null) {
			renderAfterTransitionsChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterXChange() != null) {
			renderAfterXChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterXyChange() != null) {
			renderAfterXyChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterYChange() != null) {
			renderAfterYChange(renderedAfterEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, diagramNodeJoin);
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

		if (diagramNodeJoin.getOnAlignChange() != null) {
			renderOnAlignChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnAlignOnChange() != null) {
			renderOnAlignOnChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnCenteredChange() != null) {
			renderOnCenteredChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnConnectorsChange() != null) {
			renderOnConnectorsChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnConstrainChange() != null) {
			renderOnConstrainChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnControlsToolbarChange() != null) {
			renderOnControlsToolbarChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnDescriptionChange() != null) {
			renderOnDescriptionChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnFillHeightChange() != null) {
			renderOnFillHeightChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnFooterContentChange() != null) {
			renderOnFooterContentChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnGraphicChange() != null) {
			renderOnGraphicChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnHeaderContentChange() != null) {
			renderOnHeaderContentChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnHighlightBoundaryStrokeChange() != null) {
			renderOnHighlightBoundaryStrokeChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnHighlightedChange() != null) {
			renderOnHighlightedChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnPreventOverlapChange() != null) {
			renderOnPreventOverlapChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnShapeBoundaryChange() != null) {
			renderOnShapeBoundaryChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnShapeInviteChange() != null) {
			renderOnShapeInviteChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnShimChange() != null) {
			renderOnShimChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnTransitionsChange() != null) {
			renderOnTransitionsChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnXChange() != null) {
			renderOnXChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnXyChange() != null) {
			renderOnXyChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnYChange() != null) {
			renderOnYChange(renderedOnEvents, diagramNodeJoin);
		}

		if (diagramNodeJoin.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, diagramNodeJoin);
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

	protected void renderAlign(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object align = diagramNodeJoin.getAlign();
		renderedAttributes.add(renderObject(DiagramNodeJoin.ALIGN, align));
	}

	protected void renderAlignOn(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object alignOn = diagramNodeJoin.getAlignOn();
		renderedAttributes.add(renderArray(DiagramNodeJoin.ALIGN_ON, alignOn));
	}

	protected void renderDiagramNodeJoinBodyContent(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object diagramNodeJoinBodyContent = diagramNodeJoin.getDiagramNodeJoinBodyContent();
		renderedAttributes.add(renderString(DiagramNodeJoin.DIAGRAM_NODE_JOIN_BODY_CONTENT, diagramNodeJoinBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String boundingBox = diagramNodeJoin.getBoundingBox();
		renderedAttributes.add(renderString(DiagramNodeJoin.BOUNDING_BOX, boundingBox));
	}

	protected void renderBuilder(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object builder = diagramNodeJoin.getBuilder();
		renderedAttributes.add(renderString(DiagramNodeJoin.BUILDER, builder));
	}

	protected void renderCentered(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object centered = diagramNodeJoin.getCentered();
		renderedAttributes.add(renderString(DiagramNodeJoin.CENTERED, centered));
	}

	protected void renderConnectors(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String connectors = diagramNodeJoin.getConnectors();
		renderedAttributes.add(renderString(DiagramNodeJoin.CONNECTORS, connectors));
	}

	protected void renderConstrain(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object constrain = diagramNodeJoin.getConstrain();
		renderedAttributes.add(renderString(DiagramNodeJoin.CONSTRAIN, constrain));
	}

	protected void renderContentBox(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String contentBox = diagramNodeJoin.getContentBox();
		renderedAttributes.add(renderString(DiagramNodeJoin.CONTENT_BOX, contentBox));
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object controlsToolbar = diagramNodeJoin.getControlsToolbar();
		renderedAttributes.add(renderObject(DiagramNodeJoin.CONTROLS_TOOLBAR, controlsToolbar));
	}

	protected void renderDescription(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String description = diagramNodeJoin.getDescription();
		renderedAttributes.add(renderString(DiagramNodeJoin.DESCRIPTION, description));
	}

	protected void renderDestroyed(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean destroyed = diagramNodeJoin.getDestroyed();
		renderedAttributes.add(renderBoolean(DiagramNodeJoin.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean disabled = diagramNodeJoin.getDisabled();
		renderedAttributes.add(renderBoolean(DiagramNodeJoin.DISABLED, disabled));
	}

	protected void renderFillHeight(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object fillHeight = diagramNodeJoin.getFillHeight();
		renderedAttributes.add(renderString(DiagramNodeJoin.FILL_HEIGHT, fillHeight));
	}

	protected void renderFocused(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean focused = diagramNodeJoin.getFocused();
		renderedAttributes.add(renderBoolean(DiagramNodeJoin.FOCUSED, focused));
	}

	protected void renderFooterContent(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object footerContent = diagramNodeJoin.getFooterContent();
		renderedAttributes.add(renderString(DiagramNodeJoin.FOOTER_CONTENT, footerContent));
	}

	protected void renderGraphic(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object graphic = diagramNodeJoin.getGraphic();
		renderedAttributes.add(renderObject(DiagramNodeJoin.GRAPHIC, graphic));
	}

	protected void renderHeaderContent(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object headerContent = diagramNodeJoin.getHeaderContent();
		renderedAttributes.add(renderString(DiagramNodeJoin.HEADER_CONTENT, headerContent));
	}

	protected void renderHeight(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object height = diagramNodeJoin.getHeight();
		renderedAttributes.add(renderNumber(DiagramNodeJoin.HEIGHT, height));
	}

	protected void renderHighlightBoundaryStroke(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object highlightBoundaryStroke = diagramNodeJoin.getHighlightBoundaryStroke();
		renderedAttributes.add(renderObject(DiagramNodeJoin.HIGHLIGHT_BOUNDARY_STROKE, highlightBoundaryStroke));
	}

	protected void renderHighlighted(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean highlighted = diagramNodeJoin.getHighlighted();
		renderedAttributes.add(renderBoolean(DiagramNodeJoin.HIGHLIGHTED, highlighted));
	}

	protected void renderDiagramNodeJoinId(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String diagramNodeJoinId = diagramNodeJoin.getDiagramNodeJoinId();
		renderedAttributes.add(renderString(DiagramNodeJoin.DIAGRAM_NODE_JOIN_ID, diagramNodeJoinId));
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean initialized = diagramNodeJoin.getInitialized();
		renderedAttributes.add(renderBoolean(DiagramNodeJoin.INITIALIZED, initialized));
	}

	protected void renderDiagramNodeJoinLocale(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String diagramNodeJoinLocale = diagramNodeJoin.getDiagramNodeJoinLocale();
		renderedAttributes.add(renderString(DiagramNodeJoin.DIAGRAM_NODE_JOIN_LOCALE, diagramNodeJoinLocale));
	}

	protected void renderName(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String name = diagramNodeJoin.getName();
		renderedAttributes.add(renderString(DiagramNodeJoin.NAME, name));
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean preventOverlap = diagramNodeJoin.getPreventOverlap();
		renderedAttributes.add(renderBoolean(DiagramNodeJoin.PREVENT_OVERLAP, preventOverlap));
	}

	protected void renderRender(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object render = diagramNodeJoin.getRender();
		renderedAttributes.add(renderString(DiagramNodeJoin.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean rendered = diagramNodeJoin.getRendered();
		renderedAttributes.add(renderBoolean(DiagramNodeJoin.RENDERED, rendered));
	}

	protected void renderRequired(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean required = diagramNodeJoin.getRequired();
		renderedAttributes.add(renderBoolean(DiagramNodeJoin.REQUIRED, required));
	}

	protected void renderSelected(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean selected = diagramNodeJoin.getSelected();
		renderedAttributes.add(renderBoolean(DiagramNodeJoin.SELECTED, selected));
	}

	protected void renderShapeBoundary(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object shapeBoundary = diagramNodeJoin.getShapeBoundary();
		renderedAttributes.add(renderObject(DiagramNodeJoin.SHAPE_BOUNDARY, shapeBoundary));
	}

	protected void renderShapeInvite(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object shapeInvite = diagramNodeJoin.getShapeInvite();
		renderedAttributes.add(renderObject(DiagramNodeJoin.SHAPE_INVITE, shapeInvite));
	}

	protected void renderShim(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean shim = diagramNodeJoin.getShim();
		renderedAttributes.add(renderBoolean(DiagramNodeJoin.SHIM, shim));
	}

	protected void renderSrcNode(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String srcNode = diagramNodeJoin.getSrcNode();
		renderedAttributes.add(renderString(DiagramNodeJoin.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object strings = diagramNodeJoin.getStrings();
		renderedAttributes.add(renderObject(DiagramNodeJoin.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object tabIndex = diagramNodeJoin.getTabIndex();
		renderedAttributes.add(renderNumber(DiagramNodeJoin.TAB_INDEX, tabIndex));
	}

	protected void renderTransitions(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String transitions = diagramNodeJoin.getTransitions();
		renderedAttributes.add(renderString(DiagramNodeJoin.TRANSITIONS, transitions));
	}

	protected void renderType(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String type = diagramNodeJoin.getType();
		renderedAttributes.add(renderString(DiagramNodeJoin.TYPE, type));
	}

	protected void renderVisible(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Boolean visible = diagramNodeJoin.getVisible();
		renderedAttributes.add(renderBoolean(DiagramNodeJoin.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object width = diagramNodeJoin.getWidth();
		renderedAttributes.add(renderNumber(DiagramNodeJoin.WIDTH, width));
	}

	protected void renderX(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object x = diagramNodeJoin.getX();
		renderedAttributes.add(renderNumber(DiagramNodeJoin.X, x));
	}

	protected void renderXy(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object xy = diagramNodeJoin.getXy();
		renderedAttributes.add(renderArray(DiagramNodeJoin.XY, xy));
	}

	protected void renderY(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object y = diagramNodeJoin.getY();
		renderedAttributes.add(renderNumber(DiagramNodeJoin.Y, y));
	}

	protected void renderZIndex(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.Object zIndex = diagramNodeJoin.getZIndex();
		renderedAttributes.add(renderNumber(DiagramNodeJoin.Z_INDEX, zIndex));
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterAlignChange = diagramNodeJoin.getAfterAlignChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_ALIGN_CHANGE, afterAlignChange));
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterAlignOnChange = diagramNodeJoin.getAfterAlignOnChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterBodyContentChange = diagramNodeJoin.getAfterBodyContentChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterBoundingBoxChange = diagramNodeJoin.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterBuilderChange = diagramNodeJoin.getAfterBuilderChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterCenteredChange = diagramNodeJoin.getAfterCenteredChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_CENTERED_CHANGE, afterCenteredChange));
	}

	protected void renderAfterConnectorsChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterConnectorsChange = diagramNodeJoin.getAfterConnectorsChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_CONNECTORS_CHANGE, afterConnectorsChange));
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterConstrainChange = diagramNodeJoin.getAfterConstrainChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterContentBoxChange = diagramNodeJoin.getAfterContentBoxChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterControlsToolbarChange = diagramNodeJoin.getAfterControlsToolbarChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
	}

	protected void renderAfterDescriptionChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterDescriptionChange = diagramNodeJoin.getAfterDescriptionChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_DESCRIPTION_CHANGE, afterDescriptionChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterDestroyedChange = diagramNodeJoin.getAfterDestroyedChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterDisabledChange = diagramNodeJoin.getAfterDisabledChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterFillHeightChange = diagramNodeJoin.getAfterFillHeightChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterFocusedChange = diagramNodeJoin.getAfterFocusedChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterFooterContentChange = diagramNodeJoin.getAfterFooterContentChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterGraphicChange = diagramNodeJoin.getAfterGraphicChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterHeaderContentChange = diagramNodeJoin.getAfterHeaderContentChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterHeightChange = diagramNodeJoin.getAfterHeightChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterHighlightBoundaryStrokeChange = diagramNodeJoin.getAfterHighlightBoundaryStrokeChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, afterHighlightBoundaryStrokeChange));
	}

	protected void renderAfterHighlightedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterHighlightedChange = diagramNodeJoin.getAfterHighlightedChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_HIGHLIGHTED_CHANGE, afterHighlightedChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterIdChange = diagramNodeJoin.getAfterIdChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterInitializedChange = diagramNodeJoin.getAfterInitializedChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterLocaleChange = diagramNodeJoin.getAfterLocaleChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterNameChange = diagramNodeJoin.getAfterNameChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterPreventOverlapChange = diagramNodeJoin.getAfterPreventOverlapChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterRenderChange = diagramNodeJoin.getAfterRenderChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterRenderedChange = diagramNodeJoin.getAfterRenderedChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterRequiredChange = diagramNodeJoin.getAfterRequiredChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterSelectedChange = diagramNodeJoin.getAfterSelectedChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterShapeBoundaryChange = diagramNodeJoin.getAfterShapeBoundaryChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_SHAPE_BOUNDARY_CHANGE, afterShapeBoundaryChange));
	}

	protected void renderAfterShapeInviteChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterShapeInviteChange = diagramNodeJoin.getAfterShapeInviteChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_SHAPE_INVITE_CHANGE, afterShapeInviteChange));
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterShimChange = diagramNodeJoin.getAfterShimChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_SHIM_CHANGE, afterShimChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterSrcNodeChange = diagramNodeJoin.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterStringsChange = diagramNodeJoin.getAfterStringsChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterTabIndexChange = diagramNodeJoin.getAfterTabIndexChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTransitionsChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterTransitionsChange = diagramNodeJoin.getAfterTransitionsChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_TRANSITIONS_CHANGE, afterTransitionsChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterTypeChange = diagramNodeJoin.getAfterTypeChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterVisibleChange = diagramNodeJoin.getAfterVisibleChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterWidthChange = diagramNodeJoin.getAfterWidthChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterXChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterXChange = diagramNodeJoin.getAfterXChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_XCHANGE, afterXChange));
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterXyChange = diagramNodeJoin.getAfterXyChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_XY_CHANGE, afterXyChange));
	}

	protected void renderAfterYChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterYChange = diagramNodeJoin.getAfterYChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_YCHANGE, afterYChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String afterZIndexChange = diagramNodeJoin.getAfterZIndexChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onAlignChange = diagramNodeJoin.getOnAlignChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_ALIGN_CHANGE, onAlignChange));
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onAlignOnChange = diagramNodeJoin.getOnAlignOnChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_ALIGN_ON_CHANGE, onAlignOnChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onBodyContentChange = diagramNodeJoin.getOnBodyContentChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onBoundingBoxChange = diagramNodeJoin.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onBuilderChange = diagramNodeJoin.getOnBuilderChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onCenteredChange = diagramNodeJoin.getOnCenteredChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_CENTERED_CHANGE, onCenteredChange));
	}

	protected void renderOnConnectorsChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onConnectorsChange = diagramNodeJoin.getOnConnectorsChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_CONNECTORS_CHANGE, onConnectorsChange));
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onConstrainChange = diagramNodeJoin.getOnConstrainChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_CONSTRAIN_CHANGE, onConstrainChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onContentBoxChange = diagramNodeJoin.getOnContentBoxChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onControlsToolbarChange = diagramNodeJoin.getOnControlsToolbarChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
	}

	protected void renderOnDescriptionChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onDescriptionChange = diagramNodeJoin.getOnDescriptionChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_DESCRIPTION_CHANGE, onDescriptionChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onDestroyedChange = diagramNodeJoin.getOnDestroyedChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onDisabledChange = diagramNodeJoin.getOnDisabledChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onFillHeightChange = diagramNodeJoin.getOnFillHeightChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onFocusedChange = diagramNodeJoin.getOnFocusedChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onFooterContentChange = diagramNodeJoin.getOnFooterContentChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onGraphicChange = diagramNodeJoin.getOnGraphicChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_GRAPHIC_CHANGE, onGraphicChange));
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onHeaderContentChange = diagramNodeJoin.getOnHeaderContentChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onHeightChange = diagramNodeJoin.getOnHeightChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onHighlightBoundaryStrokeChange = diagramNodeJoin.getOnHighlightBoundaryStrokeChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, onHighlightBoundaryStrokeChange));
	}

	protected void renderOnHighlightedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onHighlightedChange = diagramNodeJoin.getOnHighlightedChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_HIGHLIGHTED_CHANGE, onHighlightedChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onIdChange = diagramNodeJoin.getOnIdChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onInitializedChange = diagramNodeJoin.getOnInitializedChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onLocaleChange = diagramNodeJoin.getOnLocaleChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onNameChange = diagramNodeJoin.getOnNameChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onPreventOverlapChange = diagramNodeJoin.getOnPreventOverlapChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onRenderChange = diagramNodeJoin.getOnRenderChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onRenderedChange = diagramNodeJoin.getOnRenderedChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onRequiredChange = diagramNodeJoin.getOnRequiredChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onSelectedChange = diagramNodeJoin.getOnSelectedChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onShapeBoundaryChange = diagramNodeJoin.getOnShapeBoundaryChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_SHAPE_BOUNDARY_CHANGE, onShapeBoundaryChange));
	}

	protected void renderOnShapeInviteChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onShapeInviteChange = diagramNodeJoin.getOnShapeInviteChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_SHAPE_INVITE_CHANGE, onShapeInviteChange));
	}

	protected void renderOnShimChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onShimChange = diagramNodeJoin.getOnShimChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_SHIM_CHANGE, onShimChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onSrcNodeChange = diagramNodeJoin.getOnSrcNodeChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onStringsChange = diagramNodeJoin.getOnStringsChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onTabIndexChange = diagramNodeJoin.getOnTabIndexChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTransitionsChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onTransitionsChange = diagramNodeJoin.getOnTransitionsChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_TRANSITIONS_CHANGE, onTransitionsChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onTypeChange = diagramNodeJoin.getOnTypeChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onVisibleChange = diagramNodeJoin.getOnVisibleChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onWidthChange = diagramNodeJoin.getOnWidthChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnXChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onXChange = diagramNodeJoin.getOnXChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_XCHANGE, onXChange));
	}

	protected void renderOnXyChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onXyChange = diagramNodeJoin.getOnXyChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_XY_CHANGE, onXyChange));
	}

	protected void renderOnYChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onYChange = diagramNodeJoin.getOnYChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_YCHANGE, onYChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, DiagramNodeJoin diagramNodeJoin) throws IOException {
		java.lang.String onZIndexChange = diagramNodeJoin.getOnZIndexChange();
		renderedAttributes.add(renderString(DiagramNodeJoin.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}