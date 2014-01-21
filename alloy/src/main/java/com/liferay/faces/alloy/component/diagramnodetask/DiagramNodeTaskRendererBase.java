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
package com.liferay.faces.alloy.component.diagramnodetask;

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
public abstract class DiagramNodeTaskRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DiagramNodeTask diagramNodeTask = (DiagramNodeTask) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var diagramNodeTask = new A.DiagramNodeTask");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (diagramNodeTask.getAlign() != null) {
			renderAlign(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getAlignOn() != null) {
			renderAlignOn(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getDiagramNodeTaskBodyContent() != null) {
			renderDiagramNodeTaskBodyContent(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getBuilder() != null) {
			renderBuilder(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getCentered() != null) {
			renderCentered(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getConnectors() != null) {
			renderConnectors(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getConstrain() != null) {
			renderConstrain(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getContentBox() != null) {
			renderContentBox(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getControlsToolbar() != null) {
			renderControlsToolbar(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getDescription() != null) {
			renderDescription(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getDisabled() != null) {
			renderDisabled(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getFillHeight() != null) {
			renderFillHeight(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getFocused() != null) {
			renderFocused(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getFooterContent() != null) {
			renderFooterContent(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getGraphic() != null) {
			renderGraphic(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getHeaderContent() != null) {
			renderHeaderContent(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getHeight() != null) {
			renderHeight(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getHighlightBoundaryStroke() != null) {
			renderHighlightBoundaryStroke(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getHighlighted() != null) {
			renderHighlighted(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getDiagramNodeTaskId() != null) {
			renderDiagramNodeTaskId(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getInitialized() != null) {
			renderInitialized(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getDiagramNodeTaskLocale() != null) {
			renderDiagramNodeTaskLocale(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getName() != null) {
			renderName(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getPreventOverlap() != null) {
			renderPreventOverlap(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getRender() != null) {
			renderRender(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getRendered() != null) {
			renderRendered(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getRequired() != null) {
			renderRequired(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getSelected() != null) {
			renderSelected(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getShapeBoundary() != null) {
			renderShapeBoundary(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getShapeInvite() != null) {
			renderShapeInvite(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getShim() != null) {
			renderShim(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getStrings() != null) {
			renderStrings(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getTransitions() != null) {
			renderTransitions(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getType() != null) {
			renderType(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getVisible() != null) {
			renderVisible(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getWidth() != null) {
			renderWidth(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getX() != null) {
			renderX(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getXy() != null) {
			renderXy(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getY() != null) {
			renderY(renderedAttributes, diagramNodeTask);
		}

		if (diagramNodeTask.getZIndex() != null) {
			renderZIndex(renderedAttributes, diagramNodeTask);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (diagramNodeTask.getAfterAlignChange() != null) {
			renderAfterAlignChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterAlignOnChange() != null) {
			renderAfterAlignOnChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterCenteredChange() != null) {
			renderAfterCenteredChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterConnectorsChange() != null) {
			renderAfterConnectorsChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterConstrainChange() != null) {
			renderAfterConstrainChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterControlsToolbarChange() != null) {
			renderAfterControlsToolbarChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterDescriptionChange() != null) {
			renderAfterDescriptionChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterFillHeightChange() != null) {
			renderAfterFillHeightChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterFooterContentChange() != null) {
			renderAfterFooterContentChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterGraphicChange() != null) {
			renderAfterGraphicChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterHeaderContentChange() != null) {
			renderAfterHeaderContentChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterHighlightBoundaryStrokeChange() != null) {
			renderAfterHighlightBoundaryStrokeChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterHighlightedChange() != null) {
			renderAfterHighlightedChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterPreventOverlapChange() != null) {
			renderAfterPreventOverlapChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterShapeBoundaryChange() != null) {
			renderAfterShapeBoundaryChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterShapeInviteChange() != null) {
			renderAfterShapeInviteChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterShimChange() != null) {
			renderAfterShimChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterTransitionsChange() != null) {
			renderAfterTransitionsChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterXChange() != null) {
			renderAfterXChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterXyChange() != null) {
			renderAfterXyChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterYChange() != null) {
			renderAfterYChange(renderedAfterEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, diagramNodeTask);
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

		if (diagramNodeTask.getOnAlignChange() != null) {
			renderOnAlignChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnAlignOnChange() != null) {
			renderOnAlignOnChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnCenteredChange() != null) {
			renderOnCenteredChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnConnectorsChange() != null) {
			renderOnConnectorsChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnConstrainChange() != null) {
			renderOnConstrainChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnControlsToolbarChange() != null) {
			renderOnControlsToolbarChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnDescriptionChange() != null) {
			renderOnDescriptionChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnFillHeightChange() != null) {
			renderOnFillHeightChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnFooterContentChange() != null) {
			renderOnFooterContentChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnGraphicChange() != null) {
			renderOnGraphicChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnHeaderContentChange() != null) {
			renderOnHeaderContentChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnHighlightBoundaryStrokeChange() != null) {
			renderOnHighlightBoundaryStrokeChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnHighlightedChange() != null) {
			renderOnHighlightedChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnPreventOverlapChange() != null) {
			renderOnPreventOverlapChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnShapeBoundaryChange() != null) {
			renderOnShapeBoundaryChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnShapeInviteChange() != null) {
			renderOnShapeInviteChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnShimChange() != null) {
			renderOnShimChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnTransitionsChange() != null) {
			renderOnTransitionsChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnXChange() != null) {
			renderOnXChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnXyChange() != null) {
			renderOnXyChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnYChange() != null) {
			renderOnYChange(renderedOnEvents, diagramNodeTask);
		}

		if (diagramNodeTask.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, diagramNodeTask);
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

	protected void renderAlign(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object align = diagramNodeTask.getAlign();
		renderedAttributes.add(renderObject(DiagramNodeTask.ALIGN, align));
	}

	protected void renderAlignOn(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object alignOn = diagramNodeTask.getAlignOn();
		renderedAttributes.add(renderArray(DiagramNodeTask.ALIGN_ON, alignOn));
	}

	protected void renderDiagramNodeTaskBodyContent(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object diagramNodeTaskBodyContent = diagramNodeTask.getDiagramNodeTaskBodyContent();
		renderedAttributes.add(renderString(DiagramNodeTask.DIAGRAM_NODE_TASK_BODY_CONTENT, diagramNodeTaskBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String boundingBox = diagramNodeTask.getBoundingBox();
		renderedAttributes.add(renderString(DiagramNodeTask.BOUNDING_BOX, boundingBox));
	}

	protected void renderBuilder(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object builder = diagramNodeTask.getBuilder();
		renderedAttributes.add(renderString(DiagramNodeTask.BUILDER, builder));
	}

	protected void renderCentered(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object centered = diagramNodeTask.getCentered();
		renderedAttributes.add(renderString(DiagramNodeTask.CENTERED, centered));
	}

	protected void renderConnectors(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String connectors = diagramNodeTask.getConnectors();
		renderedAttributes.add(renderString(DiagramNodeTask.CONNECTORS, connectors));
	}

	protected void renderConstrain(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object constrain = diagramNodeTask.getConstrain();
		renderedAttributes.add(renderString(DiagramNodeTask.CONSTRAIN, constrain));
	}

	protected void renderContentBox(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String contentBox = diagramNodeTask.getContentBox();
		renderedAttributes.add(renderString(DiagramNodeTask.CONTENT_BOX, contentBox));
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object controlsToolbar = diagramNodeTask.getControlsToolbar();
		renderedAttributes.add(renderObject(DiagramNodeTask.CONTROLS_TOOLBAR, controlsToolbar));
	}

	protected void renderDescription(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String description = diagramNodeTask.getDescription();
		renderedAttributes.add(renderString(DiagramNodeTask.DESCRIPTION, description));
	}

	protected void renderDestroyed(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean destroyed = diagramNodeTask.getDestroyed();
		renderedAttributes.add(renderBoolean(DiagramNodeTask.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean disabled = diagramNodeTask.getDisabled();
		renderedAttributes.add(renderBoolean(DiagramNodeTask.DISABLED, disabled));
	}

	protected void renderFillHeight(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object fillHeight = diagramNodeTask.getFillHeight();
		renderedAttributes.add(renderString(DiagramNodeTask.FILL_HEIGHT, fillHeight));
	}

	protected void renderFocused(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean focused = diagramNodeTask.getFocused();
		renderedAttributes.add(renderBoolean(DiagramNodeTask.FOCUSED, focused));
	}

	protected void renderFooterContent(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object footerContent = diagramNodeTask.getFooterContent();
		renderedAttributes.add(renderString(DiagramNodeTask.FOOTER_CONTENT, footerContent));
	}

	protected void renderGraphic(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object graphic = diagramNodeTask.getGraphic();
		renderedAttributes.add(renderObject(DiagramNodeTask.GRAPHIC, graphic));
	}

	protected void renderHeaderContent(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object headerContent = diagramNodeTask.getHeaderContent();
		renderedAttributes.add(renderString(DiagramNodeTask.HEADER_CONTENT, headerContent));
	}

	protected void renderHeight(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object height = diagramNodeTask.getHeight();
		renderedAttributes.add(renderNumber(DiagramNodeTask.HEIGHT, height));
	}

	protected void renderHighlightBoundaryStroke(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object highlightBoundaryStroke = diagramNodeTask.getHighlightBoundaryStroke();
		renderedAttributes.add(renderObject(DiagramNodeTask.HIGHLIGHT_BOUNDARY_STROKE, highlightBoundaryStroke));
	}

	protected void renderHighlighted(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean highlighted = diagramNodeTask.getHighlighted();
		renderedAttributes.add(renderBoolean(DiagramNodeTask.HIGHLIGHTED, highlighted));
	}

	protected void renderDiagramNodeTaskId(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String diagramNodeTaskId = diagramNodeTask.getDiagramNodeTaskId();
		renderedAttributes.add(renderString(DiagramNodeTask.DIAGRAM_NODE_TASK_ID, diagramNodeTaskId));
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean initialized = diagramNodeTask.getInitialized();
		renderedAttributes.add(renderBoolean(DiagramNodeTask.INITIALIZED, initialized));
	}

	protected void renderDiagramNodeTaskLocale(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String diagramNodeTaskLocale = diagramNodeTask.getDiagramNodeTaskLocale();
		renderedAttributes.add(renderString(DiagramNodeTask.DIAGRAM_NODE_TASK_LOCALE, diagramNodeTaskLocale));
	}

	protected void renderName(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String name = diagramNodeTask.getName();
		renderedAttributes.add(renderString(DiagramNodeTask.NAME, name));
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean preventOverlap = diagramNodeTask.getPreventOverlap();
		renderedAttributes.add(renderBoolean(DiagramNodeTask.PREVENT_OVERLAP, preventOverlap));
	}

	protected void renderRender(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object render = diagramNodeTask.getRender();
		renderedAttributes.add(renderString(DiagramNodeTask.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean rendered = diagramNodeTask.getRendered();
		renderedAttributes.add(renderBoolean(DiagramNodeTask.RENDERED, rendered));
	}

	protected void renderRequired(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean required = diagramNodeTask.getRequired();
		renderedAttributes.add(renderBoolean(DiagramNodeTask.REQUIRED, required));
	}

	protected void renderSelected(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean selected = diagramNodeTask.getSelected();
		renderedAttributes.add(renderBoolean(DiagramNodeTask.SELECTED, selected));
	}

	protected void renderShapeBoundary(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object shapeBoundary = diagramNodeTask.getShapeBoundary();
		renderedAttributes.add(renderObject(DiagramNodeTask.SHAPE_BOUNDARY, shapeBoundary));
	}

	protected void renderShapeInvite(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object shapeInvite = diagramNodeTask.getShapeInvite();
		renderedAttributes.add(renderObject(DiagramNodeTask.SHAPE_INVITE, shapeInvite));
	}

	protected void renderShim(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean shim = diagramNodeTask.getShim();
		renderedAttributes.add(renderBoolean(DiagramNodeTask.SHIM, shim));
	}

	protected void renderSrcNode(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String srcNode = diagramNodeTask.getSrcNode();
		renderedAttributes.add(renderString(DiagramNodeTask.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object strings = diagramNodeTask.getStrings();
		renderedAttributes.add(renderObject(DiagramNodeTask.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object tabIndex = diagramNodeTask.getTabIndex();
		renderedAttributes.add(renderNumber(DiagramNodeTask.TAB_INDEX, tabIndex));
	}

	protected void renderTransitions(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String transitions = diagramNodeTask.getTransitions();
		renderedAttributes.add(renderString(DiagramNodeTask.TRANSITIONS, transitions));
	}

	protected void renderType(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String type = diagramNodeTask.getType();
		renderedAttributes.add(renderString(DiagramNodeTask.TYPE, type));
	}

	protected void renderVisible(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Boolean visible = diagramNodeTask.getVisible();
		renderedAttributes.add(renderBoolean(DiagramNodeTask.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object width = diagramNodeTask.getWidth();
		renderedAttributes.add(renderNumber(DiagramNodeTask.WIDTH, width));
	}

	protected void renderX(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object x = diagramNodeTask.getX();
		renderedAttributes.add(renderNumber(DiagramNodeTask.X, x));
	}

	protected void renderXy(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object xy = diagramNodeTask.getXy();
		renderedAttributes.add(renderArray(DiagramNodeTask.XY, xy));
	}

	protected void renderY(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object y = diagramNodeTask.getY();
		renderedAttributes.add(renderNumber(DiagramNodeTask.Y, y));
	}

	protected void renderZIndex(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.Object zIndex = diagramNodeTask.getZIndex();
		renderedAttributes.add(renderNumber(DiagramNodeTask.Z_INDEX, zIndex));
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterAlignChange = diagramNodeTask.getAfterAlignChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_ALIGN_CHANGE, afterAlignChange));
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterAlignOnChange = diagramNodeTask.getAfterAlignOnChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterBodyContentChange = diagramNodeTask.getAfterBodyContentChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterBoundingBoxChange = diagramNodeTask.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterBuilderChange = diagramNodeTask.getAfterBuilderChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterCenteredChange = diagramNodeTask.getAfterCenteredChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_CENTERED_CHANGE, afterCenteredChange));
	}

	protected void renderAfterConnectorsChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterConnectorsChange = diagramNodeTask.getAfterConnectorsChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_CONNECTORS_CHANGE, afterConnectorsChange));
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterConstrainChange = diagramNodeTask.getAfterConstrainChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterContentBoxChange = diagramNodeTask.getAfterContentBoxChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterControlsToolbarChange = diagramNodeTask.getAfterControlsToolbarChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
	}

	protected void renderAfterDescriptionChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterDescriptionChange = diagramNodeTask.getAfterDescriptionChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_DESCRIPTION_CHANGE, afterDescriptionChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterDestroyedChange = diagramNodeTask.getAfterDestroyedChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterDisabledChange = diagramNodeTask.getAfterDisabledChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterFillHeightChange = diagramNodeTask.getAfterFillHeightChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterFocusedChange = diagramNodeTask.getAfterFocusedChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterFooterContentChange = diagramNodeTask.getAfterFooterContentChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterGraphicChange = diagramNodeTask.getAfterGraphicChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterHeaderContentChange = diagramNodeTask.getAfterHeaderContentChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterHeightChange = diagramNodeTask.getAfterHeightChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterHighlightBoundaryStrokeChange = diagramNodeTask.getAfterHighlightBoundaryStrokeChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, afterHighlightBoundaryStrokeChange));
	}

	protected void renderAfterHighlightedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterHighlightedChange = diagramNodeTask.getAfterHighlightedChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_HIGHLIGHTED_CHANGE, afterHighlightedChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterIdChange = diagramNodeTask.getAfterIdChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterInitializedChange = diagramNodeTask.getAfterInitializedChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterLocaleChange = diagramNodeTask.getAfterLocaleChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterNameChange = diagramNodeTask.getAfterNameChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterPreventOverlapChange = diagramNodeTask.getAfterPreventOverlapChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterRenderChange = diagramNodeTask.getAfterRenderChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterRenderedChange = diagramNodeTask.getAfterRenderedChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterRequiredChange = diagramNodeTask.getAfterRequiredChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterSelectedChange = diagramNodeTask.getAfterSelectedChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterShapeBoundaryChange = diagramNodeTask.getAfterShapeBoundaryChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_SHAPE_BOUNDARY_CHANGE, afterShapeBoundaryChange));
	}

	protected void renderAfterShapeInviteChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterShapeInviteChange = diagramNodeTask.getAfterShapeInviteChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_SHAPE_INVITE_CHANGE, afterShapeInviteChange));
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterShimChange = diagramNodeTask.getAfterShimChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_SHIM_CHANGE, afterShimChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterSrcNodeChange = diagramNodeTask.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterStringsChange = diagramNodeTask.getAfterStringsChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterTabIndexChange = diagramNodeTask.getAfterTabIndexChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTransitionsChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterTransitionsChange = diagramNodeTask.getAfterTransitionsChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_TRANSITIONS_CHANGE, afterTransitionsChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterTypeChange = diagramNodeTask.getAfterTypeChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterVisibleChange = diagramNodeTask.getAfterVisibleChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterWidthChange = diagramNodeTask.getAfterWidthChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterXChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterXChange = diagramNodeTask.getAfterXChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_XCHANGE, afterXChange));
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterXyChange = diagramNodeTask.getAfterXyChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_XY_CHANGE, afterXyChange));
	}

	protected void renderAfterYChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterYChange = diagramNodeTask.getAfterYChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_YCHANGE, afterYChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String afterZIndexChange = diagramNodeTask.getAfterZIndexChange();
		renderedAttributes.add(renderString(DiagramNodeTask.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onAlignChange = diagramNodeTask.getOnAlignChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_ALIGN_CHANGE, onAlignChange));
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onAlignOnChange = diagramNodeTask.getOnAlignOnChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_ALIGN_ON_CHANGE, onAlignOnChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onBodyContentChange = diagramNodeTask.getOnBodyContentChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onBoundingBoxChange = diagramNodeTask.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onBuilderChange = diagramNodeTask.getOnBuilderChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onCenteredChange = diagramNodeTask.getOnCenteredChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_CENTERED_CHANGE, onCenteredChange));
	}

	protected void renderOnConnectorsChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onConnectorsChange = diagramNodeTask.getOnConnectorsChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_CONNECTORS_CHANGE, onConnectorsChange));
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onConstrainChange = diagramNodeTask.getOnConstrainChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_CONSTRAIN_CHANGE, onConstrainChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onContentBoxChange = diagramNodeTask.getOnContentBoxChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onControlsToolbarChange = diagramNodeTask.getOnControlsToolbarChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
	}

	protected void renderOnDescriptionChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onDescriptionChange = diagramNodeTask.getOnDescriptionChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_DESCRIPTION_CHANGE, onDescriptionChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onDestroyedChange = diagramNodeTask.getOnDestroyedChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onDisabledChange = diagramNodeTask.getOnDisabledChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onFillHeightChange = diagramNodeTask.getOnFillHeightChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onFocusedChange = diagramNodeTask.getOnFocusedChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onFooterContentChange = diagramNodeTask.getOnFooterContentChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onGraphicChange = diagramNodeTask.getOnGraphicChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_GRAPHIC_CHANGE, onGraphicChange));
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onHeaderContentChange = diagramNodeTask.getOnHeaderContentChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onHeightChange = diagramNodeTask.getOnHeightChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onHighlightBoundaryStrokeChange = diagramNodeTask.getOnHighlightBoundaryStrokeChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, onHighlightBoundaryStrokeChange));
	}

	protected void renderOnHighlightedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onHighlightedChange = diagramNodeTask.getOnHighlightedChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_HIGHLIGHTED_CHANGE, onHighlightedChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onIdChange = diagramNodeTask.getOnIdChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onInitializedChange = diagramNodeTask.getOnInitializedChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onLocaleChange = diagramNodeTask.getOnLocaleChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onNameChange = diagramNodeTask.getOnNameChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onPreventOverlapChange = diagramNodeTask.getOnPreventOverlapChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onRenderChange = diagramNodeTask.getOnRenderChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onRenderedChange = diagramNodeTask.getOnRenderedChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onRequiredChange = diagramNodeTask.getOnRequiredChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onSelectedChange = diagramNodeTask.getOnSelectedChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onShapeBoundaryChange = diagramNodeTask.getOnShapeBoundaryChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_SHAPE_BOUNDARY_CHANGE, onShapeBoundaryChange));
	}

	protected void renderOnShapeInviteChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onShapeInviteChange = diagramNodeTask.getOnShapeInviteChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_SHAPE_INVITE_CHANGE, onShapeInviteChange));
	}

	protected void renderOnShimChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onShimChange = diagramNodeTask.getOnShimChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_SHIM_CHANGE, onShimChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onSrcNodeChange = diagramNodeTask.getOnSrcNodeChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onStringsChange = diagramNodeTask.getOnStringsChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onTabIndexChange = diagramNodeTask.getOnTabIndexChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTransitionsChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onTransitionsChange = diagramNodeTask.getOnTransitionsChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_TRANSITIONS_CHANGE, onTransitionsChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onTypeChange = diagramNodeTask.getOnTypeChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onVisibleChange = diagramNodeTask.getOnVisibleChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onWidthChange = diagramNodeTask.getOnWidthChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnXChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onXChange = diagramNodeTask.getOnXChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_XCHANGE, onXChange));
	}

	protected void renderOnXyChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onXyChange = diagramNodeTask.getOnXyChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_XY_CHANGE, onXyChange));
	}

	protected void renderOnYChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onYChange = diagramNodeTask.getOnYChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_YCHANGE, onYChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, DiagramNodeTask diagramNodeTask) throws IOException {
		java.lang.String onZIndexChange = diagramNodeTask.getOnZIndexChange();
		renderedAttributes.add(renderString(DiagramNodeTask.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}