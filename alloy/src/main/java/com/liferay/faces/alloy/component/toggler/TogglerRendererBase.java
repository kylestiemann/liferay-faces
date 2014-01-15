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
package com.liferay.faces.alloy.component.toggler;

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
public abstract class TogglerRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-toggler";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Toggler toggler = (Toggler) uiComponent;
		encodeHTML(facesContext, toggler);
		encodeJavaScript(facesContext, toggler);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Toggler toggler) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Toggler toggler) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, toggler);

		bufferedResponseWriter.write("var toggler = new A.Toggler");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAnimated(renrederedAttributes, toggler);
		renderAnimating(renrederedAttributes, toggler);
		renderBindDOMEvents(renrederedAttributes, toggler);
		renderContent(renrederedAttributes, toggler);
		renderDestroyed(renrederedAttributes, toggler);
		renderExpanded(renrederedAttributes, toggler);
		renderHeader(renrederedAttributes, toggler);
		renderInitialized(renrederedAttributes, toggler);
		renderTransition(renrederedAttributes, toggler);

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

		handleBuffer(facesContext, toggler);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAnimated(ArrayList<String> renrederedAttributes, Toggler toggler) throws IOException {
		if (toggler.getAnimated() != null) {
			renrederedAttributes.add(renderBoolean("animated", toggler.getAnimated()));
		}
	}

	protected void renderAnimating(ArrayList<String> renrederedAttributes, Toggler toggler) throws IOException {
		if (toggler.getAnimating() != null) {
			renrederedAttributes.add(renderBoolean("animating", toggler.getAnimating()));
		}
	}

	protected void renderBindDOMEvents(ArrayList<String> renrederedAttributes, Toggler toggler) throws IOException {
		if (toggler.getBindDOMEvents() != null) {
			renrederedAttributes.add(renderBoolean("bindDOMEvents", toggler.getBindDOMEvents()));
		}
	}

	protected void renderContent(ArrayList<String> renrederedAttributes, Toggler toggler) throws IOException {
		if (toggler.getContent() != null) {
			renrederedAttributes.add(renderString("content", toggler.getContent()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, Toggler toggler) throws IOException {
		if (toggler.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", toggler.getDestroyed()));
		}
	}

	protected void renderExpanded(ArrayList<String> renrederedAttributes, Toggler toggler) throws IOException {
		if (toggler.getExpanded() != null) {
			renrederedAttributes.add(renderBoolean("expanded", toggler.getExpanded()));
		}
	}

	protected void renderHeader(ArrayList<String> renrederedAttributes, Toggler toggler) throws IOException {
		if (toggler.getHeader() != null) {
			renrederedAttributes.add(renderString("header", toggler.getHeader()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, Toggler toggler) throws IOException {
		if (toggler.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", toggler.getInitialized()));
		}
	}

	protected void renderTransition(ArrayList<String> renrederedAttributes, Toggler toggler) throws IOException {
		if (toggler.getTransition() != null) {
			renrederedAttributes.add(renderObject("transition", toggler.getTransition()));
		}
	}

}