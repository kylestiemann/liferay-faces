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
package com.liferay.faces.alloy.component.tooltipdelegate;

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
public abstract class TooltipDelegateRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tooltip";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TooltipDelegate tooltipDelegate = (TooltipDelegate) uiComponent;
		encodeHTML(facesContext, tooltipDelegate);
		encodeJavaScript(facesContext, tooltipDelegate);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TooltipDelegate tooltipDelegate) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TooltipDelegate tooltipDelegate) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, tooltipDelegate);

		bufferedResponseWriter.write("var tooltipDelegate = new A.TooltipDelegate");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlign(renrederedAttributes, tooltipDelegate);
		renderContainer(renrederedAttributes, tooltipDelegate);
		renderDestroyed(renrederedAttributes, tooltipDelegate);
		renderDuration(renrederedAttributes, tooltipDelegate);
		renderInitialized(renrederedAttributes, tooltipDelegate);
		renderOpacity(renrederedAttributes, tooltipDelegate);
		renderTriggerHideEvent(renrederedAttributes, tooltipDelegate);
		renderTriggerShowEvent(renrederedAttributes, tooltipDelegate);
		renderZIndex(renrederedAttributes, tooltipDelegate);

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

		handleBuffer(facesContext, tooltipDelegate);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlign(ArrayList<String> renrederedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		if (tooltipDelegate.getAlign() != null) {
			renrederedAttributes.add(renderObject("align", tooltipDelegate.getAlign()));
		}
	}

	protected void renderContainer(ArrayList<String> renrederedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		if (tooltipDelegate.getContainer() != null) {
			renrederedAttributes.add(renderString("container", tooltipDelegate.getContainer()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		if (tooltipDelegate.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", tooltipDelegate.getDestroyed()));
		}
	}

	protected void renderDuration(ArrayList<String> renrederedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		if (tooltipDelegate.getDuration() != null) {
			renrederedAttributes.add(renderString("duration", tooltipDelegate.getDuration()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		if (tooltipDelegate.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", tooltipDelegate.getInitialized()));
		}
	}

	protected void renderOpacity(ArrayList<String> renrederedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		if (tooltipDelegate.getOpacity() != null) {
			renrederedAttributes.add(renderString("opacity", tooltipDelegate.getOpacity()));
		}
	}

	protected void renderTriggerHideEvent(ArrayList<String> renrederedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		if (tooltipDelegate.getTriggerHideEvent() != null) {
			renrederedAttributes.add(renderString("triggerHideEvent", tooltipDelegate.getTriggerHideEvent()));
		}
	}

	protected void renderTriggerShowEvent(ArrayList<String> renrederedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		if (tooltipDelegate.getTriggerShowEvent() != null) {
			renrederedAttributes.add(renderString("triggerShowEvent", tooltipDelegate.getTriggerShowEvent()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, TooltipDelegate tooltipDelegate) throws IOException {
		if (tooltipDelegate.getZIndex() != null) {
			renrederedAttributes.add(renderString("zIndex", tooltipDelegate.getZIndex()));
		}
	}

}