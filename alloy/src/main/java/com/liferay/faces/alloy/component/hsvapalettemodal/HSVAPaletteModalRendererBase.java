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
public abstract class HSVAPaletteModalRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-hsv-palette-modal";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		HSVAPaletteModal hSVAPaletteModal = (HSVAPaletteModal) uiComponent;
		encodeHTML(facesContext, hSVAPaletteModal);
		encodeJavaScript(facesContext, hSVAPaletteModal);
	}

	protected abstract void encodeHTML(FacesContext facesContext, HSVAPaletteModal hSVAPaletteModal) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, HSVAPaletteModal hSVAPaletteModal) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, hSVAPaletteModal);

		bufferedResponseWriter.write("var hSVAPaletteModal = new A.HSVAPaletteModal");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlign(renrederedAttributes, hSVAPaletteModal);
		renderAlignOn(renrederedAttributes, hSVAPaletteModal);
		renderHsvapalettemodalBodyContent(renrederedAttributes, hSVAPaletteModal);
		renderBoundingBox(renrederedAttributes, hSVAPaletteModal);
		renderCentered(renrederedAttributes, hSVAPaletteModal);
		renderConstrain(renrederedAttributes, hSVAPaletteModal);
		renderContentBox(renrederedAttributes, hSVAPaletteModal);
		renderDestroyOnHide(renrederedAttributes, hSVAPaletteModal);
		renderDestroyed(renrederedAttributes, hSVAPaletteModal);
		renderDisabled(renrederedAttributes, hSVAPaletteModal);
		renderDraggable(renrederedAttributes, hSVAPaletteModal);
		renderFillHeight(renrederedAttributes, hSVAPaletteModal);
		renderFocusOn(renrederedAttributes, hSVAPaletteModal);
		renderFocused(renrederedAttributes, hSVAPaletteModal);
		renderFooterContent(renrederedAttributes, hSVAPaletteModal);
		renderHeaderContent(renrederedAttributes, hSVAPaletteModal);
		renderHeight(renrederedAttributes, hSVAPaletteModal);
		renderHideOn(renrederedAttributes, hSVAPaletteModal);
		renderHsv(renrederedAttributes, hSVAPaletteModal);
		renderHsvapalettemodalId(renrederedAttributes, hSVAPaletteModal);
		renderInitialized(renrederedAttributes, hSVAPaletteModal);
		renderHsvapalettemodalLocale(renrederedAttributes, hSVAPaletteModal);
		renderMaskNode(renrederedAttributes, hSVAPaletteModal);
		renderModal(renrederedAttributes, hSVAPaletteModal);
		renderPreventOverlap(renrederedAttributes, hSVAPaletteModal);
		renderRender(renrederedAttributes, hSVAPaletteModal);
		renderRendered(renrederedAttributes, hSVAPaletteModal);
		renderResizable(renrederedAttributes, hSVAPaletteModal);
		renderSelected(renrederedAttributes, hSVAPaletteModal);
		renderShim(renrederedAttributes, hSVAPaletteModal);
		renderSrcNode(renrederedAttributes, hSVAPaletteModal);
		renderStrings(renrederedAttributes, hSVAPaletteModal);
		renderTabIndex(renrederedAttributes, hSVAPaletteModal);
		renderToolbarPosition(renrederedAttributes, hSVAPaletteModal);
		renderToolbars(renrederedAttributes, hSVAPaletteModal);
		renderVisible(renrederedAttributes, hSVAPaletteModal);
		renderWidth(renrederedAttributes, hSVAPaletteModal);
		renderX(renrederedAttributes, hSVAPaletteModal);
		renderXy(renrederedAttributes, hSVAPaletteModal);
		renderY(renrederedAttributes, hSVAPaletteModal);
		renderZIndex(renrederedAttributes, hSVAPaletteModal);

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

		endJavaScript(facesContext);

		handleBuffer(facesContext, hSVAPaletteModal);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlign(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getAlign() != null) {
			renrederedAttributes.add(renderObject("align", hSVAPaletteModal.getAlign()));
		}
	}

	protected void renderAlignOn(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getAlignOn() != null) {
			renrederedAttributes.add(renderArray("alignOn", hSVAPaletteModal.getAlignOn()));
		}
	}

	protected void renderHsvapalettemodalBodyContent(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getHsvapalettemodalBodyContent() != null) {
			renrederedAttributes.add(renderString("hsvapalettemodalBodyContent", hSVAPaletteModal.getHsvapalettemodalBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", hSVAPaletteModal.getBoundingBox()));
		}
	}

	protected void renderCentered(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getCentered() != null) {
			renrederedAttributes.add(renderString("centered", hSVAPaletteModal.getCentered()));
		}
	}

	protected void renderConstrain(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getConstrain() != null) {
			renrederedAttributes.add(renderString("constrain", hSVAPaletteModal.getConstrain()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", hSVAPaletteModal.getContentBox()));
		}
	}

	protected void renderDestroyOnHide(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getDestroyOnHide() != null) {
			renrederedAttributes.add(renderBoolean("destroyOnHide", hSVAPaletteModal.getDestroyOnHide()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", hSVAPaletteModal.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", hSVAPaletteModal.getDisabled()));
		}
	}

	protected void renderDraggable(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getDraggable() != null) {
			renrederedAttributes.add(renderObject("draggable", hSVAPaletteModal.getDraggable()));
		}
	}

	protected void renderFillHeight(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getFillHeight() != null) {
			renrederedAttributes.add(renderString("fillHeight", hSVAPaletteModal.getFillHeight()));
		}
	}

	protected void renderFocusOn(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getFocusOn() != null) {
			renrederedAttributes.add(renderArray("focusOn", hSVAPaletteModal.getFocusOn()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", hSVAPaletteModal.getFocused()));
		}
	}

	protected void renderFooterContent(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getFooterContent() != null) {
			renrederedAttributes.add(renderString("footerContent", hSVAPaletteModal.getFooterContent()));
		}
	}

	protected void renderHeaderContent(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getHeaderContent() != null) {
			renrederedAttributes.add(renderString("headerContent", hSVAPaletteModal.getHeaderContent()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getHeight() != null) {
			renrederedAttributes.add(renderString("height", hSVAPaletteModal.getHeight()));
		}
	}

	protected void renderHideOn(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getHideOn() != null) {
			renrederedAttributes.add(renderArray("hideOn", hSVAPaletteModal.getHideOn()));
		}
	}

	protected void renderHsv(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getHsv() != null) {
			renrederedAttributes.add(renderObject("hsv", hSVAPaletteModal.getHsv()));
		}
	}

	protected void renderHsvapalettemodalId(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getHsvapalettemodalId() != null) {
			renrederedAttributes.add(renderString("hsvapalettemodalId", hSVAPaletteModal.getHsvapalettemodalId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", hSVAPaletteModal.getInitialized()));
		}
	}

	protected void renderHsvapalettemodalLocale(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getHsvapalettemodalLocale() != null) {
			renrederedAttributes.add(renderString("hsvapalettemodalLocale", hSVAPaletteModal.getHsvapalettemodalLocale()));
		}
	}

	protected void renderMaskNode(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getMaskNode() != null) {
			renrederedAttributes.add(renderString("maskNode", hSVAPaletteModal.getMaskNode()));
		}
	}

	protected void renderModal(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getModal() != null) {
			renrederedAttributes.add(renderBoolean("modal", hSVAPaletteModal.getModal()));
		}
	}

	protected void renderPreventOverlap(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getPreventOverlap() != null) {
			renrederedAttributes.add(renderBoolean("preventOverlap", hSVAPaletteModal.getPreventOverlap()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getRender() != null) {
			renrederedAttributes.add(renderString("render", hSVAPaletteModal.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", hSVAPaletteModal.getRendered()));
		}
	}

	protected void renderResizable(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getResizable() != null) {
			renrederedAttributes.add(renderObject("resizable", hSVAPaletteModal.getResizable()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getSelected() != null) {
			renrederedAttributes.add(renderString("selected", hSVAPaletteModal.getSelected()));
		}
	}

	protected void renderShim(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getShim() != null) {
			renrederedAttributes.add(renderBoolean("shim", hSVAPaletteModal.getShim()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", hSVAPaletteModal.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", hSVAPaletteModal.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", hSVAPaletteModal.getTabIndex()));
		}
	}

	protected void renderToolbarPosition(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getToolbarPosition() != null) {
			renrederedAttributes.add(renderObject("toolbarPosition", hSVAPaletteModal.getToolbarPosition()));
		}
	}

	protected void renderToolbars(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getToolbars() != null) {
			renrederedAttributes.add(renderString("toolbars", hSVAPaletteModal.getToolbars()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", hSVAPaletteModal.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getWidth() != null) {
			renrederedAttributes.add(renderString("width", hSVAPaletteModal.getWidth()));
		}
	}

	protected void renderX(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getX() != null) {
			renrederedAttributes.add(renderNumber("x", hSVAPaletteModal.getX()));
		}
	}

	protected void renderXy(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getXy() != null) {
			renrederedAttributes.add(renderArray("xy", hSVAPaletteModal.getXy()));
		}
	}

	protected void renderY(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getY() != null) {
			renrederedAttributes.add(renderNumber("y", hSVAPaletteModal.getY()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		if (hSVAPaletteModal.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", hSVAPaletteModal.getZIndex()));
		}
	}

}