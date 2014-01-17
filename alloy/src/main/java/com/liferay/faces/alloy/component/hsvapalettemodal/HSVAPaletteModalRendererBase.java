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

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
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

		Iterator<String> it = renderedAttributes.iterator();

		while (it.hasNext()) {
			responseWriter.write(it.next());

			if (it.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

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

}