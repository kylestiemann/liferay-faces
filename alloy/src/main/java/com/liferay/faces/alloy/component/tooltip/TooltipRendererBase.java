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
package com.liferay.faces.alloy.component.tooltip;

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
public abstract class TooltipRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tooltip";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Tooltip tooltip = (Tooltip) uiComponent;
		encodeHTML(facesContext, tooltip);
		encodeJavaScript(facesContext, tooltip);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Tooltip tooltip) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Tooltip tooltip) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, tooltip);

		bufferedResponseWriter.write("var tooltip = new Y.Tooltip");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAlign(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderAlignOn(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderTooltipBodyContent(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderBoundingBox(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderCentered(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderConstrain(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderContentBox(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderDestroyed(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderDisabled(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderDuration(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderFillHeight(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderFocused(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderFooterContent(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderFormatter(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderHeaderContent(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderHeight(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderHideOn(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderTooltipId(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderInitialized(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderTooltipLocale(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderOpacity(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderPreventOverlap(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderRender(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderRendered(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderShim(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderSrcNode(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderTabIndex(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderToolbarPosition(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderToolbars(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderTriggerHideEvent(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderTriggerShowEvent(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderVisible(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderWidth(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderX(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderXy(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderY(responseWriter, tooltip);
		responseWriter.write(StringPool.COMMA);
		renderZIndex(responseWriter, tooltip);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, tooltip);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlign(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderObject(responseWriter, "align", tooltip.getAlign());
	}

	protected void renderAlignOn(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderArray(responseWriter, "alignOn", tooltip.getAlignOn());
	}

	protected void renderTooltipBodyContent(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "tooltipBodyContent", tooltip.getTooltipBodyContent());
	}

	protected void renderBoundingBox(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "boundingBox", tooltip.getBoundingBox());
	}

	protected void renderCentered(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "centered", tooltip.getCentered());
	}

	protected void renderConstrain(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "constrain", tooltip.getConstrain());
	}

	protected void renderContentBox(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "contentBox", tooltip.getContentBox());
	}

	protected void renderDestroyed(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderBoolean(responseWriter, "destroyed", tooltip.getDestroyed());
	}

	protected void renderDisabled(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderBoolean(responseWriter, "disabled", tooltip.getDisabled());
	}

	protected void renderDuration(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "duration", tooltip.getDuration());
	}

	protected void renderFillHeight(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "fillHeight", tooltip.getFillHeight());
	}

	protected void renderFocused(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderBoolean(responseWriter, "focused", tooltip.getFocused());
	}

	protected void renderFooterContent(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "footerContent", tooltip.getFooterContent());
	}

	protected void renderFormatter(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "formatter", tooltip.getFormatter());
	}

	protected void renderHeaderContent(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "headerContent", tooltip.getHeaderContent());
	}

	protected void renderHeight(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "height", tooltip.getHeight());
	}

	protected void renderHideOn(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderArray(responseWriter, "hideOn", tooltip.getHideOn());
	}

	protected void renderTooltipId(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "tooltipId", tooltip.getTooltipId());
	}

	protected void renderInitialized(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderBoolean(responseWriter, "initialized", tooltip.getInitialized());
	}

	protected void renderTooltipLocale(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "tooltipLocale", tooltip.getTooltipLocale());
	}

	protected void renderOpacity(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "opacity", tooltip.getOpacity());
	}

	protected void renderPreventOverlap(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderBoolean(responseWriter, "preventOverlap", tooltip.getPreventOverlap());
	}

	protected void renderRender(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "render", tooltip.getRender());
	}

	protected void renderRendered(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderBoolean(responseWriter, "rendered", tooltip.getRendered());
	}

	protected void renderShim(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderBoolean(responseWriter, "shim", tooltip.getShim());
	}

	protected void renderSrcNode(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "srcNode", tooltip.getSrcNode());
	}

	protected void renderStrings(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderObject(responseWriter, "strings", tooltip.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderNumber(responseWriter, "tabIndex", tooltip.getTabIndex());
	}

	protected void renderToolbarPosition(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderObject(responseWriter, "toolbarPosition", tooltip.getToolbarPosition());
	}

	protected void renderToolbars(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "toolbars", tooltip.getToolbars());
	}

	protected void renderTriggerHideEvent(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "triggerHideEvent", tooltip.getTriggerHideEvent());
	}

	protected void renderTriggerShowEvent(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "triggerShowEvent", tooltip.getTriggerShowEvent());
	}

	protected void renderVisible(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderBoolean(responseWriter, "visible", tooltip.getVisible());
	}

	protected void renderWidth(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderString(responseWriter, "width", tooltip.getWidth());
	}

	protected void renderX(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderNumber(responseWriter, "x", tooltip.getX());
	}

	protected void renderXy(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderArray(responseWriter, "xy", tooltip.getXy());
	}

	protected void renderY(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderNumber(responseWriter, "y", tooltip.getY());
	}

	protected void renderZIndex(ResponseWriter responseWriter, Tooltip tooltip) throws IOException {
		renderNumber(responseWriter, "zIndex", tooltip.getZIndex());
	}

}