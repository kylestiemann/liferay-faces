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
package com.liferay.faces.alloy.component.hsvapalettemodal;

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
public abstract class HSVAPaletteModalRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-hsv-palette-modal";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		HSVAPaletteModal hSVAPaletteModal = (HSVAPaletteModal) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var hSVAPaletteModal = new A.HSVAPaletteModal");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (hSVAPaletteModal.getAlign() != null) {
			renderAlign(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAlignOn() != null) {
			renderAlignOn(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getHSVAPaletteModalBodyContent() != null) {
			renderHSVAPaletteModalBodyContent(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getCentered() != null) {
			renderCentered(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getConstrain() != null) {
			renderConstrain(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getContentBox() != null) {
			renderContentBox(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getDestroyOnHide() != null) {
			renderDestroyOnHide(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getDisabled() != null) {
			renderDisabled(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getDraggable() != null) {
			renderDraggable(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getFillHeight() != null) {
			renderFillHeight(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getFocusOn() != null) {
			renderFocusOn(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getFocused() != null) {
			renderFocused(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getFooterContent() != null) {
			renderFooterContent(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getHeaderContent() != null) {
			renderHeaderContent(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getHeight() != null) {
			renderHeight(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getHideOn() != null) {
			renderHideOn(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getHsv() != null) {
			renderHsv(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getHSVAPaletteModalId() != null) {
			renderHSVAPaletteModalId(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getInitialized() != null) {
			renderInitialized(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getHSVAPaletteModalLocale() != null) {
			renderHSVAPaletteModalLocale(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getMaskNode() != null) {
			renderMaskNode(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getModal() != null) {
			renderModal(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getPreventOverlap() != null) {
			renderPreventOverlap(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getRender() != null) {
			renderRender(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getRendered() != null) {
			renderRendered(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getResizable() != null) {
			renderResizable(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getSelected() != null) {
			renderSelected(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getShim() != null) {
			renderShim(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getStrings() != null) {
			renderStrings(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getToolbarPosition() != null) {
			renderToolbarPosition(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getToolbars() != null) {
			renderToolbars(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getVisible() != null) {
			renderVisible(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getWidth() != null) {
			renderWidth(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getX() != null) {
			renderX(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getXy() != null) {
			renderXy(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getY() != null) {
			renderY(renderedAttributes, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getZIndex() != null) {
			renderZIndex(renderedAttributes, hSVAPaletteModal);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (hSVAPaletteModal.getAfterAlignChange() != null) {
			renderAfterAlignChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterAlignOnChange() != null) {
			renderAfterAlignOnChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterCenteredChange() != null) {
			renderAfterCenteredChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterConstrainChange() != null) {
			renderAfterConstrainChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterDestroyOnHideChange() != null) {
			renderAfterDestroyOnHideChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterDraggableChange() != null) {
			renderAfterDraggableChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterFillHeightChange() != null) {
			renderAfterFillHeightChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterFocusOnChange() != null) {
			renderAfterFocusOnChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterFooterContentChange() != null) {
			renderAfterFooterContentChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterHeaderContentChange() != null) {
			renderAfterHeaderContentChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterHideOnChange() != null) {
			renderAfterHideOnChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterHsvChange() != null) {
			renderAfterHsvChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterMaskNodeChange() != null) {
			renderAfterMaskNodeChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterModalChange() != null) {
			renderAfterModalChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterPreventOverlapChange() != null) {
			renderAfterPreventOverlapChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterResizableChange() != null) {
			renderAfterResizableChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterShimChange() != null) {
			renderAfterShimChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterToolbarPositionChange() != null) {
			renderAfterToolbarPositionChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterToolbarsChange() != null) {
			renderAfterToolbarsChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterXChange() != null) {
			renderAfterXChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterXyChange() != null) {
			renderAfterXyChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterYChange() != null) {
			renderAfterYChange(renderedAfterEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, hSVAPaletteModal);
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

		if (hSVAPaletteModal.getOnAlignChange() != null) {
			renderOnAlignChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnAlignOnChange() != null) {
			renderOnAlignOnChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnCenteredChange() != null) {
			renderOnCenteredChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnConstrainChange() != null) {
			renderOnConstrainChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnDestroyOnHideChange() != null) {
			renderOnDestroyOnHideChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnDraggableChange() != null) {
			renderOnDraggableChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnFillHeightChange() != null) {
			renderOnFillHeightChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnFocusOnChange() != null) {
			renderOnFocusOnChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnFooterContentChange() != null) {
			renderOnFooterContentChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnHeaderContentChange() != null) {
			renderOnHeaderContentChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnHideOnChange() != null) {
			renderOnHideOnChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnHsvChange() != null) {
			renderOnHsvChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnMaskNodeChange() != null) {
			renderOnMaskNodeChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnModalChange() != null) {
			renderOnModalChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnPreventOverlapChange() != null) {
			renderOnPreventOverlapChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnResizableChange() != null) {
			renderOnResizableChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnShimChange() != null) {
			renderOnShimChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnToolbarPositionChange() != null) {
			renderOnToolbarPositionChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnToolbarsChange() != null) {
			renderOnToolbarsChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnXChange() != null) {
			renderOnXChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnXyChange() != null) {
			renderOnXyChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnYChange() != null) {
			renderOnYChange(renderedOnEvents, hSVAPaletteModal);
		}
		
		if (hSVAPaletteModal.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, hSVAPaletteModal);
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

	protected void renderAlign(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object align = hSVAPaletteModal.getAlign();
		renderedAttributes.add(renderObject(HSVAPaletteModal.ALIGN, align));
	}

	protected void renderAlignOn(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object alignOn = hSVAPaletteModal.getAlignOn();
		renderedAttributes.add(renderArray(HSVAPaletteModal.ALIGN_ON, alignOn));
	}

	protected void renderHSVAPaletteModalBodyContent(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String hSVAPaletteModalBodyContent = hSVAPaletteModal.getHSVAPaletteModalBodyContent();
		renderedAttributes.add(renderString(HSVAPaletteModal.H_SVAPALETTE_MODAL_BODY_CONTENT, hSVAPaletteModalBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String boundingBox = hSVAPaletteModal.getBoundingBox();
		renderedAttributes.add(renderString(HSVAPaletteModal.BOUNDING_BOX, boundingBox));
	}

	protected void renderCentered(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object centered = hSVAPaletteModal.getCentered();
		renderedAttributes.add(renderString(HSVAPaletteModal.CENTERED, centered));
	}

	protected void renderConstrain(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object constrain = hSVAPaletteModal.getConstrain();
		renderedAttributes.add(renderString(HSVAPaletteModal.CONSTRAIN, constrain));
	}

	protected void renderContentBox(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String contentBox = hSVAPaletteModal.getContentBox();
		renderedAttributes.add(renderString(HSVAPaletteModal.CONTENT_BOX, contentBox));
	}

	protected void renderDestroyOnHide(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean destroyOnHide = hSVAPaletteModal.getDestroyOnHide();
		renderedAttributes.add(renderBoolean(HSVAPaletteModal.DESTROY_ON_HIDE, destroyOnHide));
	}

	protected void renderDestroyed(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean destroyed = hSVAPaletteModal.getDestroyed();
		renderedAttributes.add(renderBoolean(HSVAPaletteModal.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean disabled = hSVAPaletteModal.getDisabled();
		renderedAttributes.add(renderBoolean(HSVAPaletteModal.DISABLED, disabled));
	}

	protected void renderDraggable(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object draggable = hSVAPaletteModal.getDraggable();
		renderedAttributes.add(renderObject(HSVAPaletteModal.DRAGGABLE, draggable));
	}

	protected void renderFillHeight(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object fillHeight = hSVAPaletteModal.getFillHeight();
		renderedAttributes.add(renderString(HSVAPaletteModal.FILL_HEIGHT, fillHeight));
	}

	protected void renderFocusOn(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object focusOn = hSVAPaletteModal.getFocusOn();
		renderedAttributes.add(renderArray(HSVAPaletteModal.FOCUS_ON, focusOn));
	}

	protected void renderFocused(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean focused = hSVAPaletteModal.getFocused();
		renderedAttributes.add(renderBoolean(HSVAPaletteModal.FOCUSED, focused));
	}

	protected void renderFooterContent(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object footerContent = hSVAPaletteModal.getFooterContent();
		renderedAttributes.add(renderString(HSVAPaletteModal.FOOTER_CONTENT, footerContent));
	}

	protected void renderHeaderContent(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object headerContent = hSVAPaletteModal.getHeaderContent();
		renderedAttributes.add(renderString(HSVAPaletteModal.HEADER_CONTENT, headerContent));
	}

	protected void renderHeight(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object height = hSVAPaletteModal.getHeight();
		renderedAttributes.add(renderString(HSVAPaletteModal.HEIGHT, height));
	}

	protected void renderHideOn(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object hideOn = hSVAPaletteModal.getHideOn();
		renderedAttributes.add(renderArray(HSVAPaletteModal.HIDE_ON, hideOn));
	}

	protected void renderHsv(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object hsv = hSVAPaletteModal.getHsv();
		renderedAttributes.add(renderObject(HSVAPaletteModal.HSV, hsv));
	}

	protected void renderHSVAPaletteModalId(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String hSVAPaletteModalId = hSVAPaletteModal.getHSVAPaletteModalId();
		renderedAttributes.add(renderString(HSVAPaletteModal.H_SVAPALETTE_MODAL_ID, hSVAPaletteModalId));
	}

	protected void renderInitialized(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean initialized = hSVAPaletteModal.getInitialized();
		renderedAttributes.add(renderBoolean(HSVAPaletteModal.INITIALIZED, initialized));
	}

	protected void renderHSVAPaletteModalLocale(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String hSVAPaletteModalLocale = hSVAPaletteModal.getHSVAPaletteModalLocale();
		renderedAttributes.add(renderString(HSVAPaletteModal.H_SVAPALETTE_MODAL_LOCALE, hSVAPaletteModalLocale));
	}

	protected void renderMaskNode(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object maskNode = hSVAPaletteModal.getMaskNode();
		renderedAttributes.add(renderString(HSVAPaletteModal.MASK_NODE, maskNode));
	}

	protected void renderModal(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean modal = hSVAPaletteModal.getModal();
		renderedAttributes.add(renderBoolean(HSVAPaletteModal.MODAL, modal));
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean preventOverlap = hSVAPaletteModal.getPreventOverlap();
		renderedAttributes.add(renderBoolean(HSVAPaletteModal.PREVENT_OVERLAP, preventOverlap));
	}

	protected void renderRender(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object render = hSVAPaletteModal.getRender();
		renderedAttributes.add(renderString(HSVAPaletteModal.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean rendered = hSVAPaletteModal.getRendered();
		renderedAttributes.add(renderBoolean(HSVAPaletteModal.RENDERED, rendered));
	}

	protected void renderResizable(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object resizable = hSVAPaletteModal.getResizable();
		renderedAttributes.add(renderObject(HSVAPaletteModal.RESIZABLE, resizable));
	}

	protected void renderSelected(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String selected = hSVAPaletteModal.getSelected();
		renderedAttributes.add(renderString(HSVAPaletteModal.SELECTED, selected));
	}

	protected void renderShim(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean shim = hSVAPaletteModal.getShim();
		renderedAttributes.add(renderBoolean(HSVAPaletteModal.SHIM, shim));
	}

	protected void renderSrcNode(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String srcNode = hSVAPaletteModal.getSrcNode();
		renderedAttributes.add(renderString(HSVAPaletteModal.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object strings = hSVAPaletteModal.getStrings();
		renderedAttributes.add(renderObject(HSVAPaletteModal.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object tabIndex = hSVAPaletteModal.getTabIndex();
		renderedAttributes.add(renderNumber(HSVAPaletteModal.TAB_INDEX, tabIndex));
	}

	protected void renderToolbarPosition(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object toolbarPosition = hSVAPaletteModal.getToolbarPosition();
		renderedAttributes.add(renderObject(HSVAPaletteModal.TOOLBAR_POSITION, toolbarPosition));
	}

	protected void renderToolbars(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object toolbars = hSVAPaletteModal.getToolbars();
		renderedAttributes.add(renderString(HSVAPaletteModal.TOOLBARS, toolbars));
	}

	protected void renderVisible(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean visible = hSVAPaletteModal.getVisible();
		renderedAttributes.add(renderBoolean(HSVAPaletteModal.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object width = hSVAPaletteModal.getWidth();
		renderedAttributes.add(renderString(HSVAPaletteModal.WIDTH, width));
	}

	protected void renderX(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object x = hSVAPaletteModal.getX();
		renderedAttributes.add(renderNumber(HSVAPaletteModal.X, x));
	}

	protected void renderXy(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object xy = hSVAPaletteModal.getXy();
		renderedAttributes.add(renderArray(HSVAPaletteModal.XY, xy));
	}

	protected void renderY(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object y = hSVAPaletteModal.getY();
		renderedAttributes.add(renderNumber(HSVAPaletteModal.Y, y));
	}

	protected void renderZIndex(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object zIndex = hSVAPaletteModal.getZIndex();
		renderedAttributes.add(renderNumber(HSVAPaletteModal.Z_INDEX, zIndex));
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterAlignChange = hSVAPaletteModal.getAfterAlignChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_ALIGN_CHANGE, afterAlignChange));
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterAlignOnChange = hSVAPaletteModal.getAfterAlignOnChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterBodyContentChange = hSVAPaletteModal.getAfterBodyContentChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterBoundingBoxChange = hSVAPaletteModal.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterCenteredChange = hSVAPaletteModal.getAfterCenteredChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_CENTERED_CHANGE, afterCenteredChange));
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterConstrainChange = hSVAPaletteModal.getAfterConstrainChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterContentBoxChange = hSVAPaletteModal.getAfterContentBoxChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterDestroyOnHideChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterDestroyOnHideChange = hSVAPaletteModal.getAfterDestroyOnHideChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_DESTROY_ON_HIDE_CHANGE, afterDestroyOnHideChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterDestroyedChange = hSVAPaletteModal.getAfterDestroyedChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterDisabledChange = hSVAPaletteModal.getAfterDisabledChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterDraggableChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterDraggableChange = hSVAPaletteModal.getAfterDraggableChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_DRAGGABLE_CHANGE, afterDraggableChange));
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterFillHeightChange = hSVAPaletteModal.getAfterFillHeightChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
	}

	protected void renderAfterFocusOnChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterFocusOnChange = hSVAPaletteModal.getAfterFocusOnChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_FOCUS_ON_CHANGE, afterFocusOnChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterFocusedChange = hSVAPaletteModal.getAfterFocusedChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterFooterContentChange = hSVAPaletteModal.getAfterFooterContentChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterHeaderContentChange = hSVAPaletteModal.getAfterHeaderContentChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterHeightChange = hSVAPaletteModal.getAfterHeightChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideOnChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterHideOnChange = hSVAPaletteModal.getAfterHideOnChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_HIDE_ON_CHANGE, afterHideOnChange));
	}

	protected void renderAfterHsvChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterHsvChange = hSVAPaletteModal.getAfterHsvChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_HSV_CHANGE, afterHsvChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterIdChange = hSVAPaletteModal.getAfterIdChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterInitializedChange = hSVAPaletteModal.getAfterInitializedChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterLocaleChange = hSVAPaletteModal.getAfterLocaleChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterMaskNodeChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterMaskNodeChange = hSVAPaletteModal.getAfterMaskNodeChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_MASK_NODE_CHANGE, afterMaskNodeChange));
	}

	protected void renderAfterModalChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterModalChange = hSVAPaletteModal.getAfterModalChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_MODAL_CHANGE, afterModalChange));
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterPreventOverlapChange = hSVAPaletteModal.getAfterPreventOverlapChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterRenderChange = hSVAPaletteModal.getAfterRenderChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterRenderedChange = hSVAPaletteModal.getAfterRenderedChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterResizableChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterResizableChange = hSVAPaletteModal.getAfterResizableChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_RESIZABLE_CHANGE, afterResizableChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterSelectedChange = hSVAPaletteModal.getAfterSelectedChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterShimChange = hSVAPaletteModal.getAfterShimChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_SHIM_CHANGE, afterShimChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterSrcNodeChange = hSVAPaletteModal.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterStringsChange = hSVAPaletteModal.getAfterStringsChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterTabIndexChange = hSVAPaletteModal.getAfterTabIndexChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterToolbarPositionChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterToolbarPositionChange = hSVAPaletteModal.getAfterToolbarPositionChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_TOOLBAR_POSITION_CHANGE, afterToolbarPositionChange));
	}

	protected void renderAfterToolbarsChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterToolbarsChange = hSVAPaletteModal.getAfterToolbarsChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_TOOLBARS_CHANGE, afterToolbarsChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterVisibleChange = hSVAPaletteModal.getAfterVisibleChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterWidthChange = hSVAPaletteModal.getAfterWidthChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterXChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterXChange = hSVAPaletteModal.getAfterXChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_XCHANGE, afterXChange));
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterXyChange = hSVAPaletteModal.getAfterXyChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_XY_CHANGE, afterXyChange));
	}

	protected void renderAfterYChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterYChange = hSVAPaletteModal.getAfterYChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_YCHANGE, afterYChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterZIndexChange = hSVAPaletteModal.getAfterZIndexChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onAlignChange = hSVAPaletteModal.getOnAlignChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_ALIGN_CHANGE, onAlignChange));
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onAlignOnChange = hSVAPaletteModal.getOnAlignOnChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_ALIGN_ON_CHANGE, onAlignOnChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onBodyContentChange = hSVAPaletteModal.getOnBodyContentChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onBoundingBoxChange = hSVAPaletteModal.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onCenteredChange = hSVAPaletteModal.getOnCenteredChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_CENTERED_CHANGE, onCenteredChange));
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onConstrainChange = hSVAPaletteModal.getOnConstrainChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_CONSTRAIN_CHANGE, onConstrainChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onContentBoxChange = hSVAPaletteModal.getOnContentBoxChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnDestroyOnHideChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onDestroyOnHideChange = hSVAPaletteModal.getOnDestroyOnHideChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_DESTROY_ON_HIDE_CHANGE, onDestroyOnHideChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onDestroyedChange = hSVAPaletteModal.getOnDestroyedChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onDisabledChange = hSVAPaletteModal.getOnDisabledChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnDraggableChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onDraggableChange = hSVAPaletteModal.getOnDraggableChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_DRAGGABLE_CHANGE, onDraggableChange));
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onFillHeightChange = hSVAPaletteModal.getOnFillHeightChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
	}

	protected void renderOnFocusOnChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onFocusOnChange = hSVAPaletteModal.getOnFocusOnChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_FOCUS_ON_CHANGE, onFocusOnChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onFocusedChange = hSVAPaletteModal.getOnFocusedChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onFooterContentChange = hSVAPaletteModal.getOnFooterContentChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onHeaderContentChange = hSVAPaletteModal.getOnHeaderContentChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onHeightChange = hSVAPaletteModal.getOnHeightChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideOnChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onHideOnChange = hSVAPaletteModal.getOnHideOnChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_HIDE_ON_CHANGE, onHideOnChange));
	}

	protected void renderOnHsvChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onHsvChange = hSVAPaletteModal.getOnHsvChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_HSV_CHANGE, onHsvChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onIdChange = hSVAPaletteModal.getOnIdChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onInitializedChange = hSVAPaletteModal.getOnInitializedChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onLocaleChange = hSVAPaletteModal.getOnLocaleChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnMaskNodeChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onMaskNodeChange = hSVAPaletteModal.getOnMaskNodeChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_MASK_NODE_CHANGE, onMaskNodeChange));
	}

	protected void renderOnModalChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onModalChange = hSVAPaletteModal.getOnModalChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_MODAL_CHANGE, onModalChange));
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onPreventOverlapChange = hSVAPaletteModal.getOnPreventOverlapChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onRenderChange = hSVAPaletteModal.getOnRenderChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onRenderedChange = hSVAPaletteModal.getOnRenderedChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnResizableChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onResizableChange = hSVAPaletteModal.getOnResizableChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_RESIZABLE_CHANGE, onResizableChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onSelectedChange = hSVAPaletteModal.getOnSelectedChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShimChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onShimChange = hSVAPaletteModal.getOnShimChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_SHIM_CHANGE, onShimChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onSrcNodeChange = hSVAPaletteModal.getOnSrcNodeChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onStringsChange = hSVAPaletteModal.getOnStringsChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onTabIndexChange = hSVAPaletteModal.getOnTabIndexChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnToolbarPositionChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onToolbarPositionChange = hSVAPaletteModal.getOnToolbarPositionChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_TOOLBAR_POSITION_CHANGE, onToolbarPositionChange));
	}

	protected void renderOnToolbarsChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onToolbarsChange = hSVAPaletteModal.getOnToolbarsChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_TOOLBARS_CHANGE, onToolbarsChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onVisibleChange = hSVAPaletteModal.getOnVisibleChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onWidthChange = hSVAPaletteModal.getOnWidthChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnXChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onXChange = hSVAPaletteModal.getOnXChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_XCHANGE, onXChange));
	}

	protected void renderOnXyChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onXyChange = hSVAPaletteModal.getOnXyChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_XY_CHANGE, onXyChange));
	}

	protected void renderOnYChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onYChange = hSVAPaletteModal.getOnYChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_YCHANGE, onYChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onZIndexChange = hSVAPaletteModal.getOnZIndexChange();
		renderedAttributes.add(renderString(HSVAPaletteModal.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}