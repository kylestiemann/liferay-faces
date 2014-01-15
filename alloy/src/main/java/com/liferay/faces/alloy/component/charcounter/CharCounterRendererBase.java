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
package com.liferay.faces.alloy.component.charcounter;

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
public abstract class CharCounterRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-char-counter";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		CharCounter charCounter = (CharCounter) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var charCounter = new A.CharCounter");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderCounter(renrederedAttributes, charCounter);
		renderDestroyed(renrederedAttributes, charCounter);
		renderInitialized(renrederedAttributes, charCounter);
		renderInput(renrederedAttributes, charCounter);
		renderMaxLength(renrederedAttributes, charCounter);

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

	protected void renderCounter(ArrayList<String> renrederedAttributes, CharCounter charCounter) throws IOException {
		if (charCounter.getCounter() != null) {
			renrederedAttributes.add(renderString("counter", charCounter.getCounter()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, CharCounter charCounter) throws IOException {
		if (charCounter.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", charCounter.getDestroyed()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, CharCounter charCounter) throws IOException {
		if (charCounter.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", charCounter.getInitialized()));
		}
	}

	protected void renderInput(ArrayList<String> renrederedAttributes, CharCounter charCounter) throws IOException {
		if (charCounter.getInput() != null) {
			renrederedAttributes.add(renderString("input", charCounter.getInput()));
		}
	}

	protected void renderMaxLength(ArrayList<String> renrederedAttributes, CharCounter charCounter) throws IOException {
		if (charCounter.getMaxLength() != null) {
			renrederedAttributes.add(renderNumber("maxLength", charCounter.getMaxLength()));
		}
	}

}