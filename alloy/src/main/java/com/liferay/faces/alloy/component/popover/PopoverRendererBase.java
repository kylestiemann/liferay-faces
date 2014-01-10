/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class PopoverRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		Popover popover = (Popover) uiComponent;
		encodeHTML(facesContext, popover);
		encodeJavaScript(facesContext, popover);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Popover popover) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Popover popover) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", popover);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-popover',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var popover = new Y.Popover");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(popover.getAlign() != null)
		{

			responseWriter.write("align: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getAlign().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getAlignOn() != null)
		{

			responseWriter.write("alignOn: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getAlignOn().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getPopoverBodyContent() != null)
		{

			responseWriter.write("popoverBodyContent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getPopoverBodyContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getBoundingBox() != null)
		{

			responseWriter.write("boundingBox: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getBoundingBox().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getCentered() != null)
		{

			responseWriter.write("centered: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getCentered().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getConstrain() != null)
		{

			responseWriter.write("constrain: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getConstrain().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getContentBox() != null)
		{

			responseWriter.write("contentBox: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getContentBox().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getDestroyed() != null)
		{

			responseWriter.write("destroyed: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getDestroyed().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getDisabled() != null)
		{

			responseWriter.write("disabled: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getDisabled().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getFillHeight() != null)
		{

			responseWriter.write("fillHeight: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getFillHeight().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getFocusOn() != null)
		{

			responseWriter.write("focusOn: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getFocusOn().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getFocused() != null)
		{

			responseWriter.write("focused: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getFocused().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getFooterContent() != null)
		{

			responseWriter.write("footerContent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getFooterContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getHeaderContent() != null)
		{

			responseWriter.write("headerContent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getHeaderContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getHeight() != null)
		{

			responseWriter.write("height: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getHeight().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getHideOn() != null)
		{

			responseWriter.write("hideOn: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getHideOn().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getPopoverId() != null)
		{

			responseWriter.write("popoverId: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getPopoverId().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getInitialized() != null)
		{

			responseWriter.write("initialized: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getInitialized().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getPopoverLocale() != null)
		{

			responseWriter.write("popoverLocale: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getPopoverLocale().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getMaskNode() != null)
		{

			responseWriter.write("maskNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getMaskNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getModal() != null)
		{

			responseWriter.write("modal: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getModal().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getPreventOverlap() != null)
		{

			responseWriter.write("preventOverlap: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getPreventOverlap().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getRender() != null)
		{

			responseWriter.write("render: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getRender().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getRendered() != null)
		{

			responseWriter.write("rendered: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getRendered().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getShim() != null)
		{

			responseWriter.write("shim: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getShim().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getSrcNode() != null)
		{

			responseWriter.write("srcNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getSrcNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getTabIndex() != null)
		{

			responseWriter.write("tabIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getTabIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getToolbarPosition() != null)
		{

			responseWriter.write("toolbarPosition: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getToolbarPosition().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getToolbars() != null)
		{

			responseWriter.write("toolbars: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getToolbars().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getTriggerToggleEvent() != null)
		{

			responseWriter.write("triggerToggleEvent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getTriggerToggleEvent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getVisible() != null)
		{

			responseWriter.write("visible: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getVisible().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getWidth() != null)
		{

			responseWriter.write("width: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getWidth().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getX() != null)
		{

			responseWriter.write("x: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getX().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getXy() != null)
		{

			responseWriter.write("xy: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getXy().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getY() != null)
		{

			responseWriter.write("y: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getY().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(popover.getZIndex() != null)
		{

			responseWriter.write("zIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(popover.getZIndex().toString());
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