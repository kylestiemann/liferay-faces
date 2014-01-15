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

		bufferedResponseWriter.write("var tooltip = new A.Tooltip");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlign(renrederedAttributes, tooltip);
		renderAlignOn(renrederedAttributes, tooltip);
		renderTooltipBodyContent(renrederedAttributes, tooltip);
		renderBoundingBox(renrederedAttributes, tooltip);
		renderCentered(renrederedAttributes, tooltip);
		renderConstrain(renrederedAttributes, tooltip);
		renderContentBox(renrederedAttributes, tooltip);
		renderDestroyed(renrederedAttributes, tooltip);
		renderDisabled(renrederedAttributes, tooltip);
		renderDuration(renrederedAttributes, tooltip);
		renderFillHeight(renrederedAttributes, tooltip);
		renderFocused(renrederedAttributes, tooltip);
		renderFooterContent(renrederedAttributes, tooltip);
		renderFormatter(renrederedAttributes, tooltip);
		renderHeaderContent(renrederedAttributes, tooltip);
		renderHeight(renrederedAttributes, tooltip);
		renderHideOn(renrederedAttributes, tooltip);
		renderTooltipId(renrederedAttributes, tooltip);
		renderInitialized(renrederedAttributes, tooltip);
		renderTooltipLocale(renrederedAttributes, tooltip);
		renderOpacity(renrederedAttributes, tooltip);
		renderPreventOverlap(renrederedAttributes, tooltip);
		renderRender(renrederedAttributes, tooltip);
		renderRendered(renrederedAttributes, tooltip);
		renderShim(renrederedAttributes, tooltip);
		renderSrcNode(renrederedAttributes, tooltip);
		renderStrings(renrederedAttributes, tooltip);
		renderTabIndex(renrederedAttributes, tooltip);
		renderToolbarPosition(renrederedAttributes, tooltip);
		renderToolbars(renrederedAttributes, tooltip);
		renderTriggerHideEvent(renrederedAttributes, tooltip);
		renderTriggerShowEvent(renrederedAttributes, tooltip);
		renderVisible(renrederedAttributes, tooltip);
		renderWidth(renrederedAttributes, tooltip);
		renderX(renrederedAttributes, tooltip);
		renderXy(renrederedAttributes, tooltip);
		renderY(renrederedAttributes, tooltip);
		renderZIndex(renrederedAttributes, tooltip);

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

		handleBuffer(facesContext, tooltip);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlign(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getAlign() != null) {
			renrederedAttributes.add(renderObject("align", tooltip.getAlign()));
		}
	}

	protected void renderAlignOn(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getAlignOn() != null) {
			renrederedAttributes.add(renderArray("alignOn", tooltip.getAlignOn()));
		}
	}

	protected void renderTooltipBodyContent(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getTooltipBodyContent() != null) {
			renrederedAttributes.add(renderString("tooltipBodyContent", tooltip.getTooltipBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", tooltip.getBoundingBox()));
		}
	}

	protected void renderCentered(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getCentered() != null) {
			renrederedAttributes.add(renderString("centered", tooltip.getCentered()));
		}
	}

	protected void renderConstrain(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getConstrain() != null) {
			renrederedAttributes.add(renderString("constrain", tooltip.getConstrain()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", tooltip.getContentBox()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", tooltip.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", tooltip.getDisabled()));
		}
	}

	protected void renderDuration(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getDuration() != null) {
			renrederedAttributes.add(renderString("duration", tooltip.getDuration()));
		}
	}

	protected void renderFillHeight(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getFillHeight() != null) {
			renrederedAttributes.add(renderString("fillHeight", tooltip.getFillHeight()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", tooltip.getFocused()));
		}
	}

	protected void renderFooterContent(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getFooterContent() != null) {
			renrederedAttributes.add(renderString("footerContent", tooltip.getFooterContent()));
		}
	}

	protected void renderFormatter(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getFormatter() != null) {
			renrederedAttributes.add(renderString("formatter", tooltip.getFormatter()));
		}
	}

	protected void renderHeaderContent(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getHeaderContent() != null) {
			renrederedAttributes.add(renderString("headerContent", tooltip.getHeaderContent()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getHeight() != null) {
			renrederedAttributes.add(renderString("height", tooltip.getHeight()));
		}
	}

	protected void renderHideOn(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getHideOn() != null) {
			renrederedAttributes.add(renderArray("hideOn", tooltip.getHideOn()));
		}
	}

	protected void renderTooltipId(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getTooltipId() != null) {
			renrederedAttributes.add(renderString("tooltipId", tooltip.getTooltipId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", tooltip.getInitialized()));
		}
	}

	protected void renderTooltipLocale(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getTooltipLocale() != null) {
			renrederedAttributes.add(renderString("tooltipLocale", tooltip.getTooltipLocale()));
		}
	}

	protected void renderOpacity(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getOpacity() != null) {
			renrederedAttributes.add(renderString("opacity", tooltip.getOpacity()));
		}
	}

	protected void renderPreventOverlap(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getPreventOverlap() != null) {
			renrederedAttributes.add(renderBoolean("preventOverlap", tooltip.getPreventOverlap()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getRender() != null) {
			renrederedAttributes.add(renderString("render", tooltip.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", tooltip.getRendered()));
		}
	}

	protected void renderShim(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getShim() != null) {
			renrederedAttributes.add(renderBoolean("shim", tooltip.getShim()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", tooltip.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", tooltip.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", tooltip.getTabIndex()));
		}
	}

	protected void renderToolbarPosition(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getToolbarPosition() != null) {
			renrederedAttributes.add(renderObject("toolbarPosition", tooltip.getToolbarPosition()));
		}
	}

	protected void renderToolbars(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getToolbars() != null) {
			renrederedAttributes.add(renderString("toolbars", tooltip.getToolbars()));
		}
	}

	protected void renderTriggerHideEvent(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getTriggerHideEvent() != null) {
			renrederedAttributes.add(renderString("triggerHideEvent", tooltip.getTriggerHideEvent()));
		}
	}

	protected void renderTriggerShowEvent(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getTriggerShowEvent() != null) {
			renrederedAttributes.add(renderString("triggerShowEvent", tooltip.getTriggerShowEvent()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", tooltip.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getWidth() != null) {
			renrederedAttributes.add(renderString("width", tooltip.getWidth()));
		}
	}

	protected void renderX(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getX() != null) {
			renrederedAttributes.add(renderNumber("x", tooltip.getX()));
		}
	}

	protected void renderXy(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getXy() != null) {
			renrederedAttributes.add(renderArray("xy", tooltip.getXy()));
		}
	}

	protected void renderY(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getY() != null) {
			renrederedAttributes.add(renderNumber("y", tooltip.getY()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, Tooltip tooltip) throws IOException {
		if (tooltip.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", tooltip.getZIndex()));
		}
	}

}