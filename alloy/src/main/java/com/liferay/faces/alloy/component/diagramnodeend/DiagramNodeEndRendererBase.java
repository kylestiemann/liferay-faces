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
public abstract class DiagramNodeEndRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DiagramNodeEnd diagramNodeEnd = (DiagramNodeEnd) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var diagramNodeEnd = new A.DiagramNodeEnd");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (diagramNodeEnd.getAlign() != null) {
			renderAlign(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAlignOn() != null) {
			renderAlignOn(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getDiagramNodeEndBodyContent() != null) {
			renderDiagramNodeEndBodyContent(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getBuilder() != null) {
			renderBuilder(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getCentered() != null) {
			renderCentered(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getConnectors() != null) {
			renderConnectors(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getConstrain() != null) {
			renderConstrain(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getContentBox() != null) {
			renderContentBox(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getControlsToolbar() != null) {
			renderControlsToolbar(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getDescription() != null) {
			renderDescription(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getDisabled() != null) {
			renderDisabled(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getFillHeight() != null) {
			renderFillHeight(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getFocused() != null) {
			renderFocused(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getFooterContent() != null) {
			renderFooterContent(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getGraphic() != null) {
			renderGraphic(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getHeaderContent() != null) {
			renderHeaderContent(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getHeight() != null) {
			renderHeight(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getHighlightBoundaryStroke() != null) {
			renderHighlightBoundaryStroke(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getHighlighted() != null) {
			renderHighlighted(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getDiagramNodeEndId() != null) {
			renderDiagramNodeEndId(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getInitialized() != null) {
			renderInitialized(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getDiagramNodeEndLocale() != null) {
			renderDiagramNodeEndLocale(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getName() != null) {
			renderName(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getPreventOverlap() != null) {
			renderPreventOverlap(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getRender() != null) {
			renderRender(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getRendered() != null) {
			renderRendered(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getRequired() != null) {
			renderRequired(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getSelected() != null) {
			renderSelected(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getShapeBoundary() != null) {
			renderShapeBoundary(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getShapeInvite() != null) {
			renderShapeInvite(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getShim() != null) {
			renderShim(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getStrings() != null) {
			renderStrings(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getTransitions() != null) {
			renderTransitions(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getType() != null) {
			renderType(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getVisible() != null) {
			renderVisible(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getWidth() != null) {
			renderWidth(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getX() != null) {
			renderX(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getXy() != null) {
			renderXy(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getY() != null) {
			renderY(renderedAttributes, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getZIndex() != null) {
			renderZIndex(renderedAttributes, diagramNodeEnd);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (diagramNodeEnd.getAfterAlignChange() != null) {
			renderAfterAlignChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterAlignOnChange() != null) {
			renderAfterAlignOnChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterCenteredChange() != null) {
			renderAfterCenteredChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterConnectorsChange() != null) {
			renderAfterConnectorsChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterConstrainChange() != null) {
			renderAfterConstrainChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterControlsToolbarChange() != null) {
			renderAfterControlsToolbarChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterDescriptionChange() != null) {
			renderAfterDescriptionChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterFillHeightChange() != null) {
			renderAfterFillHeightChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterFooterContentChange() != null) {
			renderAfterFooterContentChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterGraphicChange() != null) {
			renderAfterGraphicChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterHeaderContentChange() != null) {
			renderAfterHeaderContentChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterHighlightBoundaryStrokeChange() != null) {
			renderAfterHighlightBoundaryStrokeChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterHighlightedChange() != null) {
			renderAfterHighlightedChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterPreventOverlapChange() != null) {
			renderAfterPreventOverlapChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterShapeBoundaryChange() != null) {
			renderAfterShapeBoundaryChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterShapeInviteChange() != null) {
			renderAfterShapeInviteChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterShimChange() != null) {
			renderAfterShimChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterTransitionsChange() != null) {
			renderAfterTransitionsChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterXChange() != null) {
			renderAfterXChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterXyChange() != null) {
			renderAfterXyChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterYChange() != null) {
			renderAfterYChange(renderedAfterEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, diagramNodeEnd);
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

		if (diagramNodeEnd.getOnAlignChange() != null) {
			renderOnAlignChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnAlignOnChange() != null) {
			renderOnAlignOnChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnCenteredChange() != null) {
			renderOnCenteredChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnConnectorsChange() != null) {
			renderOnConnectorsChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnConstrainChange() != null) {
			renderOnConstrainChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnControlsToolbarChange() != null) {
			renderOnControlsToolbarChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnDescriptionChange() != null) {
			renderOnDescriptionChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnFillHeightChange() != null) {
			renderOnFillHeightChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnFooterContentChange() != null) {
			renderOnFooterContentChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnGraphicChange() != null) {
			renderOnGraphicChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnHeaderContentChange() != null) {
			renderOnHeaderContentChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnHighlightBoundaryStrokeChange() != null) {
			renderOnHighlightBoundaryStrokeChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnHighlightedChange() != null) {
			renderOnHighlightedChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnPreventOverlapChange() != null) {
			renderOnPreventOverlapChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnShapeBoundaryChange() != null) {
			renderOnShapeBoundaryChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnShapeInviteChange() != null) {
			renderOnShapeInviteChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnShimChange() != null) {
			renderOnShimChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnTransitionsChange() != null) {
			renderOnTransitionsChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnXChange() != null) {
			renderOnXChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnXyChange() != null) {
			renderOnXyChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnYChange() != null) {
			renderOnYChange(renderedOnEvents, diagramNodeEnd);
		}
		
		if (diagramNodeEnd.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, diagramNodeEnd);
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

	protected void renderAlign(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object align = diagramNodeEnd.getAlign();
		renderedAttributes.add(renderObject(DiagramNodeEnd.ALIGN, align));
	}

	protected void renderAlignOn(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object alignOn = diagramNodeEnd.getAlignOn();
		renderedAttributes.add(renderArray(DiagramNodeEnd.ALIGN_ON, alignOn));
	}

	protected void renderDiagramNodeEndBodyContent(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object diagramNodeEndBodyContent = diagramNodeEnd.getDiagramNodeEndBodyContent();
		renderedAttributes.add(renderString(DiagramNodeEnd.DIAGRAM_NODE_END_BODY_CONTENT, diagramNodeEndBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String boundingBox = diagramNodeEnd.getBoundingBox();
		renderedAttributes.add(renderString(DiagramNodeEnd.BOUNDING_BOX, boundingBox));
	}

	protected void renderBuilder(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object builder = diagramNodeEnd.getBuilder();
		renderedAttributes.add(renderString(DiagramNodeEnd.BUILDER, builder));
	}

	protected void renderCentered(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object centered = diagramNodeEnd.getCentered();
		renderedAttributes.add(renderString(DiagramNodeEnd.CENTERED, centered));
	}

	protected void renderConnectors(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String connectors = diagramNodeEnd.getConnectors();
		renderedAttributes.add(renderString(DiagramNodeEnd.CONNECTORS, connectors));
	}

	protected void renderConstrain(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object constrain = diagramNodeEnd.getConstrain();
		renderedAttributes.add(renderString(DiagramNodeEnd.CONSTRAIN, constrain));
	}

	protected void renderContentBox(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String contentBox = diagramNodeEnd.getContentBox();
		renderedAttributes.add(renderString(DiagramNodeEnd.CONTENT_BOX, contentBox));
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object controlsToolbar = diagramNodeEnd.getControlsToolbar();
		renderedAttributes.add(renderObject(DiagramNodeEnd.CONTROLS_TOOLBAR, controlsToolbar));
	}

	protected void renderDescription(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String description = diagramNodeEnd.getDescription();
		renderedAttributes.add(renderString(DiagramNodeEnd.DESCRIPTION, description));
	}

	protected void renderDestroyed(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean destroyed = diagramNodeEnd.getDestroyed();
		renderedAttributes.add(renderBoolean(DiagramNodeEnd.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean disabled = diagramNodeEnd.getDisabled();
		renderedAttributes.add(renderBoolean(DiagramNodeEnd.DISABLED, disabled));
	}

	protected void renderFillHeight(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object fillHeight = diagramNodeEnd.getFillHeight();
		renderedAttributes.add(renderString(DiagramNodeEnd.FILL_HEIGHT, fillHeight));
	}

	protected void renderFocused(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean focused = diagramNodeEnd.getFocused();
		renderedAttributes.add(renderBoolean(DiagramNodeEnd.FOCUSED, focused));
	}

	protected void renderFooterContent(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object footerContent = diagramNodeEnd.getFooterContent();
		renderedAttributes.add(renderString(DiagramNodeEnd.FOOTER_CONTENT, footerContent));
	}

	protected void renderGraphic(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object graphic = diagramNodeEnd.getGraphic();
		renderedAttributes.add(renderObject(DiagramNodeEnd.GRAPHIC, graphic));
	}

	protected void renderHeaderContent(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object headerContent = diagramNodeEnd.getHeaderContent();
		renderedAttributes.add(renderString(DiagramNodeEnd.HEADER_CONTENT, headerContent));
	}

	protected void renderHeight(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object height = diagramNodeEnd.getHeight();
		renderedAttributes.add(renderNumber(DiagramNodeEnd.HEIGHT, height));
	}

	protected void renderHighlightBoundaryStroke(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object highlightBoundaryStroke = diagramNodeEnd.getHighlightBoundaryStroke();
		renderedAttributes.add(renderObject(DiagramNodeEnd.HIGHLIGHT_BOUNDARY_STROKE, highlightBoundaryStroke));
	}

	protected void renderHighlighted(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean highlighted = diagramNodeEnd.getHighlighted();
		renderedAttributes.add(renderBoolean(DiagramNodeEnd.HIGHLIGHTED, highlighted));
	}

	protected void renderDiagramNodeEndId(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String diagramNodeEndId = diagramNodeEnd.getDiagramNodeEndId();
		renderedAttributes.add(renderString(DiagramNodeEnd.DIAGRAM_NODE_END_ID, diagramNodeEndId));
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean initialized = diagramNodeEnd.getInitialized();
		renderedAttributes.add(renderBoolean(DiagramNodeEnd.INITIALIZED, initialized));
	}

	protected void renderDiagramNodeEndLocale(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String diagramNodeEndLocale = diagramNodeEnd.getDiagramNodeEndLocale();
		renderedAttributes.add(renderString(DiagramNodeEnd.DIAGRAM_NODE_END_LOCALE, diagramNodeEndLocale));
	}

	protected void renderName(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String name = diagramNodeEnd.getName();
		renderedAttributes.add(renderString(DiagramNodeEnd.NAME, name));
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean preventOverlap = diagramNodeEnd.getPreventOverlap();
		renderedAttributes.add(renderBoolean(DiagramNodeEnd.PREVENT_OVERLAP, preventOverlap));
	}

	protected void renderRender(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object render = diagramNodeEnd.getRender();
		renderedAttributes.add(renderString(DiagramNodeEnd.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean rendered = diagramNodeEnd.getRendered();
		renderedAttributes.add(renderBoolean(DiagramNodeEnd.RENDERED, rendered));
	}

	protected void renderRequired(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean required = diagramNodeEnd.getRequired();
		renderedAttributes.add(renderBoolean(DiagramNodeEnd.REQUIRED, required));
	}

	protected void renderSelected(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean selected = diagramNodeEnd.getSelected();
		renderedAttributes.add(renderBoolean(DiagramNodeEnd.SELECTED, selected));
	}

	protected void renderShapeBoundary(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object shapeBoundary = diagramNodeEnd.getShapeBoundary();
		renderedAttributes.add(renderObject(DiagramNodeEnd.SHAPE_BOUNDARY, shapeBoundary));
	}

	protected void renderShapeInvite(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object shapeInvite = diagramNodeEnd.getShapeInvite();
		renderedAttributes.add(renderObject(DiagramNodeEnd.SHAPE_INVITE, shapeInvite));
	}

	protected void renderShim(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean shim = diagramNodeEnd.getShim();
		renderedAttributes.add(renderBoolean(DiagramNodeEnd.SHIM, shim));
	}

	protected void renderSrcNode(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String srcNode = diagramNodeEnd.getSrcNode();
		renderedAttributes.add(renderString(DiagramNodeEnd.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object strings = diagramNodeEnd.getStrings();
		renderedAttributes.add(renderObject(DiagramNodeEnd.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object tabIndex = diagramNodeEnd.getTabIndex();
		renderedAttributes.add(renderNumber(DiagramNodeEnd.TAB_INDEX, tabIndex));
	}

	protected void renderTransitions(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String transitions = diagramNodeEnd.getTransitions();
		renderedAttributes.add(renderString(DiagramNodeEnd.TRANSITIONS, transitions));
	}

	protected void renderType(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String type = diagramNodeEnd.getType();
		renderedAttributes.add(renderString(DiagramNodeEnd.TYPE, type));
	}

	protected void renderVisible(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Boolean visible = diagramNodeEnd.getVisible();
		renderedAttributes.add(renderBoolean(DiagramNodeEnd.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object width = diagramNodeEnd.getWidth();
		renderedAttributes.add(renderNumber(DiagramNodeEnd.WIDTH, width));
	}

	protected void renderX(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object x = diagramNodeEnd.getX();
		renderedAttributes.add(renderNumber(DiagramNodeEnd.X, x));
	}

	protected void renderXy(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object xy = diagramNodeEnd.getXy();
		renderedAttributes.add(renderArray(DiagramNodeEnd.XY, xy));
	}

	protected void renderY(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object y = diagramNodeEnd.getY();
		renderedAttributes.add(renderNumber(DiagramNodeEnd.Y, y));
	}

	protected void renderZIndex(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.Object zIndex = diagramNodeEnd.getZIndex();
		renderedAttributes.add(renderNumber(DiagramNodeEnd.Z_INDEX, zIndex));
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterAlignChange = diagramNodeEnd.getAfterAlignChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_ALIGN_CHANGE, afterAlignChange));
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterAlignOnChange = diagramNodeEnd.getAfterAlignOnChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterBodyContentChange = diagramNodeEnd.getAfterBodyContentChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterBoundingBoxChange = diagramNodeEnd.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterBuilderChange = diagramNodeEnd.getAfterBuilderChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterCenteredChange = diagramNodeEnd.getAfterCenteredChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_CENTERED_CHANGE, afterCenteredChange));
	}

	protected void renderAfterConnectorsChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterConnectorsChange = diagramNodeEnd.getAfterConnectorsChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_CONNECTORS_CHANGE, afterConnectorsChange));
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterConstrainChange = diagramNodeEnd.getAfterConstrainChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterContentBoxChange = diagramNodeEnd.getAfterContentBoxChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterControlsToolbarChange = diagramNodeEnd.getAfterControlsToolbarChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
	}

	protected void renderAfterDescriptionChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterDescriptionChange = diagramNodeEnd.getAfterDescriptionChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_DESCRIPTION_CHANGE, afterDescriptionChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterDestroyedChange = diagramNodeEnd.getAfterDestroyedChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterDisabledChange = diagramNodeEnd.getAfterDisabledChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterFillHeightChange = diagramNodeEnd.getAfterFillHeightChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterFocusedChange = diagramNodeEnd.getAfterFocusedChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterFooterContentChange = diagramNodeEnd.getAfterFooterContentChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterGraphicChange = diagramNodeEnd.getAfterGraphicChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterHeaderContentChange = diagramNodeEnd.getAfterHeaderContentChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterHeightChange = diagramNodeEnd.getAfterHeightChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterHighlightBoundaryStrokeChange = diagramNodeEnd.getAfterHighlightBoundaryStrokeChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, afterHighlightBoundaryStrokeChange));
	}

	protected void renderAfterHighlightedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterHighlightedChange = diagramNodeEnd.getAfterHighlightedChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_HIGHLIGHTED_CHANGE, afterHighlightedChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterIdChange = diagramNodeEnd.getAfterIdChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterInitializedChange = diagramNodeEnd.getAfterInitializedChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterLocaleChange = diagramNodeEnd.getAfterLocaleChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterNameChange = diagramNodeEnd.getAfterNameChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterPreventOverlapChange = diagramNodeEnd.getAfterPreventOverlapChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterRenderChange = diagramNodeEnd.getAfterRenderChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterRenderedChange = diagramNodeEnd.getAfterRenderedChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterRequiredChange = diagramNodeEnd.getAfterRequiredChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterSelectedChange = diagramNodeEnd.getAfterSelectedChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterShapeBoundaryChange = diagramNodeEnd.getAfterShapeBoundaryChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_SHAPE_BOUNDARY_CHANGE, afterShapeBoundaryChange));
	}

	protected void renderAfterShapeInviteChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterShapeInviteChange = diagramNodeEnd.getAfterShapeInviteChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_SHAPE_INVITE_CHANGE, afterShapeInviteChange));
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterShimChange = diagramNodeEnd.getAfterShimChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_SHIM_CHANGE, afterShimChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterSrcNodeChange = diagramNodeEnd.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterStringsChange = diagramNodeEnd.getAfterStringsChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterTabIndexChange = diagramNodeEnd.getAfterTabIndexChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTransitionsChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterTransitionsChange = diagramNodeEnd.getAfterTransitionsChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_TRANSITIONS_CHANGE, afterTransitionsChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterTypeChange = diagramNodeEnd.getAfterTypeChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterVisibleChange = diagramNodeEnd.getAfterVisibleChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterWidthChange = diagramNodeEnd.getAfterWidthChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterXChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterXChange = diagramNodeEnd.getAfterXChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_XCHANGE, afterXChange));
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterXyChange = diagramNodeEnd.getAfterXyChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_XY_CHANGE, afterXyChange));
	}

	protected void renderAfterYChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterYChange = diagramNodeEnd.getAfterYChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_YCHANGE, afterYChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String afterZIndexChange = diagramNodeEnd.getAfterZIndexChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onAlignChange = diagramNodeEnd.getOnAlignChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_ALIGN_CHANGE, onAlignChange));
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onAlignOnChange = diagramNodeEnd.getOnAlignOnChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_ALIGN_ON_CHANGE, onAlignOnChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onBodyContentChange = diagramNodeEnd.getOnBodyContentChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onBoundingBoxChange = diagramNodeEnd.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onBuilderChange = diagramNodeEnd.getOnBuilderChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onCenteredChange = diagramNodeEnd.getOnCenteredChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_CENTERED_CHANGE, onCenteredChange));
	}

	protected void renderOnConnectorsChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onConnectorsChange = diagramNodeEnd.getOnConnectorsChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_CONNECTORS_CHANGE, onConnectorsChange));
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onConstrainChange = diagramNodeEnd.getOnConstrainChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_CONSTRAIN_CHANGE, onConstrainChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onContentBoxChange = diagramNodeEnd.getOnContentBoxChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onControlsToolbarChange = diagramNodeEnd.getOnControlsToolbarChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
	}

	protected void renderOnDescriptionChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onDescriptionChange = diagramNodeEnd.getOnDescriptionChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_DESCRIPTION_CHANGE, onDescriptionChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onDestroyedChange = diagramNodeEnd.getOnDestroyedChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onDisabledChange = diagramNodeEnd.getOnDisabledChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onFillHeightChange = diagramNodeEnd.getOnFillHeightChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onFocusedChange = diagramNodeEnd.getOnFocusedChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onFooterContentChange = diagramNodeEnd.getOnFooterContentChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onGraphicChange = diagramNodeEnd.getOnGraphicChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_GRAPHIC_CHANGE, onGraphicChange));
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onHeaderContentChange = diagramNodeEnd.getOnHeaderContentChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onHeightChange = diagramNodeEnd.getOnHeightChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onHighlightBoundaryStrokeChange = diagramNodeEnd.getOnHighlightBoundaryStrokeChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, onHighlightBoundaryStrokeChange));
	}

	protected void renderOnHighlightedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onHighlightedChange = diagramNodeEnd.getOnHighlightedChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_HIGHLIGHTED_CHANGE, onHighlightedChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onIdChange = diagramNodeEnd.getOnIdChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onInitializedChange = diagramNodeEnd.getOnInitializedChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onLocaleChange = diagramNodeEnd.getOnLocaleChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onNameChange = diagramNodeEnd.getOnNameChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onPreventOverlapChange = diagramNodeEnd.getOnPreventOverlapChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onRenderChange = diagramNodeEnd.getOnRenderChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onRenderedChange = diagramNodeEnd.getOnRenderedChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onRequiredChange = diagramNodeEnd.getOnRequiredChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onSelectedChange = diagramNodeEnd.getOnSelectedChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onShapeBoundaryChange = diagramNodeEnd.getOnShapeBoundaryChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_SHAPE_BOUNDARY_CHANGE, onShapeBoundaryChange));
	}

	protected void renderOnShapeInviteChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onShapeInviteChange = diagramNodeEnd.getOnShapeInviteChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_SHAPE_INVITE_CHANGE, onShapeInviteChange));
	}

	protected void renderOnShimChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onShimChange = diagramNodeEnd.getOnShimChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_SHIM_CHANGE, onShimChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onSrcNodeChange = diagramNodeEnd.getOnSrcNodeChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onStringsChange = diagramNodeEnd.getOnStringsChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onTabIndexChange = diagramNodeEnd.getOnTabIndexChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTransitionsChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onTransitionsChange = diagramNodeEnd.getOnTransitionsChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_TRANSITIONS_CHANGE, onTransitionsChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onTypeChange = diagramNodeEnd.getOnTypeChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onVisibleChange = diagramNodeEnd.getOnVisibleChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onWidthChange = diagramNodeEnd.getOnWidthChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnXChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onXChange = diagramNodeEnd.getOnXChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_XCHANGE, onXChange));
	}

	protected void renderOnXyChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onXyChange = diagramNodeEnd.getOnXyChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_XY_CHANGE, onXyChange));
	}

	protected void renderOnYChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onYChange = diagramNodeEnd.getOnYChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_YCHANGE, onYChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, DiagramNodeEnd diagramNodeEnd) throws IOException {
		java.lang.String onZIndexChange = diagramNodeEnd.getOnZIndexChange();
		renderedAttributes.add(renderString(DiagramNodeEnd.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}