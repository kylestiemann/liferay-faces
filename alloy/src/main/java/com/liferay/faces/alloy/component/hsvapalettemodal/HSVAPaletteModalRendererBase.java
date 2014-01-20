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

		renderAlign(renderedAttributes, hSVAPaletteModal);
		renderAlignOn(renderedAttributes, hSVAPaletteModal);
		renderHSVAPaletteModalBodyContent(renderedAttributes, hSVAPaletteModal);
		renderBoundingBox(renderedAttributes, hSVAPaletteModal);
		renderCentered(renderedAttributes, hSVAPaletteModal);
		renderConstrain(renderedAttributes, hSVAPaletteModal);
		renderContentBox(renderedAttributes, hSVAPaletteModal);
		renderDestroyOnHide(renderedAttributes, hSVAPaletteModal);
		renderDestroyed(renderedAttributes, hSVAPaletteModal);
		renderDisabled(renderedAttributes, hSVAPaletteModal);
		renderDraggable(renderedAttributes, hSVAPaletteModal);
		renderFillHeight(renderedAttributes, hSVAPaletteModal);
		renderFocusOn(renderedAttributes, hSVAPaletteModal);
		renderFocused(renderedAttributes, hSVAPaletteModal);
		renderFooterContent(renderedAttributes, hSVAPaletteModal);
		renderHeaderContent(renderedAttributes, hSVAPaletteModal);
		renderHeight(renderedAttributes, hSVAPaletteModal);
		renderHideOn(renderedAttributes, hSVAPaletteModal);
		renderHsv(renderedAttributes, hSVAPaletteModal);
		renderHSVAPaletteModalId(renderedAttributes, hSVAPaletteModal);
		renderInitialized(renderedAttributes, hSVAPaletteModal);
		renderHSVAPaletteModalLocale(renderedAttributes, hSVAPaletteModal);
		renderMaskNode(renderedAttributes, hSVAPaletteModal);
		renderModal(renderedAttributes, hSVAPaletteModal);
		renderPreventOverlap(renderedAttributes, hSVAPaletteModal);
		renderRender(renderedAttributes, hSVAPaletteModal);
		renderRendered(renderedAttributes, hSVAPaletteModal);
		renderResizable(renderedAttributes, hSVAPaletteModal);
		renderSelected(renderedAttributes, hSVAPaletteModal);
		renderShim(renderedAttributes, hSVAPaletteModal);
		renderSrcNode(renderedAttributes, hSVAPaletteModal);
		renderStrings(renderedAttributes, hSVAPaletteModal);
		renderTabIndex(renderedAttributes, hSVAPaletteModal);
		renderToolbarPosition(renderedAttributes, hSVAPaletteModal);
		renderToolbars(renderedAttributes, hSVAPaletteModal);
		renderVisible(renderedAttributes, hSVAPaletteModal);
		renderWidth(renderedAttributes, hSVAPaletteModal);
		renderX(renderedAttributes, hSVAPaletteModal);
		renderXy(renderedAttributes, hSVAPaletteModal);
		renderY(renderedAttributes, hSVAPaletteModal);
		renderZIndex(renderedAttributes, hSVAPaletteModal);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlignChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterAlignOnChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterBodyContentChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterBoundingBoxChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterCenteredChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterConstrainChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterContentBoxChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterDestroyOnHideChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterDestroyedChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterDisabledChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterDraggableChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterFillHeightChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterFocusOnChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterFocusedChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterFooterContentChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterHeaderContentChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterHeightChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterHideOnChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterHsvChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterIdChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterInitializedChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterLocaleChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterMaskNodeChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterModalChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterPreventOverlapChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterRenderChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterRenderedChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterResizableChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterSelectedChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterShimChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterSrcNodeChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterStringsChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterTabIndexChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterToolbarPositionChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterToolbarsChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterVisibleChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterWidthChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterXChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterXyChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterYChange(renderedAfterEvents, hSVAPaletteModal);
		renderAfterZIndexChange(renderedAfterEvents, hSVAPaletteModal);

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

		renderOnAlignChange(renderedOnEvents, hSVAPaletteModal);
		renderOnAlignOnChange(renderedOnEvents, hSVAPaletteModal);
		renderOnBodyContentChange(renderedOnEvents, hSVAPaletteModal);
		renderOnBoundingBoxChange(renderedOnEvents, hSVAPaletteModal);
		renderOnCenteredChange(renderedOnEvents, hSVAPaletteModal);
		renderOnConstrainChange(renderedOnEvents, hSVAPaletteModal);
		renderOnContentBoxChange(renderedOnEvents, hSVAPaletteModal);
		renderOnDestroyOnHideChange(renderedOnEvents, hSVAPaletteModal);
		renderOnDestroyedChange(renderedOnEvents, hSVAPaletteModal);
		renderOnDisabledChange(renderedOnEvents, hSVAPaletteModal);
		renderOnDraggableChange(renderedOnEvents, hSVAPaletteModal);
		renderOnFillHeightChange(renderedOnEvents, hSVAPaletteModal);
		renderOnFocusOnChange(renderedOnEvents, hSVAPaletteModal);
		renderOnFocusedChange(renderedOnEvents, hSVAPaletteModal);
		renderOnFooterContentChange(renderedOnEvents, hSVAPaletteModal);
		renderOnHeaderContentChange(renderedOnEvents, hSVAPaletteModal);
		renderOnHeightChange(renderedOnEvents, hSVAPaletteModal);
		renderOnHideOnChange(renderedOnEvents, hSVAPaletteModal);
		renderOnHsvChange(renderedOnEvents, hSVAPaletteModal);
		renderOnIdChange(renderedOnEvents, hSVAPaletteModal);
		renderOnInitializedChange(renderedOnEvents, hSVAPaletteModal);
		renderOnLocaleChange(renderedOnEvents, hSVAPaletteModal);
		renderOnMaskNodeChange(renderedOnEvents, hSVAPaletteModal);
		renderOnModalChange(renderedOnEvents, hSVAPaletteModal);
		renderOnPreventOverlapChange(renderedOnEvents, hSVAPaletteModal);
		renderOnRenderChange(renderedOnEvents, hSVAPaletteModal);
		renderOnRenderedChange(renderedOnEvents, hSVAPaletteModal);
		renderOnResizableChange(renderedOnEvents, hSVAPaletteModal);
		renderOnSelectedChange(renderedOnEvents, hSVAPaletteModal);
		renderOnShimChange(renderedOnEvents, hSVAPaletteModal);
		renderOnSrcNodeChange(renderedOnEvents, hSVAPaletteModal);
		renderOnStringsChange(renderedOnEvents, hSVAPaletteModal);
		renderOnTabIndexChange(renderedOnEvents, hSVAPaletteModal);
		renderOnToolbarPositionChange(renderedOnEvents, hSVAPaletteModal);
		renderOnToolbarsChange(renderedOnEvents, hSVAPaletteModal);
		renderOnVisibleChange(renderedOnEvents, hSVAPaletteModal);
		renderOnWidthChange(renderedOnEvents, hSVAPaletteModal);
		renderOnXChange(renderedOnEvents, hSVAPaletteModal);
		renderOnXyChange(renderedOnEvents, hSVAPaletteModal);
		renderOnYChange(renderedOnEvents, hSVAPaletteModal);
		renderOnZIndexChange(renderedOnEvents, hSVAPaletteModal);

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

		if (align != null) {
			renderedAttributes.add(renderObject(HSVAPaletteModal.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object alignOn = hSVAPaletteModal.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(HSVAPaletteModal.ALIGN_ON, alignOn));
		}
	}

	protected void renderHSVAPaletteModalBodyContent(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String hSVAPaletteModalBodyContent = hSVAPaletteModal.getHSVAPaletteModalBodyContent();

		if (hSVAPaletteModalBodyContent != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.H_SVAPALETTE_MODAL_BODY_CONTENT, hSVAPaletteModalBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String boundingBox = hSVAPaletteModal.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object centered = hSVAPaletteModal.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.CENTERED, centered));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object constrain = hSVAPaletteModal.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String contentBox = hSVAPaletteModal.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.CONTENT_BOX, contentBox));
		}
	}

	protected void renderDestroyOnHide(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean destroyOnHide = hSVAPaletteModal.getDestroyOnHide();

		if (destroyOnHide != null) {
			renderedAttributes.add(renderBoolean(HSVAPaletteModal.DESTROY_ON_HIDE, destroyOnHide));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean destroyed = hSVAPaletteModal.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(HSVAPaletteModal.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean disabled = hSVAPaletteModal.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(HSVAPaletteModal.DISABLED, disabled));
		}
	}

	protected void renderDraggable(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object draggable = hSVAPaletteModal.getDraggable();

		if (draggable != null) {
			renderedAttributes.add(renderObject(HSVAPaletteModal.DRAGGABLE, draggable));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object fillHeight = hSVAPaletteModal.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocusOn(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object focusOn = hSVAPaletteModal.getFocusOn();

		if (focusOn != null) {
			renderedAttributes.add(renderArray(HSVAPaletteModal.FOCUS_ON, focusOn));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean focused = hSVAPaletteModal.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(HSVAPaletteModal.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object footerContent = hSVAPaletteModal.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object headerContent = hSVAPaletteModal.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object height = hSVAPaletteModal.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.HEIGHT, height));
		}
	}

	protected void renderHideOn(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object hideOn = hSVAPaletteModal.getHideOn();

		if (hideOn != null) {
			renderedAttributes.add(renderArray(HSVAPaletteModal.HIDE_ON, hideOn));
		}
	}

	protected void renderHsv(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object hsv = hSVAPaletteModal.getHsv();

		if (hsv != null) {
			renderedAttributes.add(renderObject(HSVAPaletteModal.HSV, hsv));
		}
	}

	protected void renderHSVAPaletteModalId(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String hSVAPaletteModalId = hSVAPaletteModal.getHSVAPaletteModalId();

		if (hSVAPaletteModalId != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.H_SVAPALETTE_MODAL_ID, hSVAPaletteModalId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean initialized = hSVAPaletteModal.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(HSVAPaletteModal.INITIALIZED, initialized));
		}
	}

	protected void renderHSVAPaletteModalLocale(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String hSVAPaletteModalLocale = hSVAPaletteModal.getHSVAPaletteModalLocale();

		if (hSVAPaletteModalLocale != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.H_SVAPALETTE_MODAL_LOCALE, hSVAPaletteModalLocale));
		}
	}

	protected void renderMaskNode(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object maskNode = hSVAPaletteModal.getMaskNode();

		if (maskNode != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.MASK_NODE, maskNode));
		}
	}

	protected void renderModal(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean modal = hSVAPaletteModal.getModal();

		if (modal != null) {
			renderedAttributes.add(renderBoolean(HSVAPaletteModal.MODAL, modal));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean preventOverlap = hSVAPaletteModal.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(HSVAPaletteModal.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object render = hSVAPaletteModal.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean rendered = hSVAPaletteModal.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(HSVAPaletteModal.RENDERED, rendered));
		}
	}

	protected void renderResizable(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object resizable = hSVAPaletteModal.getResizable();

		if (resizable != null) {
			renderedAttributes.add(renderObject(HSVAPaletteModal.RESIZABLE, resizable));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String selected = hSVAPaletteModal.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.SELECTED, selected));
		}
	}

	protected void renderShim(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean shim = hSVAPaletteModal.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(HSVAPaletteModal.SHIM, shim));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String srcNode = hSVAPaletteModal.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object strings = hSVAPaletteModal.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(HSVAPaletteModal.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object tabIndex = hSVAPaletteModal.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(HSVAPaletteModal.TAB_INDEX, tabIndex));
		}
	}

	protected void renderToolbarPosition(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object toolbarPosition = hSVAPaletteModal.getToolbarPosition();

		if (toolbarPosition != null) {
			renderedAttributes.add(renderObject(HSVAPaletteModal.TOOLBAR_POSITION, toolbarPosition));
		}
	}

	protected void renderToolbars(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object toolbars = hSVAPaletteModal.getToolbars();

		if (toolbars != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.TOOLBARS, toolbars));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Boolean visible = hSVAPaletteModal.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(HSVAPaletteModal.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object width = hSVAPaletteModal.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object x = hSVAPaletteModal.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(HSVAPaletteModal.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object xy = hSVAPaletteModal.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(HSVAPaletteModal.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object y = hSVAPaletteModal.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(HSVAPaletteModal.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.Object zIndex = hSVAPaletteModal.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(HSVAPaletteModal.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterAlignChange = hSVAPaletteModal.getAfterAlignChange();

		if (afterAlignChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_ALIGN_CHANGE, afterAlignChange));
		}
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterAlignOnChange = hSVAPaletteModal.getAfterAlignOnChange();

		if (afterAlignOnChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterBodyContentChange = hSVAPaletteModal.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterBoundingBoxChange = hSVAPaletteModal.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterCenteredChange = hSVAPaletteModal.getAfterCenteredChange();

		if (afterCenteredChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_CENTERED_CHANGE, afterCenteredChange));
		}
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterConstrainChange = hSVAPaletteModal.getAfterConstrainChange();

		if (afterConstrainChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterContentBoxChange = hSVAPaletteModal.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterDestroyOnHideChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterDestroyOnHideChange = hSVAPaletteModal.getAfterDestroyOnHideChange();

		if (afterDestroyOnHideChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_DESTROY_ON_HIDE_CHANGE, afterDestroyOnHideChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterDestroyedChange = hSVAPaletteModal.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterDisabledChange = hSVAPaletteModal.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterDraggableChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterDraggableChange = hSVAPaletteModal.getAfterDraggableChange();

		if (afterDraggableChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_DRAGGABLE_CHANGE, afterDraggableChange));
		}
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterFillHeightChange = hSVAPaletteModal.getAfterFillHeightChange();

		if (afterFillHeightChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
		}
	}

	protected void renderAfterFocusOnChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterFocusOnChange = hSVAPaletteModal.getAfterFocusOnChange();

		if (afterFocusOnChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_FOCUS_ON_CHANGE, afterFocusOnChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterFocusedChange = hSVAPaletteModal.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterFooterContentChange = hSVAPaletteModal.getAfterFooterContentChange();

		if (afterFooterContentChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
		}
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterHeaderContentChange = hSVAPaletteModal.getAfterHeaderContentChange();

		if (afterHeaderContentChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterHeightChange = hSVAPaletteModal.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideOnChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterHideOnChange = hSVAPaletteModal.getAfterHideOnChange();

		if (afterHideOnChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_HIDE_ON_CHANGE, afterHideOnChange));
		}
	}

	protected void renderAfterHsvChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterHsvChange = hSVAPaletteModal.getAfterHsvChange();

		if (afterHsvChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_HSV_CHANGE, afterHsvChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterIdChange = hSVAPaletteModal.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterInitializedChange = hSVAPaletteModal.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterLocaleChange = hSVAPaletteModal.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterMaskNodeChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterMaskNodeChange = hSVAPaletteModal.getAfterMaskNodeChange();

		if (afterMaskNodeChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_MASK_NODE_CHANGE, afterMaskNodeChange));
		}
	}

	protected void renderAfterModalChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterModalChange = hSVAPaletteModal.getAfterModalChange();

		if (afterModalChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_MODAL_CHANGE, afterModalChange));
		}
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterPreventOverlapChange = hSVAPaletteModal.getAfterPreventOverlapChange();

		if (afterPreventOverlapChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterRenderChange = hSVAPaletteModal.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterRenderedChange = hSVAPaletteModal.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterResizableChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterResizableChange = hSVAPaletteModal.getAfterResizableChange();

		if (afterResizableChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_RESIZABLE_CHANGE, afterResizableChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterSelectedChange = hSVAPaletteModal.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterShimChange = hSVAPaletteModal.getAfterShimChange();

		if (afterShimChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_SHIM_CHANGE, afterShimChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterSrcNodeChange = hSVAPaletteModal.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterStringsChange = hSVAPaletteModal.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterTabIndexChange = hSVAPaletteModal.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterToolbarPositionChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterToolbarPositionChange = hSVAPaletteModal.getAfterToolbarPositionChange();

		if (afterToolbarPositionChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_TOOLBAR_POSITION_CHANGE, afterToolbarPositionChange));
		}
	}

	protected void renderAfterToolbarsChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterToolbarsChange = hSVAPaletteModal.getAfterToolbarsChange();

		if (afterToolbarsChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_TOOLBARS_CHANGE, afterToolbarsChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterVisibleChange = hSVAPaletteModal.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterWidthChange = hSVAPaletteModal.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterXChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterXChange = hSVAPaletteModal.getAfterXChange();

		if (afterXChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_XCHANGE, afterXChange));
		}
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterXyChange = hSVAPaletteModal.getAfterXyChange();

		if (afterXyChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_XY_CHANGE, afterXyChange));
		}
	}

	protected void renderAfterYChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterYChange = hSVAPaletteModal.getAfterYChange();

		if (afterYChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_YCHANGE, afterYChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String afterZIndexChange = hSVAPaletteModal.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onAlignChange = hSVAPaletteModal.getOnAlignChange();

		if (onAlignChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_ALIGN_CHANGE, onAlignChange));
		}
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onAlignOnChange = hSVAPaletteModal.getOnAlignOnChange();

		if (onAlignOnChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_ALIGN_ON_CHANGE, onAlignOnChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onBodyContentChange = hSVAPaletteModal.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onBoundingBoxChange = hSVAPaletteModal.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onCenteredChange = hSVAPaletteModal.getOnCenteredChange();

		if (onCenteredChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_CENTERED_CHANGE, onCenteredChange));
		}
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onConstrainChange = hSVAPaletteModal.getOnConstrainChange();

		if (onConstrainChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_CONSTRAIN_CHANGE, onConstrainChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onContentBoxChange = hSVAPaletteModal.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnDestroyOnHideChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onDestroyOnHideChange = hSVAPaletteModal.getOnDestroyOnHideChange();

		if (onDestroyOnHideChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_DESTROY_ON_HIDE_CHANGE, onDestroyOnHideChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onDestroyedChange = hSVAPaletteModal.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onDisabledChange = hSVAPaletteModal.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnDraggableChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onDraggableChange = hSVAPaletteModal.getOnDraggableChange();

		if (onDraggableChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_DRAGGABLE_CHANGE, onDraggableChange));
		}
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onFillHeightChange = hSVAPaletteModal.getOnFillHeightChange();

		if (onFillHeightChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
		}
	}

	protected void renderOnFocusOnChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onFocusOnChange = hSVAPaletteModal.getOnFocusOnChange();

		if (onFocusOnChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_FOCUS_ON_CHANGE, onFocusOnChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onFocusedChange = hSVAPaletteModal.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onFooterContentChange = hSVAPaletteModal.getOnFooterContentChange();

		if (onFooterContentChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
		}
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onHeaderContentChange = hSVAPaletteModal.getOnHeaderContentChange();

		if (onHeaderContentChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onHeightChange = hSVAPaletteModal.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideOnChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onHideOnChange = hSVAPaletteModal.getOnHideOnChange();

		if (onHideOnChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_HIDE_ON_CHANGE, onHideOnChange));
		}
	}

	protected void renderOnHsvChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onHsvChange = hSVAPaletteModal.getOnHsvChange();

		if (onHsvChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_HSV_CHANGE, onHsvChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onIdChange = hSVAPaletteModal.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onInitializedChange = hSVAPaletteModal.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onLocaleChange = hSVAPaletteModal.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnMaskNodeChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onMaskNodeChange = hSVAPaletteModal.getOnMaskNodeChange();

		if (onMaskNodeChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_MASK_NODE_CHANGE, onMaskNodeChange));
		}
	}

	protected void renderOnModalChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onModalChange = hSVAPaletteModal.getOnModalChange();

		if (onModalChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_MODAL_CHANGE, onModalChange));
		}
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onPreventOverlapChange = hSVAPaletteModal.getOnPreventOverlapChange();

		if (onPreventOverlapChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onRenderChange = hSVAPaletteModal.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onRenderedChange = hSVAPaletteModal.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnResizableChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onResizableChange = hSVAPaletteModal.getOnResizableChange();

		if (onResizableChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_RESIZABLE_CHANGE, onResizableChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onSelectedChange = hSVAPaletteModal.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShimChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onShimChange = hSVAPaletteModal.getOnShimChange();

		if (onShimChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_SHIM_CHANGE, onShimChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onSrcNodeChange = hSVAPaletteModal.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onStringsChange = hSVAPaletteModal.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onTabIndexChange = hSVAPaletteModal.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnToolbarPositionChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onToolbarPositionChange = hSVAPaletteModal.getOnToolbarPositionChange();

		if (onToolbarPositionChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_TOOLBAR_POSITION_CHANGE, onToolbarPositionChange));
		}
	}

	protected void renderOnToolbarsChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onToolbarsChange = hSVAPaletteModal.getOnToolbarsChange();

		if (onToolbarsChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_TOOLBARS_CHANGE, onToolbarsChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onVisibleChange = hSVAPaletteModal.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onWidthChange = hSVAPaletteModal.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnXChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onXChange = hSVAPaletteModal.getOnXChange();

		if (onXChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_XCHANGE, onXChange));
		}
	}

	protected void renderOnXyChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onXyChange = hSVAPaletteModal.getOnXyChange();

		if (onXyChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_XY_CHANGE, onXyChange));
		}
	}

	protected void renderOnYChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onYChange = hSVAPaletteModal.getOnYChange();

		if (onYChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_YCHANGE, onYChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		java.lang.String onZIndexChange = hSVAPaletteModal.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(HSVAPaletteModal.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}