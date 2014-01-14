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

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, popover);

		bufferedResponseWriter.write("var popover = new Y.Popover");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAlign(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderAlignOn(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPopoverBodyContent(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderBoundingBox(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCentered(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderConstrain(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContentBox(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDestroyed(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDisabled(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFillHeight(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFocusOn(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFocused(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFooterContent(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeaderContent(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeight(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHideOn(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPopoverId(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderInitialized(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPopoverLocale(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderMaskNode(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderModal(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPreventOverlap(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRender(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRendered(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShim(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSrcNode(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderToolbarPosition(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderToolbars(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTriggerToggleEvent(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderVisible(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderWidth(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderX(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderXy(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderY(bufferedResponseWriter, popover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderZIndex(bufferedResponseWriter, popover);

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