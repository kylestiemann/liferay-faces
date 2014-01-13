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
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class TooltipRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		Tooltip tooltip = (Tooltip) uiComponent;
		encodeHTML(facesContext, tooltip);
		encodeJavaScript(facesContext, tooltip);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Tooltip tooltip) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Tooltip tooltip) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", tooltip);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-tooltip',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var tooltip = new Y.Tooltip");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(tooltip.getAlign() != null)
		{

			responseWriter.write("align: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getAlign().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getAlignOn() != null)
		{

			responseWriter.write("alignOn: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getAlignOn().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getTooltipBodyContent() != null)
		{

			responseWriter.write("tooltipBodyContent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getTooltipBodyContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getBoundingBox() != null)
		{

			responseWriter.write("boundingBox: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getBoundingBox().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getCentered() != null)
		{

			responseWriter.write("centered: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getCentered().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getConstrain() != null)
		{

			responseWriter.write("constrain: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getConstrain().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getContentBox() != null)
		{

			responseWriter.write("contentBox: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getContentBox().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getDestroyed() != null)
		{

			responseWriter.write("destroyed: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getDestroyed().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getDisabled() != null)
		{

			responseWriter.write("disabled: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getDisabled().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getDuration() != null)
		{

			responseWriter.write("duration: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getDuration().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getFillHeight() != null)
		{

			responseWriter.write("fillHeight: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getFillHeight().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getFocused() != null)
		{

			responseWriter.write("focused: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getFocused().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getFooterContent() != null)
		{

			responseWriter.write("footerContent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getFooterContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getFormatter() != null)
		{

			responseWriter.write("formatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getHeaderContent() != null)
		{

			responseWriter.write("headerContent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getHeaderContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getHeight() != null)
		{

			responseWriter.write("height: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getHeight().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getHideOn() != null)
		{

			responseWriter.write("hideOn: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getHideOn().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getTooltipId() != null)
		{

			responseWriter.write("tooltipId: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getTooltipId().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getInitialized() != null)
		{

			responseWriter.write("initialized: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getInitialized().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getTooltipLocale() != null)
		{

			responseWriter.write("tooltipLocale: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getTooltipLocale().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getOpacity() != null)
		{

			responseWriter.write("opacity: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getOpacity().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getPreventOverlap() != null)
		{

			responseWriter.write("preventOverlap: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getPreventOverlap().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getRender() != null)
		{

			responseWriter.write("render: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getRender().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getRendered() != null)
		{

			responseWriter.write("rendered: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getRendered().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getShim() != null)
		{

			responseWriter.write("shim: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getShim().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getSrcNode() != null)
		{

			responseWriter.write("srcNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getSrcNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getTabIndex() != null)
		{

			responseWriter.write("tabIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getTabIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getToolbarPosition() != null)
		{

			responseWriter.write("toolbarPosition: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getToolbarPosition().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getToolbars() != null)
		{

			responseWriter.write("toolbars: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getToolbars().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getTriggerHideEvent() != null)
		{

			responseWriter.write("triggerHideEvent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getTriggerHideEvent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getTriggerShowEvent() != null)
		{

			responseWriter.write("triggerShowEvent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getTriggerShowEvent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getVisible() != null)
		{

			responseWriter.write("visible: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getVisible().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getWidth() != null)
		{

			responseWriter.write("width: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getWidth().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getX() != null)
		{

			responseWriter.write("x: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getX().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getXy() != null)
		{

			responseWriter.write("xy: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getXy().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getY() != null)
		{

			responseWriter.write("y: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getY().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(tooltip.getZIndex() != null)
		{

			responseWriter.write("zIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(tooltip.getZIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(StringPool.SEMICOLON);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(StringPool.SEMICOLON);

		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_CLOSE);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.endElement("script");
		responseWriter.write(StringPool.NEW_LINE);
	}

}