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
package com.liferay.faces.alloy.component.buttonsearchcancel;

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
public abstract class ButtonSearchCancelRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-button";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		ButtonSearchCancel buttonSearchCancel = (ButtonSearchCancel) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var buttonSearchCancel = new A.ButtonSearchCancel");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderContainer(renrederedAttributes, buttonSearchCancel);
		renderDestroyed(renrederedAttributes, buttonSearchCancel);
		renderGutter(renrederedAttributes, buttonSearchCancel);
		renderIconClass(renrederedAttributes, buttonSearchCancel);
		renderInitialized(renrederedAttributes, buttonSearchCancel);
		renderTrigger(renrederedAttributes, buttonSearchCancel);
		renderZIndex(renrederedAttributes, buttonSearchCancel);

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
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderContainer(ArrayList<String> renrederedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		if (buttonSearchCancel.getContainer() != null) {
			renrederedAttributes.add(renderString("container", buttonSearchCancel.getContainer()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		if (buttonSearchCancel.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", buttonSearchCancel.getDestroyed()));
		}
	}

	protected void renderGutter(ArrayList<String> renrederedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		if (buttonSearchCancel.getGutter() != null) {
			renrederedAttributes.add(renderArray("gutter", buttonSearchCancel.getGutter()));
		}
	}

	protected void renderIconClass(ArrayList<String> renrederedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		if (buttonSearchCancel.getIconClass() != null) {
			renrederedAttributes.add(renderString("iconClass", buttonSearchCancel.getIconClass()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		if (buttonSearchCancel.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", buttonSearchCancel.getInitialized()));
		}
	}

	protected void renderTrigger(ArrayList<String> renrederedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		if (buttonSearchCancel.getTrigger() != null) {
			renrederedAttributes.add(renderString("trigger", buttonSearchCancel.getTrigger()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, ButtonSearchCancel buttonSearchCancel) throws IOException {
		if (buttonSearchCancel.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", buttonSearchCancel.getZIndex()));
		}
	}

}