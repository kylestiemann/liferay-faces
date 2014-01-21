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
public abstract class DiagramNodeStartRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DiagramNodeStart diagramNodeStart = (DiagramNodeStart) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var diagramNodeStart = new A.DiagramNodeStart");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (diagramNodeStart.getAlign() != null) {
			renderAlign(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getAlignOn() != null) {
			renderAlignOn(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getDiagramNodeStartBodyContent() != null) {
			renderDiagramNodeStartBodyContent(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getBuilder() != null) {
			renderBuilder(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getCentered() != null) {
			renderCentered(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getConnectors() != null) {
			renderConnectors(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getConstrain() != null) {
			renderConstrain(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getContentBox() != null) {
			renderContentBox(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getControlsToolbar() != null) {
			renderControlsToolbar(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getDescription() != null) {
			renderDescription(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getDisabled() != null) {
			renderDisabled(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getFillHeight() != null) {
			renderFillHeight(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getFocused() != null) {
			renderFocused(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getFooterContent() != null) {
			renderFooterContent(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getGraphic() != null) {
			renderGraphic(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getHeaderContent() != null) {
			renderHeaderContent(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getHeight() != null) {
			renderHeight(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getHighlightBoundaryStroke() != null) {
			renderHighlightBoundaryStroke(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getHighlighted() != null) {
			renderHighlighted(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getDiagramNodeStartId() != null) {
			renderDiagramNodeStartId(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getInitialized() != null) {
			renderInitialized(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getDiagramNodeStartLocale() != null) {
			renderDiagramNodeStartLocale(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getName() != null) {
			renderName(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getPreventOverlap() != null) {
			renderPreventOverlap(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getRender() != null) {
			renderRender(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getRendered() != null) {
			renderRendered(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getRequired() != null) {
			renderRequired(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getSelected() != null) {
			renderSelected(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getShapeBoundary() != null) {
			renderShapeBoundary(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getShapeInvite() != null) {
			renderShapeInvite(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getShim() != null) {
			renderShim(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getStrings() != null) {
			renderStrings(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getTransitions() != null) {
			renderTransitions(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getType() != null) {
			renderType(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getVisible() != null) {
			renderVisible(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getWidth() != null) {
			renderWidth(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getX() != null) {
			renderX(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getXy() != null) {
			renderXy(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getY() != null) {
			renderY(renderedAttributes, diagramNodeStart);
		}

		if (diagramNodeStart.getZIndex() != null) {
			renderZIndex(renderedAttributes, diagramNodeStart);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (diagramNodeStart.getAfterAlignChange() != null) {
			renderAfterAlignChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterAlignOnChange() != null) {
			renderAfterAlignOnChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterCenteredChange() != null) {
			renderAfterCenteredChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterConnectorsChange() != null) {
			renderAfterConnectorsChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterConstrainChange() != null) {
			renderAfterConstrainChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterControlsToolbarChange() != null) {
			renderAfterControlsToolbarChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterDescriptionChange() != null) {
			renderAfterDescriptionChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterFillHeightChange() != null) {
			renderAfterFillHeightChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterFooterContentChange() != null) {
			renderAfterFooterContentChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterGraphicChange() != null) {
			renderAfterGraphicChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterHeaderContentChange() != null) {
			renderAfterHeaderContentChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterHighlightBoundaryStrokeChange() != null) {
			renderAfterHighlightBoundaryStrokeChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterHighlightedChange() != null) {
			renderAfterHighlightedChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterPreventOverlapChange() != null) {
			renderAfterPreventOverlapChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterShapeBoundaryChange() != null) {
			renderAfterShapeBoundaryChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterShapeInviteChange() != null) {
			renderAfterShapeInviteChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterShimChange() != null) {
			renderAfterShimChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterTransitionsChange() != null) {
			renderAfterTransitionsChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterXChange() != null) {
			renderAfterXChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterXyChange() != null) {
			renderAfterXyChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterYChange() != null) {
			renderAfterYChange(renderedAfterEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, diagramNodeStart);
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

		if (diagramNodeStart.getOnAlignChange() != null) {
			renderOnAlignChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnAlignOnChange() != null) {
			renderOnAlignOnChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnCenteredChange() != null) {
			renderOnCenteredChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnConnectorsChange() != null) {
			renderOnConnectorsChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnConstrainChange() != null) {
			renderOnConstrainChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnControlsToolbarChange() != null) {
			renderOnControlsToolbarChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnDescriptionChange() != null) {
			renderOnDescriptionChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnFillHeightChange() != null) {
			renderOnFillHeightChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnFooterContentChange() != null) {
			renderOnFooterContentChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnGraphicChange() != null) {
			renderOnGraphicChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnHeaderContentChange() != null) {
			renderOnHeaderContentChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnHighlightBoundaryStrokeChange() != null) {
			renderOnHighlightBoundaryStrokeChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnHighlightedChange() != null) {
			renderOnHighlightedChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnPreventOverlapChange() != null) {
			renderOnPreventOverlapChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnShapeBoundaryChange() != null) {
			renderOnShapeBoundaryChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnShapeInviteChange() != null) {
			renderOnShapeInviteChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnShimChange() != null) {
			renderOnShimChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnTransitionsChange() != null) {
			renderOnTransitionsChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnXChange() != null) {
			renderOnXChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnXyChange() != null) {
			renderOnXyChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnYChange() != null) {
			renderOnYChange(renderedOnEvents, diagramNodeStart);
		}

		if (diagramNodeStart.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, diagramNodeStart);
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

	protected void renderAlign(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object align = diagramNodeStart.getAlign();
		renderedAttributes.add(renderObject(DiagramNodeStart.ALIGN, align));
	}

	protected void renderAlignOn(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object alignOn = diagramNodeStart.getAlignOn();
		renderedAttributes.add(renderArray(DiagramNodeStart.ALIGN_ON, alignOn));
	}

	protected void renderDiagramNodeStartBodyContent(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object diagramNodeStartBodyContent = diagramNodeStart.getDiagramNodeStartBodyContent();
		renderedAttributes.add(renderString(DiagramNodeStart.DIAGRAM_NODE_START_BODY_CONTENT, diagramNodeStartBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String boundingBox = diagramNodeStart.getBoundingBox();
		renderedAttributes.add(renderString(DiagramNodeStart.BOUNDING_BOX, boundingBox));
	}

	protected void renderBuilder(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object builder = diagramNodeStart.getBuilder();
		renderedAttributes.add(renderString(DiagramNodeStart.BUILDER, builder));
	}

	protected void renderCentered(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object centered = diagramNodeStart.getCentered();
		renderedAttributes.add(renderString(DiagramNodeStart.CENTERED, centered));
	}

	protected void renderConnectors(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String connectors = diagramNodeStart.getConnectors();
		renderedAttributes.add(renderString(DiagramNodeStart.CONNECTORS, connectors));
	}

	protected void renderConstrain(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object constrain = diagramNodeStart.getConstrain();
		renderedAttributes.add(renderString(DiagramNodeStart.CONSTRAIN, constrain));
	}

	protected void renderContentBox(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String contentBox = diagramNodeStart.getContentBox();
		renderedAttributes.add(renderString(DiagramNodeStart.CONTENT_BOX, contentBox));
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object controlsToolbar = diagramNodeStart.getControlsToolbar();
		renderedAttributes.add(renderObject(DiagramNodeStart.CONTROLS_TOOLBAR, controlsToolbar));
	}

	protected void renderDescription(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String description = diagramNodeStart.getDescription();
		renderedAttributes.add(renderString(DiagramNodeStart.DESCRIPTION, description));
	}

	protected void renderDestroyed(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean destroyed = diagramNodeStart.getDestroyed();
		renderedAttributes.add(renderBoolean(DiagramNodeStart.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean disabled = diagramNodeStart.getDisabled();
		renderedAttributes.add(renderBoolean(DiagramNodeStart.DISABLED, disabled));
	}

	protected void renderFillHeight(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object fillHeight = diagramNodeStart.getFillHeight();
		renderedAttributes.add(renderString(DiagramNodeStart.FILL_HEIGHT, fillHeight));
	}

	protected void renderFocused(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean focused = diagramNodeStart.getFocused();
		renderedAttributes.add(renderBoolean(DiagramNodeStart.FOCUSED, focused));
	}

	protected void renderFooterContent(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object footerContent = diagramNodeStart.getFooterContent();
		renderedAttributes.add(renderString(DiagramNodeStart.FOOTER_CONTENT, footerContent));
	}

	protected void renderGraphic(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object graphic = diagramNodeStart.getGraphic();
		renderedAttributes.add(renderObject(DiagramNodeStart.GRAPHIC, graphic));
	}

	protected void renderHeaderContent(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object headerContent = diagramNodeStart.getHeaderContent();
		renderedAttributes.add(renderString(DiagramNodeStart.HEADER_CONTENT, headerContent));
	}

	protected void renderHeight(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object height = diagramNodeStart.getHeight();
		renderedAttributes.add(renderNumber(DiagramNodeStart.HEIGHT, height));
	}

	protected void renderHighlightBoundaryStroke(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object highlightBoundaryStroke = diagramNodeStart.getHighlightBoundaryStroke();
		renderedAttributes.add(renderObject(DiagramNodeStart.HIGHLIGHT_BOUNDARY_STROKE, highlightBoundaryStroke));
	}

	protected void renderHighlighted(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean highlighted = diagramNodeStart.getHighlighted();
		renderedAttributes.add(renderBoolean(DiagramNodeStart.HIGHLIGHTED, highlighted));
	}

	protected void renderDiagramNodeStartId(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String diagramNodeStartId = diagramNodeStart.getDiagramNodeStartId();
		renderedAttributes.add(renderString(DiagramNodeStart.DIAGRAM_NODE_START_ID, diagramNodeStartId));
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean initialized = diagramNodeStart.getInitialized();
		renderedAttributes.add(renderBoolean(DiagramNodeStart.INITIALIZED, initialized));
	}

	protected void renderDiagramNodeStartLocale(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String diagramNodeStartLocale = diagramNodeStart.getDiagramNodeStartLocale();
		renderedAttributes.add(renderString(DiagramNodeStart.DIAGRAM_NODE_START_LOCALE, diagramNodeStartLocale));
	}

	protected void renderName(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String name = diagramNodeStart.getName();
		renderedAttributes.add(renderString(DiagramNodeStart.NAME, name));
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean preventOverlap = diagramNodeStart.getPreventOverlap();
		renderedAttributes.add(renderBoolean(DiagramNodeStart.PREVENT_OVERLAP, preventOverlap));
	}

	protected void renderRender(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object render = diagramNodeStart.getRender();
		renderedAttributes.add(renderString(DiagramNodeStart.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean rendered = diagramNodeStart.getRendered();
		renderedAttributes.add(renderBoolean(DiagramNodeStart.RENDERED, rendered));
	}

	protected void renderRequired(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean required = diagramNodeStart.getRequired();
		renderedAttributes.add(renderBoolean(DiagramNodeStart.REQUIRED, required));
	}

	protected void renderSelected(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean selected = diagramNodeStart.getSelected();
		renderedAttributes.add(renderBoolean(DiagramNodeStart.SELECTED, selected));
	}

	protected void renderShapeBoundary(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object shapeBoundary = diagramNodeStart.getShapeBoundary();
		renderedAttributes.add(renderObject(DiagramNodeStart.SHAPE_BOUNDARY, shapeBoundary));
	}

	protected void renderShapeInvite(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object shapeInvite = diagramNodeStart.getShapeInvite();
		renderedAttributes.add(renderObject(DiagramNodeStart.SHAPE_INVITE, shapeInvite));
	}

	protected void renderShim(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean shim = diagramNodeStart.getShim();
		renderedAttributes.add(renderBoolean(DiagramNodeStart.SHIM, shim));
	}

	protected void renderSrcNode(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String srcNode = diagramNodeStart.getSrcNode();
		renderedAttributes.add(renderString(DiagramNodeStart.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object strings = diagramNodeStart.getStrings();
		renderedAttributes.add(renderObject(DiagramNodeStart.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object tabIndex = diagramNodeStart.getTabIndex();
		renderedAttributes.add(renderNumber(DiagramNodeStart.TAB_INDEX, tabIndex));
	}

	protected void renderTransitions(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String transitions = diagramNodeStart.getTransitions();
		renderedAttributes.add(renderString(DiagramNodeStart.TRANSITIONS, transitions));
	}

	protected void renderType(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String type = diagramNodeStart.getType();
		renderedAttributes.add(renderString(DiagramNodeStart.TYPE, type));
	}

	protected void renderVisible(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Boolean visible = diagramNodeStart.getVisible();
		renderedAttributes.add(renderBoolean(DiagramNodeStart.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object width = diagramNodeStart.getWidth();
		renderedAttributes.add(renderNumber(DiagramNodeStart.WIDTH, width));
	}

	protected void renderX(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object x = diagramNodeStart.getX();
		renderedAttributes.add(renderNumber(DiagramNodeStart.X, x));
	}

	protected void renderXy(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object xy = diagramNodeStart.getXy();
		renderedAttributes.add(renderArray(DiagramNodeStart.XY, xy));
	}

	protected void renderY(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object y = diagramNodeStart.getY();
		renderedAttributes.add(renderNumber(DiagramNodeStart.Y, y));
	}

	protected void renderZIndex(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.Object zIndex = diagramNodeStart.getZIndex();
		renderedAttributes.add(renderNumber(DiagramNodeStart.Z_INDEX, zIndex));
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterAlignChange = diagramNodeStart.getAfterAlignChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_ALIGN_CHANGE, afterAlignChange));
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterAlignOnChange = diagramNodeStart.getAfterAlignOnChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterBodyContentChange = diagramNodeStart.getAfterBodyContentChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterBoundingBoxChange = diagramNodeStart.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterBuilderChange = diagramNodeStart.getAfterBuilderChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterCenteredChange = diagramNodeStart.getAfterCenteredChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_CENTERED_CHANGE, afterCenteredChange));
	}

	protected void renderAfterConnectorsChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterConnectorsChange = diagramNodeStart.getAfterConnectorsChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_CONNECTORS_CHANGE, afterConnectorsChange));
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterConstrainChange = diagramNodeStart.getAfterConstrainChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterContentBoxChange = diagramNodeStart.getAfterContentBoxChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterControlsToolbarChange = diagramNodeStart.getAfterControlsToolbarChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
	}

	protected void renderAfterDescriptionChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterDescriptionChange = diagramNodeStart.getAfterDescriptionChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_DESCRIPTION_CHANGE, afterDescriptionChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterDestroyedChange = diagramNodeStart.getAfterDestroyedChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterDisabledChange = diagramNodeStart.getAfterDisabledChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterFillHeightChange = diagramNodeStart.getAfterFillHeightChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterFocusedChange = diagramNodeStart.getAfterFocusedChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterFooterContentChange = diagramNodeStart.getAfterFooterContentChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterGraphicChange = diagramNodeStart.getAfterGraphicChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterHeaderContentChange = diagramNodeStart.getAfterHeaderContentChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterHeightChange = diagramNodeStart.getAfterHeightChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterHighlightBoundaryStrokeChange = diagramNodeStart.getAfterHighlightBoundaryStrokeChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, afterHighlightBoundaryStrokeChange));
	}

	protected void renderAfterHighlightedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterHighlightedChange = diagramNodeStart.getAfterHighlightedChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_HIGHLIGHTED_CHANGE, afterHighlightedChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterIdChange = diagramNodeStart.getAfterIdChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterInitializedChange = diagramNodeStart.getAfterInitializedChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterLocaleChange = diagramNodeStart.getAfterLocaleChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterNameChange = diagramNodeStart.getAfterNameChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterPreventOverlapChange = diagramNodeStart.getAfterPreventOverlapChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterRenderChange = diagramNodeStart.getAfterRenderChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterRenderedChange = diagramNodeStart.getAfterRenderedChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterRequiredChange = diagramNodeStart.getAfterRequiredChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterSelectedChange = diagramNodeStart.getAfterSelectedChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterShapeBoundaryChange = diagramNodeStart.getAfterShapeBoundaryChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_SHAPE_BOUNDARY_CHANGE, afterShapeBoundaryChange));
	}

	protected void renderAfterShapeInviteChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterShapeInviteChange = diagramNodeStart.getAfterShapeInviteChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_SHAPE_INVITE_CHANGE, afterShapeInviteChange));
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterShimChange = diagramNodeStart.getAfterShimChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_SHIM_CHANGE, afterShimChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterSrcNodeChange = diagramNodeStart.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterStringsChange = diagramNodeStart.getAfterStringsChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterTabIndexChange = diagramNodeStart.getAfterTabIndexChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTransitionsChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterTransitionsChange = diagramNodeStart.getAfterTransitionsChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_TRANSITIONS_CHANGE, afterTransitionsChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterTypeChange = diagramNodeStart.getAfterTypeChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterVisibleChange = diagramNodeStart.getAfterVisibleChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterWidthChange = diagramNodeStart.getAfterWidthChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterXChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterXChange = diagramNodeStart.getAfterXChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_XCHANGE, afterXChange));
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterXyChange = diagramNodeStart.getAfterXyChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_XY_CHANGE, afterXyChange));
	}

	protected void renderAfterYChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterYChange = diagramNodeStart.getAfterYChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_YCHANGE, afterYChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String afterZIndexChange = diagramNodeStart.getAfterZIndexChange();
		renderedAttributes.add(renderString(DiagramNodeStart.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onAlignChange = diagramNodeStart.getOnAlignChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_ALIGN_CHANGE, onAlignChange));
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onAlignOnChange = diagramNodeStart.getOnAlignOnChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_ALIGN_ON_CHANGE, onAlignOnChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onBodyContentChange = diagramNodeStart.getOnBodyContentChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onBoundingBoxChange = diagramNodeStart.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onBuilderChange = diagramNodeStart.getOnBuilderChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onCenteredChange = diagramNodeStart.getOnCenteredChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_CENTERED_CHANGE, onCenteredChange));
	}

	protected void renderOnConnectorsChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onConnectorsChange = diagramNodeStart.getOnConnectorsChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_CONNECTORS_CHANGE, onConnectorsChange));
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onConstrainChange = diagramNodeStart.getOnConstrainChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_CONSTRAIN_CHANGE, onConstrainChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onContentBoxChange = diagramNodeStart.getOnContentBoxChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onControlsToolbarChange = diagramNodeStart.getOnControlsToolbarChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
	}

	protected void renderOnDescriptionChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onDescriptionChange = diagramNodeStart.getOnDescriptionChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_DESCRIPTION_CHANGE, onDescriptionChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onDestroyedChange = diagramNodeStart.getOnDestroyedChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onDisabledChange = diagramNodeStart.getOnDisabledChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onFillHeightChange = diagramNodeStart.getOnFillHeightChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onFocusedChange = diagramNodeStart.getOnFocusedChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onFooterContentChange = diagramNodeStart.getOnFooterContentChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onGraphicChange = diagramNodeStart.getOnGraphicChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_GRAPHIC_CHANGE, onGraphicChange));
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onHeaderContentChange = diagramNodeStart.getOnHeaderContentChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onHeightChange = diagramNodeStart.getOnHeightChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onHighlightBoundaryStrokeChange = diagramNodeStart.getOnHighlightBoundaryStrokeChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, onHighlightBoundaryStrokeChange));
	}

	protected void renderOnHighlightedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onHighlightedChange = diagramNodeStart.getOnHighlightedChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_HIGHLIGHTED_CHANGE, onHighlightedChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onIdChange = diagramNodeStart.getOnIdChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onInitializedChange = diagramNodeStart.getOnInitializedChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onLocaleChange = diagramNodeStart.getOnLocaleChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onNameChange = diagramNodeStart.getOnNameChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onPreventOverlapChange = diagramNodeStart.getOnPreventOverlapChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onRenderChange = diagramNodeStart.getOnRenderChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onRenderedChange = diagramNodeStart.getOnRenderedChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onRequiredChange = diagramNodeStart.getOnRequiredChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onSelectedChange = diagramNodeStart.getOnSelectedChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onShapeBoundaryChange = diagramNodeStart.getOnShapeBoundaryChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_SHAPE_BOUNDARY_CHANGE, onShapeBoundaryChange));
	}

	protected void renderOnShapeInviteChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onShapeInviteChange = diagramNodeStart.getOnShapeInviteChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_SHAPE_INVITE_CHANGE, onShapeInviteChange));
	}

	protected void renderOnShimChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onShimChange = diagramNodeStart.getOnShimChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_SHIM_CHANGE, onShimChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onSrcNodeChange = diagramNodeStart.getOnSrcNodeChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onStringsChange = diagramNodeStart.getOnStringsChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onTabIndexChange = diagramNodeStart.getOnTabIndexChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTransitionsChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onTransitionsChange = diagramNodeStart.getOnTransitionsChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_TRANSITIONS_CHANGE, onTransitionsChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onTypeChange = diagramNodeStart.getOnTypeChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onVisibleChange = diagramNodeStart.getOnVisibleChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onWidthChange = diagramNodeStart.getOnWidthChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnXChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onXChange = diagramNodeStart.getOnXChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_XCHANGE, onXChange));
	}

	protected void renderOnXyChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onXyChange = diagramNodeStart.getOnXyChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_XY_CHANGE, onXyChange));
	}

	protected void renderOnYChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onYChange = diagramNodeStart.getOnYChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_YCHANGE, onYChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, DiagramNodeStart diagramNodeStart) throws IOException {
		java.lang.String onZIndexChange = diagramNodeStart.getOnZIndexChange();
		renderedAttributes.add(renderString(DiagramNodeStart.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}