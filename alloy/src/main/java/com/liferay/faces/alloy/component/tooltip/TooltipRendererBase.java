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
public abstract class TooltipRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tooltip";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Tooltip tooltip = (Tooltip) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var tooltip = new A.Tooltip");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlign(renderedAttributes, tooltip);
		renderAlignOn(renderedAttributes, tooltip);
		renderTooltipBodyContent(renderedAttributes, tooltip);
		renderBoundingBox(renderedAttributes, tooltip);
		renderCentered(renderedAttributes, tooltip);
		renderConstrain(renderedAttributes, tooltip);
		renderContentBox(renderedAttributes, tooltip);
		renderDestroyed(renderedAttributes, tooltip);
		renderDisabled(renderedAttributes, tooltip);
		renderDuration(renderedAttributes, tooltip);
		renderFillHeight(renderedAttributes, tooltip);
		renderFocused(renderedAttributes, tooltip);
		renderFooterContent(renderedAttributes, tooltip);
		renderFormatter(renderedAttributes, tooltip);
		renderHeaderContent(renderedAttributes, tooltip);
		renderHeight(renderedAttributes, tooltip);
		renderHideOn(renderedAttributes, tooltip);
		renderTooltipId(renderedAttributes, tooltip);
		renderInitialized(renderedAttributes, tooltip);
		renderTooltipLocale(renderedAttributes, tooltip);
		renderOpacity(renderedAttributes, tooltip);
		renderPreventOverlap(renderedAttributes, tooltip);
		renderRender(renderedAttributes, tooltip);
		renderRendered(renderedAttributes, tooltip);
		renderShim(renderedAttributes, tooltip);
		renderSrcNode(renderedAttributes, tooltip);
		renderStrings(renderedAttributes, tooltip);
		renderTabIndex(renderedAttributes, tooltip);
		renderToolbarPosition(renderedAttributes, tooltip);
		renderToolbars(renderedAttributes, tooltip);
		renderTriggerHideEvent(renderedAttributes, tooltip);
		renderTriggerShowEvent(renderedAttributes, tooltip);
		renderVisible(renderedAttributes, tooltip);
		renderWidth(renderedAttributes, tooltip);
		renderX(renderedAttributes, tooltip);
		renderXy(renderedAttributes, tooltip);
		renderY(renderedAttributes, tooltip);
		renderZIndex(renderedAttributes, tooltip);

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

	protected void renderAlign(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object align = tooltip.getAlign();

		if (align != null) {
			renderedAttributes.add(renderObject(Tooltip.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object alignOn = tooltip.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(Tooltip.ALIGN_ON, alignOn));
		}
	}

	protected void renderTooltipBodyContent(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object tooltipBodyContent = tooltip.getTooltipBodyContent();

		if (tooltipBodyContent != null) {
			renderedAttributes.add(renderString(Tooltip.TOOLTIP_BODY_CONTENT, tooltipBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String boundingBox = tooltip.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(Tooltip.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object centered = tooltip.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderString(Tooltip.CENTERED, centered));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object constrain = tooltip.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(Tooltip.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String contentBox = tooltip.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(Tooltip.CONTENT_BOX, contentBox));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean destroyed = tooltip.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Tooltip.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean disabled = tooltip.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(Tooltip.DISABLED, disabled));
		}
	}

	protected void renderDuration(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object duration = tooltip.getDuration();

		if (duration != null) {
			renderedAttributes.add(renderString(Tooltip.DURATION, duration));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object fillHeight = tooltip.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(Tooltip.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean focused = tooltip.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(Tooltip.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object footerContent = tooltip.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(Tooltip.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderFormatter(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object formatter = tooltip.getFormatter();

		if (formatter != null) {
			renderedAttributes.add(renderString(Tooltip.FORMATTER, formatter));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object headerContent = tooltip.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(Tooltip.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object height = tooltip.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(Tooltip.HEIGHT, height));
		}
	}

	protected void renderHideOn(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object hideOn = tooltip.getHideOn();

		if (hideOn != null) {
			renderedAttributes.add(renderArray(Tooltip.HIDE_ON, hideOn));
		}
	}

	protected void renderTooltipId(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String tooltipId = tooltip.getTooltipId();

		if (tooltipId != null) {
			renderedAttributes.add(renderString(Tooltip.TOOLTIP_ID, tooltipId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean initialized = tooltip.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Tooltip.INITIALIZED, initialized));
		}
	}

	protected void renderTooltipLocale(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String tooltipLocale = tooltip.getTooltipLocale();

		if (tooltipLocale != null) {
			renderedAttributes.add(renderString(Tooltip.TOOLTIP_LOCALE, tooltipLocale));
		}
	}

	protected void renderOpacity(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object opacity = tooltip.getOpacity();

		if (opacity != null) {
			renderedAttributes.add(renderString(Tooltip.OPACITY, opacity));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean preventOverlap = tooltip.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(Tooltip.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object render = tooltip.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(Tooltip.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean rendered = tooltip.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(Tooltip.RENDERED, rendered));
		}
	}

	protected void renderShim(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean shim = tooltip.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(Tooltip.SHIM, shim));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String srcNode = tooltip.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(Tooltip.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object strings = tooltip.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(Tooltip.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object tabIndex = tooltip.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(Tooltip.TAB_INDEX, tabIndex));
		}
	}

	protected void renderToolbarPosition(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object toolbarPosition = tooltip.getToolbarPosition();

		if (toolbarPosition != null) {
			renderedAttributes.add(renderObject(Tooltip.TOOLBAR_POSITION, toolbarPosition));
		}
	}

	protected void renderToolbars(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String toolbars = tooltip.getToolbars();

		if (toolbars != null) {
			renderedAttributes.add(renderString(Tooltip.TOOLBARS, toolbars));
		}
	}

	protected void renderTriggerHideEvent(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String triggerHideEvent = tooltip.getTriggerHideEvent();

		if (triggerHideEvent != null) {
			renderedAttributes.add(renderString(Tooltip.TRIGGER_HIDE_EVENT, triggerHideEvent));
		}
	}

	protected void renderTriggerShowEvent(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.String triggerShowEvent = tooltip.getTriggerShowEvent();

		if (triggerShowEvent != null) {
			renderedAttributes.add(renderString(Tooltip.TRIGGER_SHOW_EVENT, triggerShowEvent));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Boolean visible = tooltip.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(Tooltip.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object width = tooltip.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(Tooltip.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object x = tooltip.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(Tooltip.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object xy = tooltip.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(Tooltip.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object y = tooltip.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(Tooltip.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, Tooltip tooltip) throws IOException {
		java.lang.Object zIndex = tooltip.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(Tooltip.Z_INDEX, zIndex));
		}
	}

}