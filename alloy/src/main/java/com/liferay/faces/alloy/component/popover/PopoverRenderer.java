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

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import com.liferay.faces.alloy.util.AlloyUtil;
import com.liferay.faces.util.lang.StringPool;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Bruno Basto
 */
@FacesRenderer(
	componentFamily = "javax.faces.Panel",
	rendererType = "com.liferay.faces.alloy.component.popover.PopoverRenderer"
)
public class PopoverRenderer extends PopoverRendererBase {

	@Override
	protected void encodeJavaScriptCustom(
		FacesContext facesContext, UIComponent component) throws IOException {

		Popover popover = (Popover) component;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("A.one('#");
		responseWriter.write(getEscapedForClientId(popover));
		responseWriter.write("').on('click', function(){");
		responseWriter.write(
			"popover.set('visible', !popover.get('visible'));");
		responseWriter.write("});");
	}
	
	protected String getEscapedForClientId(Popover popover) {
		String escapedForClientId = StringPool.BLANK;

		String for_ = popover.getFor_();

		// Ask Neil for a better findComponent method
		UIComponent forComponent = popover.findComponent(for_);

		if (forComponent != null) {
			String forClientId = forComponent.getClientId();

			escapedForClientId = AlloyUtil.escapeClientId(forClientId);
		}

		return escapedForClientId;
	}

	@Override
	protected void renderAlign(
			List<String> renrederedAttributes, Popover popover)
		throws IOException {

		if (popover.getAlign() == null) {
			Map<String, String> alignMap = new HashMap<String, String>();

			alignMap.put("node", "#" + getEscapedForClientId(popover));

			renrederedAttributes.add(renderMap("align", alignMap));
		}
		else {
			super.renderAlign(renrederedAttributes, popover);
		}

	}

	@Override
	protected void renderFor_(
			List<String> renrederedAttributes, Popover popover)
		throws IOException {

		// no-op in order to prevent rendering the for_ attribute
	}

	@Override
	protected void renderPopoverBodyContent(
			List<String> renrederedAttributes, Popover popover)
		throws IOException {

		if (popover.getPopoverBodyContent() != null) {
			renrederedAttributes.add(
				renderString("bodyContent", popover.getPopoverBodyContent()));
		}
	}

}