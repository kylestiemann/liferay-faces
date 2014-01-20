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
public abstract class PopoverRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-popover";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Popover popover = (Popover) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var popover = new A.Popover");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlign(renderedAttributes, popover);
		renderAlignOn(renderedAttributes, popover);
		renderPopoverBodyContent(renderedAttributes, popover);
		renderBoundingBox(renderedAttributes, popover);
		renderCentered(renderedAttributes, popover);
		renderConstrain(renderedAttributes, popover);
		renderContentBox(renderedAttributes, popover);
		renderDestroyed(renderedAttributes, popover);
		renderDisabled(renderedAttributes, popover);
		renderFillHeight(renderedAttributes, popover);
		renderFocusOn(renderedAttributes, popover);
		renderFocused(renderedAttributes, popover);
		renderFooterContent(renderedAttributes, popover);
		renderHeaderContent(renderedAttributes, popover);
		renderHeight(renderedAttributes, popover);
		renderHideOn(renderedAttributes, popover);
		renderPopoverId(renderedAttributes, popover);
		renderInitialized(renderedAttributes, popover);
		renderPopoverLocale(renderedAttributes, popover);
		renderMaskNode(renderedAttributes, popover);
		renderModal(renderedAttributes, popover);
		renderPreventOverlap(renderedAttributes, popover);
		renderRender(renderedAttributes, popover);
		renderRendered(renderedAttributes, popover);
		renderShim(renderedAttributes, popover);
		renderSrcNode(renderedAttributes, popover);
		renderStrings(renderedAttributes, popover);
		renderTabIndex(renderedAttributes, popover);
		renderToolbarPosition(renderedAttributes, popover);
		renderToolbars(renderedAttributes, popover);
		renderTriggerToggleEvent(renderedAttributes, popover);
		renderVisible(renderedAttributes, popover);
		renderWidth(renderedAttributes, popover);
		renderX(renderedAttributes, popover);
		renderXy(renderedAttributes, popover);
		renderY(renderedAttributes, popover);
		renderZIndex(renderedAttributes, popover);
		renderFor(renderedAttributes, popover);

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

	protected void renderAlign(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object align = popover.getAlign();

		if (align != null) {
			renderedAttributes.add(renderObject(Popover.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object alignOn = popover.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(Popover.ALIGN_ON, alignOn));
		}
	}

	protected void renderPopoverBodyContent(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object popoverBodyContent = popover.getPopoverBodyContent();

		if (popoverBodyContent != null) {
			renderedAttributes.add(renderString(Popover.POPOVER_BODY_CONTENT, popoverBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String boundingBox = popover.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(Popover.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object centered = popover.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderString(Popover.CENTERED, centered));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object constrain = popover.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(Popover.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String contentBox = popover.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(Popover.CONTENT_BOX, contentBox));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean destroyed = popover.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Popover.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean disabled = popover.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(Popover.DISABLED, disabled));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object fillHeight = popover.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(Popover.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocusOn(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object focusOn = popover.getFocusOn();

		if (focusOn != null) {
			renderedAttributes.add(renderArray(Popover.FOCUS_ON, focusOn));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean focused = popover.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(Popover.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object footerContent = popover.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(Popover.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object headerContent = popover.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(Popover.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object height = popover.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(Popover.HEIGHT, height));
		}
	}

	protected void renderHideOn(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object hideOn = popover.getHideOn();

		if (hideOn != null) {
			renderedAttributes.add(renderArray(Popover.HIDE_ON, hideOn));
		}
	}

	protected void renderPopoverId(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String popoverId = popover.getPopoverId();

		if (popoverId != null) {
			renderedAttributes.add(renderString(Popover.POPOVER_ID, popoverId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean initialized = popover.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Popover.INITIALIZED, initialized));
		}
	}

	protected void renderPopoverLocale(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String popoverLocale = popover.getPopoverLocale();

		if (popoverLocale != null) {
			renderedAttributes.add(renderString(Popover.POPOVER_LOCALE, popoverLocale));
		}
	}

	protected void renderMaskNode(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object maskNode = popover.getMaskNode();

		if (maskNode != null) {
			renderedAttributes.add(renderString(Popover.MASK_NODE, maskNode));
		}
	}

	protected void renderModal(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean modal = popover.getModal();

		if (modal != null) {
			renderedAttributes.add(renderBoolean(Popover.MODAL, modal));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean preventOverlap = popover.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(Popover.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object render = popover.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(Popover.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean rendered = popover.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(Popover.RENDERED, rendered));
		}
	}

	protected void renderShim(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean shim = popover.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(Popover.SHIM, shim));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String srcNode = popover.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(Popover.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object strings = popover.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(Popover.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object tabIndex = popover.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(Popover.TAB_INDEX, tabIndex));
		}
	}

	protected void renderToolbarPosition(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object toolbarPosition = popover.getToolbarPosition();

		if (toolbarPosition != null) {
			renderedAttributes.add(renderObject(Popover.TOOLBAR_POSITION, toolbarPosition));
		}
	}

	protected void renderToolbars(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String toolbars = popover.getToolbars();

		if (toolbars != null) {
			renderedAttributes.add(renderString(Popover.TOOLBARS, toolbars));
		}
	}

	protected void renderTriggerToggleEvent(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String triggerToggleEvent = popover.getTriggerToggleEvent();

		if (triggerToggleEvent != null) {
			renderedAttributes.add(renderString(Popover.TRIGGER_TOGGLE_EVENT, triggerToggleEvent));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Boolean visible = popover.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(Popover.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object width = popover.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(Popover.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object x = popover.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(Popover.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object xy = popover.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(Popover.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object y = popover.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(Popover.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.Object zIndex = popover.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(Popover.Z_INDEX, zIndex));
		}
	}

	protected void renderFor(List<String> renderedAttributes, Popover popover) throws IOException {
		java.lang.String for_ = popover.getFor();

		if (for_ != null) {
			renderedAttributes.add(renderString(Popover.FOR, for_));
		}
	}

}