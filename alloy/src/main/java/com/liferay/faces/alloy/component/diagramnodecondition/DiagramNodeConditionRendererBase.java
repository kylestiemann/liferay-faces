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
package com.liferay.faces.alloy.component.diagramnodecondition;

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
public abstract class DiagramNodeConditionRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DiagramNodeCondition diagramNodeCondition = (DiagramNodeCondition) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var diagramNodeCondition = new A.DiagramNodeCondition");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (diagramNodeCondition.getAlign() != null) {
			renderAlign(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAlignOn() != null) {
			renderAlignOn(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getDiagramNodeConditionBodyContent() != null) {
			renderDiagramNodeConditionBodyContent(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getBuilder() != null) {
			renderBuilder(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getCentered() != null) {
			renderCentered(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getConnectors() != null) {
			renderConnectors(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getConstrain() != null) {
			renderConstrain(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getContentBox() != null) {
			renderContentBox(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getControlsToolbar() != null) {
			renderControlsToolbar(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getDescription() != null) {
			renderDescription(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getDisabled() != null) {
			renderDisabled(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getFillHeight() != null) {
			renderFillHeight(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getFocused() != null) {
			renderFocused(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getFooterContent() != null) {
			renderFooterContent(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getGraphic() != null) {
			renderGraphic(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getHeaderContent() != null) {
			renderHeaderContent(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getHeight() != null) {
			renderHeight(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getHighlightBoundaryStroke() != null) {
			renderHighlightBoundaryStroke(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getHighlighted() != null) {
			renderHighlighted(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getDiagramNodeConditionId() != null) {
			renderDiagramNodeConditionId(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getInitialized() != null) {
			renderInitialized(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getDiagramNodeConditionLocale() != null) {
			renderDiagramNodeConditionLocale(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getName() != null) {
			renderName(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getPreventOverlap() != null) {
			renderPreventOverlap(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getRender() != null) {
			renderRender(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getRendered() != null) {
			renderRendered(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getRequired() != null) {
			renderRequired(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getSelected() != null) {
			renderSelected(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getShapeBoundary() != null) {
			renderShapeBoundary(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getShapeInvite() != null) {
			renderShapeInvite(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getShim() != null) {
			renderShim(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getStrings() != null) {
			renderStrings(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getTransitions() != null) {
			renderTransitions(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getType() != null) {
			renderType(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getVisible() != null) {
			renderVisible(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getWidth() != null) {
			renderWidth(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getX() != null) {
			renderX(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getXy() != null) {
			renderXy(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getY() != null) {
			renderY(renderedAttributes, diagramNodeCondition);
		}

		if (diagramNodeCondition.getZIndex() != null) {
			renderZIndex(renderedAttributes, diagramNodeCondition);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (diagramNodeCondition.getAfterAlignChange() != null) {
			renderAfterAlignChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterAlignOnChange() != null) {
			renderAfterAlignOnChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterCenteredChange() != null) {
			renderAfterCenteredChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterConnectorsChange() != null) {
			renderAfterConnectorsChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterConstrainChange() != null) {
			renderAfterConstrainChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterControlsToolbarChange() != null) {
			renderAfterControlsToolbarChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterDescriptionChange() != null) {
			renderAfterDescriptionChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterFillHeightChange() != null) {
			renderAfterFillHeightChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterFooterContentChange() != null) {
			renderAfterFooterContentChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterGraphicChange() != null) {
			renderAfterGraphicChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterHeaderContentChange() != null) {
			renderAfterHeaderContentChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterHighlightBoundaryStrokeChange() != null) {
			renderAfterHighlightBoundaryStrokeChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterHighlightedChange() != null) {
			renderAfterHighlightedChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterPreventOverlapChange() != null) {
			renderAfterPreventOverlapChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterShapeBoundaryChange() != null) {
			renderAfterShapeBoundaryChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterShapeInviteChange() != null) {
			renderAfterShapeInviteChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterShimChange() != null) {
			renderAfterShimChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterTransitionsChange() != null) {
			renderAfterTransitionsChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterXChange() != null) {
			renderAfterXChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterXyChange() != null) {
			renderAfterXyChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterYChange() != null) {
			renderAfterYChange(renderedAfterEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, diagramNodeCondition);
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

		if (diagramNodeCondition.getOnAlignChange() != null) {
			renderOnAlignChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnAlignOnChange() != null) {
			renderOnAlignOnChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnCenteredChange() != null) {
			renderOnCenteredChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnConnectorsChange() != null) {
			renderOnConnectorsChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnConstrainChange() != null) {
			renderOnConstrainChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnControlsToolbarChange() != null) {
			renderOnControlsToolbarChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnDescriptionChange() != null) {
			renderOnDescriptionChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnFillHeightChange() != null) {
			renderOnFillHeightChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnFooterContentChange() != null) {
			renderOnFooterContentChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnGraphicChange() != null) {
			renderOnGraphicChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnHeaderContentChange() != null) {
			renderOnHeaderContentChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnHighlightBoundaryStrokeChange() != null) {
			renderOnHighlightBoundaryStrokeChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnHighlightedChange() != null) {
			renderOnHighlightedChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnPreventOverlapChange() != null) {
			renderOnPreventOverlapChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnShapeBoundaryChange() != null) {
			renderOnShapeBoundaryChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnShapeInviteChange() != null) {
			renderOnShapeInviteChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnShimChange() != null) {
			renderOnShimChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnTransitionsChange() != null) {
			renderOnTransitionsChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnXChange() != null) {
			renderOnXChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnXyChange() != null) {
			renderOnXyChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnYChange() != null) {
			renderOnYChange(renderedOnEvents, diagramNodeCondition);
		}

		if (diagramNodeCondition.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, diagramNodeCondition);
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

	protected void renderAlign(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object align = diagramNodeCondition.getAlign();
		renderedAttributes.add(renderObject(DiagramNodeCondition.ALIGN, align));
	}

	protected void renderAlignOn(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object alignOn = diagramNodeCondition.getAlignOn();
		renderedAttributes.add(renderArray(DiagramNodeCondition.ALIGN_ON, alignOn));
	}

	protected void renderDiagramNodeConditionBodyContent(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object diagramNodeConditionBodyContent = diagramNodeCondition.getDiagramNodeConditionBodyContent();
		renderedAttributes.add(renderString(DiagramNodeCondition.DIAGRAM_NODE_CONDITION_BODY_CONTENT, diagramNodeConditionBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String boundingBox = diagramNodeCondition.getBoundingBox();
		renderedAttributes.add(renderString(DiagramNodeCondition.BOUNDING_BOX, boundingBox));
	}

	protected void renderBuilder(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object builder = diagramNodeCondition.getBuilder();
		renderedAttributes.add(renderString(DiagramNodeCondition.BUILDER, builder));
	}

	protected void renderCentered(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object centered = diagramNodeCondition.getCentered();
		renderedAttributes.add(renderString(DiagramNodeCondition.CENTERED, centered));
	}

	protected void renderConnectors(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String connectors = diagramNodeCondition.getConnectors();
		renderedAttributes.add(renderString(DiagramNodeCondition.CONNECTORS, connectors));
	}

	protected void renderConstrain(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object constrain = diagramNodeCondition.getConstrain();
		renderedAttributes.add(renderString(DiagramNodeCondition.CONSTRAIN, constrain));
	}

	protected void renderContentBox(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String contentBox = diagramNodeCondition.getContentBox();
		renderedAttributes.add(renderString(DiagramNodeCondition.CONTENT_BOX, contentBox));
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object controlsToolbar = diagramNodeCondition.getControlsToolbar();
		renderedAttributes.add(renderObject(DiagramNodeCondition.CONTROLS_TOOLBAR, controlsToolbar));
	}

	protected void renderDescription(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String description = diagramNodeCondition.getDescription();
		renderedAttributes.add(renderString(DiagramNodeCondition.DESCRIPTION, description));
	}

	protected void renderDestroyed(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean destroyed = diagramNodeCondition.getDestroyed();
		renderedAttributes.add(renderBoolean(DiagramNodeCondition.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean disabled = diagramNodeCondition.getDisabled();
		renderedAttributes.add(renderBoolean(DiagramNodeCondition.DISABLED, disabled));
	}

	protected void renderFillHeight(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object fillHeight = diagramNodeCondition.getFillHeight();
		renderedAttributes.add(renderString(DiagramNodeCondition.FILL_HEIGHT, fillHeight));
	}

	protected void renderFocused(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean focused = diagramNodeCondition.getFocused();
		renderedAttributes.add(renderBoolean(DiagramNodeCondition.FOCUSED, focused));
	}

	protected void renderFooterContent(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object footerContent = diagramNodeCondition.getFooterContent();
		renderedAttributes.add(renderString(DiagramNodeCondition.FOOTER_CONTENT, footerContent));
	}

	protected void renderGraphic(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object graphic = diagramNodeCondition.getGraphic();
		renderedAttributes.add(renderObject(DiagramNodeCondition.GRAPHIC, graphic));
	}

	protected void renderHeaderContent(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object headerContent = diagramNodeCondition.getHeaderContent();
		renderedAttributes.add(renderString(DiagramNodeCondition.HEADER_CONTENT, headerContent));
	}

	protected void renderHeight(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object height = diagramNodeCondition.getHeight();
		renderedAttributes.add(renderNumber(DiagramNodeCondition.HEIGHT, height));
	}

	protected void renderHighlightBoundaryStroke(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object highlightBoundaryStroke = diagramNodeCondition.getHighlightBoundaryStroke();
		renderedAttributes.add(renderObject(DiagramNodeCondition.HIGHLIGHT_BOUNDARY_STROKE, highlightBoundaryStroke));
	}

	protected void renderHighlighted(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean highlighted = diagramNodeCondition.getHighlighted();
		renderedAttributes.add(renderBoolean(DiagramNodeCondition.HIGHLIGHTED, highlighted));
	}

	protected void renderDiagramNodeConditionId(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String diagramNodeConditionId = diagramNodeCondition.getDiagramNodeConditionId();
		renderedAttributes.add(renderString(DiagramNodeCondition.DIAGRAM_NODE_CONDITION_ID, diagramNodeConditionId));
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean initialized = diagramNodeCondition.getInitialized();
		renderedAttributes.add(renderBoolean(DiagramNodeCondition.INITIALIZED, initialized));
	}

	protected void renderDiagramNodeConditionLocale(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String diagramNodeConditionLocale = diagramNodeCondition.getDiagramNodeConditionLocale();
		renderedAttributes.add(renderString(DiagramNodeCondition.DIAGRAM_NODE_CONDITION_LOCALE, diagramNodeConditionLocale));
	}

	protected void renderName(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String name = diagramNodeCondition.getName();
		renderedAttributes.add(renderString(DiagramNodeCondition.NAME, name));
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean preventOverlap = diagramNodeCondition.getPreventOverlap();
		renderedAttributes.add(renderBoolean(DiagramNodeCondition.PREVENT_OVERLAP, preventOverlap));
	}

	protected void renderRender(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object render = diagramNodeCondition.getRender();
		renderedAttributes.add(renderString(DiagramNodeCondition.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean rendered = diagramNodeCondition.getRendered();
		renderedAttributes.add(renderBoolean(DiagramNodeCondition.RENDERED, rendered));
	}

	protected void renderRequired(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean required = diagramNodeCondition.getRequired();
		renderedAttributes.add(renderBoolean(DiagramNodeCondition.REQUIRED, required));
	}

	protected void renderSelected(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean selected = diagramNodeCondition.getSelected();
		renderedAttributes.add(renderBoolean(DiagramNodeCondition.SELECTED, selected));
	}

	protected void renderShapeBoundary(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object shapeBoundary = diagramNodeCondition.getShapeBoundary();
		renderedAttributes.add(renderObject(DiagramNodeCondition.SHAPE_BOUNDARY, shapeBoundary));
	}

	protected void renderShapeInvite(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object shapeInvite = diagramNodeCondition.getShapeInvite();
		renderedAttributes.add(renderObject(DiagramNodeCondition.SHAPE_INVITE, shapeInvite));
	}

	protected void renderShim(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean shim = diagramNodeCondition.getShim();
		renderedAttributes.add(renderBoolean(DiagramNodeCondition.SHIM, shim));
	}

	protected void renderSrcNode(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String srcNode = diagramNodeCondition.getSrcNode();
		renderedAttributes.add(renderString(DiagramNodeCondition.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object strings = diagramNodeCondition.getStrings();
		renderedAttributes.add(renderObject(DiagramNodeCondition.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object tabIndex = diagramNodeCondition.getTabIndex();
		renderedAttributes.add(renderNumber(DiagramNodeCondition.TAB_INDEX, tabIndex));
	}

	protected void renderTransitions(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String transitions = diagramNodeCondition.getTransitions();
		renderedAttributes.add(renderString(DiagramNodeCondition.TRANSITIONS, transitions));
	}

	protected void renderType(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String type = diagramNodeCondition.getType();
		renderedAttributes.add(renderString(DiagramNodeCondition.TYPE, type));
	}

	protected void renderVisible(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Boolean visible = diagramNodeCondition.getVisible();
		renderedAttributes.add(renderBoolean(DiagramNodeCondition.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object width = diagramNodeCondition.getWidth();
		renderedAttributes.add(renderNumber(DiagramNodeCondition.WIDTH, width));
	}

	protected void renderX(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object x = diagramNodeCondition.getX();
		renderedAttributes.add(renderNumber(DiagramNodeCondition.X, x));
	}

	protected void renderXy(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object xy = diagramNodeCondition.getXy();
		renderedAttributes.add(renderArray(DiagramNodeCondition.XY, xy));
	}

	protected void renderY(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object y = diagramNodeCondition.getY();
		renderedAttributes.add(renderNumber(DiagramNodeCondition.Y, y));
	}

	protected void renderZIndex(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.Object zIndex = diagramNodeCondition.getZIndex();
		renderedAttributes.add(renderNumber(DiagramNodeCondition.Z_INDEX, zIndex));
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterAlignChange = diagramNodeCondition.getAfterAlignChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_ALIGN_CHANGE, afterAlignChange));
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterAlignOnChange = diagramNodeCondition.getAfterAlignOnChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterBodyContentChange = diagramNodeCondition.getAfterBodyContentChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterBoundingBoxChange = diagramNodeCondition.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterBuilderChange = diagramNodeCondition.getAfterBuilderChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterCenteredChange = diagramNodeCondition.getAfterCenteredChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_CENTERED_CHANGE, afterCenteredChange));
	}

	protected void renderAfterConnectorsChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterConnectorsChange = diagramNodeCondition.getAfterConnectorsChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_CONNECTORS_CHANGE, afterConnectorsChange));
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterConstrainChange = diagramNodeCondition.getAfterConstrainChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterContentBoxChange = diagramNodeCondition.getAfterContentBoxChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterControlsToolbarChange = diagramNodeCondition.getAfterControlsToolbarChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
	}

	protected void renderAfterDescriptionChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterDescriptionChange = diagramNodeCondition.getAfterDescriptionChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_DESCRIPTION_CHANGE, afterDescriptionChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterDestroyedChange = diagramNodeCondition.getAfterDestroyedChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterDisabledChange = diagramNodeCondition.getAfterDisabledChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterFillHeightChange = diagramNodeCondition.getAfterFillHeightChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterFocusedChange = diagramNodeCondition.getAfterFocusedChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterFooterContentChange = diagramNodeCondition.getAfterFooterContentChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterGraphicChange = diagramNodeCondition.getAfterGraphicChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterHeaderContentChange = diagramNodeCondition.getAfterHeaderContentChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterHeightChange = diagramNodeCondition.getAfterHeightChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterHighlightBoundaryStrokeChange = diagramNodeCondition.getAfterHighlightBoundaryStrokeChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, afterHighlightBoundaryStrokeChange));
	}

	protected void renderAfterHighlightedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterHighlightedChange = diagramNodeCondition.getAfterHighlightedChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_HIGHLIGHTED_CHANGE, afterHighlightedChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterIdChange = diagramNodeCondition.getAfterIdChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterInitializedChange = diagramNodeCondition.getAfterInitializedChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterLocaleChange = diagramNodeCondition.getAfterLocaleChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterNameChange = diagramNodeCondition.getAfterNameChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterPreventOverlapChange = diagramNodeCondition.getAfterPreventOverlapChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterRenderChange = diagramNodeCondition.getAfterRenderChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterRenderedChange = diagramNodeCondition.getAfterRenderedChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterRequiredChange = diagramNodeCondition.getAfterRequiredChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterSelectedChange = diagramNodeCondition.getAfterSelectedChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterShapeBoundaryChange = diagramNodeCondition.getAfterShapeBoundaryChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_SHAPE_BOUNDARY_CHANGE, afterShapeBoundaryChange));
	}

	protected void renderAfterShapeInviteChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterShapeInviteChange = diagramNodeCondition.getAfterShapeInviteChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_SHAPE_INVITE_CHANGE, afterShapeInviteChange));
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterShimChange = diagramNodeCondition.getAfterShimChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_SHIM_CHANGE, afterShimChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterSrcNodeChange = diagramNodeCondition.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterStringsChange = diagramNodeCondition.getAfterStringsChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterTabIndexChange = diagramNodeCondition.getAfterTabIndexChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTransitionsChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterTransitionsChange = diagramNodeCondition.getAfterTransitionsChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_TRANSITIONS_CHANGE, afterTransitionsChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterTypeChange = diagramNodeCondition.getAfterTypeChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterVisibleChange = diagramNodeCondition.getAfterVisibleChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterWidthChange = diagramNodeCondition.getAfterWidthChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterXChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterXChange = diagramNodeCondition.getAfterXChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_XCHANGE, afterXChange));
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterXyChange = diagramNodeCondition.getAfterXyChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_XY_CHANGE, afterXyChange));
	}

	protected void renderAfterYChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterYChange = diagramNodeCondition.getAfterYChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_YCHANGE, afterYChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String afterZIndexChange = diagramNodeCondition.getAfterZIndexChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onAlignChange = diagramNodeCondition.getOnAlignChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_ALIGN_CHANGE, onAlignChange));
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onAlignOnChange = diagramNodeCondition.getOnAlignOnChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_ALIGN_ON_CHANGE, onAlignOnChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onBodyContentChange = diagramNodeCondition.getOnBodyContentChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onBoundingBoxChange = diagramNodeCondition.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onBuilderChange = diagramNodeCondition.getOnBuilderChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onCenteredChange = diagramNodeCondition.getOnCenteredChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_CENTERED_CHANGE, onCenteredChange));
	}

	protected void renderOnConnectorsChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onConnectorsChange = diagramNodeCondition.getOnConnectorsChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_CONNECTORS_CHANGE, onConnectorsChange));
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onConstrainChange = diagramNodeCondition.getOnConstrainChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_CONSTRAIN_CHANGE, onConstrainChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onContentBoxChange = diagramNodeCondition.getOnContentBoxChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onControlsToolbarChange = diagramNodeCondition.getOnControlsToolbarChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
	}

	protected void renderOnDescriptionChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onDescriptionChange = diagramNodeCondition.getOnDescriptionChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_DESCRIPTION_CHANGE, onDescriptionChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onDestroyedChange = diagramNodeCondition.getOnDestroyedChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onDisabledChange = diagramNodeCondition.getOnDisabledChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onFillHeightChange = diagramNodeCondition.getOnFillHeightChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onFocusedChange = diagramNodeCondition.getOnFocusedChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onFooterContentChange = diagramNodeCondition.getOnFooterContentChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onGraphicChange = diagramNodeCondition.getOnGraphicChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_GRAPHIC_CHANGE, onGraphicChange));
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onHeaderContentChange = diagramNodeCondition.getOnHeaderContentChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onHeightChange = diagramNodeCondition.getOnHeightChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onHighlightBoundaryStrokeChange = diagramNodeCondition.getOnHighlightBoundaryStrokeChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, onHighlightBoundaryStrokeChange));
	}

	protected void renderOnHighlightedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onHighlightedChange = diagramNodeCondition.getOnHighlightedChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_HIGHLIGHTED_CHANGE, onHighlightedChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onIdChange = diagramNodeCondition.getOnIdChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onInitializedChange = diagramNodeCondition.getOnInitializedChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onLocaleChange = diagramNodeCondition.getOnLocaleChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onNameChange = diagramNodeCondition.getOnNameChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onPreventOverlapChange = diagramNodeCondition.getOnPreventOverlapChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onRenderChange = diagramNodeCondition.getOnRenderChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onRenderedChange = diagramNodeCondition.getOnRenderedChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onRequiredChange = diagramNodeCondition.getOnRequiredChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onSelectedChange = diagramNodeCondition.getOnSelectedChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onShapeBoundaryChange = diagramNodeCondition.getOnShapeBoundaryChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_SHAPE_BOUNDARY_CHANGE, onShapeBoundaryChange));
	}

	protected void renderOnShapeInviteChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onShapeInviteChange = diagramNodeCondition.getOnShapeInviteChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_SHAPE_INVITE_CHANGE, onShapeInviteChange));
	}

	protected void renderOnShimChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onShimChange = diagramNodeCondition.getOnShimChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_SHIM_CHANGE, onShimChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onSrcNodeChange = diagramNodeCondition.getOnSrcNodeChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onStringsChange = diagramNodeCondition.getOnStringsChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onTabIndexChange = diagramNodeCondition.getOnTabIndexChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTransitionsChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onTransitionsChange = diagramNodeCondition.getOnTransitionsChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_TRANSITIONS_CHANGE, onTransitionsChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onTypeChange = diagramNodeCondition.getOnTypeChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onVisibleChange = diagramNodeCondition.getOnVisibleChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onWidthChange = diagramNodeCondition.getOnWidthChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnXChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onXChange = diagramNodeCondition.getOnXChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_XCHANGE, onXChange));
	}

	protected void renderOnXyChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onXyChange = diagramNodeCondition.getOnXyChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_XY_CHANGE, onXyChange));
	}

	protected void renderOnYChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onYChange = diagramNodeCondition.getOnYChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_YCHANGE, onYChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, DiagramNodeCondition diagramNodeCondition) throws IOException {
		java.lang.String onZIndexChange = diagramNodeCondition.getOnZIndexChange();
		renderedAttributes.add(renderString(DiagramNodeCondition.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}