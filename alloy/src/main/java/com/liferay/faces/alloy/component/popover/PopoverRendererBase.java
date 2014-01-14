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

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Popover popover = (Popover) uiComponent;
		encodeHTML(facesContext, popover);
		encodeJavaScript(facesContext, popover);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Popover popover) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Popover popover) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, popover);

		bufferedResponseWriter.write("var popover = new Y.Popover");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAlign(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderAlignOn(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderPopoverBodyContent(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderBoundingBox(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderCentered(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderConstrain(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderContentBox(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderDestroyed(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderDisabled(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderFillHeight(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderFocusOn(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderFocused(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderFooterContent(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderHeaderContent(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderHeight(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderHideOn(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderPopoverId(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderInitialized(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderPopoverLocale(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderMaskNode(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderModal(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderPreventOverlap(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderRender(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderRendered(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderShim(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderSrcNode(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderTabIndex(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderToolbarPosition(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderToolbars(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderTriggerToggleEvent(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderVisible(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderWidth(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderX(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderXy(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderY(responseWriter, popover);
		responseWriter.write(StringPool.COMMA);
		renderZIndex(responseWriter, popover);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, popover);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlign(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderObject(responseWriter, "align", popover.getAlign());
	}

	protected void renderAlignOn(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderArray(responseWriter, "alignOn", popover.getAlignOn());
	}

	protected void renderPopoverBodyContent(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderString(responseWriter, "popoverBodyContent", popover.getPopoverBodyContent());
	}

	protected void renderBoundingBox(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderString(responseWriter, "boundingBox", popover.getBoundingBox());
	}

	protected void renderCentered(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderString(responseWriter, "centered", popover.getCentered());
	}

	protected void renderConstrain(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderString(responseWriter, "constrain", popover.getConstrain());
	}

	protected void renderContentBox(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderString(responseWriter, "contentBox", popover.getContentBox());
	}

	protected void renderDestroyed(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderBoolean(responseWriter, "destroyed", popover.getDestroyed());
	}

	protected void renderDisabled(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderBoolean(responseWriter, "disabled", popover.getDisabled());
	}

	protected void renderFillHeight(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderString(responseWriter, "fillHeight", popover.getFillHeight());
	}

	protected void renderFocusOn(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderArray(responseWriter, "focusOn", popover.getFocusOn());
	}

	protected void renderFocused(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderBoolean(responseWriter, "focused", popover.getFocused());
	}

	protected void renderFooterContent(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderString(responseWriter, "footerContent", popover.getFooterContent());
	}

	protected void renderHeaderContent(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderString(responseWriter, "headerContent", popover.getHeaderContent());
	}

	protected void renderHeight(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderString(responseWriter, "height", popover.getHeight());
	}

	protected void renderHideOn(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderArray(responseWriter, "hideOn", popover.getHideOn());
	}

	protected void renderPopoverId(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderString(responseWriter, "popoverId", popover.getPopoverId());
	}

	protected void renderInitialized(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderBoolean(responseWriter, "initialized", popover.getInitialized());
	}

	protected void renderPopoverLocale(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderString(responseWriter, "popoverLocale", popover.getPopoverLocale());
	}

	protected void renderMaskNode(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderString(responseWriter, "maskNode", popover.getMaskNode());
	}

	protected void renderModal(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderBoolean(responseWriter, "modal", popover.getModal());
	}

	protected void renderPreventOverlap(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderBoolean(responseWriter, "preventOverlap", popover.getPreventOverlap());
	}

	protected void renderRender(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderString(responseWriter, "render", popover.getRender());
	}

	protected void renderRendered(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderBoolean(responseWriter, "rendered", popover.getRendered());
	}

	protected void renderShim(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderBoolean(responseWriter, "shim", popover.getShim());
	}

	protected void renderSrcNode(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderString(responseWriter, "srcNode", popover.getSrcNode());
	}

	protected void renderStrings(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderObject(responseWriter, "strings", popover.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderNumber(responseWriter, "tabIndex", popover.getTabIndex());
	}

	protected void renderToolbarPosition(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderObject(responseWriter, "toolbarPosition", popover.getToolbarPosition());
	}

	protected void renderToolbars(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderString(responseWriter, "toolbars", popover.getToolbars());
	}

	protected void renderTriggerToggleEvent(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderString(responseWriter, "triggerToggleEvent", popover.getTriggerToggleEvent());
	}

	protected void renderVisible(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderBoolean(responseWriter, "visible", popover.getVisible());
	}

	protected void renderWidth(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderString(responseWriter, "width", popover.getWidth());
	}

	protected void renderX(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderNumber(responseWriter, "x", popover.getX());
	}

	protected void renderXy(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderArray(responseWriter, "xy", popover.getXy());
	}

	protected void renderY(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderNumber(responseWriter, "y", popover.getY());
	}

	protected void renderZIndex(ResponseWriter responseWriter, Popover popover) throws IOException {
		renderNumber(responseWriter, "zIndex", popover.getZIndex());
	}

}