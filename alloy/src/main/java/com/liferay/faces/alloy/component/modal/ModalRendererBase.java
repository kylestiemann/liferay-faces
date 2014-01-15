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
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.AUIRenderer;
import com.liferay.faces.alloy.renderkit.BufferedResponseWriter;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class ModalRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-modal";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		Modal modal = (Modal) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var modal = new A.Modal");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlign(renrederedAttributes, modal);
		renderAlignOn(renrederedAttributes, modal);
		renderModalBodyContent(renrederedAttributes, modal);
		renderBoundingBox(renrederedAttributes, modal);
		renderCentered(renrederedAttributes, modal);
		renderConstrain(renrederedAttributes, modal);
		renderContentBox(renrederedAttributes, modal);
		renderDestroyOnHide(renrederedAttributes, modal);
		renderDestroyed(renrederedAttributes, modal);
		renderDisabled(renrederedAttributes, modal);
		renderDraggable(renrederedAttributes, modal);
		renderFillHeight(renrederedAttributes, modal);
		renderFocusOn(renrederedAttributes, modal);
		renderFocused(renrederedAttributes, modal);
		renderFooterContent(renrederedAttributes, modal);
		renderHeaderContent(renrederedAttributes, modal);
		renderHeight(renrederedAttributes, modal);
		renderHideOn(renrederedAttributes, modal);
		renderModalId(renrederedAttributes, modal);
		renderInitialized(renrederedAttributes, modal);
		renderModalLocale(renrederedAttributes, modal);
		renderMaskNode(renrederedAttributes, modal);
		renderModal(renrederedAttributes, modal);
		renderPreventOverlap(renrederedAttributes, modal);
		renderRender(renrederedAttributes, modal);
		renderRendered(renrederedAttributes, modal);
		renderResizable(renrederedAttributes, modal);
		renderShim(renrederedAttributes, modal);
		renderSrcNode(renrederedAttributes, modal);
		renderStrings(renrederedAttributes, modal);
		renderTabIndex(renrederedAttributes, modal);
		renderToolbarPosition(renrederedAttributes, modal);
		renderToolbars(renrederedAttributes, modal);
		renderVisible(renrederedAttributes, modal);
		renderWidth(renrederedAttributes, modal);
		renderX(renrederedAttributes, modal);
		renderXy(renrederedAttributes, modal);
		renderY(renrederedAttributes, modal);
		renderZIndex(renrederedAttributes, modal);

		Iterator<String> it = renrederedAttributes.iterator();

		while (it.hasNext()) {
			bufferedResponseWriter.write(it.next());

			if (it.hasNext()) {
				bufferedResponseWriter.write(StringPool.COMMA);
			}
		}

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(".render()");
		bufferedResponseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlign(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getAlign() != null) {
			renrederedAttributes.add(renderObject("align", modal.getAlign()));
		}
	}

	protected void renderAlignOn(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getAlignOn() != null) {
			renrederedAttributes.add(renderArray("alignOn", modal.getAlignOn()));
		}
	}

	protected void renderModalBodyContent(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getModalBodyContent() != null) {
			renrederedAttributes.add(renderString("modalBodyContent", modal.getModalBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", modal.getBoundingBox()));
		}
	}

	protected void renderCentered(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getCentered() != null) {
			renrederedAttributes.add(renderString("centered", modal.getCentered()));
		}
	}

	protected void renderConstrain(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getConstrain() != null) {
			renrederedAttributes.add(renderString("constrain", modal.getConstrain()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", modal.getContentBox()));
		}
	}

	protected void renderDestroyOnHide(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getDestroyOnHide() != null) {
			renrederedAttributes.add(renderBoolean("destroyOnHide", modal.getDestroyOnHide()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", modal.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", modal.getDisabled()));
		}
	}

	protected void renderDraggable(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getDraggable() != null) {
			renrederedAttributes.add(renderObject("draggable", modal.getDraggable()));
		}
	}

	protected void renderFillHeight(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getFillHeight() != null) {
			renrederedAttributes.add(renderString("fillHeight", modal.getFillHeight()));
		}
	}

	protected void renderFocusOn(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getFocusOn() != null) {
			renrederedAttributes.add(renderArray("focusOn", modal.getFocusOn()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", modal.getFocused()));
		}
	}

	protected void renderFooterContent(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getFooterContent() != null) {
			renrederedAttributes.add(renderString("footerContent", modal.getFooterContent()));
		}
	}

	protected void renderHeaderContent(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getHeaderContent() != null) {
			renrederedAttributes.add(renderString("headerContent", modal.getHeaderContent()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getHeight() != null) {
			renrederedAttributes.add(renderString("height", modal.getHeight()));
		}
	}

	protected void renderHideOn(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getHideOn() != null) {
			renrederedAttributes.add(renderArray("hideOn", modal.getHideOn()));
		}
	}

	protected void renderModalId(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getModalId() != null) {
			renrederedAttributes.add(renderString("modalId", modal.getModalId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", modal.getInitialized()));
		}
	}

	protected void renderModalLocale(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getModalLocale() != null) {
			renrederedAttributes.add(renderString("modalLocale", modal.getModalLocale()));
		}
	}

	protected void renderMaskNode(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getMaskNode() != null) {
			renrederedAttributes.add(renderString("maskNode", modal.getMaskNode()));
		}
	}

	protected void renderModal(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getModal() != null) {
			renrederedAttributes.add(renderBoolean("modal", modal.getModal()));
		}
	}

	protected void renderPreventOverlap(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getPreventOverlap() != null) {
			renrederedAttributes.add(renderBoolean("preventOverlap", modal.getPreventOverlap()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getRender() != null) {
			renrederedAttributes.add(renderString("render", modal.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", modal.getRendered()));
		}
	}

	protected void renderResizable(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getResizable() != null) {
			renrederedAttributes.add(renderObject("resizable", modal.getResizable()));
		}
	}

	protected void renderShim(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getShim() != null) {
			renrederedAttributes.add(renderBoolean("shim", modal.getShim()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", modal.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", modal.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", modal.getTabIndex()));
		}
	}

	protected void renderToolbarPosition(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getToolbarPosition() != null) {
			renrederedAttributes.add(renderObject("toolbarPosition", modal.getToolbarPosition()));
		}
	}

	protected void renderToolbars(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getToolbars() != null) {
			renrederedAttributes.add(renderString("toolbars", modal.getToolbars()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", modal.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getWidth() != null) {
			renrederedAttributes.add(renderString("width", modal.getWidth()));
		}
	}

	protected void renderX(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getX() != null) {
			renrederedAttributes.add(renderNumber("x", modal.getX()));
		}
	}

	protected void renderXy(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getXy() != null) {
			renrederedAttributes.add(renderArray("xy", modal.getXy()));
		}
	}

	protected void renderY(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getY() != null) {
			renrederedAttributes.add(renderNumber("y", modal.getY()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, Modal modal) throws IOException {
		if (modal.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", modal.getZIndex()));
		}
	}

}