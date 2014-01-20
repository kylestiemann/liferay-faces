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
public abstract class DiagramNodeForkRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DiagramNodeFork diagramNodeFork = (DiagramNodeFork) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var diagramNodeFork = new A.DiagramNodeFork");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (diagramNodeFork.getAlign() != null) {
			renderAlign(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAlignOn() != null) {
			renderAlignOn(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getDiagramNodeForkBodyContent() != null) {
			renderDiagramNodeForkBodyContent(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getBuilder() != null) {
			renderBuilder(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getCentered() != null) {
			renderCentered(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getConnectors() != null) {
			renderConnectors(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getConstrain() != null) {
			renderConstrain(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getContentBox() != null) {
			renderContentBox(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getControlsToolbar() != null) {
			renderControlsToolbar(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getDescription() != null) {
			renderDescription(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getDisabled() != null) {
			renderDisabled(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getFillHeight() != null) {
			renderFillHeight(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getFocused() != null) {
			renderFocused(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getFooterContent() != null) {
			renderFooterContent(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getGraphic() != null) {
			renderGraphic(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getHeaderContent() != null) {
			renderHeaderContent(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getHeight() != null) {
			renderHeight(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getHighlightBoundaryStroke() != null) {
			renderHighlightBoundaryStroke(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getHighlighted() != null) {
			renderHighlighted(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getDiagramNodeForkId() != null) {
			renderDiagramNodeForkId(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getInitialized() != null) {
			renderInitialized(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getDiagramNodeForkLocale() != null) {
			renderDiagramNodeForkLocale(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getName() != null) {
			renderName(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getPreventOverlap() != null) {
			renderPreventOverlap(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getRender() != null) {
			renderRender(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getRendered() != null) {
			renderRendered(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getRequired() != null) {
			renderRequired(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getSelected() != null) {
			renderSelected(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getShapeBoundary() != null) {
			renderShapeBoundary(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getShapeInvite() != null) {
			renderShapeInvite(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getShim() != null) {
			renderShim(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getStrings() != null) {
			renderStrings(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getTransitions() != null) {
			renderTransitions(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getType() != null) {
			renderType(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getVisible() != null) {
			renderVisible(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getWidth() != null) {
			renderWidth(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getX() != null) {
			renderX(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getXy() != null) {
			renderXy(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getY() != null) {
			renderY(renderedAttributes, diagramNodeFork);
		}
		
		if (diagramNodeFork.getZIndex() != null) {
			renderZIndex(renderedAttributes, diagramNodeFork);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (diagramNodeFork.getAfterAlignChange() != null) {
			renderAfterAlignChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterAlignOnChange() != null) {
			renderAfterAlignOnChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterCenteredChange() != null) {
			renderAfterCenteredChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterConnectorsChange() != null) {
			renderAfterConnectorsChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterConstrainChange() != null) {
			renderAfterConstrainChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterControlsToolbarChange() != null) {
			renderAfterControlsToolbarChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterDescriptionChange() != null) {
			renderAfterDescriptionChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterFillHeightChange() != null) {
			renderAfterFillHeightChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterFooterContentChange() != null) {
			renderAfterFooterContentChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterGraphicChange() != null) {
			renderAfterGraphicChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterHeaderContentChange() != null) {
			renderAfterHeaderContentChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterHighlightBoundaryStrokeChange() != null) {
			renderAfterHighlightBoundaryStrokeChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterHighlightedChange() != null) {
			renderAfterHighlightedChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterPreventOverlapChange() != null) {
			renderAfterPreventOverlapChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterShapeBoundaryChange() != null) {
			renderAfterShapeBoundaryChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterShapeInviteChange() != null) {
			renderAfterShapeInviteChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterShimChange() != null) {
			renderAfterShimChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterTransitionsChange() != null) {
			renderAfterTransitionsChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterXChange() != null) {
			renderAfterXChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterXyChange() != null) {
			renderAfterXyChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterYChange() != null) {
			renderAfterYChange(renderedAfterEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, diagramNodeFork);
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

		if (diagramNodeFork.getOnAlignChange() != null) {
			renderOnAlignChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnAlignOnChange() != null) {
			renderOnAlignOnChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnCenteredChange() != null) {
			renderOnCenteredChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnConnectorsChange() != null) {
			renderOnConnectorsChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnConstrainChange() != null) {
			renderOnConstrainChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnControlsToolbarChange() != null) {
			renderOnControlsToolbarChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnDescriptionChange() != null) {
			renderOnDescriptionChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnFillHeightChange() != null) {
			renderOnFillHeightChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnFooterContentChange() != null) {
			renderOnFooterContentChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnGraphicChange() != null) {
			renderOnGraphicChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnHeaderContentChange() != null) {
			renderOnHeaderContentChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnHighlightBoundaryStrokeChange() != null) {
			renderOnHighlightBoundaryStrokeChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnHighlightedChange() != null) {
			renderOnHighlightedChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnPreventOverlapChange() != null) {
			renderOnPreventOverlapChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnShapeBoundaryChange() != null) {
			renderOnShapeBoundaryChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnShapeInviteChange() != null) {
			renderOnShapeInviteChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnShimChange() != null) {
			renderOnShimChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnTransitionsChange() != null) {
			renderOnTransitionsChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnXChange() != null) {
			renderOnXChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnXyChange() != null) {
			renderOnXyChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnYChange() != null) {
			renderOnYChange(renderedOnEvents, diagramNodeFork);
		}
		
		if (diagramNodeFork.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, diagramNodeFork);
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

	protected void renderAlign(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object align = diagramNodeFork.getAlign();
		renderedAttributes.add(renderObject(DiagramNodeFork.ALIGN, align));
	}

	protected void renderAlignOn(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object alignOn = diagramNodeFork.getAlignOn();
		renderedAttributes.add(renderArray(DiagramNodeFork.ALIGN_ON, alignOn));
	}

	protected void renderDiagramNodeForkBodyContent(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object diagramNodeForkBodyContent = diagramNodeFork.getDiagramNodeForkBodyContent();
		renderedAttributes.add(renderString(DiagramNodeFork.DIAGRAM_NODE_FORK_BODY_CONTENT, diagramNodeForkBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String boundingBox = diagramNodeFork.getBoundingBox();
		renderedAttributes.add(renderString(DiagramNodeFork.BOUNDING_BOX, boundingBox));
	}

	protected void renderBuilder(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object builder = diagramNodeFork.getBuilder();
		renderedAttributes.add(renderString(DiagramNodeFork.BUILDER, builder));
	}

	protected void renderCentered(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object centered = diagramNodeFork.getCentered();
		renderedAttributes.add(renderString(DiagramNodeFork.CENTERED, centered));
	}

	protected void renderConnectors(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String connectors = diagramNodeFork.getConnectors();
		renderedAttributes.add(renderString(DiagramNodeFork.CONNECTORS, connectors));
	}

	protected void renderConstrain(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object constrain = diagramNodeFork.getConstrain();
		renderedAttributes.add(renderString(DiagramNodeFork.CONSTRAIN, constrain));
	}

	protected void renderContentBox(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String contentBox = diagramNodeFork.getContentBox();
		renderedAttributes.add(renderString(DiagramNodeFork.CONTENT_BOX, contentBox));
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object controlsToolbar = diagramNodeFork.getControlsToolbar();
		renderedAttributes.add(renderObject(DiagramNodeFork.CONTROLS_TOOLBAR, controlsToolbar));
	}

	protected void renderDescription(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String description = diagramNodeFork.getDescription();
		renderedAttributes.add(renderString(DiagramNodeFork.DESCRIPTION, description));
	}

	protected void renderDestroyed(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean destroyed = diagramNodeFork.getDestroyed();
		renderedAttributes.add(renderBoolean(DiagramNodeFork.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean disabled = diagramNodeFork.getDisabled();
		renderedAttributes.add(renderBoolean(DiagramNodeFork.DISABLED, disabled));
	}

	protected void renderFillHeight(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object fillHeight = diagramNodeFork.getFillHeight();
		renderedAttributes.add(renderString(DiagramNodeFork.FILL_HEIGHT, fillHeight));
	}

	protected void renderFocused(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean focused = diagramNodeFork.getFocused();
		renderedAttributes.add(renderBoolean(DiagramNodeFork.FOCUSED, focused));
	}

	protected void renderFooterContent(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object footerContent = diagramNodeFork.getFooterContent();
		renderedAttributes.add(renderString(DiagramNodeFork.FOOTER_CONTENT, footerContent));
	}

	protected void renderGraphic(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object graphic = diagramNodeFork.getGraphic();
		renderedAttributes.add(renderObject(DiagramNodeFork.GRAPHIC, graphic));
	}

	protected void renderHeaderContent(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object headerContent = diagramNodeFork.getHeaderContent();
		renderedAttributes.add(renderString(DiagramNodeFork.HEADER_CONTENT, headerContent));
	}

	protected void renderHeight(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object height = diagramNodeFork.getHeight();
		renderedAttributes.add(renderNumber(DiagramNodeFork.HEIGHT, height));
	}

	protected void renderHighlightBoundaryStroke(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object highlightBoundaryStroke = diagramNodeFork.getHighlightBoundaryStroke();
		renderedAttributes.add(renderObject(DiagramNodeFork.HIGHLIGHT_BOUNDARY_STROKE, highlightBoundaryStroke));
	}

	protected void renderHighlighted(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean highlighted = diagramNodeFork.getHighlighted();
		renderedAttributes.add(renderBoolean(DiagramNodeFork.HIGHLIGHTED, highlighted));
	}

	protected void renderDiagramNodeForkId(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String diagramNodeForkId = diagramNodeFork.getDiagramNodeForkId();
		renderedAttributes.add(renderString(DiagramNodeFork.DIAGRAM_NODE_FORK_ID, diagramNodeForkId));
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean initialized = diagramNodeFork.getInitialized();
		renderedAttributes.add(renderBoolean(DiagramNodeFork.INITIALIZED, initialized));
	}

	protected void renderDiagramNodeForkLocale(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String diagramNodeForkLocale = diagramNodeFork.getDiagramNodeForkLocale();
		renderedAttributes.add(renderString(DiagramNodeFork.DIAGRAM_NODE_FORK_LOCALE, diagramNodeForkLocale));
	}

	protected void renderName(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String name = diagramNodeFork.getName();
		renderedAttributes.add(renderString(DiagramNodeFork.NAME, name));
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean preventOverlap = diagramNodeFork.getPreventOverlap();
		renderedAttributes.add(renderBoolean(DiagramNodeFork.PREVENT_OVERLAP, preventOverlap));
	}

	protected void renderRender(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object render = diagramNodeFork.getRender();
		renderedAttributes.add(renderString(DiagramNodeFork.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean rendered = diagramNodeFork.getRendered();
		renderedAttributes.add(renderBoolean(DiagramNodeFork.RENDERED, rendered));
	}

	protected void renderRequired(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean required = diagramNodeFork.getRequired();
		renderedAttributes.add(renderBoolean(DiagramNodeFork.REQUIRED, required));
	}

	protected void renderSelected(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean selected = diagramNodeFork.getSelected();
		renderedAttributes.add(renderBoolean(DiagramNodeFork.SELECTED, selected));
	}

	protected void renderShapeBoundary(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object shapeBoundary = diagramNodeFork.getShapeBoundary();
		renderedAttributes.add(renderObject(DiagramNodeFork.SHAPE_BOUNDARY, shapeBoundary));
	}

	protected void renderShapeInvite(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object shapeInvite = diagramNodeFork.getShapeInvite();
		renderedAttributes.add(renderObject(DiagramNodeFork.SHAPE_INVITE, shapeInvite));
	}

	protected void renderShim(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean shim = diagramNodeFork.getShim();
		renderedAttributes.add(renderBoolean(DiagramNodeFork.SHIM, shim));
	}

	protected void renderSrcNode(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String srcNode = diagramNodeFork.getSrcNode();
		renderedAttributes.add(renderString(DiagramNodeFork.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object strings = diagramNodeFork.getStrings();
		renderedAttributes.add(renderObject(DiagramNodeFork.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object tabIndex = diagramNodeFork.getTabIndex();
		renderedAttributes.add(renderNumber(DiagramNodeFork.TAB_INDEX, tabIndex));
	}

	protected void renderTransitions(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String transitions = diagramNodeFork.getTransitions();
		renderedAttributes.add(renderString(DiagramNodeFork.TRANSITIONS, transitions));
	}

	protected void renderType(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String type = diagramNodeFork.getType();
		renderedAttributes.add(renderString(DiagramNodeFork.TYPE, type));
	}

	protected void renderVisible(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Boolean visible = diagramNodeFork.getVisible();
		renderedAttributes.add(renderBoolean(DiagramNodeFork.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object width = diagramNodeFork.getWidth();
		renderedAttributes.add(renderNumber(DiagramNodeFork.WIDTH, width));
	}

	protected void renderX(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object x = diagramNodeFork.getX();
		renderedAttributes.add(renderNumber(DiagramNodeFork.X, x));
	}

	protected void renderXy(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object xy = diagramNodeFork.getXy();
		renderedAttributes.add(renderArray(DiagramNodeFork.XY, xy));
	}

	protected void renderY(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object y = diagramNodeFork.getY();
		renderedAttributes.add(renderNumber(DiagramNodeFork.Y, y));
	}

	protected void renderZIndex(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.Object zIndex = diagramNodeFork.getZIndex();
		renderedAttributes.add(renderNumber(DiagramNodeFork.Z_INDEX, zIndex));
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterAlignChange = diagramNodeFork.getAfterAlignChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_ALIGN_CHANGE, afterAlignChange));
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterAlignOnChange = diagramNodeFork.getAfterAlignOnChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterBodyContentChange = diagramNodeFork.getAfterBodyContentChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterBoundingBoxChange = diagramNodeFork.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterBuilderChange = diagramNodeFork.getAfterBuilderChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterCenteredChange = diagramNodeFork.getAfterCenteredChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_CENTERED_CHANGE, afterCenteredChange));
	}

	protected void renderAfterConnectorsChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterConnectorsChange = diagramNodeFork.getAfterConnectorsChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_CONNECTORS_CHANGE, afterConnectorsChange));
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterConstrainChange = diagramNodeFork.getAfterConstrainChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterContentBoxChange = diagramNodeFork.getAfterContentBoxChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterControlsToolbarChange = diagramNodeFork.getAfterControlsToolbarChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
	}

	protected void renderAfterDescriptionChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterDescriptionChange = diagramNodeFork.getAfterDescriptionChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_DESCRIPTION_CHANGE, afterDescriptionChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterDestroyedChange = diagramNodeFork.getAfterDestroyedChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterDisabledChange = diagramNodeFork.getAfterDisabledChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterFillHeightChange = diagramNodeFork.getAfterFillHeightChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterFocusedChange = diagramNodeFork.getAfterFocusedChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterFooterContentChange = diagramNodeFork.getAfterFooterContentChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
	}

	protected void renderAfterGraphicChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterGraphicChange = diagramNodeFork.getAfterGraphicChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_GRAPHIC_CHANGE, afterGraphicChange));
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterHeaderContentChange = diagramNodeFork.getAfterHeaderContentChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterHeightChange = diagramNodeFork.getAfterHeightChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterHighlightBoundaryStrokeChange = diagramNodeFork.getAfterHighlightBoundaryStrokeChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, afterHighlightBoundaryStrokeChange));
	}

	protected void renderAfterHighlightedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterHighlightedChange = diagramNodeFork.getAfterHighlightedChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_HIGHLIGHTED_CHANGE, afterHighlightedChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterIdChange = diagramNodeFork.getAfterIdChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterInitializedChange = diagramNodeFork.getAfterInitializedChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterLocaleChange = diagramNodeFork.getAfterLocaleChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterNameChange = diagramNodeFork.getAfterNameChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterPreventOverlapChange = diagramNodeFork.getAfterPreventOverlapChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterRenderChange = diagramNodeFork.getAfterRenderChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterRenderedChange = diagramNodeFork.getAfterRenderedChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterRequiredChange = diagramNodeFork.getAfterRequiredChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterSelectedChange = diagramNodeFork.getAfterSelectedChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterShapeBoundaryChange = diagramNodeFork.getAfterShapeBoundaryChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_SHAPE_BOUNDARY_CHANGE, afterShapeBoundaryChange));
	}

	protected void renderAfterShapeInviteChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterShapeInviteChange = diagramNodeFork.getAfterShapeInviteChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_SHAPE_INVITE_CHANGE, afterShapeInviteChange));
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterShimChange = diagramNodeFork.getAfterShimChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_SHIM_CHANGE, afterShimChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterSrcNodeChange = diagramNodeFork.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterStringsChange = diagramNodeFork.getAfterStringsChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterTabIndexChange = diagramNodeFork.getAfterTabIndexChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTransitionsChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterTransitionsChange = diagramNodeFork.getAfterTransitionsChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_TRANSITIONS_CHANGE, afterTransitionsChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterTypeChange = diagramNodeFork.getAfterTypeChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterVisibleChange = diagramNodeFork.getAfterVisibleChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterWidthChange = diagramNodeFork.getAfterWidthChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterXChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterXChange = diagramNodeFork.getAfterXChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_XCHANGE, afterXChange));
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterXyChange = diagramNodeFork.getAfterXyChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_XY_CHANGE, afterXyChange));
	}

	protected void renderAfterYChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterYChange = diagramNodeFork.getAfterYChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_YCHANGE, afterYChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String afterZIndexChange = diagramNodeFork.getAfterZIndexChange();
		renderedAttributes.add(renderString(DiagramNodeFork.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onAlignChange = diagramNodeFork.getOnAlignChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_ALIGN_CHANGE, onAlignChange));
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onAlignOnChange = diagramNodeFork.getOnAlignOnChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_ALIGN_ON_CHANGE, onAlignOnChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onBodyContentChange = diagramNodeFork.getOnBodyContentChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onBoundingBoxChange = diagramNodeFork.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onBuilderChange = diagramNodeFork.getOnBuilderChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onCenteredChange = diagramNodeFork.getOnCenteredChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_CENTERED_CHANGE, onCenteredChange));
	}

	protected void renderOnConnectorsChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onConnectorsChange = diagramNodeFork.getOnConnectorsChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_CONNECTORS_CHANGE, onConnectorsChange));
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onConstrainChange = diagramNodeFork.getOnConstrainChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_CONSTRAIN_CHANGE, onConstrainChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onContentBoxChange = diagramNodeFork.getOnContentBoxChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onControlsToolbarChange = diagramNodeFork.getOnControlsToolbarChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
	}

	protected void renderOnDescriptionChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onDescriptionChange = diagramNodeFork.getOnDescriptionChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_DESCRIPTION_CHANGE, onDescriptionChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onDestroyedChange = diagramNodeFork.getOnDestroyedChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onDisabledChange = diagramNodeFork.getOnDisabledChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onFillHeightChange = diagramNodeFork.getOnFillHeightChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onFocusedChange = diagramNodeFork.getOnFocusedChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onFooterContentChange = diagramNodeFork.getOnFooterContentChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
	}

	protected void renderOnGraphicChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onGraphicChange = diagramNodeFork.getOnGraphicChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_GRAPHIC_CHANGE, onGraphicChange));
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onHeaderContentChange = diagramNodeFork.getOnHeaderContentChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onHeightChange = diagramNodeFork.getOnHeightChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHighlightBoundaryStrokeChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onHighlightBoundaryStrokeChange = diagramNodeFork.getOnHighlightBoundaryStrokeChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_HIGHLIGHT_BOUNDARY_STROKE_CHANGE, onHighlightBoundaryStrokeChange));
	}

	protected void renderOnHighlightedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onHighlightedChange = diagramNodeFork.getOnHighlightedChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_HIGHLIGHTED_CHANGE, onHighlightedChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onIdChange = diagramNodeFork.getOnIdChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onInitializedChange = diagramNodeFork.getOnInitializedChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onLocaleChange = diagramNodeFork.getOnLocaleChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onNameChange = diagramNodeFork.getOnNameChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onPreventOverlapChange = diagramNodeFork.getOnPreventOverlapChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onRenderChange = diagramNodeFork.getOnRenderChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onRenderedChange = diagramNodeFork.getOnRenderedChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onRequiredChange = diagramNodeFork.getOnRequiredChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onSelectedChange = diagramNodeFork.getOnSelectedChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShapeBoundaryChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onShapeBoundaryChange = diagramNodeFork.getOnShapeBoundaryChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_SHAPE_BOUNDARY_CHANGE, onShapeBoundaryChange));
	}

	protected void renderOnShapeInviteChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onShapeInviteChange = diagramNodeFork.getOnShapeInviteChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_SHAPE_INVITE_CHANGE, onShapeInviteChange));
	}

	protected void renderOnShimChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onShimChange = diagramNodeFork.getOnShimChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_SHIM_CHANGE, onShimChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onSrcNodeChange = diagramNodeFork.getOnSrcNodeChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onStringsChange = diagramNodeFork.getOnStringsChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onTabIndexChange = diagramNodeFork.getOnTabIndexChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTransitionsChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onTransitionsChange = diagramNodeFork.getOnTransitionsChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_TRANSITIONS_CHANGE, onTransitionsChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onTypeChange = diagramNodeFork.getOnTypeChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onVisibleChange = diagramNodeFork.getOnVisibleChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onWidthChange = diagramNodeFork.getOnWidthChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnXChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onXChange = diagramNodeFork.getOnXChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_XCHANGE, onXChange));
	}

	protected void renderOnXyChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onXyChange = diagramNodeFork.getOnXyChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_XY_CHANGE, onXyChange));
	}

	protected void renderOnYChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onYChange = diagramNodeFork.getOnYChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_YCHANGE, onYChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, DiagramNodeFork diagramNodeFork) throws IOException {
		java.lang.String onZIndexChange = diagramNodeFork.getOnZIndexChange();
		renderedAttributes.add(renderString(DiagramNodeFork.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}