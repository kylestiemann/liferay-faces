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

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, tooltip);

		bufferedResponseWriter.write("var tooltip = new Y.Tooltip");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAlign(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderAlignOn(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTooltipBodyContent(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderBoundingBox(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCentered(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderConstrain(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContentBox(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDestroyed(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDisabled(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDuration(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFillHeight(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFocused(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFooterContent(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFormatter(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeaderContent(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeight(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHideOn(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTooltipId(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderInitialized(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTooltipLocale(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderOpacity(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPreventOverlap(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRender(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRendered(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShim(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSrcNode(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderToolbarPosition(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderToolbars(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTriggerHideEvent(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTriggerShowEvent(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderVisible(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderWidth(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderX(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderXy(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderY(bufferedResponseWriter, tooltip);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderZIndex(bufferedResponseWriter, tooltip);

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