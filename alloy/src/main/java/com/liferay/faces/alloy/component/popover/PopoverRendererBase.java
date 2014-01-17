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
package com.liferay.faces.alloy.component.popover;

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
public abstract class PopoverRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-popover";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		Popover popover = (Popover) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var popover = new A.Popover");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlign(renrederedAttributes, popover);
		renderAlignOn(renrederedAttributes, popover);
		renderPopoverBodyContent(renrederedAttributes, popover);
		renderBoundingBox(renrederedAttributes, popover);
		renderCentered(renrederedAttributes, popover);
		renderConstrain(renrederedAttributes, popover);
		renderContentBox(renrederedAttributes, popover);
		renderDestroyed(renrederedAttributes, popover);
		renderDisabled(renrederedAttributes, popover);
		renderFillHeight(renrederedAttributes, popover);
		renderFocusOn(renrederedAttributes, popover);
		renderFocused(renrederedAttributes, popover);
		renderFooterContent(renrederedAttributes, popover);
		renderHeaderContent(renrederedAttributes, popover);
		renderHeight(renrederedAttributes, popover);
		renderHideOn(renrederedAttributes, popover);
		renderPopoverId(renrederedAttributes, popover);
		renderInitialized(renrederedAttributes, popover);
		renderPopoverLocale(renrederedAttributes, popover);
		renderMaskNode(renrederedAttributes, popover);
		renderModal(renrederedAttributes, popover);
		renderPreventOverlap(renrederedAttributes, popover);
		renderRender(renrederedAttributes, popover);
		renderRendered(renrederedAttributes, popover);
		renderShim(renrederedAttributes, popover);
		renderSrcNode(renrederedAttributes, popover);
		renderStrings(renrederedAttributes, popover);
		renderTabIndex(renrederedAttributes, popover);
		renderToolbarPosition(renrederedAttributes, popover);
		renderToolbars(renrederedAttributes, popover);
		renderTriggerToggleEvent(renrederedAttributes, popover);
		renderVisible(renrederedAttributes, popover);
		renderWidth(renrederedAttributes, popover);
		renderX(renrederedAttributes, popover);
		renderXy(renrederedAttributes, popover);
		renderY(renrederedAttributes, popover);
		renderZIndex(renrederedAttributes, popover);
		renderFor_(renrederedAttributes, popover);

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

	protected void renderAlign(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getAlign() != null) {
			renrederedAttributes.add(renderObject("align", popover.getAlign()));
		}
	}

	protected void renderAlignOn(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getAlignOn() != null) {
			renrederedAttributes.add(renderArray("alignOn", popover.getAlignOn()));
		}
	}

	protected void renderPopoverBodyContent(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getPopoverBodyContent() != null) {
			renrederedAttributes.add(renderString("popoverBodyContent", popover.getPopoverBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", popover.getBoundingBox()));
		}
	}

	protected void renderCentered(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getCentered() != null) {
			renrederedAttributes.add(renderString("centered", popover.getCentered()));
		}
	}

	protected void renderConstrain(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getConstrain() != null) {
			renrederedAttributes.add(renderString("constrain", popover.getConstrain()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", popover.getContentBox()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", popover.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", popover.getDisabled()));
		}
	}

	protected void renderFillHeight(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getFillHeight() != null) {
			renrederedAttributes.add(renderString("fillHeight", popover.getFillHeight()));
		}
	}

	protected void renderFocusOn(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getFocusOn() != null) {
			renrederedAttributes.add(renderArray("focusOn", popover.getFocusOn()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", popover.getFocused()));
		}
	}

	protected void renderFooterContent(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getFooterContent() != null) {
			renrederedAttributes.add(renderString("footerContent", popover.getFooterContent()));
		}
	}

	protected void renderHeaderContent(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getHeaderContent() != null) {
			renrederedAttributes.add(renderString("headerContent", popover.getHeaderContent()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getHeight() != null) {
			renrederedAttributes.add(renderString("height", popover.getHeight()));
		}
	}

	protected void renderHideOn(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getHideOn() != null) {
			renrederedAttributes.add(renderArray("hideOn", popover.getHideOn()));
		}
	}

	protected void renderPopoverId(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getPopoverId() != null) {
			renrederedAttributes.add(renderString("popoverId", popover.getPopoverId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", popover.getInitialized()));
		}
	}

	protected void renderPopoverLocale(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getPopoverLocale() != null) {
			renrederedAttributes.add(renderString("popoverLocale", popover.getPopoverLocale()));
		}
	}

	protected void renderMaskNode(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getMaskNode() != null) {
			renrederedAttributes.add(renderString("maskNode", popover.getMaskNode()));
		}
	}

	protected void renderModal(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getModal() != null) {
			renrederedAttributes.add(renderBoolean("modal", popover.getModal()));
		}
	}

	protected void renderPreventOverlap(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getPreventOverlap() != null) {
			renrederedAttributes.add(renderBoolean("preventOverlap", popover.getPreventOverlap()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getRender() != null) {
			renrederedAttributes.add(renderString("render", popover.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", popover.getRendered()));
		}
	}

	protected void renderShim(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getShim() != null) {
			renrederedAttributes.add(renderBoolean("shim", popover.getShim()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", popover.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", popover.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", popover.getTabIndex()));
		}
	}

	protected void renderToolbarPosition(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getToolbarPosition() != null) {
			renrederedAttributes.add(renderObject("toolbarPosition", popover.getToolbarPosition()));
		}
	}

	protected void renderToolbars(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getToolbars() != null) {
			renrederedAttributes.add(renderString("toolbars", popover.getToolbars()));
		}
	}

	protected void renderTriggerToggleEvent(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getTriggerToggleEvent() != null) {
			renrederedAttributes.add(renderString("triggerToggleEvent", popover.getTriggerToggleEvent()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", popover.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getWidth() != null) {
			renrederedAttributes.add(renderString("width", popover.getWidth()));
		}
	}

	protected void renderX(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getX() != null) {
			renrederedAttributes.add(renderNumber("x", popover.getX()));
		}
	}

	protected void renderXy(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getXy() != null) {
			renrederedAttributes.add(renderArray("xy", popover.getXy()));
		}
	}

	protected void renderY(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getY() != null) {
			renrederedAttributes.add(renderNumber("y", popover.getY()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", popover.getZIndex()));
		}
	}

	protected void renderFor_(ArrayList<String> renrederedAttributes, Popover popover) throws IOException {
		if (popover.getFor_() != null) {
			renrederedAttributes.add(renderString("for_", popover.getFor_()));
		}
	}

}