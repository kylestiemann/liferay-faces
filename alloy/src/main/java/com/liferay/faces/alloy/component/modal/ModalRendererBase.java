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
package com.liferay.faces.alloy.component.modal;

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
public abstract class ModalRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-modal";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Modal modal = (Modal) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var modal = new A.Modal");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlign(renderedAttributes, modal);
		renderAlignOn(renderedAttributes, modal);
		renderModalBodyContent(renderedAttributes, modal);
		renderBoundingBox(renderedAttributes, modal);
		renderCentered(renderedAttributes, modal);
		renderConstrain(renderedAttributes, modal);
		renderContentBox(renderedAttributes, modal);
		renderDestroyOnHide(renderedAttributes, modal);
		renderDestroyed(renderedAttributes, modal);
		renderDisabled(renderedAttributes, modal);
		renderDraggable(renderedAttributes, modal);
		renderFillHeight(renderedAttributes, modal);
		renderFocusOn(renderedAttributes, modal);
		renderFocused(renderedAttributes, modal);
		renderFooterContent(renderedAttributes, modal);
		renderHeaderContent(renderedAttributes, modal);
		renderHeight(renderedAttributes, modal);
		renderHideOn(renderedAttributes, modal);
		renderModalId(renderedAttributes, modal);
		renderInitialized(renderedAttributes, modal);
		renderModalLocale(renderedAttributes, modal);
		renderMaskNode(renderedAttributes, modal);
		renderModal(renderedAttributes, modal);
		renderPreventOverlap(renderedAttributes, modal);
		renderRender(renderedAttributes, modal);
		renderRendered(renderedAttributes, modal);
		renderResizable(renderedAttributes, modal);
		renderShim(renderedAttributes, modal);
		renderSrcNode(renderedAttributes, modal);
		renderStrings(renderedAttributes, modal);
		renderTabIndex(renderedAttributes, modal);
		renderToolbarPosition(renderedAttributes, modal);
		renderToolbars(renderedAttributes, modal);
		renderVisible(renderedAttributes, modal);
		renderWidth(renderedAttributes, modal);
		renderX(renderedAttributes, modal);
		renderXy(renderedAttributes, modal);
		renderY(renderedAttributes, modal);
		renderZIndex(renderedAttributes, modal);

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

	protected void renderAlign(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object align = modal.getAlign();

		if (align != null) {
			renderedAttributes.add(renderObject(Modal.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object alignOn = modal.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(Modal.ALIGN_ON, alignOn));
		}
	}

	protected void renderModalBodyContent(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String modalBodyContent = modal.getModalBodyContent();

		if (modalBodyContent != null) {
			renderedAttributes.add(renderString(Modal.MODAL_BODY_CONTENT, modalBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String boundingBox = modal.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(Modal.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object centered = modal.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderString(Modal.CENTERED, centered));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object constrain = modal.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(Modal.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String contentBox = modal.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(Modal.CONTENT_BOX, contentBox));
		}
	}

	protected void renderDestroyOnHide(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean destroyOnHide = modal.getDestroyOnHide();

		if (destroyOnHide != null) {
			renderedAttributes.add(renderBoolean(Modal.DESTROY_ON_HIDE, destroyOnHide));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean destroyed = modal.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Modal.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean disabled = modal.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(Modal.DISABLED, disabled));
		}
	}

	protected void renderDraggable(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object draggable = modal.getDraggable();

		if (draggable != null) {
			renderedAttributes.add(renderObject(Modal.DRAGGABLE, draggable));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object fillHeight = modal.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(Modal.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocusOn(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object focusOn = modal.getFocusOn();

		if (focusOn != null) {
			renderedAttributes.add(renderArray(Modal.FOCUS_ON, focusOn));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean focused = modal.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(Modal.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object footerContent = modal.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(Modal.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object headerContent = modal.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(Modal.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object height = modal.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(Modal.HEIGHT, height));
		}
	}

	protected void renderHideOn(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object hideOn = modal.getHideOn();

		if (hideOn != null) {
			renderedAttributes.add(renderArray(Modal.HIDE_ON, hideOn));
		}
	}

	protected void renderModalId(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String modalId = modal.getModalId();

		if (modalId != null) {
			renderedAttributes.add(renderString(Modal.MODAL_ID, modalId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean initialized = modal.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Modal.INITIALIZED, initialized));
		}
	}

	protected void renderModalLocale(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String modalLocale = modal.getModalLocale();

		if (modalLocale != null) {
			renderedAttributes.add(renderString(Modal.MODAL_LOCALE, modalLocale));
		}
	}

	protected void renderMaskNode(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object maskNode = modal.getMaskNode();

		if (maskNode != null) {
			renderedAttributes.add(renderString(Modal.MASK_NODE, maskNode));
		}
	}

	protected void renderModal(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean modal_ = modal.getModal();

		if (modal_ != null) {
			renderedAttributes.add(renderBoolean(Modal.MODAL, modal_));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean preventOverlap = modal.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(Modal.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object render = modal.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(Modal.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean rendered = modal.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(Modal.RENDERED, rendered));
		}
	}

	protected void renderResizable(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object resizable = modal.getResizable();

		if (resizable != null) {
			renderedAttributes.add(renderObject(Modal.RESIZABLE, resizable));
		}
	}

	protected void renderShim(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean shim = modal.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(Modal.SHIM, shim));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.String srcNode = modal.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(Modal.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object strings = modal.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(Modal.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object tabIndex = modal.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(Modal.TAB_INDEX, tabIndex));
		}
	}

	protected void renderToolbarPosition(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object toolbarPosition = modal.getToolbarPosition();

		if (toolbarPosition != null) {
			renderedAttributes.add(renderObject(Modal.TOOLBAR_POSITION, toolbarPosition));
		}
	}

	protected void renderToolbars(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object toolbars = modal.getToolbars();

		if (toolbars != null) {
			renderedAttributes.add(renderString(Modal.TOOLBARS, toolbars));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Boolean visible = modal.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(Modal.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object width = modal.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(Modal.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object x = modal.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(Modal.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object xy = modal.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(Modal.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object y = modal.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(Modal.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, Modal modal) throws IOException {
		java.lang.Object zIndex = modal.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(Modal.Z_INDEX, zIndex));
		}
	}

}